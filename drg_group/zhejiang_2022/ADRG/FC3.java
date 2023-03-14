package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCF_DRG;

public class FC3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"36.1000x001","36.1000x002","36.1100","36.1200","36.1300","36.1400","36.1500","36.1600","36.1700x001","36.1900x001","36.2x00"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合FC3入组条件，匹配规则：某一手术匹配");
                
            if (MDCF_DRG.FC31_group(record)){
                return "FC31";
            }
    
            if (MDCF_DRG.FC33_group(record)){
                return "FC33";
            }
    
            if (MDCF_DRG.FC35_group(record)){
                return "FC35";
            }

            return "FC3";
        }else{
            return "";
        }
    }
}

