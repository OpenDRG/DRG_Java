package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCX_DRG;

public class XR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"R41.000","R41.001","R41.300x001","R41.800x002","R46.600","R46.700","R53.x00x005","R63.200","R63.300x003","R63.601","T97.x01","Z00.401","Z04.601","Z50.100x001","Z50.200","Z50.300","Z50.400x001","Z50.500","Z50.700x001","Z50.800x002","Z50.900x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合XR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCX_DRG.XR11_group(record)){
                return "XR11";
            }
    
            if (MDCX_DRG.XR15_group(record)){
                return "XR15";
            }

            return "XR1";
        }else{
            return "";
        }
    }
}

