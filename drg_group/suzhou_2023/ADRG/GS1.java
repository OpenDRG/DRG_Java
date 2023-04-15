package drg_group.suzhou_2023.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.suzhou_2023.Base;
import drg_group.suzhou_2023.MedicalRecord;
import drg_group.suzhou_2023.DRG.MDCG_DRG;

public class GS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"I85.000x001","I86.401","I86.800x014","I86.812","K22.804","K55.800x003","K55.900x004","K91.800x102","K91.800x103","K91.800x106","K91.800x501","K92.000","K92.100x001","K92.200x001","K92.200x005","K92.201","K92.202","K92.203","K92.204","K92.205","K92.206","K92.207","K92.208","K92.209","K92.210","K92.800x001","K92.800x002","K92.800x003","K92.800x004","K92.800x005","K92.800x007","K92.800x011","R19.501"};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GS1入组条件，匹配规则：主诊断匹配");
                
            if (MDCG_DRG.GS1A_group(record)){
                return "GS1A";
            }
    
            if (MDCG_DRG.GS15_group(record)){
                return "GS15";
            }

            return "GS1";
        }else{
            return "";
        }
    }
}

