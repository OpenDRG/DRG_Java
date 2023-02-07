package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCH_DRG;

public class HB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.6600x002","38.9300","38.9300x202","38.9300x701","39.1x00x006","39.1x00x007","39.1x00x008","39.1x00x009","39.1x00x010","39.1x00x012","39.1x00x013","39.1x01","39.1x03","39.1x05","39.1x07","39.1x10","39.2300x017","40.5900x014","50.2200","50.2200x003","50.2200x004","50.2200x005","50.2200x006","50.2200x007","50.2200x008","50.2200x009","50.2200x010","50.2201","50.2202","50.2203","50.2204","50.2205","50.2206","50.3x01","50.3x02","50.3x03","50.3x04","50.3x05","50.3x06","50.4x00","51.3300","51.3301","51.3601","51.3602","51.3700x001","51.3700x002","51.3700x003","51.3700x007","51.3701","51.3702","51.3703","51.3704","51.6200x002","51.6201","51.8300x003","51.8301","52.5100x001","52.5101","52.5102","52.5103","52.5104","52.5201","52.5202","52.5203","52.5204","52.5205","52.5206","52.5300","52.5301","52.5901","52.5902","52.5903","52.5904","52.5905","52.5906","52.6x00","52.6x00x003","52.6x00x004","52.6x01","52.6x02","52.6x03","52.7x00","52.7x00x003","52.7x00x004","52.7x01","52.9601","52.9602","52.9603","52.9604","52.9605","54.9400x002","54.9401","54.9402","54.9501","54.9502"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HB1入组条件，匹配规则：主手术匹配");
                
            if (MDCH_DRG.HB11_group(record)){
                return "HB11";
            }
    
            if (MDCH_DRG.HB13_group(record)){
                return "HB13";
            }
    
            if (MDCH_DRG.HB15_group(record)){
                return "HB15";
            }

            return "HB1";
        }else{
            return "";
        }
    }
}

