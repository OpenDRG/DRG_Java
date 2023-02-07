package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCR_DRG;

public class RC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"92.2200","92.2201","92.2300","92.2301","92.2302","92.2303","92.2400","92.2400x002","92.2400x003","92.2400x004","92.2400x005","92.2400x006","92.2400x007","92.2500","92.2501","92.2601","92.2602","92.2900x001","92.3100","92.3101","92.3102","92.3200","92.3200x001","92.3201","92.3202","92.3300","92.3900"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RC1入组条件，匹配规则：主手术匹配");
                
            if (MDCR_DRG.RC12_group(record)){
                return "RC12";
            }
    
            if (MDCR_DRG.RC14_group(record)){
                return "RC14";
            }
    
            if (MDCR_DRG.RC16_group(record)){
                return "RC16";
            }
    
            if (MDCR_DRG.RC18_group(record)){
                return "RC18";
            }

            return "RC1";
        }else{
            return "";
        }
    }
}

