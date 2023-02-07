package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCX_DRG;

public class XR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"T97.x00x003","T97.x01","T97.x02","Z00.401","Z50.000","Z50.100x001","Z50.101","Z50.200","Z50.300","Z50.400x001","Z50.500","Z50.501","Z50.600","Z50.700x001","Z50.800x002","Z50.801","Z50.900x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合XR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCX_DRG.XR19_group(record)){
                return "XR19";
            }

            return "XR1";
        }else{
            return "";
        }
    }
}

