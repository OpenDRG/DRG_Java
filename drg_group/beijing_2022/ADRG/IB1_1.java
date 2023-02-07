package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCI_DRG;

public class IB1_1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"03.0900x007","03.0900x023","03.0900x024","03.5303","79.8904","81.0100x001","81.0101","81.0102","81.0103","81.0104","81.0105","81.3101","81.3102","81.3103","81.3104","81.3105","81.3106","81.3200x001","81.3200x002","81.3300x001","81.3300x002","81.3400x003","81.3400x004","81.3401","81.3402","81.3500x003","81.3500x004","81.3501","81.3502","81.3600x003","81.3600x004","81.3601","81.3602","81.3700x001","81.3700x002","81.3701","81.3702","81.3800x003","81.3800x004","81.3800x005","81.3801","81.3802","81.3900","81.6300","81.6400x003"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合IB1_1入组条件，匹配规则：某一手术匹配");
                
            if (MDCI_DRG.IB19_group(record)){
                return "IB19";
            }

            return "IB1";
        }else{
            return "";
        }
    }
}

