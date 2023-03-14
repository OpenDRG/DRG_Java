package drg_group.xian_2020.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;
import drg_group.xian_2020.DRG.MDCP_DRG;

public class PC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PC1入组条件，匹配规则：新生儿");
                
            if (MDCP_DRG.PC19_group(record)){
                return "PC19";
            }

            return "PC1";
        }else{
            return "";
        }
    }
}

