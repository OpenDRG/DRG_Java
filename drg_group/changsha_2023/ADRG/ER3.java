package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCE_DRG;

public class ER3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"J68.101","J80.x00","J80.x01","J81.x00","J81.x00x002","J95.100","J95.200","J95.300","J95.800x004","J95.811","J96.000","J96.100","J96.900x001","J96.900x002","J96.900x003"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合ER3入组条件，匹配规则：主诊断匹配");
                
            if (MDCE_DRG.ER39_group(record)){
                return "ER39";
            }

            return "ER3";
        }else{
            return "";
        }
    }
}

