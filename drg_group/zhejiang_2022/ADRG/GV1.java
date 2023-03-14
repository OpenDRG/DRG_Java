package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCG_DRG;

public class GV1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"E84.102","K22.200","K22.201","K22.202","K22.203","K22.205","K22.206","K22.207","K22.208","K22.901","K31.100","K31.100x002","K31.101","K31.102","K31.103","K31.104","K31.200","K31.500","K31.501","K31.502","K40.000x001","K40.001","K40.002","K40.100x001","K40.101","K40.102","K40.306","K40.307","K40.308","K40.310","K40.311","K40.312","K40.400x001","K40.401","K40.402","K41.100x001","K41.300x002","K41.300x003","K41.302","K41.400x001","K42.000x001","K42.001","K42.100x001","K43.001","K43.002","K43.100x003","K43.301","K43.302","K43.303","K43.304","K44.000x001","K44.000x002","K44.100x001","K44.900x001","K44.901","K45.002","K45.003","K45.100","K45.800","K46.000x002","K46.001","K46.002","K46.100x001","K46.101","K56.000","K56.001","K56.100","K56.101","K56.102","K56.200","K56.200x003","K56.200x011","K56.201","K56.202","K56.203","K56.300","K56.400x001","K56.400x003","K56.401","K56.500x003","K56.501","K56.503","K56.600","K56.600x001","K56.600x005","K56.600x007","K56.600x008","K56.601","K56.602","K56.603","K56.604","K56.700","K56.700x003","K56.701","K62.402","K91.300","K91.300x002","K91.404","K91.408","K91.800x111","K91.809","K91.812","K91.819","K91.831","K91.839","K91.842","R10.000","R10.000x004","R10.101","R10.301","R10.400x002","R10.400x004","R10.401","R10.402"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GV1入组条件，匹配规则：主诊断匹配");
                
            if (MDCG_DRG.GV11_group(record)){
                return "GV11";
            }
    
            if (MDCG_DRG.GV13_group(record)){
                return "GV13";
            }
    
            if (MDCG_DRG.GV15_group(record)){
                return "GV15";
            }

            return "GV1";
        }else{
            return "";
        }
    }
}

