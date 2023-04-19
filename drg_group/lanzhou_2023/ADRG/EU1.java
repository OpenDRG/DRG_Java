package drg_group.lanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2023.Base;
import drg_group.lanzhou_2023.MedicalRecord;
import drg_group.lanzhou_2023.DRG.MDCE_DRG;

public class EU1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"S25.401","S27.000","S27.010","S27.100","S27.110","S27.200","S27.210","S27.300x012","S27.301","S27.302","S27.303","S27.310","S27.311","S27.312","S27.313","S27.400","S27.401","S27.410","S27.500","S27.501","S27.510","S27.600","S27.610","S27.700","S27.710","S27.800x013","S27.801","S27.802","S27.803","S27.804","S27.805","S27.806","S27.807","S27.808","S27.810","S27.811","S27.812","S27.900","S27.910","S28.000","S28.100","S29.700","S29.900","T79.800x007"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合EU1入组条件，匹配规则：主诊断匹配");
                
            if (MDCE_DRG.EU11_group(record)){
                return "EU11";
            }
    
            if (MDCE_DRG.EU13_group(record)){
                return "EU13";
            }
    
            if (MDCE_DRG.EU15_group(record)){
                return "EU15";
            }

            return "EU1";
        }else{
            return "";
        }
    }
}

