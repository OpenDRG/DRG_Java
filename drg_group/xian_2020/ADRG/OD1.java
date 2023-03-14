package drg_group.xian_2020.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;
import drg_group.xian_2020.DRG.MDCO_DRG;

public class OD1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.8609","38.8700x002","38.8700x008","38.8700x009","39.7900x019","39.7906","54.1101","65.2901","65.3100","65.3900x001","65.4100","65.4900x001","65.5100","65.5200","65.5200x001","65.6200x001","66.3201","66.3900x001","66.3900x004","66.3901","66.3902","67.5900x001","68.2400","68.2401","68.2500x001","68.2501","68.3900x003","68.3901","68.4901","69.4900x005","69.4900x006","69.4902","69.4903","69.4904","69.9100x001","69.9101","70.3200x002","70.7905","70.7906","70.7909","71.7900x008","71.7900x013","71.7901","71.7903","74.9100","74.9100x001","74.9101","75.5100","75.5200","75.6901","75.6904","75.6905","75.8x00","75.8x00x001","75.9203","75.9300","75.9400x001"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合OD1入组条件，匹配规则：主手术匹配");
                
            if (MDCO_DRG.OD19_group(record)){
                return "OD19";
            }

            return "OD1";
        }else{
            return "";
        }
    }
}

