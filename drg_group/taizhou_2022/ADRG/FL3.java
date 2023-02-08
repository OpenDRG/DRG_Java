package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCF_DRG;

public class FL3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"35.0501","35.0502","35.0701","35.0900","35.9500x006","35.9600x008","35.9601","35.9602","35.9603","35.9604","35.9700x001","35.9700x002","35.9700x003","35.9700x004","35.9700x005","35.9700x006"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FL3入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FL39_group(record)){
                return "FL39";
            }

            return "FL3";
        }else{
            return "";
        }
    }
}

