package drg_group.lanzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2022.Base;
import drg_group.lanzhou_2022.MedicalRecord;
import drg_group.lanzhou_2022.DRG.MDCI_DRG;

public class IC2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.8500x001","00.8600x001","00.8700x001","81.5100","81.5200x004","81.5201","81.5202","81.5400","81.5400x004","81.5400x005","81.5400x007","81.5400x008","81.5401","81.5600","81.5700x001","81.5700x002","81.8000","81.8000x003","81.8100","81.8101","81.8400","81.8400x002","81.8401","81.8800"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IC2入组条件，匹配规则：主手术匹配");
                
            if (MDCI_DRG.IC29_group(record)){
                return "IC29";
            }

            return "IC2";
        }else{
            return "";
        }
    }
}

