package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCF_DRG;

public class FV2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"E10.700x022","E10.700x023","E11.700x022","E11.700x023","E14.700x022","E14.700x023","E16.800x101","E16.800x102","I10.x00x002","I10.x00x007","I10.x00x008","I10.x00x009","I10.x00x015","I10.x00x016","I10.x00x017","I10.x02","I10.x03","I10.x04","I10.x05","I10.x06","I10.x08","I10.x09","I10.x10","I10.x12","I10.x13","I10.x14","I11.901","I13.900x001","I13.900x001","I15.000","I15.100x001","I15.101","I15.102","I15.103","I15.200x001","I15.200x002","I15.200x003","I15.200x004","I15.200x005","I15.800x001","I15.800x002","I15.800x003","I15.800x004","I15.800x006","I15.900"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FV2入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FV21_group(record)){
                return "FV21";
            }
    
            if (MDCF_DRG.FV23_group(record)){
                return "FV23";
            }
    
            if (MDCF_DRG.FV25_group(record)){
                return "FV25";
            }

            return "FV2";
        }else{
            return "";
        }
    }
}

