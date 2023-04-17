package drg_group.yantai_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yantai_2023.Base;
import drg_group.yantai_2023.MedicalRecord;
import drg_group.yantai_2023.DRG.MDCL_DRG;

public class LW1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"E72.007","N02.900","N02.900x001","N02.900x002","N13.701","N23.x00","N28.802","N32.803","N36.804","N39.300","N39.300x002","N39.400","N39.401","N39.402","N39.403","N39.404","N39.405","N99.803","R30.000","R30.000x002","R30.100","R30.100x001","R30.900x001","R31.x00","R32.x00","R32.x01","R33.x00","R34.x01","R34.x02","R35.x00","R35.x00x001","R35.x00x003","R36.x01","R39.000","R39.100x001","R39.100x002","R39.101","R39.801","R79.802","R80.x00","R80.x00x003","R80.x01","R80.x02","R82.000","R82.200","R82.300","R82.500x003","R82.500x004","R82.500x005","R82.500x006","R82.500x007","R82.600x001","R82.700","R82.800","R82.900x002","R82.900x003","R82.901","R82.902","R93.400x001","R93.400x002","R93.400x003","R93.401","R93.402","R93.403","R93.404","R93.405","R94.400","R94.401","R94.402","R94.802","R94.803"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LW1入组条件，匹配规则：主诊断匹配");
                
            if (MDCL_DRG.LW11_group(record)){
                return "LW11";
            }
    
            if (MDCL_DRG.LW15_group(record)){
                return "LW15";
            }

            return "LW1";
        }else{
            return "";
        }
    }
}

