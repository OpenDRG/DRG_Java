package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCB_DRG;

public class BY1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"S01.800x011","S01.800x021","S01.800x031","S01.800x083","S01.800x085","S01.800x086","S01.800x087","S02.000","S02.000x003","S02.000x004","S02.000x005","S02.001","S02.002","S02.011","S02.012","S02.100","S02.100x002","S02.100x003","S02.100x004","S02.100x006","S02.100x008","S02.100x009","S02.101","S02.102","S02.103","S02.111","S02.112","S02.113","S02.114","S02.300","S02.300x002","S02.700x001","S02.700x002","S02.701","S02.712","S02.900x002","S02.902","S02.911","S06.211","S06.310","S06.700x005","S06.700x006","S06.700x007","S06.700x008","S06.710","S06.814","S06.910","S06.911","T02.000x001","T02.010"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BY1入组条件，匹配规则：主诊断匹配");
                
            if (MDCB_DRG.BY10_group(record)){
                return "BY10";
            }
    
            if (MDCB_DRG.BY11_group(record)){
                return "BY11";
            }
    
            if (MDCB_DRG.BY13_group(record)){
                return "BY13";
            }
    
            if (MDCB_DRG.BY15_group(record)){
                return "BY15";
            }

            return "BY1";
        }else{
            return "";
        }
    }
}

