package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCP_DRG;

public class PV1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true){
            Base.groupMessages.putMessage(record.Index,"符合PV1入组条件，匹配规则：");
                
            if (MDCP_DRG.PV11_group(record)){
                return "PV11";
            }
    
            if (MDCP_DRG.PV13_group(record)){
                return "PV13";
            }
    
            if (MDCP_DRG.PV15_group(record)){
                return "PV15";
            }

            return "PV1";
        }else{
            return "";
        }
    }
}

