package drg_group.chs_drg_10.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;
import drg_group.chs_drg_10.DRG.MDCG_DRG;

public class GB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"40.5900x013","40.5900x015","40.5900x019","40.5902","42.4100x008","42.4101","42.4102","42.4103","42.4103","42.4104","42.4200x001","42.4200x002","42.4201","42.4202","42.4203","42.5100","42.5200","42.5200x005","42.5201","42.5202","42.5300x001","42.5500x001","42.5600","42.5800x001","42.5801","42.5802","42.5803","42.5900x001","42.6100","42.6200","42.6300","42.6400x002","42.6401","42.6402","42.6403","42.6500","42.6601","43.3x00x003","43.3x00x004","43.3x01","43.4201","43.4202","43.4203","43.5x00x003","43.5x00x007","43.5x01","43.5x02","43.5x03","43.6x00x005","43.6x00x006","43.6x01","43.6x02","43.7x00x001","43.7x00x002","43.7x01","43.7x02","43.7x03","43.8100","43.8201","43.8202","43.8901","43.8902","43.8903","43.9101","43.9102","43.9900x002","43.9900x003","43.9900x004","43.9901","43.9902","43.9903","43.9904","43.9905","44.2100x001","44.2100x002","44.2900x001","44.2901","44.3801","44.3802","44.3803","44.3804","44.3900x003","44.3901","44.3902","44.3903","44.3904","44.6500","44.6500x001","44.6500x002","44.6500x003","44.6501","44.6600x002","44.6601","45.6202","45.6203","45.6300x001","45.9103","46.7900x009","46.7902","51.8200x001","51.8200x002","51.8300x003","51.8301","52.6x01","52.7x00","52.7x00x003"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GB1入组条件，匹配规则：主手术匹配");
                
            if (MDCG_DRG.GB19_group(record)){
                return "GB19";
            }

            return "GB1";
        }else{
            return "";
        }
    }
}

