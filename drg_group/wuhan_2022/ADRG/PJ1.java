package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCP_DRG;

public class PJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PJ1入组条件，匹配规则：新生儿");
                
            if (MDCP_DRG.PJ19_group(record)){
                return "PJ19";
            }

            return "PJ1";
        }else{
            return "";
        }
    }
}

