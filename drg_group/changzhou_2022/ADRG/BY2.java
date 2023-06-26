package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCB_DRG;


public class BY2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"S01.800x031","S01.801","S06.000","S06.100","S06.200x001","S06.200x002","S06.200x011","S06.200x021","S06.200x031","S06.200x032","S06.200x033","S06.200x081","S06.200x082","S06.201","S06.202","S06.203","S06.204","S06.205","S06.206","S06.300x001","S06.300x002","S06.300x011","S06.300x021","S06.300x031","S06.300x032","S06.300x041","S06.300x042","S06.300x081","S06.300x082","S06.301","S06.302","S06.400","S06.401","S06.410","S06.500","S06.500x002","S06.500x004","S06.500x005","S06.500x006","S06.500x007","S06.501","S06.502","S06.510","S06.600","S06.600x002","S06.610","S06.700","S06.700x001","S06.700x002","S06.700x003","S06.700x004","S06.800x002","S06.800x004","S06.800x005","S06.800x007","S06.800x009","S06.800x010","S06.800x011","S06.800x012","S06.800x013","S06.801","S06.802","S06.803","S06.804","S06.805","S06.900","S06.901","S06.912"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BY2入组条件，匹配规则：主诊断匹配");
            
                
            if (MDCB_DRG.BY27_group(record)){
                return "BY27";
            }
    
            if (MDCB_DRG.BY21_group(record)){
                return "BY21";
            }
    
            if (MDCB_DRG.BY23_group(record)){
                return "BY23";
            }
    
            if (MDCB_DRG.BY25_group(record)){
                return "BY25";
            }

            return "";
        }else{
            return "";
        }
    }
}

