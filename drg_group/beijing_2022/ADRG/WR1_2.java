package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCW_DRG;

public class WR1_2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={"T31.300","T31.400","T31.500","T31.600","T31.700","T31.800","T31.900","T32.300","T32.400","T32.500","T32.600","T32.700","T32.800","T32.900"};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.intersect(Arrays.copyOfRange(record.zdList,1,record.zdList.length),adrg_zd1)){
            Base.groupMessages.putMessage(record.Index,"符合WR1_2入组条件，匹配规则：其他诊断匹配");
                
            if (MDCW_DRG.WR11_group(record)){
                return "WR11";
            }
    
            if (MDCW_DRG.WR15_group(record)){
                return "WR15";
            }

            return "WR1";
        }else{
            return "";
        }
    }
}

