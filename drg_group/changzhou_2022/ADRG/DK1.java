package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCD_DRG;

public class DK1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"18.1200","20.3201","20.3202","20.3901","20.7200","20.9400","21.0100","21.0200x001","21.0200x002","22.0200","22.1100","22.1100x002","22.1200","22.1901","23.5x01","23.7000x001","23.7001","23.7002","24.1100","24.1200","24.1900","24.7x01","24.7x02","24.7x03","24.7x04","24.8x02","25.0100","25.0200","25.0201","25.0900","26.1100x001","26.1100x003","26.1200x001","26.1200x002","26.1900x001","27.2100","27.2101","27.2201","27.2202","27.2300","27.2401","27.2402","27.2901","27.9200x001","27.9201","28.0x00x002","28.0x01","28.0x02","28.0x03","28.1101","28.1102","28.1900","28.7x01","29.1100","29.1100x002","29.1201","29.1202","29.1203","29.1204","29.1900","31.0x00","31.0x00x001","31.0x01","31.0x04","31.4100","31.4200x001","31.4200x003","31.4201","31.4202","31.4300x002","31.4301","31.4400x001","31.9400","31.9804","31.9805","31.9806","31.9900x001","31.9902","42.3200x003","96.0600","98.0101","98.1100x001","98.1200x001","98.1201","98.1300x001","98.1400x001","98.1400x002","98.1501"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DK1入组条件，匹配规则：主手术匹配");
                
            if (MDCD_DRG.DK19_group(record)){
                return "DK19";
            }

            return "DK1";
        }else{
            return "";
        }
    }
}

