package drg_group.chs_drg_10.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;
import drg_group.chs_drg_10.DRG.MDCK_DRG;

public class KZ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A18.801+E35.8*","B26.800x011","B67.302+E35.0*","D35.700","D44.800","E15.x00x001","E52.x00","E52.x00x002","E65.x00x002","E65.x00x010","E65.x00x011","E65.x00x013","E65.x01","E65.x02","E65.x03","E65.x04","E65.x05","E65.x07","E65.x08","E65.x09","E65.x10","E65.x11","E65.x12","E65.x13","E66.000","E66.100","E66.200","E66.201","E66.801","E66.900","E66.900x001","E66.901","E67.000","E67.100","E67.200","E67.300","E71.300","E71.300x005","E71.300x011","E71.302","E71.304","E71.305","E71.307","E71.308","E71.309","E71.310","E83.300x007","E83.401","E83.402","E83.501","E83.502","E83.503","E83.504","E83.505+F02.8*","E84.801","E84.900","E85.200x001","E85.300x002","E85.300x003","E85.400x014","E85.406","E85.413+L99.0*","E85.800","E85.901","E86.x00x001","E86.x00x003","E86.x00x004","E86.x01","E87.001","E87.101","E87.102","E87.200x002","E87.201","E87.202","E87.203","E87.204","E87.205","E87.206","E87.301","E87.302","E87.303","E87.400","E87.500","E87.501","E87.600","E87.600x002","E87.600x003","E87.600x004","E87.700","E87.701","E87.800x004","E87.801","E87.802","E87.803","E88.203","E89.102","E89.800x003","K90.403","K90.405","R29.000","R73.001","R73.003","R73.900x001","R79.801","R82.400","R82.401","R94.700"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合KZ1入组条件，匹配规则：主诊断匹配");
                
            if (MDCK_DRG.KZ19_group(record)){
                return "KZ19";
            }

            return "KZ1";
        }else{
            return "";
        }
    }
}

