package drg_group.wuxi_2022.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.DRG.MDCG_DRG;

public class GK2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_ss={"42.3300x006","42.3300x007","42.3301","42.3302","42.3303","42.3304","42.3305","42.3306","42.3307","42.3308","42.3309","42.3310","42.8100","42.8101","42.9200x006","42.9200x008","42.9201","42.9202","42.9900x001","42.9901","43.1100x001","43.4100x011","43.4100x013","43.4100x014","43.4100x015","43.4100x016","43.4100x020","43.4101","43.4102","43.4103","43.4104","43.4105","43.4108","43.4109","43.4110","44.1100x002","44.2200x001","44.2200x002","44.2200x003","44.2200x004","44.2201","44.2202","44.3200x001","44.3201","44.4300x001","44.4300x002","44.4300x004","44.4300x005","44.4301","44.4302","44.4303","44.9300","44.9400","45.3001","45.3002","45.3003","45.3005","45.3006","46.8500x005","46.8501","46.8503","46.8510","97.5101","97.5900x002","98.0301","98.0302"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null &&record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GK2入组条件，匹配规则：主手术匹配");
                
            if (MDCG_DRG.GK23_group(record)){
                return "GK23";
            }
    
            if (MDCG_DRG.GK25_group(record)){
                return "GK25";
            }

            return "GK2";
        }else{
            return "";
        }
    }
}

