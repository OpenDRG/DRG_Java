package drg_group.tongchuan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.tongchuan_2022.Base;
import drg_group.tongchuan_2022.MedicalRecord;
import drg_group.tongchuan_2022.DRG.MDCB_DRG;

public class BV2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"B89.x00x002+G73.4*","B99.x00x004+G73.4*","D48.900x012+G73.2*","E05.900x002+G73.0*","E10.405+G73.0*","E14.400x120+G73.0*","E20.900x004+G73.5*","E21.300x004+G73.5*","E23.000x001+G73.5*","E34.901+G73.5*","E74.007+G73.6*","E75.601+G73.6*","E88.908+G73.6*","G70.000","G70.000x002","G70.000x004","G70.000x005","G70.001","G70.002","G70.003","G70.004","G70.005","G70.006","G70.007","G70.008","G70.100","G70.200","G70.200x004","G70.200x005","G70.201","G70.202","G70.800x001","G70.900","G70.900x001","G70.900x003","G70.901","G70.902","G71.000","G71.000x005","G71.000x006","G71.000x010","G71.000x011","G71.001","G71.002","G71.003","G71.004","G71.005","G71.006","G71.007","G71.100","G71.101","G71.102","G71.103","G71.104","G71.105","G71.106","G71.200","G71.200x002","G71.200x003","G71.200x004","G71.200x005","G71.300","G71.300x001","G71.300x003","G71.301","G71.800","G71.800x002","G71.801","G71.900","G71.900x001","G72.000","G72.100","G72.200","G72.200x001","G72.300","G72.301","G72.302","G72.304","G72.400","G72.401","G72.402","G72.403","G72.404","G72.800x001","G72.800x002","G72.800x003","G72.800x006","G72.800x007","G72.800x008","G72.800x009","G72.800x010","G72.800x011","G72.800x012","G72.800x013","G72.900","R25.200x001","R25.200x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BV2入组条件，匹配规则：主诊断匹配");
                
            if (MDCB_DRG.BV21_group(record)){
                return "BV21";
            }
    
            if (MDCB_DRG.BV23_group(record)){
                return "BV23";
            }
    
            if (MDCB_DRG.BV25_group(record)){
                return "BV25";
            }

            return "BV2";
        }else{
            return "";
        }
    }
}

