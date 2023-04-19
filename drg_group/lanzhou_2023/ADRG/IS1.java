package drg_group.lanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2023.Base;
import drg_group.lanzhou_2023.MedicalRecord;
import drg_group.lanzhou_2023.DRG.MDCI_DRG;

public class IS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"M24.309","M24.310","M24.407","M24.408","M24.812","M84.000x043","M84.000x074","M84.100x044","M84.100x075","M87.200","M87.201","S51.901","S52.000x002","S52.000x012","S52.000x021","S52.000x091","S52.010","S52.100x001","S52.100x002","S52.100x012","S52.100x091","S52.101","S52.102","S52.110","S52.200","S52.200x011","S52.201","S52.210","S52.211","S52.300","S52.300x011","S52.310","S52.400x001","S52.410","S52.500x001","S52.500x002","S52.500x003","S52.500x011","S52.500x021","S52.500x022","S52.500x091","S52.501","S52.502","S52.510","S52.600x001","S52.600x002","S52.610","S52.700","S52.701","S52.710","S52.711","S52.800x002","S52.801","S52.802","S52.803","S52.804","S52.810","S52.811","S52.812","S52.814","S52.900","S53.000","S53.000x003","S53.001","S53.002","S53.200x001","S53.300x001","S53.400x012","S53.400x021","S53.400x031","S53.400x041","S53.401","S53.402","S56.000x001","S56.000x002","S56.000x003","S56.001","S56.100x001","S56.100x002","S56.100x003","S56.200x001","S56.200x002","S56.200x003","S56.300x001","S56.300x002","S56.300x003","S56.300x004","S56.300x005","S56.300x006","S56.301","S56.400x001","S56.400x002","S56.400x003","S56.500x001","S56.500x002","S56.500x003","S56.700x001","S56.801","S59.700","S59.701","S59.900","S61.701","S61.702","S61.901","S61.902","S62.000x001","S62.010","S62.100x011","S62.100x021","S62.100x031","S62.100x041","S62.100x051","S62.100x061","S62.100x071","S62.100x091","S62.101","S62.110","S62.111","S62.200","S62.200x011","S62.200x021","S62.200x031","S62.200x041","S62.201","S62.210","S62.300x002","S62.300x011","S62.300x021","S62.300x031","S62.300x041","S62.301","S62.310","S62.311","S62.400","S62.410","S62.500","S62.500x002","S62.500x011","S62.500x021","S62.510","S62.600x002","S62.600x011","S62.600x021","S62.600x031","S62.611","S62.700","S62.710","S62.801","S62.802","S62.811","S63.000","S63.000x002","S63.000x003","S63.000x011","S63.000x021","S63.000x031","S63.000x041","S63.000x042","S63.000x081","S63.000x082","S63.000x083","S63.100","S63.100x001","S63.100x002","S63.100x011","S63.100x012","S63.100x013","S63.100x021","S63.200","S63.200x001","S63.300x001","S63.300x002","S63.300x003","S63.300x004","S63.400x001","S63.400x002","S63.400x003","S63.400x004","S63.400x005","S63.400x006","S63.401","S63.500","S63.500x002","S63.500x003","S63.500x011","S63.500x012","S63.500x021","S63.500x022","S63.500x031","S63.500x032","S63.500x081","S63.500x082","S63.500x101","S63.501","S63.600","S63.600x001","S63.600x002","S63.601","S63.602","S63.700x001","S63.701","S66.000x001","S66.000x002","S66.000x003","S66.000x004","S66.000x005","S66.000x006","S66.000x007","S66.000x008","S66.000x009","S66.100x001","S66.100x002","S66.100x003","S66.100x004","S66.100x005","S66.100x006","S66.100x007","S66.100x008","S66.100x009","S66.200x001","S66.200x002","S66.200x003","S66.200x004","S66.200x005","S66.200x006","S66.200x007","S66.200x008","S66.200x009","S66.300x001","S66.300x002","S66.300x003","S66.300x004","S66.300x005","S66.300x006","S66.300x007","S66.300x008","S66.300x009","S66.400x001","S66.400x002","S66.400x003","S66.400x004","S66.400x005","S66.400x006","S66.400x007","S66.400x008","S66.400x009","S66.500x001","S66.500x002","S66.500x003","S66.500x004","S66.500x005","S66.500x006","S66.500x007","S66.500x008","S66.500x009","S66.600x001","S66.601","S66.700x001","S66.800","S66.900x001","S66.900x002","S66.900x003","S66.900x004","S68.001","S68.100x001","S68.200x001","S68.201","S68.300","S68.900","S69.700","S69.800","S86.001","S91.300x823","S91.301","S91.302","S91.303","S92.000","S92.010","S92.200x001","S92.200x081","S92.201","S92.202","S92.203","S92.210","S92.300","S92.300x001","S92.300x003","S92.300x004","S92.310","S92.400","S92.410","S92.500x001","S92.500x002","S92.510","S92.700","S92.710","S92.900","S92.910","S93.100x001","S93.101","S93.102","S93.103","S93.200x003","S93.300x011","S93.300x021","S93.300x031","S93.300x032","S93.300x081","S93.301","S93.302","S93.303","S93.500","S93.500x001","S93.500x002","S93.500x003","S93.500x004","S93.500x005","S93.500x006","S93.600x001","S93.600x002","S93.600x003","S93.600x004","S93.601","S96.000x001","S96.100x001","S96.100x002","S96.101","S96.102","S96.200x001","S96.700x001","S96.701","S96.800x001","S96.800x002","S96.801","S96.900x002","S99.800x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IS1入组条件，匹配规则：主诊断匹配");
                
            if (MDCI_DRG.IS1A_group(record)){
                return "IS1A";
            }
    
            if (MDCI_DRG.IS15_group(record)){
                return "IS15";
            }

            return "IS1";
        }else{
            return "";
        }
    }
}

