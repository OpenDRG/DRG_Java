package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCF_DRG;

public class FB2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"35.0100x002","35.0101","35.0200x003","35.0201","35.0300x002","35.0301","35.0400x001","35.0401","35.0600x001","35.0600x002","35.0800x001","35.0800x002","35.1000","35.1100x003","35.1100x004","35.1100x005","35.1101","35.1200x001","35.1200x002","35.1200x003","35.1201","35.1202","35.1300x002","35.1300x004","35.1300x005","35.1301","35.1400x001","35.1400x002","35.1400x003","35.1400x006","35.1401","35.1402","35.2000x001","35.2000x002","35.2000x003","35.2100x002","35.2100x003","35.2100x004","35.2100x005","35.2101","35.2200x002","35.2200x003","35.2200x004","35.2201","35.2300x002","35.2300x003","35.2301","35.2302","35.2400x002","35.2400x003","35.2401","35.2402","35.2500x002","35.2501","35.2600x002","35.2601","35.2701","35.2702","35.2801","35.2802","35.3101","35.3200x003","35.3200x004","35.3201","35.3202","35.3300x001","35.3300x002","35.3300x003","35.3300x004","35.3500x002","35.3500x003","35.3500x004","35.3500x005","35.3500x006","35.3500x007","35.3500x008","35.3500x009","35.3500x011","35.3500x012","35.3501","35.9500x001","35.9500x003","35.9500x004","35.9500x005","35.9502","35.9900x001","35.9900x002","37.3300x017","37.3300x026"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FB2入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FB21_group(record)){
                return "FB21";
            }
    
            if (MDCF_DRG.FB23_group(record)){
                return "FB23";
            }
    
            if (MDCF_DRG.FB25_group(record)){
                return "FB25";
            }

            return "FB2";
        }else{
            return "";
        }
    }
}

