package drg_group.wlmq_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wlmq_2022.Base;
import drg_group.wlmq_2022.MedicalRecord;
import drg_group.wlmq_2022.DRG.MDCT_DRG;

public class TB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(Base.SS_VALID,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合TB1入组条件，匹配规则：存在手术");
                
            if (MDCT_DRG.TB13_group(record)){
                return "TB13";
            }
    
            if (MDCT_DRG.TB15_group(record)){
                return "TB15";
            }

            return "TB1";
        }else{
            return "";
        }
    }
}

