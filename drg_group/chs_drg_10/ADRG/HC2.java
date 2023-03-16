package drg_group.chs_drg_10.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;
import drg_group.chs_drg_10.DRG.MDCH_DRG;

public class HC2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"51.1104","51.3601","51.3602","51.3903","51.3905","51.4100x001","51.4201","51.4202","51.5100","51.5101","51.5102","51.6300x001","51.6301","51.6302","51.6303","51.7200x001","51.7201","51.7202","51.7203","51.7204","51.8800x006","51.8803","51.8807"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HC2入组条件，匹配规则：主手术匹配");
                
            if (MDCH_DRG.HC29_group(record)){
                return "HC29";
            }

            return "HC2";
        }else{
            return "";
        }
    }
}

