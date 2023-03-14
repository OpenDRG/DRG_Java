package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCF_DRG;

public class FV4 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"R07.101","R07.200","R07.301","R07.400","Z03.400"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FV4入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FV41_group(record)){
                return "FV41";
            }
    
            if (MDCF_DRG.FV43_group(record)){
                return "FV43";
            }
    
            if (MDCF_DRG.FV45_group(record)){
                return "FV45";
            }

            return "FV4";
        }else{
            return "";
        }
    }
}

