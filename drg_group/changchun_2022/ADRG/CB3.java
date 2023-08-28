package drg_group.changchun_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;
import drg_group.changchun_2022.DRG.MDCC_DRG;


public class CB3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"13.0100","13.0201","13.1100","13.1900x006","13.1900x007","13.1900x008","13.1901","13.1902","13.2x01","13.3x00x001","13.3x01","13.4100x001","13.4101","13.4200x001","13.4300x001","13.5100","13.5900x001","13.6400x001","13.6500x002","13.6501","13.6502","13.6503","13.6600","13.6900x002","13.6901","13.7000","13.7100x001","13.7200x001","13.8x00x003","13.9000x004","13.9000x005","13.9000x006","13.9000x007","13.9000x008","13.9000x009","13.9000x010","13.9000x011","13.9001","13.9002","13.9003","13.9100x001"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合CB3入组条件，匹配规则：主手术匹配");
            
                
            if (MDCC_DRG.CB39_group(record)){
                return "CB39";
            }

            return "";
        }else{
            return "";
        }
    }
}

