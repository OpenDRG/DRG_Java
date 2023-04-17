package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCF_DRG;

public class FT1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"E05.900x004+I43.8*","E11.502+I79.2*","E14.500x031+I43.8*","E14.500x032+I43.8*","E63.901+I43.2*","E83.103","E88.907+I43.1*","I25.500","I42.000x001","I42.001","I42.100","I42.200x002","I42.201","I42.401","I42.500x001","I42.501","I42.600","I42.701","I42.800x002","I42.800x004","I42.800x005","I42.800x006","I42.800x007","I42.802","I42.803","I42.900","I42.901","I42.902","I42.904","I42.905","I51.500x006","M32.104+I43.8*"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FT1入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FT10_group(record)){
                return "FT10";
            }
    
            if (MDCF_DRG.FT11_group(record)){
                return "FT11";
            }
    
            if (MDCF_DRG.FT13_group(record)){
                return "FT13";
            }
    
            if (MDCF_DRG.FT15_group(record)){
                return "FT15";
            }

            return "FT1";
        }else{
            return "";
        }
    }
}

