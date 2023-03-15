package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCG_DRG;

public class GK1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"42.3300x015","42.3300x016","42.3300x017","42.9200x007","43.4100x021","43.4100x024","43.4100x025","43.4106","43.4107","44.9901","45.3000x005","45.3000x006","45.3000x007","45.3004","45.3007","45.3400x001","45.3400x002","45.3400x003","45.3400x004","45.3400x005","45.3400x006","45.3400x007","45.3400x008","45.3401","45.3402","45.4300x009","45.4300x012","45.4300x015","45.4300x016","45.4300x017","48.3600x003","48.3600x006","48.3600x009","48.3600x010","48.3600x011"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GK1入组条件，匹配规则：主手术匹配");
                
            if (MDCG_DRG.GK19_group(record)){
                return "GK19";
            }

            return "GK1";
        }else{
            return "";
        }
    }
}

