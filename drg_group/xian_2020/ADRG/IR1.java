package drg_group.xian_2020.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;
import drg_group.xian_2020.DRG.MDCI_DRG;

public class IR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"M84.000x052","M84.100x052","S32.300","S32.310","S32.400","S32.410","S32.500x002","S32.500x003","S32.510","S32.700","S32.701","S32.800x091","S32.800x092","S32.800x093","S32.800x094","S32.800x095","S32.801","S32.802","S32.811","S32.812"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCI_DRG.IR11_group(record)){
                return "IR11";
            }
    
            if (MDCI_DRG.IR13_group(record)){
                return "IR13";
            }
    
            if (MDCI_DRG.IR15_group(record)){
                return "IR15";
            }

            return "IR1";
        }else{
            return "";
        }
    }
}

