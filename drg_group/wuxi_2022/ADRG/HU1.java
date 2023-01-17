package drg_group.wuxi_2022.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.DRG.MDCH_DRG;

public class HU1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"K75.805","K75.806","K80.000x002","K80.000x004","K80.001","K80.002","K80.100x001","K80.200x001","K80.200x003","K80.201","K80.202","K80.203","K80.300x002","K80.300x005","K80.301","K80.302","K80.303","K80.304","K80.305","K80.306","K80.400","K80.401","K80.402","K80.405","K80.500x001","K80.500x002","K80.501","K80.502","K80.503","K80.504","K80.505","K80.506","K80.507","K80.800x001","K80.801","K81.000","K81.000x008","K81.001","K81.002","K81.003","K81.004","K81.005","K81.006","K81.007","K81.008","K81.801","K81.900","K81.900x001","K82.000x003","K82.001","K82.200","K82.200x002","K82.808","K83.000","K83.000x007","K83.000x012","K83.001","K83.004","K83.005","K83.007","K83.008","K83.009","K83.010","K83.011","K83.012","K83.013","K83.014","K83.015","K83.016","K83.017","K83.018","K83.019","K83.100","K83.103","K83.106","K83.108","K83.109","K83.200x001"};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HU1入组条件，匹配规则：主诊断匹配");
                
            if (MDCH_DRG.HU11_group(record)){
                return "HU11";
            }
    
            if (MDCH_DRG.HU15_group(record)){
                return "HU15";
            }

            return "HU1";
        }else{
            return "";
        }
    }
}

