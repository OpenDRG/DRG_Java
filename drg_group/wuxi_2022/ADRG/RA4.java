package drg_group.wuxi_2022.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.DRG.MDCR_DRG;

public class RA4 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C76.300x001","C76.300x009","C76.304","C76.305","C76.306","C76.400","C76.401","C76.402","C76.500","C76.501","C76.502","C76.503","C76.700x002","C76.701","C76.702","C90.000","C90.000x004","C90.000x005","C90.000x008+M90.6*","C90.000x009","C90.000x011","C90.000x012","C90.000x014","C90.000x021","C90.000x022","C90.000x023","C90.000x024","C90.000x025","C90.000x026","C90.000x027","C90.000x028","C90.000x029","C90.000x030","C90.000x031","C90.000x032","C90.000x033","C90.000x034","C90.000x035","C90.000x036","C90.000x037","C90.000x038","C90.000x039","C90.000x040","C90.000x041","C90.001","C90.002","C90.002","C90.200","C90.200x008","C90.200x009","C90.200x013","C90.300x001","C90.300x002","C90.300x003","C90.300x004","C90.300x004","C90.302","C90.303","C90.303","C91.704"};
        String[] adrg_ss={"01.1200","01.1400","01.2400x005","01.2400x009","01.2400x013","01.2400x018","01.2402","01.2405","01.2407","01.2413","01.2414","01.2415","02.0101","02.0102","02.0201","02.0202","02.0203","02.0300x001","02.0400x003","02.0500x004","02.0500x005","02.0502","02.0600x003","02.0700","03.3201","03.3202","03.4x00x002","03.4x00x004","25.0200","25.1x01","25.1x02","25.1x03","25.1x04","25.1x05","25.2x00","25.2x01","32.2400x001","32.2500x001","33.2000","33.2000x002","33.2400x001","33.2400x002","33.2400x002","33.2400x002","33.2402","33.2405","33.2500x002","33.2500x003","33.2800x001","34.2000","34.2502","34.2600","34.2700x001","34.9101","34.9102","34.9103","37.2401","37.9100","39.9800x001","39.9801","40.1100x003","40.1100x004","40.2900x008","40.2902","40.2906","40.2908","41.1x00","41.3300","41.4200x003","41.9100x001","41.9200","41.9201","41.9202","41.9203","41.9800","42.1100","42.1200","42.1901","42.2100","42.2200","42.2500","42.3200x003","42.3201","42.3300x006","42.3301","42.3303","42.3305","42.3306","42.3309","43.0x00x003","43.0x02","43.1100x001","43.1900x003","43.1900x005","43.4100x011","43.4100x013","43.4100x014","43.4100x015","43.4100x016","43.4101","44.1500","45.1101","45.3001","45.3004","45.3005","45.3007","45.3400x002","45.3400x003","45.3400x004","45.4200x003","45.4201","45.4300x008","45.4300x009","45.4300x012","45.4302","45.4304","45.4307","46.0401","46.0402","46.1000","46.1000x007","46.1100","46.1100x002","46.1300","46.1301","46.1400","46.2100","46.2300x001","46.2301","46.2400","46.3200x002","46.3900x002","46.3900x006","46.3900x007","46.3901","46.3902","46.3904","46.3905","46.4100","46.4101","46.4102","46.4103","46.8600","48.3507","48.3600x002","48.3600x003","48.3600x004","48.3600x006","48.3600x007","50.1200","50.1400","50.2301","50.2302","50.2303","50.2401","50.2402","50.2403","50.2404","50.2502","50.2900x020","50.2902","50.2904","50.2905","50.2908","50.2909","50.6101","50.6900x002","50.6901","50.9401","50.9402","50.9900x003","51.1301","51.1302","51.8400x001","51.8500x002","51.8501","51.8502","51.8503","51.8600x002","51.8700x001","51.8700x003","51.8700x004","51.9100","51.9200","51.9501","51.9600x001","51.9800x001","51.9800x005","51.9800x008","51.9800x009","51.9800x010","51.9800x012","51.9800x013","51.9800x015","51.9800x016","51.9801","51.9806","51.9807","51.9808","51.9901","52.0903","52.1200","52.9201","52.9300","52.9300x002","52.9400","52.9400x002","54.0x00x002","54.0x00x004","54.0x00x006","54.0x00x010","54.0x00x013","54.0x00x018","54.0x00x021","54.0x00x022","54.0x00x023","54.0x00x024","54.0x00x025","54.0x01","54.0x02","54.0x03","54.0x04","54.0x05","54.0x06","54.0x07","54.0x08","54.1100","54.2100","54.2200x003","54.2300x003","54.2300x004","54.2300x005","54.2300x006","54.2301","54.2302","54.2303","54.3x00x004","54.3x00x010","54.3x00x011","54.3x00x027","54.3x01","54.3x02","54.3x03","54.3x04","54.3x05","54.3x07","54.4x02","54.6101","54.6301","54.6400","54.6401","54.7100","54.7200x001","54.9100x002","54.9100x009","54.9101","54.9104","54.9300x001","55.3301","55.3302","56.4100x012","56.5101","56.5102","56.5200x001","56.6100x001","56.6100x003","56.6100x004","56.7100x002","56.7100x004","56.7300","56.7402","56.7501","56.8100","56.8200x002","56.8201","56.8300","56.8400x001","56.8401","56.8500","56.8600","57.1200","57.1901","57.1902","57.1903","57.1905","57.2100","57.3400x002","57.4100x002","57.8200","57.8900x003","57.8900x004","57.8903","57.9102","57.9201","57.9600","57.9900x001","58.0x00x003","58.0x01","58.0x02","58.1x01","58.3101","58.3103","58.3901","58.3902","58.3903","58.3904","58.3905","58.3906","58.4301","58.4302","58.4303","58.4304","58.4305","58.9102","58.9200x002","58.9201","58.9300","58.9901","59.0000","59.0201","59.0202","59.0203","59.0301","59.0302","59.0303","59.0901","59.0902","59.0903","59.1901","59.1902","59.2101","60.2100x001","60.2900x003","60.2901","60.2902","60.6100x001","60.6100x002","60.6101","60.6200","60.6201","60.6900x001","60.6900x002","65.1200x001","65.1201","65.1300","67.2x00","67.2x01","67.3904","68.1300","68.1400","68.1501","68.1601","68.2903","68.2915","68.2917","71.2400x003"};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null &&record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RA4入组条件，匹配规则：主诊断匹配、主手术匹配");
            
            return "RA4";
        }else{
            return "";
        }
    }
}

