package drg_group.suzhou_2022.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.suzhou_2022.Base;
import drg_group.suzhou_2022.MedicalRecord;
import drg_group.suzhou_2022.DRG.MDCM_DRG;

public class MD1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_ss={"61.2x01","61.2x02","61.4101","61.4102","61.4201","61.4202","61.9101","61.9200x001","61.9900","62.0x00x001","62.0x01","62.0x02","62.0x03","62.1200","62.2x00x002","62.2x00x003","62.2x01","62.3x00","62.3x01","62.3x02","62.3x03","62.3x04","62.4100x004","62.4101","62.4102","62.4103","62.4104","62.4105","62.4200","62.5x00","62.5x01","62.5x02","62.6100","62.6900x001","62.6901","62.7x00","62.9900x001","63.1x00x003","63.1x01","63.1x02","63.1x03","63.2x00","63.2x01","63.4x00","63.5201","63.5202","63.5203","63.5300","63.5900","63.6x00x001","63.6x01","63.6x02","63.8102","63.8300","63.9200x001","63.9300","63.9400"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null &&record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合MD1入组条件，匹配规则：主手术匹配");
                
            if (MDCM_DRG.MD19_group(record)){
                return "MD19";
            }

            return "MD1";
        }else{
            return "";
        }
    }
}

