package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCR_DRG;

public class RS2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C90.000","C90.000x004","C90.000x005","C90.000x009","C90.000x011","C90.000x012","C90.000x014","C90.000x021","C90.000x022","C90.000x023","C90.000x024","C90.000x025","C90.000x026","C90.000x027","C90.000x028","C90.000x029","C90.000x030","C90.000x031","C90.000x032","C90.000x033","C90.000x034","C90.000x035","C90.000x036","C90.000x037","C90.000x038","C90.000x039","C90.000x040","C90.000x041","C90.001","C90.002","C90.002","C90.100","C90.100x002","C90.100x011","C90.200","C90.200x008","C90.200x009","C90.200x013","C90.300","C90.300x001","C90.300x002","C90.300x003","C90.300x004","C90.300x004","C90.301","C90.302","C90.303","C90.303"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RS2入组条件，匹配规则：主诊断匹配");
                
            if (MDCR_DRG.RS21_group(record)){
                return "RS21";
            }
    
            if (MDCR_DRG.RS23_group(record)){
                return "RS23";
            }
    
            if (MDCR_DRG.RS25_group(record)){
                return "RS25";
            }

            return "";
        }else{
            return "";
        }
    }
}

