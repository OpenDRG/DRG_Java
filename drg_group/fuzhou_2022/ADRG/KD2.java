package drg_group.fuzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.fuzhou_2022.Base;
import drg_group.fuzhou_2022.MedicalRecord;
import drg_group.fuzhou_2022.DRG.MDCK_DRG;

public class KD2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"06.0100x001","06.0100x001","06.0200x001","06.0201","06.0900x004","06.0900x005","06.0900x006","06.0901","06.0902","06.0903","06.1200","06.3100","06.3101","06.3102","06.5100x001","06.5100x002","06.7x00","06.7x00x003","06.7x01","06.7x02","06.8100","06.8100x002","06.8900x005","06.8900x006","06.8900x007","06.8901","06.8902","06.8903","06.8904","06.8905","06.9100x001","06.9200","06.9300","06.9501","06.9502","06.9800","06.9900x002","40.1900x002","40.4000x003"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合KD2入组条件，匹配规则：主手术匹配");
                
            if (MDCK_DRG.KD29_group(record)){
                return "KD29";
            }

            return "KD2";
        }else{
            return "";
        }
    }
}

