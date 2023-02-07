package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCW_DRG;

public class WB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true){
            Base.groupMessages.putMessage(record.Index,"符合WB1入组条件，匹配规则：");
                
            if (MDCW_DRG.WB11_group(record)){
                return "WB11";
            }
    
            if (MDCW_DRG.WB13_group(record)){
                return "WB13";
            }
    
            if (MDCW_DRG.WB15_group(record)){
                return "WB15";
            }

            return "WB1";
        }else{
            return "";
        }
    }
}

