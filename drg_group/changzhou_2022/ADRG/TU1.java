package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCT_DRG;

public class TU1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"F70.000","F70.000x001","F70.100","F70.800","F70.900","F71.000","F71.000x001","F71.100","F71.800","F71.900","F72.000","F72.000x001","F72.100","F72.800","F72.900","F73.000","F73.000x001","F73.100","F73.800","F73.900","F78.000","F78.100","F78.800","F78.900","F79.000","F79.000x001","F79.100","F79.800","F79.900","F79.901","F80.000","F80.100","F80.200","F80.201","F80.202","F80.203","F80.204","F80.205","F80.300","F80.800","F80.900","F81.000","F81.100","F81.200","F81.201","F81.300","F81.800","F81.900","F82.x00","F83.x00","F84.000","F84.000x001","F84.001","F84.002","F84.100","F84.200","F84.300x001","F84.301","F84.400","F84.500","F84.800","F84.900","F84.900x001","F88.x00","F88.x01","F89.x00","F90.000","F90.000x001","F90.100","F90.800","F90.900","F91.800","F92.800","F93.000","F93.100","F93.200","F93.300","F93.800","F93.900","F94.000","F94.100","F94.200","F94.800","F94.900","F95.000","F95.100","F95.101","F95.200","F95.201","F95.800","F95.801","F95.900","F98.000","F98.001","F98.100","F98.101","F98.200","F98.300","F98.400","F98.500","F98.600","F98.800","F98.800x001","F98.801","F98.802","F98.803","F98.900","R48.000x002","R48.001","R48.100","R48.200","R48.800x001","R48.800x002","R48.800x004"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合TU1入组条件，匹配规则：主诊断匹配");
                
            if (MDCT_DRG.TU19_group(record)){
                return "TU19";
            }

            return "TU1";
        }else{
            return "";
        }
    }
}

