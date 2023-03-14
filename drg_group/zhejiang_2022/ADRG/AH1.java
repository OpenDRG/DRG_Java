package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCA_DRG;

public class AH1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"31.1x00x005","31.2100x001","31.2900x001","39.6500","96.0400","96.7201"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合AH1入组条件，匹配规则：某一手术匹配");
                
            if (MDCA_DRG.AH11_group(record)){
                return "AH11";
            }
    
            if (MDCA_DRG.AH13_group(record)){
                return "AH13";
            }
    
            if (MDCA_DRG.AH19_group(record)){
                return "AH19";
            }

            return "AH1";
        }else{
            return "";
        }
    }
}

