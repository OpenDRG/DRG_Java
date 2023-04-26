package drg_group.qingdao_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.DRG.MDCP_DRG;

public class PK1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"93.9000x003","93.9001","96.7101"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0]) && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PK1入组条件，匹配规则：主手术匹配、新生儿");
                
            if (MDCP_DRG.PK11_group(record)){
                return "PK11";
            }
    
            if (MDCP_DRG.PK15_group(record)){
                return "PK15";
            }

            return "PK1";
        }else{
            return "";
        }
    }
}

