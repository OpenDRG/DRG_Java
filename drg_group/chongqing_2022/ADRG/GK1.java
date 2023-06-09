package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCG_DRG;

public class GK1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"42.3300x015","42.3300x016","42.3300x017","42.3303","42.3305","42.3306","43.4100x021","43.4100x024","43.4100x025","44.2200x002","44.4402","44.4403","45.3000x005","45.3000x006","45.3000x007","45.3001","45.3004","45.3005","45.3007","45.3400x001","45.3400x002","45.3400x003","45.3400x004","45.3400x006","45.3400x007","45.3400x008","45.4300x015","45.4300x016","45.4300x017","46.3200x002","46.3201","46.8504","46.8505","46.8506","46.8507","46.8508","46.8509","46.8600x001","46.9501","46.9600x001","47.0900x001","47.9900x002","48.3600x003","48.3600x004","48.3600x006","48.3600x009","48.3600x010","48.3600x011","97.5101","97.5201","97.5900x002","97.5900x003","97.5902","97.5903","98.0400x002"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GK1入组条件，匹配规则：主手术匹配");
                
            if (MDCG_DRG.GK19_group(record)){
                return "GK19";
            }

            return "";
        }else{
            return "";
        }
    }
}

