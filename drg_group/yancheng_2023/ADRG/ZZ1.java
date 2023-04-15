package drg_group.yancheng_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yancheng_2023.Base;
import drg_group.yancheng_2023.MedicalRecord;
import drg_group.yancheng_2023.DRG.MDCZ_DRG;

public class ZZ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && (record.ssList==null || record.ssList.length==0 || !Base.contains(Base.SS_VALID,record.ssList[0]))){
            Base.groupMessages.putMessage(record.Index,"符合ZZ1入组条件，匹配规则：无手术");
                
            if (MDCZ_DRG.ZZ11_group(record)){
                return "ZZ11";
            }
    
            if (MDCZ_DRG.ZZ15_group(record)){
                return "ZZ15";
            }

            return "ZZ1";
        }else{
            return "";
        }
    }
}

