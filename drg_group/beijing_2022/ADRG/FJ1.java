package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCF_DRG;

public class FJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.6700x001","00.6701","36.0901","37.0x00x002","37.0x01","37.2400","37.2401","37.2501","37.7901","37.7902","37.9300x001","38.0500x002","38.7x01","38.7x02","38.8401","38.8501","38.8502","40.2900x002","40.2900x008"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FJ1入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FJ11_group(record)){
                return "FJ11";
            }
    
            if (MDCF_DRG.FJ15_group(record)){
                return "FJ15";
            }

            return "FJ1";
        }else{
            return "";
        }
    }
}

