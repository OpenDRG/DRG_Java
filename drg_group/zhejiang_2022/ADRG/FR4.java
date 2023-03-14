package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCF_DRG;

public class FR4 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"I24.000x003","I24.000x004","I24.000x005","I24.000x009","I24.000x010","I24.001","I24.002","I24.003","I24.100x001","I24.800x001","I24.800x004","I25.000x001","I25.100x003","I25.102","I25.103","I25.200","I25.200x006","I25.200x009","I25.200x011","I25.200x012","I25.200x014","I25.200x015","I25.200x016","I25.200x017","I25.200x018","I25.200x019","I25.200x020","I25.200x021","I25.200x022","I25.200x023","I25.200x024","I25.200x025","I25.200x026","I25.200x027","I25.200x028","I25.200x029","I25.200x030","I25.200x031","I25.201","I25.202","I25.203","I25.204","I25.205","I25.206","I25.207","I25.208","I25.400","I25.400x001","I25.400x005","I25.401","I25.402","I25.403","I25.600x001","I25.800x002","I25.800x003","I25.800x004","I25.800x005","I25.800x006","I25.800x007","I25.800x009","I25.800x010","I25.800x011","I25.800x012","I25.802","I25.900","I25.901","I25.902","I51.600x002","I51.600x003","T82.201"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FR4入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FR41_group(record)){
                return "FR41";
            }
    
            if (MDCF_DRG.FR43_group(record)){
                return "FR43";
            }
    
            if (MDCF_DRG.FR45_group(record)){
                return "FR45";
            }

            return "FR4";
        }else{
            return "";
        }
    }
}

