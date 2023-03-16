package drg_group.yancheng_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yancheng_2022.Base;
import drg_group.yancheng_2022.MedicalRecord;
import drg_group.yancheng_2022.DRG.MDCA_DRG;

public class AF1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"33.5000","33.5100","33.5200","33.6x00"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合AF1入组条件，匹配规则：主手术匹配");
                
            if (MDCA_DRG.AF19_group(record)){
                return "AF19";
            }

            return "AF1";
        }else{
            return "";
        }
    }
}

