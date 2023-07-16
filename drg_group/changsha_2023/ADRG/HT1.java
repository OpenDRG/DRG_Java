package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCH_DRG;


public class HT1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"K85.002","K85.102","K85.202","K85.302","K85.800x001","K85.800x002","K85.800x003","K85.813","K85.814","K85.815","K85.816","K85.817","K85.818","K85.821","K85.822","K85.902","K86.801"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HT1入组条件，匹配规则：主诊断匹配");
            
                
            if (MDCH_DRG.HT11_group(record)){
                return "HT11";
            }
    
            if (MDCH_DRG.HT13_group(record)){
                return "HT13";
            }
    
            if (MDCH_DRG.HT15_group(record)){
                return "HT15";
            }

            return "";
        }else{
            return "";
        }
    }
}

