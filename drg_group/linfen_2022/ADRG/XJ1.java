package drg_group.linfen_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;
import drg_group.linfen_2022.DRG.MDCX_DRG;

public class XJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(Base.SS_VALID,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合XJ1入组条件，匹配规则：存在手术");
                
            if (MDCX_DRG.XJ11_group(record)){
                return "XJ11";
            }
    
            if (MDCX_DRG.XJ13_group(record)){
                return "XJ13";
            }
    
            if (MDCX_DRG.XJ15_group(record)){
                return "XJ15";
            }

            return "XJ1";
        }else{
            return "";
        }
    }
}

