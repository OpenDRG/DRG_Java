package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCD_DRG;

public class DB2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"20.9500","20.9501","20.9502","20.9601","20.9602","20.9701","20.9702","20.9801","20.9802"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DB2入组条件，匹配规则：主手术匹配");
                
            if (MDCD_DRG.DB21_group(record)){
                return "DB21";
            }
    
            if (MDCD_DRG.DB23_group(record)){
                return "DB23";
            }
    
            if (MDCD_DRG.DB25_group(record)){
                return "DB25";
            }

            return "";
        }else{
            return "";
        }
    }
}

