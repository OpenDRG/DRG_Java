package drg_group.linfen_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;
import drg_group.linfen_2022.DRG.MDCM_DRG;

public class MB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"60.0x00x001","60.0x00x003","60.0x01","60.0x02","60.0x03","60.2100x001","60.2100x002","60.2900x003","60.2900x004","60.2901","60.2902","60.3x01","60.4x01","60.5x01","60.5x02","60.6100x001","60.6100x002","60.6101","60.6200","60.6201","60.6900x001","60.6900x002","60.8201","60.9300","60.9400x001","60.9401","60.9500x001","60.9600x001","60.9701","60.9702","60.9901"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合MB1入组条件，匹配规则：主手术匹配");
                
            if (MDCM_DRG.MB19_group(record)){
                return "MB19";
            }

            return "MB1";
        }else{
            return "";
        }
    }
}

