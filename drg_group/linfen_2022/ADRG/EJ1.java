package drg_group.linfen_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;
import drg_group.linfen_2022.DRG.MDCE_DRG;

public class EJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"31.1x00x005","31.4100","31.4200x001","31.4200x003","31.4201","31.4202","31.4300x002","31.4301","31.4400x001","31.9400","33.2100","33.2200x002","33.2200x003","33.2300x002","33.2300x003","33.2301","33.2302","33.9200","34.7300x001","96.0500x001","96.5602"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合EJ1入组条件，匹配规则：主手术匹配");
                
            if (MDCE_DRG.EJ11_group(record)){
                return "EJ11";
            }
    
            if (MDCE_DRG.EJ13_group(record)){
                return "EJ13";
            }
    
            if (MDCE_DRG.EJ15_group(record)){
                return "EJ15";
            }

            return "EJ1";
        }else{
            return "";
        }
    }
}

