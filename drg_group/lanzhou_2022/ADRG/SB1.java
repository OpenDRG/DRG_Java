package drg_group.lanzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2022.Base;
import drg_group.lanzhou_2022.MedicalRecord;
import drg_group.lanzhou_2022.DRG.MDCS_DRG;

public class SB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(Base.SS_VALID,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合SB1入组条件，匹配规则：存在手术");
                
            if (MDCS_DRG.SB11_group(record)){
                return "SB11";
            }
    
            if (MDCS_DRG.SB1B_group(record)){
                return "SB14";
            }

            return "SB1";
        }else{
            return "";
        }
    }
}

