package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCJ_DRG;

public class JR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C43.501","C50.000","C50.000x001","C50.001","C50.100","C50.200","C50.300","C50.400","C50.500","C50.600","C50.800","C50.800x005","C50.801","C50.802","C50.803","C50.804","C50.900","C50.900x005","C50.901","C50.902","C79.200x007","C79.800x831","C79.806","D03.501","D04.501","D05.000","D05.100","D05.700","D05.900","D48.600x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合JR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCJ_DRG.JR19_group(record)){
                return "JR19";
            }

            return "JR1";
        }else{
            return "";
        }
    }
}

