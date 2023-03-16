package drg_group.chs_drg_10.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;
import drg_group.chs_drg_10.DRG.MDCW_DRG;

public class WJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(Base.SS_VALID,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合WJ1入组条件，匹配规则：存在手术");
                
            if (MDCW_DRG.WJ11_group(record)){
                return "WJ11";
            }
    
            if (MDCW_DRG.WJ13_group(record)){
                return "WJ13";
            }
    
            if (MDCW_DRG.WJ15_group(record)){
                return "WJ15";
            }

            return "WJ1";
        }else{
            return "";
        }
    }
}

