package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCR_DRG;

public class RT2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"D19.900x001","D36.700x011","D36.700x012","D36.700x021","D36.700x023","D36.700x025","D36.700x028","D36.704","D36.705","D36.709","D36.710","D36.711"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RT2入组条件，匹配规则：主诊断匹配");
                
            if (MDCR_DRG.RT29_group(record)){
                return "RT29";
            }

            return "RT2";
        }else{
            return "";
        }
    }
}

