package drg_group.linfen_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;
import drg_group.linfen_2022.DRG.MDCF_DRG;

public class FF1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.0900x003","38.5900x005","38.5900x008","38.5900x009","38.5900x010","38.5901","38.5902","38.5903","38.5904","38.5905","38.5906","38.5907","39.2900x001","39.2900x002","39.2900x044"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FF1入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FF19_group(record)){
                return "FF19";
            }

            return "FF1";
        }else{
            return "";
        }
    }
}

