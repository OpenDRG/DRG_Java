package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCP_DRG;

public class PJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"21.0902","31.3x03","31.7900x004","31.7900x005","45.9301","45.9303","47.1900x001","49.9100","58.0x05","58.3103","58.3905","58.5x00","58.5x01","59.0201","59.0202"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0]) && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PJ1入组条件，匹配规则：主手术匹配、新生儿");
                
            if (MDCP_DRG.PJ19_group(record)){
                return "PJ19";
            }

            return "PJ1";
        }else{
            return "";
        }
    }
}

