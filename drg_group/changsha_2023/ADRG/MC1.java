package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCM_DRG;

public class MC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.5702","38.8705","64.2x00x001","64.2x00x002","64.2x00x003","64.2x00x006","64.2x00x007","64.2x00x008","64.2x01","64.3x01","64.3x02","64.4100","64.4200","64.4300","64.4400","64.4500","64.4500x002","64.4901","64.4902","64.4903","64.4904","64.4905","64.5x00","64.5x00x001","64.9100x002","64.9100x003","64.9101","64.9200","64.9300x001","64.9400","64.9501","64.9502","64.9600","64.9701","64.9702","64.9801","64.9802","98.2401"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合MC1入组条件，匹配规则：主手术匹配");
                
            if (MDCM_DRG.MC19_group(record)){
                return "MC19";
            }

            return "MC1";
        }else{
            return "";
        }
    }
}

