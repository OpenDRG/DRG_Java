package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCD_DRG;

public class DK1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"20.7200","20.9400","21.0100","21.0200","21.0200x001","21.0200x002","21.0300x003","21.0300x004","21.0301","21.0302","21.0500","21.0501","21.0600","21.0901","21.0903","22.0200","22.1200","23.5x01","23.7000x001","23.7001","23.7002","24.7x01","24.7x02","24.7x03","24.7x04","24.8x02","25.0200","25.0201","26.9101","27.2901","27.9200x001","27.9201","31.0x00x001","31.4100","31.4200x001","31.4200x003","31.4201","31.4202","31.4300x002","31.4301","31.4400x001","31.4502","31.9400","31.9804","31.9805","31.9806","31.9900x001","31.9902","96.0600","98.0101","98.1100x001","98.1200x001","98.1201","98.1300x001","98.1400x001","98.1400x002","98.1501"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DK1入组条件，匹配规则：主手术匹配");
                
            if (MDCD_DRG.DK11_group(record)){
                return "DK11";
            }
    
            if (MDCD_DRG.DK13_group(record)){
                return "DK13";
            }
    
            if (MDCD_DRG.DK15_group(record)){
                return "DK15";
            }

            return "DK1";
        }else{
            return "";
        }
    }
}

