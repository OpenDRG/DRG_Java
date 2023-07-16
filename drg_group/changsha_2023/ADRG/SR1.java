package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCS_DRG;


public class SR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A01.003","A02.100","A02.100x002","A02.101","A20.700","A21.700x002","A22.700","A24.100x002","A26.700","A26.700x001","A28.001","A32.700","A32.701","A38.x00x012","A40.000","A40.100","A40.200","A40.300","A40.800","A40.900","A40.903+N16.0*","A41.000","A41.100x002","A41.101","A41.200","A41.300","A41.400","A41.400x001","A41.500x083","A41.500x087","A41.501","A41.502","A41.503","A41.504","A41.505","A41.506","A41.800x002","A41.801","A41.802","A41.803","A41.804","A41.805","A41.806","A41.807","A41.900","A41.900x004","A41.904+N16.0*","A42.700","A54.808","B00.701","B25.800x001","B37.700","B37.700x001","R68.801","T80.201"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合SR1入组条件，匹配规则：主诊断匹配");
            
                
            if (MDCS_DRG.SR11_group(record)){
                return "SR11";
            }
    
            if (MDCS_DRG.SR13_group(record)){
                return "SR13";
            }
    
            if (MDCS_DRG.SR15_group(record)){
                return "SR15";
            }

            return "";
        }else{
            return "";
        }
    }
}

