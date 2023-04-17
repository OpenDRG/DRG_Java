package drg_group.yantai_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yantai_2023.Base;
import drg_group.yantai_2023.MedicalRecord;
import drg_group.yantai_2023.DRG.MDCA_DRG;

public class AB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"50.5100","50.5100x001","50.5900x001","50.5900x004","50.5900x005","50.5901","50.5902"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合AB1入组条件，匹配规则：主手术匹配");
                
            if (MDCA_DRG.AB19_group(record)){
                return "AB19";
            }

            return "AB1";
        }else{
            return "";
        }
    }
}

