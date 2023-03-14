package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCF_DRG;

public class FF4 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"20.7100","20.7903","38.0701","38.5701","38.8700x001","38.8701","38.8704","39.3201","44.4400x001","44.4402","55.9902","99.1000x011"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合FF4入组条件，匹配规则：某一手术匹配");
                
            if (MDCF_DRG.FF41_group(record)){
                return "FF41";
            }
    
            if (MDCF_DRG.FF43_group(record)){
                return "FF43";
            }
    
            if (MDCF_DRG.FF45_group(record)){
                return "FF45";
            }

            return "FF4";
        }else{
            return "";
        }
    }
}

