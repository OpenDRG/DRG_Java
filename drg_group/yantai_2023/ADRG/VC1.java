package drg_group.yantai_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yantai_2023.Base;
import drg_group.yantai_2023.MedicalRecord;
import drg_group.yantai_2023.DRG.MDCV_DRG;

public class VC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"21.9900x002","21.9900x005","21.9901","21.9902","79.6100","79.6201","79.6202","79.6301","79.6302","79.6400","79.6500","79.6601","79.6602","79.6701","79.6702","79.6800","79.6900x002","79.6901","83.4500x001","83.4501","83.4502","86.2200x011","86.2201","86.2202","86.2800x012"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合VC1入组条件，匹配规则：主手术匹配");
                
            if (MDCV_DRG.VC13_group(record)){
                return "VC13";
            }
    
            if (MDCV_DRG.VC15_group(record)){
                return "VC15";
            }

            return "VC1";
        }else{
            return "";
        }
    }
}

