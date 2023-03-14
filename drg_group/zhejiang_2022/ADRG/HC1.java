package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCH_DRG;

public class HC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"51.2100","51.2200","51.2200x004","51.2201","51.2300","51.2301","51.2400"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合HC1入组条件，匹配规则：某一手术匹配");
                
            if (MDCH_DRG.HC11_group(record)){
                return "HC11";
            }
    
            if (MDCH_DRG.HC13_group(record)){
                return "HC13";
            }

            return "HC1";
        }else{
            return "";
        }
    }
}

