package drg_group.lanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2023.Base;
import drg_group.lanzhou_2023.MedicalRecord;
import drg_group.lanzhou_2023.DRG.MDCB_DRG;

public class BY1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"S01.800x011","S01.800x021","S01.800x031","S01.800x031","S01.800x083","S01.800x085","S01.800x086","S01.800x087","S01.801","S02.000","S02.000x003","S02.000x004","S02.000x005","S02.001","S02.002","S02.011","S02.012","S02.100x002","S02.100x003","S02.100x004","S02.100x006","S02.100x008","S02.100x009","S02.101","S02.102","S02.103","S02.111","S02.112","S02.113","S02.114","S02.300","S02.300x002","S02.700x001","S02.700x002","S02.701","S02.712","S02.900x002","S02.902","S02.911","S06.000","S06.100","S06.200x001","S06.200x002","S06.200x011","S06.200x021","S06.200x031","S06.200x032","S06.200x033","S06.200x081","S06.200x082","S06.201","S06.202","S06.203","S06.204","S06.205","S06.206","S06.211","S06.300x001","S06.300x002","S06.300x011","S06.300x021","S06.300x031","S06.300x032","S06.300x041","S06.300x042","S06.300x081","S06.300x082","S06.301","S06.302","S06.310","S06.400","S06.401","S06.410","S06.500","S06.500x002","S06.500x004","S06.500x006","S06.501","S06.502","S06.510","S06.600","S06.600x002","S06.610","S06.700","S06.700x001","S06.700x002","S06.700x003","S06.700x004","S06.700x005","S06.700x006","S06.700x007","S06.700x008","S06.710","S06.800x002","S06.800x004","S06.800x005","S06.800x007","S06.800x009","S06.800x010","S06.800x011","S06.800x012","S06.800x013","S06.801","S06.802","S06.803","S06.804","S06.805","S06.814","S06.900","S06.901","S06.910","S06.911","S06.912","T02.000x001","T02.010"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BY1入组条件，匹配规则：主诊断匹配");
                
            if (MDCB_DRG.BY11_group(record)){
                return "BY11";
            }
    
            if (MDCB_DRG.BY13_group(record)){
                return "BY13";
            }
    
            if (MDCB_DRG.BY15_group(record)){
                return "BY15";
            }

            return "BY1";
        }else{
            return "";
        }
    }
}

