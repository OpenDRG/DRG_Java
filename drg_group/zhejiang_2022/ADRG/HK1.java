package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCH_DRG;

public class HK1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"39.5017","42.3307","42.3308","42.3309","42.3310","42.9100x002","43.4100x020"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合HK1入组条件，匹配规则：某一手术匹配");
                
            if (MDCH_DRG.HK11_group(record)){
                return "HK11";
            }
    
            if (MDCH_DRG.HK13_group(record)){
                return "HK13";
            }

            return "HK1";
        }else{
            return "";
        }
    }
}

