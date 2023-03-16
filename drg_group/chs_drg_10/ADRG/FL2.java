package drg_group.chs_drg_10.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;
import drg_group.chs_drg_10.DRG.MDCF_DRG;

public class FL2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"37.3400x002","37.3401","37.3402","37.3403","37.3404","37.3405","37.3406"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FL2入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FL29_group(record)){
                return "FL29";
            }

            return "FL2";
        }else{
            return "";
        }
    }
}

