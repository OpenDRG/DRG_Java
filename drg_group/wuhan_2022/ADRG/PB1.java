package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCP_DRG;

public class PB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PB1入组条件，匹配规则：新生儿");
                
            if (MDCP_DRG.PB19_group(record)){
                return "PB19";
            }

            return "PB1";
        }else{
            return "";
        }
    }
}

