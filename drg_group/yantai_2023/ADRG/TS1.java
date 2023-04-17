package drg_group.yantai_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yantai_2023.Base;
import drg_group.yantai_2023.MedicalRecord;
import drg_group.yantai_2023.DRG.MDCT_DRG;

public class TS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"F25.000","F25.000x001","F25.100","F25.100x001","F25.200","F25.200x001","F25.200x002","F25.800","F25.900","F29.x00","F30.000","F30.100","F30.100x001","F30.200","F30.200x001","F30.200x002","F30.201","F30.800x002","F30.900","F30.901","F31.000","F31.100","F31.200","F31.300x002","F31.300x003","F31.300x005","F31.300x011","F31.300x012","F31.301","F31.400","F31.500","F31.600","F31.700","F31.800x001","F31.800x002","F31.800x003","F31.801","F31.802","F31.803","F31.900","F31.901","F31.902","F32.000x002","F32.000x011","F32.100x002","F32.100x011","F32.200","F32.300","F32.301","F32.800x001","F32.800x002","F32.801","F32.802","F32.900","F32.901","F32.902","F33.000","F33.000x002","F33.000x011","F33.100","F33.100x002","F33.100x011","F33.200","F33.300","F33.400","F33.800","F33.900","F34.800","F34.900","F38.000x001","F38.001","F38.100x001","F38.100x002","F38.800","F39.x00","R45.801"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合TS1入组条件，匹配规则：主诊断匹配");
                
            if (MDCT_DRG.TS19_group(record)){
                return "TS19";
            }

            return "TS1";
        }else{
            return "";
        }
    }
}

