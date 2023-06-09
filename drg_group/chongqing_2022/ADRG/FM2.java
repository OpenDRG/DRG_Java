package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCF_DRG;

public class FM2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.0200x001","00.6600x004","00.6601","17.5500x002","17.5500x003","17.5500x004","17.5501","35.9600x008","35.9700x004","35.9700x005","35.9700x006","36.0400","36.3400","36.9900x011","36.9900x012","37.2800","37.3400x001","37.4900x017","37.4900x017","37.4900x018","37.9000x001","37.9200x001","37.9900x003","39.4901","39.5000x011","39.5000x014","39.5000x021","39.5000x034","39.5000x035","39.5000x036","39.5000x037","39.5000x038","39.5000x039","39.5000x040","39.5000x041","39.5006","39.5010","39.5400x001","39.7100x004","39.7101","39.7102","39.7103","39.7300x003","39.7300x004","39.7301","39.7302","39.7303","39.7800x001","39.7800x002","39.7800x006","39.9000","39.9000x026"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FM2入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FM29_group(record)){
                return "FM29";
            }

            return "";
        }else{
            return "";
        }
    }
}

