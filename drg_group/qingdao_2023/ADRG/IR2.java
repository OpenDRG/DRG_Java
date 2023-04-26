package drg_group.qingdao_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.DRG.MDCI_DRG;

public class IR2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"S72.000","S72.000x011","S72.000x021","S72.000x031","S72.000x041","S72.000x051","S72.000x081","S72.000x082","S72.010","S72.100x001","S72.100x002","S72.101","S72.110","S72.200x001","S72.210","S72.300","S72.310","S72.400x001","S72.400x012","S72.400x013","S72.400x021","S72.400x031","S72.400x041","S72.401","S72.410","S72.700","S72.800","S72.900","S72.900x002","S72.910"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IR2入组条件，匹配规则：主诊断匹配");
                
            if (MDCI_DRG.IR29_group(record)){
                return "IR29";
            }

            return "IR2";
        }else{
            return "";
        }
    }
}

