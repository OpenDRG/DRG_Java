package drg_group.suzhou_2023.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.suzhou_2023.Base;
import drg_group.suzhou_2023.MedicalRecord;
import drg_group.suzhou_2023.DRG.MDCF_DRG;

public class FT4 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A18.808+I32.0*","A18.809+I32.0*","A39.501+I32.0*","A52.005+I52.0*","A52.008+I32.0*","A54.805+I32.0*","B33.200x001+I32.1*","B49.x15","I01.000","I01.800x001","I01.900","I02.000x001","I09.200","I09.200x001","I09.200x003","I09.200x004","I30.000","I30.100","I30.100x005","I30.100x006","I30.100x007","I30.100x008","I30.101","I30.102","I30.103","I30.801","I30.900","I30.900x001","I30.900x003","I31.000","I31.000x002","I31.001","I31.100","I31.100x001","I31.101","I31.200x001","I31.300","I31.300x005","I31.301","I31.302","I31.800x001","I31.800x003","I31.900x008","I31.900x009","I31.900x010","I31.901","I31.902","I31.903","I31.904","I40.000x004","I97.000x002","M05.305+I32.8*","M32.105+I32.8*","N18.506+I32.8*","S26.000x001","S26.000x002","S26.010","S26.801"};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FT4入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FT4A_group(record)){
                return "FT4A";
            }
    
            if (MDCF_DRG.FT45_group(record)){
                return "FT45";
            }

            return "FT4";
        }else{
            return "";
        }
    }
}

