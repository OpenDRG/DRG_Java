package drg_group.guangxi_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.guangxi_2022.Base;
import drg_group.guangxi_2022.MedicalRecord;
import drg_group.guangxi_2022.DRG.MDCH_DRG;

public class HL2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"51.1000","51.1100","51.1101","51.1104","51.1105","51.1500","52.1302","52.1303"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0]) && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合HL2入组条件，匹配规则：主手术匹配、某一手术匹配");
                
            if (MDCH_DRG.HL21_group(record)){
                return "HL21";
            }
    
            if (MDCH_DRG.HL23_group(record)){
                return "HL23";
            }
    
            if (MDCH_DRG.HL25_group(record)){
                return "HL25";
            }

            return "";
        }else{
            return "";
        }
    }
}

