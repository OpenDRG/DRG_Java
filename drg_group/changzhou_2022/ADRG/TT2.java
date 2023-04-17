package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCT_DRG;

public class TT2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"F44.800x011","F44.800x012","F52.000","F52.001","F52.100","F52.100x002","F52.100x011","F52.200","F52.200x002","F52.201","F52.202","F52.300","F52.400","F52.500","F52.600","F52.700","F52.800","F52.900","F54.x00","F60.000","F60.100","F60.200","F60.201","F60.300","F60.301","F60.302","F60.400","F60.500","F60.600","F60.700","F60.800x001","F60.800x002","F60.800x003","F60.801","F60.802","F60.900","F61.x00","F61.x00x011","F62.000","F62.100","F62.800","F62.900","F63.000","F63.100","F63.200","F63.300","F63.800","F63.800x001","F63.801","F63.900","F64.000x001","F64.000x002","F64.100","F64.200","F64.800","F64.900","F65.000","F65.100","F65.200","F65.300","F65.400","F65.500","F65.500x001","F65.500x002","F65.600","F65.800","F65.900","F66.000","F66.100","F66.200","F66.800","F66.900","F68.000","F68.000x001","F68.100","F68.100x001","F68.800","F69.x00","F91.000","F91.100","F91.100x002","F91.200","F91.300","F91.900","F92.000","F92.900","R45.000","R45.100x001","R45.100x002","R45.200","R45.200x001","R45.200x003","R45.300x001","R45.300x002","R45.400x001","R45.400x002","R45.500","R45.600","R45.700x001","R45.700x002","R45.800x091","R46.200x002","R46.400","Z03.200"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合TT2入组条件，匹配规则：主诊断匹配");
                
            if (MDCT_DRG.TT29_group(record)){
                return "TT29";
            }

            return "TT2";
        }else{
            return "";
        }
    }
}

