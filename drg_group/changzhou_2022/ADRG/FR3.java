package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCF_DRG;

public class FR3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"I20.000","I20.000x004","I20.000x005","I20.001","I20.002","I20.003","I20.004","I20.005","I20.006","I20.101","I20.102","I20.800x006","I20.800x007","I20.801","I20.802","I20.803","I20.806","I20.807","I20.808","I20.900","I24.800x007","I24.801","I24.900x001","I24.901"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FR3入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FR35_group(record)){
                return "FR35";
            }
    
            if (MDCF_DRG.FR31_group(record)){
                return "FR31";
            }
    
            if (MDCF_DRG.FR33_group(record)){
                return "FR33";
            }
    
            if (MDCF_DRG.FR37_group(record)){
                return "FR37";
            }

            return "FR3";
        }else{
            return "";
        }
    }
}

