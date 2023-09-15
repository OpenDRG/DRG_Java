package drg_group.quanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;
import drg_group.quanzhou_2023.DRG.MDCE_DRG;


public class EX1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"J45.000","J45.000x001","J45.000x003","J45.002","J45.003","J45.004","J45.005","J45.006","J45.007","J45.100","J45.100x002","J45.100x003","J45.800","J45.900","J45.900x001","J45.900x002","J45.900x011","J45.900x012","J45.900x013","J45.900x021","J45.900x023","J45.900x031","J45.900x041","J45.901","J45.902","J45.903","J46.x00x002","J46.x00x003","J46.x00x006","J46.x00x008","J46.x00x009","J46.x00x010","J46.x01","J46.x02"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合EX1入组条件，匹配规则：主诊断匹配");
            
                
            if (MDCE_DRG.EX13_group(record)){
                return "EX13";
            }
    
            if (MDCE_DRG.EX15_group(record)){
                return "EX15";
            }

            return "";
        }else{
            return "";
        }
    }
}

