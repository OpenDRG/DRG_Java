package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCR_DRG;

public class RE1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.1000","00.1500x002","54.9703","99.2500x036","99.2500x037","99.2502","99.2503","99.2505","99.2506","99.2800x003","99.2800x006","99.2801"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合RE1入组条件，匹配规则：某一手术匹配");
                
            if (MDCR_DRG.RE11_group(record)){
                return "RE11";
            }
    
            if (MDCR_DRG.RE13_group(record)){
                return "RE13";
            }
    
            if (MDCR_DRG.RE15_group(record)){
                return "RE15";
            }
    
            if (MDCR_DRG.RE19_group(record)){
                return "RE19";
            }

            return "RE1";
        }else{
            return "";
        }
    }
}

