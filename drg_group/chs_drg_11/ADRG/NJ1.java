package drg_group.chs_drg_11.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCN_DRG;

public class NJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.7x01","38.7x02","38.7x03","38.7x04","39.7900x019","39.7900x023","39.7900x024","39.7900x809","40.1100x003","40.2400","40.2900x002","40.2900x017","40.2900x018","40.2900x023","40.2901","40.2905","40.2906","40.2907","40.2908","40.2909","40.3x00x001","40.3x00x002","40.5000","40.5200","40.5300","40.5301","40.5400x001","40.5907","40.5908","40.5909","40.5910","40.5911","40.5912","40.9x00x003","40.9x00x004","40.9x00x006","40.9x00x007","40.9x00x008","40.9x00x009","40.9x00x010","40.9x00x011","40.9x00x012","40.9x00x013","40.9x00x014","40.9x00x015","40.9x00x016","40.9x09","48.8100x001","48.8101","48.8102","48.8201","48.8202","48.8203","48.8204","48.8205","48.8206","54.0x00x002","54.0x00x004","54.0x00x006","54.0x00x010","54.0x00x013","54.0x00x018","54.0x00x021","54.0x00x022","54.0x00x023","54.0x00x024","54.0x00x025","54.0x01","54.0x02","54.0x03","54.1100","54.1101","54.1201","54.1202","54.1900x001","54.1900x005","54.1900x010","54.1900x011","54.1901","54.1902","54.1903","54.1904","54.1907","54.1909","54.2100","54.2200x003","54.2300x003","54.2300x004","54.2300x005","54.2301","54.2302","54.2303","54.3x07","54.4x00x005","54.4x00x006","54.4x00x007","54.4x00x012","54.4x00x021","54.4x00x035","54.4x00x039","54.4x00x042","54.4x00x047","54.4x00x048","54.4x00x050","54.4x01","54.4x02","54.4x03","54.4x04","54.4x05","54.4x06","54.4x07","54.4x08","54.4x09","54.4x10","54.4x11","54.4x12","54.4x13","54.4x14","54.4x15","54.4x16","54.5100","54.5100x005","54.5100x009","54.5101","54.5102","54.5103","54.5900x007","54.5901","54.5902","54.5903","54.5904","54.5905","54.5906","54.6101","54.6301","54.6400","54.6401","54.7100","54.7200x001","54.7300x001","54.7400x001","54.7400x002","54.7400x003","54.7400x004","54.7400x005","54.7400x006","54.7404","54.7500x002","54.7501","54.9100x002","54.9100x009","54.9101","54.9104","54.9900x010","54.9900x011","54.9900x017","54.9904","58.0x02","58.0x04","69.1900x022","69.1901","69.1902","69.1903","69.1904","69.1905","69.1906","69.1907","69.1908","69.1909","69.2100x001","69.2101","69.3x01","69.3x02","69.9100x002","69.9800","70.0x00x003","70.1200x002","70.3200x002","70.3201","71.9x00"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合NJ1入组条件，匹配规则：主手术匹配");
                
            if (MDCN_DRG.NJ19_group(record)){
                return "NJ19";
            }

            return "NJ1";
        }else{
            return "";
        }
    }
}

