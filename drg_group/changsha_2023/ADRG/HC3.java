package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCH_DRG;


public class HC3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"51.0200","51.0300x002","51.0301","51.0400x004","51.0400x006","51.0400x008","51.0401","51.0402","51.0403","51.0404","51.0405","51.0405","51.3100","51.3200x001","51.3201","51.3202","51.3203","51.3204","51.3400","51.3500","51.3900x005","51.3900x008","51.3901","51.3902","51.3904","51.3906","51.3907","51.5900x001","51.5900x005","51.5900x006","51.5900x008","51.5900x009","51.5901","51.5902","51.5903","51.5904","51.6900x007","51.6900x008","51.6900x012","51.6900x013","51.6901","51.6902","51.6903","51.6904","51.6905","51.7900x002","51.7900x005","51.7900x007","51.7901","51.7902","51.7903","51.7904","51.7905","51.7906","51.7907","51.7908","51.7909","51.7910","51.8100","51.8101","51.8900","51.9100","51.9101","51.9200","51.9300x001","51.9301","51.9302","51.9303","51.9304","51.9305","51.9401","51.9901"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HC3入组条件，匹配规则：主手术匹配");
            
                
            if (MDCH_DRG.HC31_group(record)){
                return "HC31";
            }
    
            if (MDCH_DRG.HC35_group(record)){
                return "HC35";
            }

            return "";
        }else{
            return "";
        }
    }
}

