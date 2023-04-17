package drg_group.wlmq_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wlmq_2022.Base;
import drg_group.wlmq_2022.MedicalRecord;
import drg_group.wlmq_2022.DRG.MDCK_DRG;

public class KE1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"42.9200x008","43.7x00x001","43.7x01","43.7x02","43.7x03","43.8201","43.8903","43.9900x003","44.2200x001","44.2200x001","44.2200x003","44.2200x004","44.3200x001","44.3201","44.3803","44.3804","44.3900x003","44.3901","44.3902","44.3903","44.3904","44.5x00x002","44.5x00x004","44.5x00x005","44.5x01","44.5x02","44.6800x002","44.6801","44.6902","44.9501","44.9502","44.9601","44.9602","44.9800x003","44.9800x004","44.9801","44.9802","45.9100x006","45.9100x008","45.9103","45.9104"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合KE1入组条件，匹配规则：主手术匹配");
                
            if (MDCK_DRG.KE19_group(record)){
                return "KE19";
            }

            return "KE1";
        }else{
            return "";
        }
    }
}

