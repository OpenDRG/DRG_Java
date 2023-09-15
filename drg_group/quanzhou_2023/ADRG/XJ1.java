package drg_group.quanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;
import drg_group.quanzhou_2023.DRG.MDCX_DRG;


public class XJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList.length>0 && record.ssValidList.length>0){
            Base.groupMessages.putMessage(record.Index,"符合XJ1入组条件，匹配规则：存在手术");
            
                
            if (MDCX_DRG.XJ13_group(record)){
                return "XJ13";
            }
    
            if (MDCX_DRG.XJ15_group(record)){
                return "XJ15";
            }

            return "";
        }else{
            return "";
        }
    }
}

