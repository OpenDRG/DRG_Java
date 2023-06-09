package drg_group.handan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;
import drg_group.handan_2022.DRG.MDCB_DRG;

public class BS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"E03.500","E16.107+G94.8*","G93.500x001","G93.500x002","G93.500x005","G93.500x006","G93.500x007","G93.500x008","G93.500x009","G93.500x010","G93.501","G97.100x003","R40.100","R40.100x002","R40.100x003","R40.100x005","R40.200","R40.200x002","R40.200x004","R40.201"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BS1入组条件，匹配规则：主诊断匹配");
                
            if (MDCB_DRG.BS11_group(record)){
                return "BS11";
            }
    
            if (MDCB_DRG.BS13_group(record)){
                return "BS13";
            }
    
            if (MDCB_DRG.BS15_group(record)){
                return "BS15";
            }

            return "";
        }else{
            return "";
        }
    }
}

