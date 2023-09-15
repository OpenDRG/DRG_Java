package drg_group.quanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;
import drg_group.quanzhou_2023.DRG.MDCT_DRG;


public class TB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList.length>0 && record.ssValidList.length>0){
            Base.groupMessages.putMessage(record.Index,"符合TB1入组条件，匹配规则：存在手术");
            
                
            if (MDCT_DRG.TB19_group(record)){
                return "TB19";
            }

            return "";
        }else{
            return "";
        }
    }
}

