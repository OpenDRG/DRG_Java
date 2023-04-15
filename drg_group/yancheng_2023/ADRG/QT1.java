package drg_group.yancheng_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yancheng_2023.Base;
import drg_group.yancheng_2023.MedicalRecord;
import drg_group.yancheng_2023.DRG.MDCQ_DRG;

public class QT1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"D65.x00x001","D65.x00x003","D65.x00x005","D65.x01","D65.x02","D65.x03","D65.x04","D66.x00x001","D66.x01","D66.x02","D66.x03+M36.2*","D67.x00x003","D67.x01","D68.000","D68.000x001","D68.000x002","D68.001","D68.100x001","D68.101","D68.200x001","D68.200x005","D68.200x006","D68.200x007","D68.200x008","D68.200x009","D68.200x010","D68.201","D68.202","D68.203","D68.204","D68.205","D68.206","D68.207","D68.208","D68.300","D68.300x001","D68.300x003","D68.300x004","D68.301","D68.302","D68.303","D68.400","D68.400x002","D68.400x003","D68.401","D68.402","D68.500","D68.501","D68.502","D68.503","D68.504","D68.505","D68.600x003","D68.601","D68.602","D68.603","D68.604","D68.605","D68.801","D68.900x003","D68.900x005","D68.900x006","D68.901","D68.902","D68.903","D69.000","D69.000x007","D69.000x008","D69.000x010","D69.000x011","D69.000x013","D69.001","D69.002","D69.003","D69.004","D69.006","D69.007","D69.008","D69.009","D69.010","D69.100x001","D69.100x002","D69.100x003","D69.100x004","D69.101","D69.102","D69.103","D69.200","D69.200x003","D69.200x005","D69.200x006","D69.200x007","D69.200x008","D69.201","D69.202","D69.203","D69.300","D69.301","D69.302","D69.400","D69.400x001","D69.400x002","D69.400x003","D69.400x006","D69.401","D69.403","D69.405","D69.406","D69.407","D69.500","D69.500x003","D69.501","D69.502","D69.503","D69.504","D69.600","D69.800","D69.800x002","D69.801","D69.802","D69.900","R23.300","R23.300x003","R23.301"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合QT1入组条件，匹配规则：主诊断匹配");
                
            if (MDCQ_DRG.QT13_group(record)){
                return "QT13";
            }
    
            if (MDCQ_DRG.QT15_group(record)){
                return "QT15";
            }

            return "QT1";
        }else{
            return "";
        }
    }
}

