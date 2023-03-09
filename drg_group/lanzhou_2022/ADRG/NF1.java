package drg_group.lanzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2022.Base;
import drg_group.lanzhou_2022.MedicalRecord;
import drg_group.lanzhou_2022.DRG.MDCN_DRG;

public class NF1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"57.7101","67.0x00","67.0x00x002","67.0x01","67.2x00","67.2x01","67.3100","67.3200","67.3200x009","67.3200x012","67.3201","67.3202","67.3203","67.3300","67.3301","67.3302","67.3900x001","67.3900x002","67.3901","67.3902","67.3903","67.3904","67.3905","67.4x00x002","67.4x00x005","67.4x01","67.4x02","67.4x03","67.4x04","67.4x05","67.4x06","67.4x07","67.4x08","67.5100","67.5101","67.5900x001","67.5900x002","67.5900x003","67.5901","67.6100","67.6901","67.6902","69.3x00","69.9500","69.9500x001","69.9600","69.9700","70.0x00x002","70.1100","70.1200x001","70.1201","70.1202","70.1300","70.1400x002","70.1400x007","70.1400x011","70.1400x012","70.1401","70.1402","70.1403","70.1404","70.1405","70.1406","70.1407","70.1408","70.3100","70.3101","70.3300x003","70.3301","70.3302","70.3303","70.3304","70.3305","70.4x00x001","70.4x01","70.4x02","70.4x03","70.4x04","70.4x05","70.7100","70.7101","70.7600","70.7900x005","70.7900x006","70.7900x010","70.7901","70.7902","70.7903","70.7904","70.7905","70.7906","70.7907","70.7908","70.7909","71.0100x002","71.0100x003","71.0100x004","71.0900x001","71.0900x004","71.0900x006","71.0901","71.0902","71.0903","71.0904","71.0905","71.2100x001","71.2200x001","71.2200x002","71.2300x001","71.2400x001","71.2400x003","71.2401","71.2900x001","71.2900x002","71.3x00x001","71.3x00x007","71.3x00x011","71.3x00x013","71.3x00x021","71.3x00x022","71.3x00x023","71.3x00x024","71.3x00x025","71.3x01","71.3x03","71.3x04","71.3x05","71.4x01","71.4x02","71.4x03","71.4x04","71.4x05","71.5x00x001","71.5x00x003","71.5x00x004","71.6100","71.7101","71.7102","71.8x00","96.1800x001","98.1601","98.1700x001","98.2300x001"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合NF1入组条件，匹配规则：主手术匹配");
                
            if (MDCN_DRG.NF1A_group(record)){
                return "NF12";
            }
    
            if (MDCN_DRG.NF15_group(record)){
                return "NF15";
            }

            return "NF1";
        }else{
            return "";
        }
    }
}

