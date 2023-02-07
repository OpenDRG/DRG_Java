package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCC_DRG;

public class CB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"14.0100","14.0101","14.0200x001","14.0200x002","14.0201","14.0202","14.2101","14.2102","14.2201","14.2202","14.2301","14.2302","14.2401","14.2402","14.2403","14.2500","14.2601","14.2602","14.2900x001","14.2900x002","14.2900x003","14.2900x004","14.2901","14.2902","14.3101","14.3200x001","14.3200x002","14.3300","14.3400","14.3500","14.3901","14.4100","14.4900x001","14.4901","14.4902","14.4903","14.5101","14.5200x001","14.5300x001","14.5400x001","14.5500","14.5901","14.5902","14.5903","14.5904","14.5905","14.6x00x001","14.6x01","14.6x02","14.7100x001","14.7201","14.7300x001","14.7401","14.7500x001","14.7500x002","14.7500x003","14.7500x004","14.7501","14.7900x001","14.7901","14.7902","14.7903","14.7904","14.7905","14.9x00x001","14.9x01","14.9x02","14.9x03","14.9x04","14.9x05","14.9x06","14.9x07","14.9x08","16.9100x002"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合CB1入组条件，匹配规则：主手术匹配");
                
            if (MDCC_DRG.CB13_group(record)){
                return "CB13";
            }
    
            if (MDCC_DRG.CB15_group(record)){
                return "CB15";
            }

            return "CB1";
        }else{
            return "";
        }
    }
}

