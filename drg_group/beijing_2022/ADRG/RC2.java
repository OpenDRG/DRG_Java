package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCR_DRG;

public class RC2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"92.2000","92.2001","92.2100","92.2700x002","92.2700x004","92.2701","92.2702","92.2703","92.2704","92.2705","92.2706","92.2800","92.2801","92.2900x002","92.2900x003"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RC2入组条件，匹配规则：主手术匹配");
                
            if (MDCR_DRG.RC22_group(record)){
                return "RC22";
            }
    
            if (MDCR_DRG.RC24_group(record)){
                return "RC24";
            }
    
            if (MDCR_DRG.RC26_group(record)){
                return "RC26";
            }
    
            if (MDCR_DRG.RC28_group(record)){
                return "RC28";
            }

            return "RC2";
        }else{
            return "";
        }
    }
}

