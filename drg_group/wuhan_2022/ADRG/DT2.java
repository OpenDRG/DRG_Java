package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCD_DRG;

public class DT2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A21.300x002","A36.000x003","A36.200","A36.200x002","A36.201","A52.703+J99.8*","A54.500","A56.400","A69.100x001","A69.100x002","B05.801","B37.800x088","J04.000","J04.000x004","J04.000x006","J04.000x008","J04.001","J04.002","J04.003","J04.004","J04.005","J04.100","J04.200","J05.000","J05.100","J06.000","J36.x00","J36.x00x001","J36.x00x003","J36.x00x004","J37.000","J37.001","J37.002","J37.003","J37.004","J37.005","J37.100","J38.201","J38.300x013","J38.305","J38.700x009","J38.700x021","J38.700x022","J38.704","J38.707","J38.714","J38.716","J39.809","J39.811"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DT2入组条件，匹配规则：主诊断匹配");
                
            if (MDCD_DRG.DT21_group(record)){
                return "DT21";
            }
    
            if (MDCD_DRG.DT23_group(record)){
                return "DT23";
            }
    
            if (MDCD_DRG.DT25_group(record)){
                return "DT25";
            }

            return "DT2";
        }else{
            return "";
        }
    }
}

