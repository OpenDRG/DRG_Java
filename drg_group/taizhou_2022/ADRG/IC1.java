package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCI_DRG;

public class IC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.7000x001","00.7100x001","00.7200x001","00.7201","00.7300x001","00.7300x002","00.7300x003","00.7301","00.8000x001","00.8100x001","00.8200x001","00.8201","00.8300x001","00.8400x001","81.9700x002","81.9701","81.9702"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IC1入组条件，匹配规则：主手术匹配");
                
            if (MDCI_DRG.IC10_group(record)){
                return "IC10";
            }
    
            if (MDCI_DRG.IC11_group(record)){
                return "IC11";
            }
    
            if (MDCI_DRG.IC13_group(record)){
                return "IC13";
            }
    
            if (MDCI_DRG.IC15_group(record)){
                return "IC15";
            }

            return "IC1";
        }else{
            return "";
        }
    }
}

