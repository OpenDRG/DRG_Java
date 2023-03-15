package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCL_DRG;

public class LF1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.0300x003","38.4301","38.4302","38.4303","38.9501","38.9502","39.2700x001","39.2700x002","39.2700x003","39.2700x004","39.2900x001","39.4200x001","39.4200x002","39.4200x003","39.4200x004","39.4300x001","39.5000x032","39.5300x013","39.7200x018","39.7900x077","39.9300","54.9300x003","54.9300x004","54.9300x005","54.9300x006","54.9300x007","54.9300x008","54.9300x009","54.9300x010","54.9300x011","54.9300x012","97.8600x007","97.8600x008","97.8600x009","97.8601","97.8900x004","97.8900x005"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LF1入组条件，匹配规则：主手术匹配");
                
            if (MDCL_DRG.LF11_group(record)){
                return "LF11";
            }
    
            if (MDCL_DRG.LF13_group(record)){
                return "LF13";
            }
    
            if (MDCL_DRG.LF15_group(record)){
                return "LF15";
            }

            return "LF1";
        }else{
            return "";
        }
    }
}

