package drg_group.lanzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2022.Base;
import drg_group.lanzhou_2022.MedicalRecord;
import drg_group.lanzhou_2022.DRG.MDCF_DRG;

public class FR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"I21.000x005","I21.001","I21.002","I21.003","I21.004","I21.103","I21.104","I21.105","I21.106","I21.200x003","I21.200x009","I21.200x010","I21.200x011","I21.200x014","I21.200x015","I21.200x016","I21.200x017","I21.200x018","I21.200x019","I21.200x020","I21.200x021","I21.200x022","I21.200x023","I21.200x024","I21.200x025","I21.200x026","I21.200x027","I21.200x029","I21.200x030","I21.204","I21.205","I21.206","I21.207","I21.208","I21.210","I21.211","I21.212","I21.213","I21.300x003","I21.300x004","I21.300x005","I21.300x008","I21.302","I21.303","I21.400x003","I21.401","I21.402","I21.900","I21.900x001","I21.901","I22.000x001","I22.000x002","I22.000x003","I22.000x004","I22.000x005","I22.100x001","I22.100x002","I22.100x003","I22.800x001","I22.800x002","I22.800x003","I22.800x004","I22.800x005","I22.800x006","I22.800x007","I22.800x008","I22.800x009","I22.800x010","I22.800x011","I22.800x012","I22.800x013","I22.800x014","I22.800x015","I22.800x016","I22.800x017","I22.800x018","I22.900x001","I23.000x001","I23.100x001","I23.200x001","I23.300x001","I23.400x001","I23.500x001","I23.601","I23.800x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FR11_group(record)){
                return "FR11";
            }
    
            if (MDCF_DRG.FR1B_group(record)){
                return "FR14";
            }

            return "FR1";
        }else{
            return "";
        }
    }
}

