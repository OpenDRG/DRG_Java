package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCP_DRG;

public class PR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"P22.000","P22.000x001","P22.100x003","P22.101","P22.900"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PR1入组条件，匹配规则：主诊断匹配、新生儿");
                
            if (MDCP_DRG.PR11_group(record)){
                return "PR11";
            }
    
            if (MDCP_DRG.PR13_group(record)){
                return "PR13";
            }
    
            if (MDCP_DRG.PR15_group(record)){
                return "PR15";
            }

            return "PR1";
        }else{
            return "";
        }
    }
}

