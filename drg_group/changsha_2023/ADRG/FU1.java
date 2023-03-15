package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCF_DRG;

public class FU1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"I44.200","I44.201","I45.300","I45.801","I45.804","I45.901","I46.000","I46.100x001","I46.901","I47.200","I47.200x001","I47.200x003","I47.200x005","I47.200x006","I47.200x007","I47.200x008","I47.200x009","I47.200x010","I47.200x011","I47.200x013","I47.200x014","I47.201","I47.202","I47.203","I47.204","I47.204","I49.001","I49.002","I49.300x005","I49.302","I49.800x016","I49.804","I49.805","R00.300","R94.300x003","R94.300x010","R94.308","R96.000x001","R96.001","Z45.006"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FU1入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FU11_group(record)){
                return "FU11";
            }
    
            if (MDCF_DRG.FU13_group(record)){
                return "FU13";
            }
    
            if (MDCF_DRG.FU15_group(record)){
                return "FU15";
            }

            return "FU1";
        }else{
            return "";
        }
    }
}

