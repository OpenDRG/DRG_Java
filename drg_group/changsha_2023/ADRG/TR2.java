package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCT_DRG;

public class TR2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"F22.000","F22.001","F22.002","F22.003","F22.800","F22.800x001","F22.900","F23.000","F23.001","F23.002","F23.200x003","F23.200x011","F23.300x001","F23.300x002","F23.300x003","F23.301","F23.800","F23.900","F23.901","F23.902","F23.903","F24.x00","F28.x00x002","F28.x00x011","F28.x00x012","F28.x01","F28.x02"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合TR2入组条件，匹配规则：主诊断匹配");
                
            if (MDCT_DRG.TR29_group(record)){
                return "TR29";
            }

            return "TR2";
        }else{
            return "";
        }
    }
}

