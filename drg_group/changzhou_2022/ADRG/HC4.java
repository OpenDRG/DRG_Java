package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCH_DRG;

public class HC4 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"51.0200","51.0300x002","51.0301","51.0400x004","51.0400x006","51.0400x008","51.0401","51.0402","51.0403","51.0404","51.0405","51.0405","51.2101","51.3100","51.3200x001","51.3201","51.3202","51.3203","51.3204","51.3400","51.3700x003","51.3700x007","51.3701","51.3702","51.3703","51.3704","51.3900x005","51.3900x008","51.3901","51.3902","51.3904","51.3906","51.4301","51.4302","51.4303","51.4304","51.4900x002","51.4900x003","51.4901","51.4902","51.4903","51.4904","51.4905","51.5900x005","51.5900x008","51.5901","51.5902","51.5903","51.5904","51.6100x001","51.6900x007","51.6900x008","51.6900x012","51.6901","51.6902","51.6903","51.6904","51.6905","51.7101","51.7900x002","51.7900x005","51.7900x006","51.7900x007","51.7901","51.7902","51.7903","51.7904","51.7905","51.7906","51.7907","51.7908","51.7909","51.7910","51.8100","51.8101","51.9100","51.9101","51.9200","51.9300x001","51.9301","51.9302","51.9303","51.9304","51.9305","51.9401"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HC4入组条件，匹配规则：主手术匹配");
                
            if (MDCH_DRG.HC49_group(record)){
                return "HC49";
            }

            return "HC4";
        }else{
            return "";
        }
    }
}

