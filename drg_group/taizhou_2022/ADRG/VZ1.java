package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCV_DRG;

public class VZ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"S41.801","T45.900","T47.800","T47.900","T48.201","T48.701","T49.900","T61.800","T63.900","T66.x00x001","T66.x00x002","T66.x01","T67.000x001","T67.000x002","T67.001","T67.002","T67.100","T67.100x002","T67.200","T67.300","T67.300x001","T67.300x002","T67.400","T67.400x001","T67.500","T67.500x001","T67.600","T67.700","T67.800","T67.900","T67.901","T68.x00","T69.000x001","T69.000x002","T69.000x003","T69.000x004","T69.100","T69.100x002","T69.100x003","T69.100x004","T69.100x005","T69.800x001","T69.800x002","T69.800x003","T70.200x005","T70.200x006","T70.201","T70.202","T70.204","T70.205","T70.206","T70.207","T70.300","T70.300x002","T70.300x004","T70.800","T70.800x001","T71.x00","T71.x00x001","T71.x00x002","T71.x00x003","T71.x00x004","T73.000","T73.000x001","T74.000x001","T74.000x002","T74.100","T74.100x001","T74.100x002","T74.100x003","T74.200","T74.300","T74.800x001","T74.900x001","T74.900x002","T75.000","T75.000x001","T75.000x002","T75.100","T75.100x001","T75.100x002","T75.101","T75.200x001","T75.200x002","T75.200x003","T75.200x004","T75.200x005","T75.300","T75.300x002","T75.300x003","T75.300x004","T75.400","T75.400x001","T75.800x001","T75.800x002","T76.x00","T79.000","T79.201","T79.202","T79.400","T79.501","T79.800x001","T79.800x003","T79.800x004","T79.800x005","T79.900","T81.000x004","T81.000x032","T81.008","T81.009","T88.800","T98.100","T98.100x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合VZ1入组条件，匹配规则：主诊断匹配");
                
            if (MDCV_DRG.VZ11_group(record)){
                return "VZ11";
            }
    
            if (MDCV_DRG.VZ13_group(record)){
                return "VZ13";
            }
    
            if (MDCV_DRG.VZ15_group(record)){
                return "VZ15";
            }

            return "VZ1";
        }else{
            return "";
        }
    }
}

