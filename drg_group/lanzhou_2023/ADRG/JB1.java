package drg_group.lanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2023.Base;
import drg_group.lanzhou_2023.MedicalRecord;
import drg_group.lanzhou_2023.DRG.MDCJ_DRG;

public class JB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"85.3100","85.3200","85.3300x001","85.3500x001","85.5100x001","85.5200x001","85.5300x001","85.5400x001","85.5500x001","85.5500x002","85.6x00x001","85.7000x001","85.7100x001","85.7200x001","85.7300x001","85.7400x001","85.7500x001","85.7600x001","85.7900x001","85.8100","85.8200","85.8300","85.8400","85.8500","85.8601","85.8700x003","85.8701","85.8702","85.8900x005","85.8900x006","85.8900x007","85.8900x008","85.8901","85.9100","85.9300","85.9400","85.9500","85.9600"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合JB1入组条件，匹配规则：主手术匹配");
                
            if (MDCJ_DRG.JB15_group(record)){
                return "JB15";
            }
    
            if (MDCJ_DRG.JB1A_group(record)){
                return "JB1A";
            }

            return "JB1";
        }else{
            return "";
        }
    }
}

