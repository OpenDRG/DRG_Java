package drg_group.chs_drg_11.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCF_DRG;

public class FT1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A01.000x016+I41.0*","A36.802+I41.0*","A38.x00x002+I41.0*","A39.503+I41.0*","A52.007+I41.0*","A54.804+I41.0*","B01.800x001+I41.1*","B25.803+I41.1*","B26.803+I41.1*","B33.200","B33.200x004+I41.1*","B33.201+I41.1*","B57.001+I98.1*","B57.002+I41.2*","B57.202+I41.2*","B57.202+I41.2*","B58.800x001+I41.2*","D86.800x005+I41.8*","E05.900x004+I43.8*","E10.502+I79.2*","E11.502+I79.2*","E14.500x031+I43.8*","E14.500x032+I43.8*","E63.901+I43.2*","E74.006+K77.8*","E74.008+I43.1*","E76.300x002+I52.8*","E83.103","E85.416+I43.1*","E88.907+I43.1*","I01.200","I09.000","I25.500","I40.000x003","I40.000x005","I40.000x006","I40.000x007","I40.001","I40.002","I40.100","I40.800x001","I40.800x002","I40.800x003","I40.900","I42.000x001","I42.001","I42.100","I42.200x002","I42.201","I42.300","I42.301","I42.401","I42.500x001","I42.501","I42.600","I42.701","I42.800x001","I42.800x002","I42.800x004","I42.800x005","I42.800x006","I42.800x007","I42.801","I42.802","I42.803","I42.900","I42.901","I42.902","I42.904","I42.905","I50.906","I51.400","I51.400x005","I51.400x006","I51.401","I51.403","I51.403","I51.404","I51.500x002","I51.500x006","I51.501","I51.502","I51.802","J09.x03+I41.1*","J10.800x003+I41.1*","J10.802+I41.1*","J11.801+I41.1*","M05.302+I43.8*","M05.306+I41.8*","M32.104+I43.8*","T70.200x007"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FT1入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FT11_group(record)){
                return "FT11";
            }
    
            if (MDCF_DRG.FT13_group(record)){
                return "FT13";
            }
    
            if (MDCF_DRG.FT15_group(record)){
                return "FT15";
            }

            return "FT1";
        }else{
            return "";
        }
    }
}

