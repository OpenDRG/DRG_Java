package drg_group.xian_2020.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;
import drg_group.xian_2020.DRG.MDCW_DRG;

public class WR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true){
            Base.groupMessages.putMessage(record.Index,"符合WR1入组条件，匹配规则：");
                
            if (MDCW_DRG.WR11_group(record)){
                return "WR11";
            }
    
            if (MDCW_DRG.WR13_group(record)){
                return "WR13";
            }
    
            if (MDCW_DRG.WR15_group(record)){
                return "WR15";
            }

            return "WR1";
        }else{
            return "";
        }
    }
}

