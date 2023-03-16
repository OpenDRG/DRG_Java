package drg_group.chs_drg_10.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;
import drg_group.chs_drg_10.DRG.MDCF_DRG;

public class FV4 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"R07.101","R07.200","R07.301","R07.400","Z03.400"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FV4入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FV49_group(record)){
                return "FV49";
            }

            return "FV4";
        }else{
            return "";
        }
    }
}

