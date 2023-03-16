package drg_group.chs_drg_10.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;
import drg_group.chs_drg_10.DRG.MDCH_DRG;

public class HK1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"39.5017","42.3307","42.3308","42.3309","42.3310","43.4100x020","96.0601"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HK1入组条件，匹配规则：主手术匹配");
                
            if (MDCH_DRG.HK19_group(record)){
                return "HK19";
            }

            return "HK1";
        }else{
            return "";
        }
    }
}

