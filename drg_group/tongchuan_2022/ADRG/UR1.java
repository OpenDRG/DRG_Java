package drg_group.tongchuan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.tongchuan_2022.Base;
import drg_group.tongchuan_2022.MedicalRecord;
import drg_group.tongchuan_2022.DRG.MDCU_DRG;

public class UR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"F10.000","F10.001","F10.002","F10.003","F10.100","F10.100x002","F10.200","F10.201","F10.300","F10.400","F10.401","F10.500","F10.501","F10.502","F10.503","F10.504","F10.505","F10.600","F10.600x002","F10.601","F10.700","F10.700x091","F10.701","F10.800","F10.900","R78.000","T51.001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合UR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCU_DRG.UR13_group(record)){
                return "UR13";
            }
    
            if (MDCU_DRG.UR15_group(record)){
                return "UR15";
            }

            return "UR1";
        }else{
            return "";
        }
    }
}

