package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCP_DRG;

public class PK1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"96.0400","96.7101","96.7201"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss) && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PK1入组条件，匹配规则：某一手术匹配、新生儿");
                
            if (MDCP_DRG.PK19_group(record)){
                return "PK19";
            }

            return "PK1";
        }else{
            return "";
        }
    }
}

