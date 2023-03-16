package drg_group.yancheng_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yancheng_2022.Base;
import drg_group.yancheng_2022.MedicalRecord;
import drg_group.yancheng_2022.DRG.MDCL_DRG;

public class LJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.3701","55.9200x002","55.9200x006","55.9201","55.9202","55.9203","55.9204","55.9205","55.9206","55.9300","55.9300x001","55.9400","55.9500","55.9601","56.3300x001","57.0x01","57.1101","57.1700x001","57.1701","57.1800x001","57.3300","57.9500","58.2300","59.0000","59.0301","59.0302","59.1902","59.2101","59.2102","59.8x02","59.9201","59.9300","59.9400","59.9501","59.9502","97.6101","97.6102","97.6201","97.6202","97.6203","97.6901","98.5101","98.5102","98.5103","98.5104"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LJ1入组条件，匹配规则：主手术匹配");
                
            if (MDCL_DRG.LJ13_group(record)){
                return "LJ13";
            }
    
            if (MDCL_DRG.LJ15_group(record)){
                return "LJ15";
            }

            return "LJ1";
        }else{
            return "";
        }
    }
}

