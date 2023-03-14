package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCR_DRG;

public class RC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"92.2001","92.2100","92.2201","92.2301","92.2302","92.2303","92.2400x002","92.2400x003","92.2400x004","92.2400x005","92.2400x006","92.2400x007","92.2501","92.2601","92.2602","92.2700x002","92.2701","92.2702","92.2703","92.2704","92.2705","92.2706","92.2900x001","92.2900x002","92.2900x003","92.3000","92.3101","92.3102","92.3200x001","92.3201","92.3202","92.3300","92.3900"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合RC1入组条件，匹配规则：某一手术匹配");
                
            if (MDCR_DRG.RC11_group(record)){
                return "RC11";
            }
    
            if (MDCR_DRG.RC13_group(record)){
                return "RC13";
            }
    
            if (MDCR_DRG.RC15_group(record)){
                return "RC15";
            }

            return "RC1";
        }else{
            return "";
        }
    }
}

