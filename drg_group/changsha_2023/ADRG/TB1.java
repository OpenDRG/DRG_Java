package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCT_DRG;


public class TB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,Base.SS_VALID)){
            Base.groupMessages.putMessage(record.Index,"符合TB1入组条件，匹配规则：存在手术");
            
                
            if (MDCT_DRG.TB11_group(record)){
                return "TB11";
            }
    
            if (MDCT_DRG.TB13_group(record)){
                return "TB13";
            }
    
            if (MDCT_DRG.TB15_group(record)){
                return "TB15";
            }

            return "";
        }else{
            return "";
        }
    }
}

