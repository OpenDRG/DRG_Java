package drg_group.handan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;
import drg_group.handan_2022.DRG.MDCJ_DRG;

public class JV2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A18.811","D18.000x816","D23.502","D24.x00","D24.x01","D24.x02","D48.507","D48.601","E10.600x970","E11.600x970","E14.600x970","I97.200","N60.000","N60.000x001","N60.000x002","N60.100","N60.100x002","N60.100x003","N60.101","N60.200","N60.201","N60.202","N60.300","N60.400","N60.801","N60.900","N61.x00x004","N61.x00x013","N61.x00x014","N61.x01","N61.x02","N61.x03","N61.x04","N61.x05","N61.x06","N61.x07","N62.x00","N62.x00x001","N62.x00x004","N62.x00x007","N62.x01","N62.x02","N63.x00","N63.x00","N63.x01","N64.001","N64.002","N64.100","N64.200","N64.200x001","N64.300x001","N64.400","N64.501","N64.502","N64.503","N64.504","N64.801","N64.802","N64.803","N64.804","N64.805","N64.900","Q83.000","Q83.100","Q83.100x001","Q83.100x002","Q83.200","Q83.300","Q83.800x004","Q83.800x005","Q83.801","Q83.802","Q83.803","Q83.900","Q85.900x009","Q85.915","R92.x00","T85.400","T85.401"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合JV2入组条件，匹配规则：主诊断匹配");
                
            if (MDCJ_DRG.JV29_group(record)){
                return "JV29";
            }

            return "";
        }else{
            return "";
        }
    }
}

