package drg_group.lanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2023.Base;
import drg_group.lanzhou_2023.MedicalRecord;
import drg_group.lanzhou_2023.DRG.MDCK_DRG;

public class KU1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"E40.x00","E41.x00","E41.x01","E42.x00","E43.x00","E43.x00x001","E43.x00x002","E44.000","E44.100","E45.x00","E45.x00x003","E46.x00x002","E46.x00x003","E46.x00x004","E46.x00x005","E46.x01","E50.100x001+H13.8*","E50.900","E51.800","E51.900","E51.900x001","E52.x00x003","E53.000","E53.100","E53.100x001","E53.800x010","E53.800x011","E53.800x012","E53.800x013","E53.802","E53.804","E53.900","E53.901","E54.x00","E55.002","E55.900","E56.000","E56.100","E56.800x001","E56.900","E58.x00","E59.x00","E59.x01","E60.x00","E61.000","E61.100","E61.200","E61.300","E61.400","E61.500","E61.600","E61.700","E61.800","E61.900","E63.000","E63.100","E63.800","E63.900","E64.000","E64.100","E64.200","E64.800","E64.900","E67.800","E68.x00","E78.601","E80.700","E83.800","E84.801","R63.801","R64.x00"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合KU1入组条件，匹配规则：主诊断匹配");
                
            if (MDCK_DRG.KU11_group(record)){
                return "KU11";
            }
    
            if (MDCK_DRG.KU13_group(record)){
                return "KU13";
            }
    
            if (MDCK_DRG.KU15_group(record)){
                return "KU15";
            }

            return "KU1";
        }else{
            return "";
        }
    }
}

