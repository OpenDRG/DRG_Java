package drg_group.lanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2023.Base;
import drg_group.lanzhou_2023.MedicalRecord;
import drg_group.lanzhou_2023.DRG.MDCT_DRG;

public class TS2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"F34.000","F34.001","F34.002","F34.100","F34.101","F34.102","F43.000","F43.001","F43.002","F43.100","F43.101","F43.200","F43.200x031","F43.200x041","F43.200x051","F43.200x081","F43.800x002","F43.801","F43.802","F43.803","F43.804","F43.900","F44.000","F44.100","F44.200","F44.300","F44.301","F44.400","F44.401","F44.402","F44.403","F44.404","F44.405","F44.406","F44.407","F44.500","F44.501","F44.600","F44.600x002","F44.601","F44.602","F44.603","F44.700","F44.800x002","F44.800x011","F44.800x012","F44.800x021","F44.801","F44.802","F44.804","F44.805","F44.900","F44.901","F44.902","F44.903","F45.000","F45.100","F45.200","F45.201","F45.202","F45.300","F45.300x021","F45.300x022","F45.300x031","F45.300x041","F45.300x051","F45.300x091","F45.301","F45.302","F45.303","F45.304","F45.305","F45.306","F45.307","F45.308","F45.309","F45.310","F45.400","F45.401","F45.402","F45.403","F45.800x002","F45.801","F45.802","F45.803","F45.804","F45.805","F45.806","F45.807","F45.900","F45.901","F48.000","F48.001","F48.100","F48.100x002","F48.801","F48.802","F48.900","F48.901","F53.000x001","F53.001","F53.002","F53.100x001","F53.101","F53.900","F54.x00","F59.x00","F59.x00x001","F68.000","F68.000x001","F68.100","F68.100x001","F95.000","F95.100","F95.101","F95.200","F95.201","F95.900"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合TS2入组条件，匹配规则：主诊断匹配");
                
            if (MDCT_DRG.TS2A_group(record)){
                return "TS2A";
            }
    
            if (MDCT_DRG.TS25_group(record)){
                return "TS25";
            }

            return "TS2";
        }else{
            return "";
        }
    }
}

