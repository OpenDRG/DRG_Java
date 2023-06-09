package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCC_DRG;

public class CR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C43.100x001","C43.101","C44.100x002","C44.100x003","C44.100x004","C44.101","C44.102","C49.003","C69.000x001","C69.100","C69.200","C69.300","C69.400","C69.400x005","C69.401","C69.500x003","C69.501","C69.502","C69.503","C69.600","C69.600x001","C69.601","C69.602","C69.603","C69.604","C69.800","C69.900","C69.900x001","C69.901","C79.200x002","C79.400x014","C79.405","C79.406","C79.407","C79.408","C79.409","D03.100x002","D03.100x003","D04.100x001","D04.101","D09.200","D09.201","D09.202","D48.200x010","D48.700x021","D48.704","D48.706","D48.900x014+H36.8*"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合CR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCC_DRG.CR11_group(record)){
                return "CR11";
            }
    
            if (MDCC_DRG.CR13_group(record)){
                return "CR13";
            }
    
            if (MDCC_DRG.CR15_group(record)){
                return "CR15";
            }

            return "";
        }else{
            return "";
        }
    }
}

