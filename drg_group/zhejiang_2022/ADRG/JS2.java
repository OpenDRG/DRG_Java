package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCJ_DRG;

public class JS2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"B00.000","B65.300","B78.100x001+L99.8*","B88.000x004+L99.8*","B88.000x006+L99.8*","B88.001+L99.8*","B88.800x004","L20.000","L20.801","L20.802","L20.803","L20.804","L20.805","L20.806","L20.900","L21.100","L21.800","L21.900","L21.901","L22.x00","L23.300","L23.900","L23.901","L24.000","L24.100","L24.200","L24.201","L24.202","L24.203","L24.204","L24.205","L24.206","L24.300","L24.400","L24.500","L24.501","L24.502","L24.503","L24.504","L24.600","L24.601","L24.700","L24.800","L24.801","L24.900","L24.901","L25.000","L25.100","L25.200","L25.201","L25.300","L25.500","L25.800","L25.900","L26.x00","L27.002","L27.003","L27.004","L27.005","L27.100","L27.101","L27.200","L27.201","L27.800","L27.801","L28.000","L28.000x006","L28.000x007","L28.001","L28.002","L28.003","L28.100","L28.200","L28.201","L28.203","L29.000","L29.800","L29.801","L29.802","L29.900","L30.000","L30.100","L30.201","L30.202","L30.203","L30.204","L30.300","L30.301","L30.302","L30.400","L30.400x004","L30.500","L30.500x003","L30.800","L30.801","L30.802","L30.803","L30.804","L30.805","L30.900","L30.901","L30.902","L30.903","L30.904","L30.905","L44.400","L56.200","L57.801","L57.802","L58.000","L58.100","L58.101","L58.900","L59.000","L59.801","L95.900","L98.101"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合JS2入组条件，匹配规则：主诊断匹配");
                
            if (MDCJ_DRG.JS21_group(record)){
                return "JS21";
            }
    
            if (MDCJ_DRG.JS23_group(record)){
                return "JS23";
            }
    
            if (MDCJ_DRG.JS25_group(record)){
                return "JS25";
            }

            return "JS2";
        }else{
            return "";
        }
    }
}

