package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCZ_DRG;


public class ZZ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && !Base.intersect(record.ssList,Base.SS_VALID)){
            Base.groupMessages.putMessage(record.Index,"符合ZZ1入组条件，匹配规则：无手术");
            
                
            if (MDCZ_DRG.ZZ17_group(record)){
                return "ZZ17";
            }
    
            if (MDCZ_DRG.ZZ11_group(record)){
                return "ZZ11";
            }
    
            if (MDCZ_DRG.ZZ13_group(record)){
                return "ZZ13";
            }
    
            if (MDCZ_DRG.ZZ15_group(record)){
                return "ZZ15";
            }

            return "";
        }else{
            return "";
        }
    }
}

