package drg_group.lanzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2022.Base;
import drg_group.lanzhou_2022.MedicalRecord;
import drg_group.lanzhou_2022.DRG.MDCL_DRG;

public class LR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"I12.000x001","I13.100x001","N00.000","N00.100x001","N00.200","N00.301","N00.400","N00.500","N00.600","N00.700","N00.800x001","N00.801","N00.802","N00.900","N00.900x002","N00.900x006","N00.900x008","N00.900x009","N00.901","N00.902","N01.000","N01.100x002","N01.200x001","N01.300x001","N01.400x001","N01.500x001","N01.600x001","N01.700x001","N01.800","N01.900","N01.900x001","N01.900x002","N01.900x003","N17.000","N17.001","N17.002","N17.100","N17.101","N17.200","N17.200x002","N17.200x003","N17.800","N17.900","N17.900x002","N17.900x003","N17.900x004","N17.901","N18.300","N18.400","N18.500","N18.501","N18.900x011","N18.902","N18.904","N19.x00","N19.x01","N19.x02","N19.x03","N25.900","N99.000","N99.001","R39.200","R39.200x001","T79.500","T79.500x002","T86.100x001","T86.100x002","T86.100x003","T86.100x005","T86.100x006","T86.100x007","T86.100x008","T86.102","T86.103","T86.104","T86.105","T86.106","T86.107"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCL_DRG.LR11_group(record)){
                return "LR11";
            }
    
            if (MDCL_DRG.LR1B_group(record)){
                return "LR14";
            }

            return "LR1";
        }else{
            return "";
        }
    }
}

