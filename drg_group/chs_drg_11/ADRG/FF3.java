package drg_group.chs_drg_11.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCF_DRG;

public class FF3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_ss={"20.7100","20.7903","38.0000","38.0200x002","38.0200x003","38.0200x004","38.0201","38.0202","38.0300x003","38.0300x005","38.0301","38.0302","38.0500x002","38.0500x003","38.0500x004","38.0501","38.0600x002","38.0600x003","38.0601","38.0602","38.0700x001","38.0700x003","38.0700x004","38.0701","38.0703","38.0704","38.0705","38.0800x002","38.0800x003","38.0800x004","38.0800x005","38.0801","38.0802","38.0900x001","38.0900x002","38.0901","38.0902","38.1000x002","38.1200x003","38.1201","38.1202","38.1300","38.1600x002","38.1600x005","38.1601","38.1602","38.1603","38.1604","38.1800x001","38.1800x002","38.1800x003","38.1800x004","38.1800x005","38.1800x006","38.1800x007","38.1801","38.1802","38.1803","38.1804","38.3000","38.3000x001","38.3200x002","38.3200x003","38.3201","38.3202","38.3300","38.3301","38.3500x003","38.3500x004","38.3700x001","38.3700x002","38.3700x003","38.3700x004","38.3700x005","38.3701","38.3800","38.3900","38.4000","38.4200x001","38.4200x002","38.4200x003","38.4201","38.4202","38.4203","38.4300x001","38.4300x002","38.4300x003","38.4300x004","38.4300x005","38.4300x006","38.4300x007","38.4300x008","38.4301","38.4302","38.4303","38.4304","38.4500x002","38.4500x020","38.4500x022","38.4500x023","38.4500x024","38.4508","38.4509","38.4600x001","38.4600x003","38.4600x004","38.4600x005","38.4600x006","38.4601","38.4602","38.4603","38.4604","38.4700x002","38.4700x003","38.4700x004","38.4700x005","38.4701","38.4800x001","38.4800x002","38.4800x003","38.4800x004","38.4801","38.4802","38.4803","38.4804","38.4805","38.4900x001","38.4900x002","38.5000","38.5201","38.5202","38.5300","38.5500","38.5701","38.6000x010","38.6000x011","38.6000x012","38.6000x013","38.6200x002","38.6200x003","38.6200x005","38.6200x006","38.6200x007","38.6200x008","38.6200x009","38.6200x010","38.6201","38.6300x001","38.6301","38.6302","38.6500x001","38.6500x002","38.6500x005","38.6501","38.6600x002","38.6600x003","38.6600x004","38.6601","38.6602","38.6703","38.6705","38.6706","38.6800x002","38.6801","38.6802","38.6901","38.7x00x009","38.7x00x010","38.8000","38.8200x003","38.8200x005","38.8200x006","38.8200x007","38.8200x008","38.8200x009","38.8201","38.8202","38.8203","38.8300x004","38.8301","38.8302","38.8303","38.8500x010","38.8500x016","38.8500x017","38.8500x018","38.8503","38.8504","38.8600x004","38.8600x005","38.8600x006","38.8601","38.8602","38.8603","38.8604","38.8605","38.8606","38.8607","38.8608","38.8609","38.8700x001","38.8700x002","38.8700x008","38.8700x009","38.8700x010","38.8700x011","38.8700x012","38.8701","38.8702","38.8703","38.8704","38.8800x002","38.8800x003","38.8800x004","38.8800x005","38.8801","38.8901","38.9100","38.9100x601","38.9100x602","38.9200","38.9300","38.9300x201","38.9300x701","38.9300x702","38.9400","38.9501","38.9502","38.9700x002","38.9800x001","38.9800x801","38.9900x002","38.9900x501","38.9900x701","38.9900x901","39.0x02","39.1x00x007","39.1x00x012","39.1x00x013","39.1x00x020","39.1x00x021","39.1x00x022","39.1x00x023","39.1x00x024","39.1x07","39.1x10","39.2200x002","39.2200x003","39.2200x004","39.2200x005","39.2200x006","39.2200x011","39.2200x014","39.2200x018","39.2200x019","39.2200x022","39.2200x023","39.2200x024","39.2200x025","39.2202","39.2205","39.2206","39.2208","39.2209","39.2210","39.2211","39.2300x009","39.2500x005","39.2500x006","39.2500x009","39.2500x010","39.2500x011","39.2500x012","39.2500x013","39.2500x014","39.2500x015","39.2500x020","39.2500x021","39.2501","39.2504","39.2506","39.2508","39.2600x002","39.2600x003","39.2600x004","39.2600x007","39.2600x009","39.2600x010","39.2600x011","39.2600x012","39.2600x013","39.2602","39.2604","39.2605","39.2607","39.2900x003","39.2900x004","39.2900x005","39.2900x010","39.2900x011","39.2900x012","39.2900x013","39.2900x013","39.2900x015","39.2900x017","39.2900x019","39.2900x024","39.2900x025","39.2900x026","39.2900x027","39.2900x028","39.2900x030","39.2900x031","39.2900x032","39.2900x033","39.2900x034","39.2900x035","39.2900x036","39.2900x037","39.2900x038","39.2900x039","39.2900x040","39.2900x041","39.2900x042","39.2900x043","39.2900x045","39.2900x046","39.2900x047","39.2900x048","39.2900x049","39.2900x050","39.2900x051","39.2900x052","39.2900x053","39.2900x054","39.2900x055","39.2900x056","39.2901","39.2902","39.2903","39.2904","39.2905","39.2906","39.2907","39.2908","39.2909","39.2910","39.2911","39.2912","39.2913","39.2914","39.2915","39.2916","39.3100","39.3100x002","39.3100x004","39.3100x005","39.3100x006","39.3100x007","39.3100x009","39.3100x010","39.3100x011","39.3100x014","39.3100x015","39.3100x016","39.3100x017","39.3100x018","39.3100x019","39.3101","39.3102","39.3103","39.3104","39.3105","39.3106","39.3108","39.3109","39.3110","39.3111","39.3112","39.3113","39.3200","39.3200x004","39.3200x007","39.3200x008","39.3200x009","39.3200x010","39.3200x011","39.3200x012","39.3200x013","39.3201","39.3202","39.3204","39.3206","39.3207","39.4100x001","39.4100x002","39.4300x001","39.4301","39.4900x001","39.4900x004","39.4900x005","39.4900x006","39.4900x008","39.5100","39.5100x008","39.5100x009","39.5101","39.5102","39.5103","39.5104","39.5105","39.5106","39.5107","39.5108","39.5200x002","39.5200x003","39.5200x009","39.5200x011","39.5200x012","39.5200x014","39.5200x015","39.5200x016","39.5200x017","39.5201","39.5202","39.5300x010","39.5300x011","39.5300x013","39.5300x015","39.5300x016","39.5300x017","39.5300x018","39.5300x022","39.5300x023","39.5300x024","39.5300x025","39.5302","39.5303","39.5304","39.5500","39.5600x002","39.5600x003","39.5600x004","39.5600x005","39.5600x006","39.5600x007","39.5601","39.5602","39.5700x005","39.5700x006","39.5700x007","39.5700x008","39.5700x009","39.5701","39.5702","39.5800","39.5900x001","39.5900x003","39.5900x004","39.5900x005","39.5900x006","39.5900x007","39.5900x008","39.5900x010","39.5900x011","39.5900x013","39.5900x014","39.5900x019","39.5900x021","39.5900x022","39.5900x023","39.5900x024","39.5900x031","39.5900x033","39.5900x034","39.5900x035","39.5900x036","39.7200x009","39.7900x015","39.7900x077","39.7900x078","39.7900x301","39.7900x801","39.8900x001","39.8901","39.9300","39.9401","39.9800x003","39.9900","40.0x01","40.2900x002","40.2900x008","40.2900x017","40.2900x018","40.2900x019","40.2900x020","40.2910","40.6301","40.9x00x003","40.9x00x004","40.9x00x005","40.9x00x006","40.9x00x007","40.9x00x008","40.9x00x009","40.9x00x010","40.9x00x011","40.9x00x012","40.9x00x013","40.9x00x014","40.9x00x015","40.9x00x016","40.9x00x017","40.9x01","40.9x02","40.9x03","40.9x04","40.9x05","40.9x06","40.9x07","40.9x08","40.9x09","54.9400x002","54.9401","55.9902","59.0200x007","59.0300x002","86.0701","87.3400x001","88.0400","88.0401","88.3400","88.3600","88.3900x001","88.8901","92.1601","99.6400","99.7200x002"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null &&record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FF3入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FF33_group(record)){
                return "FF33";
            }
    
            if (MDCF_DRG.FF35_group(record)){
                return "FF35";
            }

            return "FF3";
        }else{
            return "";
        }
    }
}

