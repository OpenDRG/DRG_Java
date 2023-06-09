package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCF_DRG;

public class FB2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"35.0100x002","35.0101","35.0200x003","35.0201","35.0300x002","35.0301","35.0400x001","35.0401","35.0600x001","35.0600x002","35.0800x001","35.1000","35.1100x003","35.1100x004","35.1101","35.1200x001","35.1200x002","35.1200x003","35.1201","35.1300x002","35.1300x004","35.1301","35.1400x001","35.1400x002","35.1400x003","35.1400x006","35.1401","35.2000x001","35.2000x002","35.2000x003","35.2100x002","35.2100x003","35.2101","35.2200x002","35.2201","35.2300x002","35.2301","35.2302","35.2400x002","35.2401","35.2501","35.2601","35.2701","35.2801","35.2802","35.3300x001","35.3300x002","35.3300x003","35.3500x002","35.3500x003","35.3500x004","35.3500x005","35.3500x006","35.3500x007","35.3500x008","35.3500x009","35.3501","35.9500x001","35.9500x003","35.9500x004","35.9500x005","35.9502","35.9900x001","35.9900x002","37.3300x017","37.3300x026"};
        String[] adrg_ss1={"00.2400x001","00.5900x003","00.5901","00.5902","37.2100","37.2200","37.2300","37.2600x001","88.5201","88.5202","88.5301","88.5302","88.5400x001","88.5500","88.5500x002","88.5600","88.5600x002","88.5700x003","88.5701","88.5800","88.5900"};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss) && Base.intersect(record.ssList,adrg_ss1)){
            Base.groupMessages.putMessage(record.Index,"符合FB2入组条件，匹配规则：双手术匹配");
                
            if (MDCF_DRG.FB29_group(record)){
                return "FB29";
            }

            return "";
        }else{
            return "";
        }
    }
}

