package drg_group.chs_drg_11.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCH_DRG;

public class HZ3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A18.817+K87.1*","D13.600","D13.700x001","D13.701","D18.000x031","D37.700x003","D37.705","D37.706","E84.901","K85.801","K85.802","K86.000","K86.100x001","K86.100x002","K86.100x004","K86.101","K86.102","K86.103","K86.104","K86.105","K86.106","K86.107","K86.200","K86.300","K86.800x001","K86.800x002","K86.800x013","K86.800x015","K86.802","K86.803","K86.804","K86.805","K86.806","K86.807","K86.808","K86.809","K86.810","K86.811","K86.812","K86.813","K86.814","K86.815","K86.816","K86.817","K86.818","K86.901","Q45.001","Q45.002","Q45.003","Q45.100","Q45.200","Q45.300x901","Q45.300x902","Q45.300x904","Q45.301","Q45.802","Q85.912","R93.302","S36.200","S36.200x001","S36.200x011","S36.200x021","S36.200x031","S36.200x091","S36.200x092","S36.201","S36.202","S36.210","T81.800x006","T86.800x021","T86.804"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HZ3入组条件，匹配规则：主诊断匹配");
                
            if (MDCH_DRG.HZ31_group(record)){
                return "HZ31";
            }
    
            if (MDCH_DRG.HZ35_group(record)){
                return "HZ35";
            }

            return "HZ3";
        }else{
            return "";
        }
    }
}

