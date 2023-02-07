package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCW_DRG;

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
    
            if (MDCW_DRG.WR1B_group(record)){
                return "WR1B";
            }

            return "WR1";
        }else{
            return "";
        }
    }
}

