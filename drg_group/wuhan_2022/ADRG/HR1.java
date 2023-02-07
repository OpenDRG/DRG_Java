package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCH_DRG;

public class HR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C22.000","C22.001","C22.100","C22.101","C22.200","C22.300","C22.301","C22.400","C22.700","C22.900","C23.x00","C24.000","C24.000x007","C24.001","C24.002","C24.003","C24.004","C24.100","C24.101","C24.800","C24.800x001","C24.900","C25.000","C25.100","C25.200","C25.300","C25.400","C25.401","C25.701","C25.800x001","C25.801","C25.802","C25.803","C25.900","C45.704","C77.203","C77.204","C78.700","C78.800x009","C78.806","C78.807","C78.808","D01.500x001","D01.501","D01.502","D01.503","D01.700","D01.701","D37.600x001","D37.600x002","D37.600x003","D37.600x004","D37.601","D37.603","D37.605","D37.700x003","D37.706","K92.800x006","K92.800x009","K92.800x010","K92.800x012"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCH_DRG.HR11_group(record)){
                return "HR11";
            }
    
            if (MDCH_DRG.HR1B_group(record)){
                return "HR1B";
            }

            return "HR1";
        }else{
            return "";
        }
    }
}

