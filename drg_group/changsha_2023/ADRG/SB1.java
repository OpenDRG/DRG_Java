package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCS_DRG;


public class SB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,Base.SS_VALID)){
            Base.groupMessages.putMessage(record.Index,"符合SB1入组条件，匹配规则：存在手术");
            
                
            if (MDCS_DRG.SB11_group(record)){
                return "SB11";
            }
    
            if (MDCS_DRG.SB13_group(record)){
                return "SB13";
            }
    
            if (MDCS_DRG.SB15_group(record)){
                return "SB15";
            }

            return "";
        }else{
            return "";
        }
    }
}

