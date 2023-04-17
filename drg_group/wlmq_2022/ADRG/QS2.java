package drg_group.wlmq_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wlmq_2022.Base;
import drg_group.wlmq_2022.MedicalRecord;
import drg_group.wlmq_2022.DRG.MDCQ_DRG;

public class QS2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"D55.000","D55.001","D55.100x001","D55.100x003","D55.101","D55.200","D55.201","D55.202","D55.203","D55.204","D55.300","D55.800","D55.900","D56.000","D56.100","D56.100x001","D56.100x003","D56.101","D56.102","D56.200","D56.300","D56.301","D56.400","D56.800","D56.900","D56.901","D57.000x001","D57.001","D57.100","D57.100x003","D57.200","D57.200x001","D57.201","D57.202","D57.203","D57.204","D57.300","D57.301","D57.302","D57.800","D58.000","D58.000x001","D58.000x003","D58.001","D58.002","D58.003","D58.100","D58.100x002","D58.100x004","D58.101","D58.200x002","D58.200x004","D58.200x006","D58.201","D58.202","D58.203","D58.204","D58.205","D58.206","D58.800","D58.800x001","D58.801","D58.900","D58.901","D59.000","D59.100x002","D59.100x005","D59.101","D59.102","D59.103","D59.104","D59.105","D59.200","D59.201","D59.300x001","D59.400x001","D59.400x002","D59.401","D59.402","D59.403","D59.404","D59.500x001","D59.501","D59.600","D59.600x004","D59.601","D59.602","D59.603","D59.604","D59.800","D59.900","D59.901","D59.902","D59.903"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合QS2入组条件，匹配规则：主诊断匹配");
                
            if (MDCQ_DRG.QS21_group(record)){
                return "QS21";
            }
    
            if (MDCQ_DRG.QS23_group(record)){
                return "QS23";
            }
    
            if (MDCQ_DRG.QS25_group(record)){
                return "QS25";
            }

            return "QS2";
        }else{
            return "";
        }
    }
}

