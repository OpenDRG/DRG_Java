package drg_group.chs_drg_11.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCJ_DRG;

public class JR2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C43.500","C43.502","C43.503","C43.504","C43.505","C43.506","C43.507","C43.508","C43.600","C43.600x002","C43.601","C43.602","C43.603","C43.604","C43.605","C43.606","C43.700x001","C43.701","C43.702","C43.703","C43.704","C43.705","C43.706","C43.707","C43.800","C43.900","C43.900x003","C43.901","C44.500","C44.501","C44.502","C44.503","C44.504","C44.505","C44.506","C44.507","C44.508","C44.509","C44.600","C44.601","C44.602","C44.603","C44.604","C44.605","C44.606","C44.700","C44.701","C44.702","C44.703","C44.704","C44.705","C44.706","C44.707","C44.800","C44.900","C44.901","C46.000","C79.200","C79.200x001","C79.200x005","C79.200x006","C79.204","C79.205","D03.500","D03.500x002","D03.502","D03.503","D03.504","D03.600","D03.600x002","D03.601","D03.602","D03.700x001","D03.700x002","D03.701","D03.800","D03.900","D03.900x002","D04.500","D04.502","D04.503","D04.504","D04.600x001","D04.601","D04.700x001","D04.701","D04.800","D04.900x001","D48.500x002","D48.500x003","D48.500x004","D48.500x005","D48.500x006","D48.500x007","D48.500x008","D48.500x009","D48.500x010","D48.500x011","D48.500x012","D48.500x014","L85.801"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合JR2入组条件，匹配规则：主诊断匹配");
                
            if (MDCJ_DRG.JR23_group(record)){
                return "JR23";
            }
    
            if (MDCJ_DRG.JR25_group(record)){
                return "JR25";
            }

            return "JR2";
        }else{
            return "";
        }
    }
}

