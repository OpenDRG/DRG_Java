package drg_group.handan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;
import drg_group.handan_2022.DRG.MDCG_DRG;

public class GJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"34.0401","34.0402","34.8101","34.8102","34.8301","34.8302","34.8303","34.9103","38.8601","38.8602","38.8603","38.8604","38.8607","38.8701","39.1x00x011","39.1x00x013","39.1x01","39.2606","39.3203","39.5000x011","39.5000x021","39.7101","39.7102","39.7103","39.7800x006","39.9001","39.9002","39.9800x001","39.9801","40.1100x003","40.2100","40.2300","40.2400","40.2900x002","40.2900x017","40.2900x018","40.2900x020","40.2900x023","40.2900x028","40.2901","40.2905","40.2906","40.2907","40.2908","40.2909","40.3x00x001","40.3x00x002","40.5300","40.5301","40.5400x001","40.5400x002","40.5400x003","40.9x00x003","40.9x00x004","40.9x00x006","40.9x00x007","40.9x00x008","40.9x00x009","40.9x00x010","40.9x00x011","40.9x00x012","40.9x00x013","40.9x00x014","40.9x00x015","40.9x00x016","40.9x09","41.4200x002","41.5x00","41.5x01","44.1101","48.2600","51.1301","51.1302","51.8100","51.8101","51.8200x003","51.8201","51.8900","52.1200","52.5901","52.5902","52.5904","53.8000x001","53.8001","53.8002","53.8100x001","53.8301","54.0x00x002","54.0x00x004","54.0x00x006","54.0x00x010","54.0x00x013","54.0x00x018","54.0x00x021","54.0x00x022","54.0x00x023","54.0x00x024","54.0x00x025","54.0x00x026","54.0x00x027","54.0x01","54.0x02","54.0x03","54.0x04","54.0x05","54.0x06","54.0x07","54.0x08","54.1100","54.1101","54.1201","54.1202","54.1900x001","54.1900x005","54.1900x006","54.1900x010","54.1900x011","54.1900x020","54.1900x023","54.1900x024","54.1900x025","54.1901","54.1902","54.1903","54.1904","54.1905","54.1906","54.1907","54.1908","54.1909","54.2100","54.2200x003","54.2300x003","54.2300x004","54.2300x005","54.2300x006","54.2301","54.2302","54.2303","54.2500","54.3x00x004","54.3x00x010","54.3x00x011","54.3x00x027","54.3x01","54.3x02","54.3x03","54.3x04","54.3x05","54.3x06","54.3x07","54.3x08","54.4x00x005","54.4x00x006","54.4x00x007","54.4x00x012","54.4x00x021","54.4x00x035","54.4x00x039","54.4x00x042","54.4x00x048","54.4x00x052","54.4x01","54.4x02","54.4x03","54.4x04","54.4x05","54.4x06","54.4x07","54.4x08","54.4x09","54.4x10","54.4x11","54.4x12","54.4x13","54.4x14","54.4x15","54.4x16","54.6101","54.6200","54.6301","54.6400","54.6400x001","54.6401","54.7100","54.7200x001","54.7200x002","54.7200x003","54.7200x004","54.7300x001","54.7301","54.7302","54.7400x001","54.7400x002","54.7400x003","54.7400x004","54.7400x005","54.7400x006","54.7401","54.7402","54.7403","54.7404","54.7405","54.7500x002","54.7501","54.7502","54.9100x002","54.9100x009","54.9101","54.9104","54.9201","54.9202","54.9300x001","54.9400x002","54.9400x003","54.9400x004","54.9401","54.9402","54.9500","54.9500x004","54.9500x005","54.9501","54.9502","54.9700x001","54.9703","54.9900x010","54.9900x011","54.9900x017","54.9902","54.9904","96.2200x002","96.2900","98.0500x003","98.1800x001"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GJ1入组条件，匹配规则：主手术匹配");
                
            if (MDCG_DRG.GJ11_group(record)){
                return "GJ11";
            }
    
            if (MDCG_DRG.GJ13_group(record)){
                return "GJ13";
            }
    
            if (MDCG_DRG.GJ15_group(record)){
                return "GJ15";
            }

            return "";
        }else{
            return "";
        }
    }
}

