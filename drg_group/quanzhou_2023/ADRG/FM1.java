package drg_group.quanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;
import drg_group.quanzhou_2023.DRG.MDCF_DRG;


public class FM1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"36.0601","36.0602","36.0700x004","36.0701"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FM1入组条件，匹配规则：主手术匹配");
            
                
            if (MDCF_DRG.FM19_group(record)){
                return "FM19";
            }

            return "";
        }else{
            return "";
        }
    }
}

