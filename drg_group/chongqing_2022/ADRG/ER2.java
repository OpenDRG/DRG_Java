package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCE_DRG;

public class ER2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"I26.900x001","I26.900x002","I26.900x003","I26.900x005","I26.900x006","I26.900x007","I26.900x008","I26.900x009","I26.900x010","I26.900x011","I26.900x012","I26.900x013","I26.900x015","I26.900x016","I26.900x017","I26.900x018","I26.901","I26.902","I28.800x010","T79.100"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合ER2入组条件，匹配规则：主诊断匹配");
                
            if (MDCE_DRG.ER21_group(record)){
                return "ER21";
            }
    
            if (MDCE_DRG.ER23_group(record)){
                return "ER23";
            }
    
            if (MDCE_DRG.ER25_group(record)){
                return "ER25";
            }

            return "";
        }else{
            return "";
        }
    }
}

