package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCH_DRG;

public class HZ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A01.001+K77.0*","A06.400+K77.0*","A18.301","A18.814+K77.0*","A50.000x002+K77.0*","A51.400x008+K77.0*","A52.700x007+K77.0*","B00.802+K77.0*","B00.803+K77.0*","B05.800x003+K77.0*","B25.100+K77.0*","B26.802+K77.0*","B44.803","B54.x00","B54.x00x003+K77.0*","B58.100+K77.0*","B65.900x004+K77.0*","B65.900x010+K77.0*","B65.903+K77.0*","B66.100x001+K77.0*","B66.301","B67.000x001+K77.0*","B67.500x001+K77.0*","B67.800x001+K77.0*","D13.400","D13.401","D13.500x001","D13.500x003","D13.501","D17.700x015","D18.013","D37.600x003","D37.600x004","E80.400","E80.500","E80.501","E80.600x005","E80.600x006","E80.600x007","E80.600x008","E80.601","E80.602","E80.603","E83.102","E85.415+K77.8*","I72.800x072","I72.809","I74.800x016","I74.803","I74.804","I77.000x017","I77.100x011","I81.x00","I81.x00x003","I82.000x001","I82.001","I86.808","I86.809","I87.108","I87.109","I87.121","I87.803","K65.007","K71.000x002","K71.001","K71.002","K71.200x001","K71.300x001","K71.400x001","K71.500x001","K71.500x002","K71.600","K71.600x002","K71.601","K71.800","K71.900","K71.900x003","K71.901","K72.004","K72.902","K72.904","K73.000x001","K73.100","K73.200x002","K73.800x001","K73.801","K73.900","K75.000","K75.000x002","K75.000x003","K75.001","K75.002","K75.003","K75.100","K75.200","K75.300","K75.300x001","K75.400","K75.401","K75.800x001","K75.800x006","K75.801","K75.803","K75.804","K75.810","K75.901","K76.000","K76.001","K76.102","K76.200","K76.300","K76.400","K76.401","K76.500","K76.500x001","K76.500x002","K76.600x002","K76.600x006","K76.600x007","K76.601","K76.602","K76.603","K76.800x003","K76.800x006","K76.800x007","K76.800x009","K76.800x015","K76.800x021","K76.800x022","K76.800x023","K76.800x026","K76.800x027","K76.801","K76.803","K76.804","K76.806","K76.807","K76.808","K76.809","K76.810","K76.811","K76.813","K76.814","K76.815","K76.816","K76.817","K76.818","K76.819","K76.900x002","K76.901","K91.825","K91.826","K91.827","K91.841","M32.108+K77.8*","M35.003+K77.8*","N82.201","N82.302","Q27.304","Q27.800x004","Q27.805","Q44.600","Q44.601","Q44.700x002","Q44.700x003","Q44.700x004","Q44.701","Q44.702","Q44.704","Q44.705","Q85.911","R16.000x001","R16.200x001","R17.900","R17.900x001","R17.901","R93.200x001","R93.201","R93.203","R94.500","S36.100x001","S36.100x011","S36.100x013","S36.100x021","S36.100x031","S36.100x041","S36.100x051","S36.102","T82.813","T85.800x802","T86.400x001","T86.400x003","T86.400x004","T86.400x005","T86.400x006","T86.400x007","T86.400x009","T86.400x010","T86.400x011","T86.400x012","T86.400x013","T86.400x014","T86.400x015","T86.400x016","T86.400x017","T86.400x018","Z52.600x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HZ1入组条件，匹配规则：主诊断匹配");
                
            if (MDCH_DRG.HZ11_group(record)){
                return "HZ11";
            }
    
            if (MDCH_DRG.HZ13_group(record)){
                return "HZ13";
            }
    
            if (MDCH_DRG.HZ15_group(record)){
                return "HZ15";
            }

            return "HZ1";
        }else{
            return "";
        }
    }
}

