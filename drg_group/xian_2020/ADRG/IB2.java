package drg_group.xian_2020.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;
import drg_group.xian_2020.DRG.MDCI_DRG;

public class IB2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"81.0100x001","81.0101","81.0102","81.0103","81.0104","81.0105","81.0200x001","81.0200x002","81.0300x001","81.0300x002","81.0400x004","81.0400x005","81.0401","81.0402","81.0500x005","81.0500x006","81.0501","81.0502","81.0600x005","81.0600x006","81.0601","81.0602","81.0700x002","81.0701","81.0702","81.0800x016","81.0800x017","81.0800x018","81.0801","81.0802","81.3101","81.3102","81.3103","81.3104","81.3105","81.3106","81.3200x001","81.3200x002","81.3300x001","81.3300x002","81.3400x003","81.3400x004","81.3401","81.3402","81.3500x003","81.3500x004","81.3501","81.3502","81.3600x003","81.3600x004","81.3601","81.3602","81.3700x001","81.3700x002","81.3701","81.3702","81.3800x003","81.3800x004","81.3800x005","81.3801","81.3802","81.3900","81.6200","81.6300","81.6400x003","84.5100x002","84.5100x003","84.5100x004","84.5100x005","84.5100x006","84.5100x007"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IB2入组条件，匹配规则：主手术匹配");
                
            if (MDCI_DRG.IB29_group(record)){
                return "IB29";
            }

            return "IB2";
        }else{
            return "";
        }
    }
}

