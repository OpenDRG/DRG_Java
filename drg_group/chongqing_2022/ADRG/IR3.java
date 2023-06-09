package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCI_DRG;

public class IR3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"S72.300","S72.310","S72.400x001","S72.400x012","S72.400x013","S72.400x021","S72.400x031","S72.400x041","S72.401","S72.410","S72.700","S72.800","S72.900","S72.900x002"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IR3入组条件，匹配规则：主诊断匹配");
                
            if (MDCI_DRG.IR31_group(record)){
                return "IR31";
            }
    
            if (MDCI_DRG.IR33_group(record)){
                return "IR33";
            }
    
            if (MDCI_DRG.IR35_group(record)){
                return "IR35";
            }

            return "";
        }else{
            return "";
        }
    }
}

