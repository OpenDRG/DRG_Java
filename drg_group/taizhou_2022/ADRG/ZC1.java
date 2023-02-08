package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCZ_DRG;

public class ZC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"79.6201","79.6500","79.6601","79.6602","79.6701","79.6702","79.6800","79.6900x002","79.7200","79.7500","79.7600x001","79.7900x002","79.7900x003","79.7900x005","79.7900x006","79.8100x003","79.8200x001","79.8201","79.8300x001","79.8301","79.8401","79.8500x001","79.8600x002","79.8700","79.8801","79.8803","79.8900x001","79.8900x002","79.8900x003","79.8900x005","79.8900x006","79.8900x007","80.0100x001","80.0100x002","80.0200x001","80.0200x002","80.0201","80.0300x001","80.0300x002","80.0400x001","80.0400x002","80.0500x001","80.0500x003","80.0501","80.0600x001","80.0600x002","80.0601","80.0700x001","80.0700x002","80.0800x001","80.0800x002","80.0900x001","80.1101","80.1201","80.1300","80.1300x002","80.1400","80.1500","80.1501","80.1601","80.1602","80.1603","80.1701","80.1800x003","80.1801","80.1802","80.4101","80.4102","80.4201","80.4202","80.4300x001","80.4301","80.4400x001","80.4400x004","80.4401","80.4500x001","80.4501","80.4601","80.4603","80.4700x002","80.4701","80.4800x002","80.4800x005","80.4801","80.4802","80.4901","80.5100x008","80.5100x011","80.5100x013","80.5100x023","80.5100x024","80.5100x025","80.5100x026","80.5100x027","80.5100x028","80.5100x029","80.5100x030","80.5100x031","80.5100x032","80.5100x033","80.5100x034","80.5100x035","80.5100x036","80.5100x037","80.5100x038","80.5100x039","80.5101","80.5102","80.5103","80.5104","80.5105","80.5106","80.5107","80.5108","80.5109","80.5110","80.5111","80.5200","80.5400x001","80.5401","80.5900x001","80.5900x003","80.6x00x002","80.6x00x010","80.6x00x011","80.6x01","80.6x02","80.6x03","80.6x05","80.6x06","80.6x07","80.6x08","80.7100","80.7101","80.7200","80.7201","80.7300","80.7301","80.7400","80.7500","80.7501","80.7600","80.7601","80.7700","80.7701","80.7800","80.7800x002","80.7801","80.8101","80.8102","80.8200x003","80.8201","80.8202","80.8301","80.8302","80.8401","80.8402","80.8501","80.8502","80.8600x009","80.8601","80.8602","80.8700x007","80.8701","80.8702","80.8800x003","80.8801","80.9900x003","80.9900x005","80.9900x006","80.9901","80.9902","80.9903","81.0100x001","81.0101","81.0102","81.0103","81.0104","81.0105","81.0200x001","81.0200x002","81.0300x001","81.0300x002","81.0400x004","81.0400x005","81.0401","81.0402","81.0500x005","81.0500x006","81.0501","81.0502","81.0600x005","81.0600x006","81.0601","81.0602","81.0700x002","81.0701","81.0702","81.0800x016","81.0800x017","81.0800x018","81.0801","81.0802","81.1100x003","81.1101","81.1200x001","81.1300x003","81.1300x004","81.1400x002","81.1500","81.1600","81.1700x001","81.1700x003","81.1800","81.2201","81.2300x002","81.2300x003","81.2300x004","81.2300x005","81.2301","81.2401","81.2500x002","81.2500x003","81.2500x004","81.2501","81.2601","81.2701","81.2801","81.3101","81.3102","81.3103","81.3104","81.3105","81.3106","81.3200x001","81.3200x002","81.3300x001","81.3300x002","81.3400x003","81.3400x004","81.3401","81.3402","81.3500x003","81.3500x004","81.3501","81.3502","81.3600x003","81.3600x004","81.3601","81.3602","81.3700x001","81.3700x002","81.3701","81.3702","81.3800x003","81.3800x004","81.3800x005","81.3801","81.3802","81.3900","81.4000x004","81.4000x005","81.4000x006","81.4001","81.4200","81.4300","81.4401","81.4402","81.4403","81.4501","81.4502","81.4503","81.4504","81.4505","81.4600x001","81.4601","81.4700x001","81.4700x005","81.4700x012","81.4700x013","81.4700x014","81.4700x015","81.4700x016","81.4700x017","81.4700x018","81.4700x019","81.4701","81.4900x001","81.4900x002","81.4900x003","81.4900x004","81.4900x005","81.4900x006","81.5100","81.5200x004","81.5201","81.5202","81.5400x004","81.5400x005","81.5400x007","81.5400x008","81.5401","81.5600","81.5700x001","81.5700x002","81.6200","81.6300","81.6400x003","81.6500","81.6600x001","81.6600x002","81.6600x003","81.6601","81.7100x001","81.7100x002","81.7100x003","81.7200x002","81.7200x003","81.7200x004","81.7200x005","81.7200x006","81.7300x001","81.7400x001","81.7400x002","81.7500x001","81.7500x002","81.7500x003","81.7500x004","81.7500x005","81.8000x003","81.8101","81.8200","81.8300x001","81.8300x003","81.8300x004","81.8300x006","81.8300x007","81.8300x008","81.8305","81.8400x002","81.8500x001","81.8500x002","81.8500x004","81.8500x005","81.8500x006","81.8500x007","81.8500x008","81.8800","81.9300x003","81.9300x004","81.9300x005","81.9300x006","81.9300x007","81.9300x008","81.9300x009","81.9300x010","81.9301","81.9302","81.9400x001","81.9400x006","81.9400x007","81.9401","81.9402","81.9403","81.9404","81.9500x001","81.9501","81.9502","81.9600x003","81.9600x015","81.9600x017","81.9600x018","81.9600x019","81.9600x020","81.9600x021","81.9600x022","81.9600x023","81.9600x024","81.9600x025","81.9600x026","81.9600x027","81.9600x028","81.9600x029","81.9600x030","81.9600x031","81.9700x002","81.9701","81.9702","81.9703","82.0101","82.0102","82.0200x001","82.0300","82.0401","82.0402","82.1100x002","82.1101","82.1200x002","82.1201","82.2100","82.2200","82.2900x001","82.3200x001","82.3301","82.3400x001","82.3400x002","82.3500x001","82.3500x002","82.3600x001","82.4100","82.4200","82.4300x001","82.4400x001","82.4400x002","82.4500x001","82.4500x009","82.4500x010","82.4500x011","82.4500x012","82.4500x013","82.4601","82.4602","82.5100","82.5200","82.5301","82.5401","82.5501","82.5600x002","82.5600x003","82.5600x004","82.5600x005","82.5601","82.5700x001","82.5801","82.5900x001","82.6100x002","82.6900x002","82.6901","82.7100x001","82.7100x002","82.7201","82.7202","82.7900x001","82.8100x001","82.8500x001","82.8500x002","82.8600x001","82.8600x006","82.8600x010","82.8600x011","82.8600x012","82.8600x013","82.8901","83.0100x001","83.0101","83.0300","83.1300x001","83.1300x004","83.1300x006","83.1403","83.1900x001","83.1900x003","83.1900x010","83.1900x023","83.2900x002","83.3100x001","83.3100x008","83.3200x009","83.3200x012","83.6400x007","83.6400x008","83.6400x009","83.6400x011","83.6400x013","83.6500x002","83.6500x003","83.6500x005","83.6500x006","83.6500x011","83.6500x012","83.6500x013","83.6500x016","83.7500x003","83.7600x002","83.7600x005","83.7700x001","83.7700x003","83.7700x004","83.7700x005","83.7700x006","83.7700x007","83.7700x008","83.7700x009","83.7700x010","83.7700x011","83.7700x012","83.7700x013","83.7700x014","83.7700x015","83.7700x016","83.7700x017","83.7700x018","83.7700x019","83.7700x020","83.7700x021","83.7700x022","83.7700x023","83.7700x024","83.7700x025","83.7700x026","83.7700x027","83.7700x028","83.7700x029","83.7700x030","83.7700x031","83.7700x032","83.7700x033","83.7701","83.7702","83.7900x002","83.7900x003","83.8500x001","83.8500x002","83.8500x003","83.8500x004","83.8500x005","83.8500x008","83.8500x009","83.8500x010","83.8600","83.8700x003","83.8700x007","83.8800x010","83.8800x012","83.8800x014","83.9100x004","83.9100x009","84.0100x001","84.0100x002","84.0100x004","84.0101","84.0103","84.0201","84.0202","84.0301","84.0400","84.0500","84.0600","84.0701","84.0800","84.1101","84.1200","84.1300","84.1400","84.1500x002","84.1600","84.1701","84.1800","84.1901","84.2101","84.2201","84.2301","84.2302","84.2303","84.2304","84.2401","84.2501","84.2601","84.2701","84.2801","84.5300","84.5400x001","84.5900x002","84.6101","84.6201","84.6300x002","84.6300x003","84.6301","84.6400x001","84.6400x003","84.6401","84.6501","84.6600x001","84.6601","84.6700x002","84.6701","84.6800x001","84.6801"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合ZC1入组条件，匹配规则：主手术匹配");
                
            if (MDCZ_DRG.ZC19_group(record)){
                return "ZC19";
            }

            return "ZC1";
        }else{
            return "";
        }
    }
}

