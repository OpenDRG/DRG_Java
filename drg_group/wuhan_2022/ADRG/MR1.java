package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCM_DRG;

public class MR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C60.000","C60.100","C60.200","C60.201","C60.800","C60.900","C60.901","C61.x00","C62.000","C62.001","C62.100","C62.900","C62.901","C63.000","C63.100","C63.200","C63.201","C63.700","C63.701","C63.702","C63.800","C63.801","C63.900","C79.800x228","C79.800x231","C79.800x233","C79.815","C79.816","C79.817","C79.818","C79.819","C79.820","D07.400","D07.401","D07.402","D07.500","D07.601","D07.602","D07.603","D40.000x001","D40.001","D40.100x002","D40.101","D40.700x001","D40.700x002","D40.700x003","D40.701","D40.702","D40.703","D40.704","D40.900x001","D40.901"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合MR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCM_DRG.MR1A_group(record)){
                return "MR1A";
            }
    
            if (MDCM_DRG.MR15_group(record)){
                return "MR15";
            }

            return "MR1";
        }else{
            return "";
        }
    }
}

