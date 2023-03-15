package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCE_DRG;

public class EX2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A36.201","A37.000","A37.100","A37.800x001","A37.900","A37.900x003","A37.900x004","A37.901+J17.0*","J20.000","J20.100","J20.200","J20.300","J20.400","J20.500","J20.600","J20.700","J20.800","J20.900","J20.901","J20.902","J21.000","J21.100","J21.801","J21.900","J21.900x002","J21.901","J39.803","J40.x00","J40.x00x002","J40.x01","J44.800x001","T17.501"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合EX2入组条件，匹配规则：主诊断匹配");
                
            if (MDCE_DRG.EX21_group(record)){
                return "EX21";
            }
    
            if (MDCE_DRG.EX23_group(record)){
                return "EX23";
            }
    
            if (MDCE_DRG.EX25_group(record)){
                return "EX25";
            }

            return "EX2";
        }else{
            return "";
        }
    }
}

