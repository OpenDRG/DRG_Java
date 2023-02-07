package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCF_DRG;

public class FD1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"35.3400x005","35.3400x007","35.3400x008","35.5400x003","35.5400x004","35.5400x005","35.5400x006","35.6300x003","35.6300x004","35.6300x005","35.7300x002","35.7300x003","35.7300x004","35.7300x005","35.7300x006","35.7300x007","35.7301","35.8100x001","35.8100x002","35.8100x003","35.8100x004","35.8307","35.8308","35.8309","35.8400x001","35.8400x002","35.8400x003","35.9101","35.9102","35.9200x001","35.9200x003","35.9200x004","35.9200x005","35.9201","35.9202","35.9300x002","35.9300x003","35.9300x004","35.9300x005","35.9301","35.9302","35.9400x003","35.9400x004","35.9400x005","35.9400x006","35.9401","35.9402","35.9500x002","35.9500x007","35.9500x008","35.9501","36.3100x001","37.0x00x003","37.1000x007","37.3201","37.3202","37.3300x006","37.3300x009","37.3300x012","37.3300x016","37.3300x018","37.3300x019","37.3300x020","37.3300x021","37.3300x024","37.3300x025","37.3300x029","37.3301","37.3302","37.3303","37.3306","37.3308","37.3500x005","37.3501","37.3600x006","37.3701","37.3702","37.3703"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FD1入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FD19_group(record)){
                return "FD19";
            }

            return "FD1";
        }else{
            return "";
        }
    }
}

