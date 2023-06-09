package drg_group.guangxi_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.guangxi_2022.Base;
import drg_group.guangxi_2022.MedicalRecord;
import drg_group.guangxi_2022.DRG.MDCO_DRG;

public class OD1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.8609","38.8700x002","38.8700x008","38.8700x009","39.7900x019","39.7906","54.1101","65.2900x001","65.2900x007","65.2900x011","65.2900x022","65.2901","65.2902","65.2903","65.2904","65.2905","65.2906","65.3100","65.3900x001","65.4100","65.4900x001","65.4901","65.5100","65.5100x001","65.5200","65.5200x001","65.6200x001","66.3200x001","66.3201","66.3900x001","66.3900x004","66.3901","66.3902","68.2400","68.2401","68.2500x001","68.2501","68.2900x013","68.2900x028","68.2900x031","68.2900x038","68.2900x048","68.2901","68.2902","68.2903","68.2904","68.2905","68.2906","68.2907","68.2909","68.2910","68.2911","68.2912","68.2913","68.2914","68.2915","68.2916","68.2917","68.2918","68.3900x003","68.3901","68.3902","68.3903","68.3904","68.3905","68.3906","68.3907","68.4900x004","68.4900x006","68.4901","68.4902","68.4903","68.4905","69.4900x005","69.4900x006","69.4902","69.4903","69.4904","69.9100x001","69.9101","70.3200x002","74.9100","74.9100x001","74.9101","75.5100","75.5200","75.6901","75.6902","75.6903","75.6904","75.6905","75.8x00","75.8x00x001","75.9200x001","75.9200x002","75.9201","75.9202","75.9203","75.9300","75.9400x001"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0]) && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合OD1入组条件，匹配规则：主手术匹配、某一手术匹配");
                
            if (MDCO_DRG.OD11_group(record)){
                return "OD11";
            }
    
            if (MDCO_DRG.OD13_group(record)){
                return "OD13";
            }
    
            if (MDCO_DRG.OD15_group(record)){
                return "OD15";
            }

            return "";
        }else{
            return "";
        }
    }
}

