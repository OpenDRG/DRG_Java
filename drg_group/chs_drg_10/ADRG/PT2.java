package drg_group.chs_drg_10.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;
import drg_group.chs_drg_10.DRG.MDCP_DRG;

public class PT2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"P07.200x011","P07.300x021"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.weight>0 && record.weight>=2500 && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PT2入组条件，匹配规则：主诊断匹配、体重大于2500克、新生儿");
                
            if (MDCP_DRG.PT29_group(record)){
                return "PT29";
            }

            return "PT2";
        }else{
            return "";
        }
    }
}

