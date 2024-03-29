package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCR_DRG;


public class RU2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"Z51.800x095","Z51.800x951","Z51.800x952","Z51.802","Z51.805","Z51.808","Z51.810"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RU2入组条件，匹配规则：主诊断匹配");
            
                
            if (MDCR_DRG.RU29_group(record)){
                return "RU29";
            }

            return "";
        }else{
            return "";
        }
    }
}

