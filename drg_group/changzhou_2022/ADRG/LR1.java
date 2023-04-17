package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCL_DRG;

public class LR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A27.900x005","E10.200x031+N29.8*","E10.200x214+N08.3*","E10.200x215+N08.3*","E11.200x031+N29.8*","E11.200x214+N08.3*","E11.200x215+N08.3*","E14.200x031+N29.8*","E14.200x214+N08.3*","E14.200x215+N08.3*","I12.000x001","N17.000","N17.001","N17.100","N17.101","N17.200","N17.200x002","N17.200x003","N17.800","N17.900","N17.900x002","N17.900x003","N17.900x004","N17.901","N18.300x001+D63.8*","N18.400","N18.400x001+D63.8*","N18.500","N18.500x001+D63.8*","N18.501","N18.505+I68.8*","N18.506+I32.8*","N18.902","N18.904","N19.x00","N19.x01","N19.x02","N19.x03","N99.000","N99.001","R39.200","R39.200x001","T79.500","T79.500x002","T86.100x003","T86.100x005","T86.100x006","T86.100x007","T86.100x008","T86.102","T86.106"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCL_DRG.LR11_group(record)){
                return "LR11";
            }
    
            if (MDCL_DRG.LR13_group(record)){
                return "LR13";
            }
    
            if (MDCL_DRG.LR15_group(record)){
                return "LR15";
            }

            return "LR1";
        }else{
            return "";
        }
    }
}

