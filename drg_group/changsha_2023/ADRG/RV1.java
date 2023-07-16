package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCR_DRG;


public class RV1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"Z51.000x003","Z51.000x008","Z51.000x012","Z51.001","Z51.002","Z51.003","Z51.806","Z51.811"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RV1入组条件，匹配规则：主诊断匹配");
            
                
            if (MDCR_DRG.RV13_group(record)){
                return "RV13";
            }
    
            if (MDCR_DRG.RV15_group(record)){
                return "RV15";
            }

            return "";
        }else{
            return "";
        }
    }
}

