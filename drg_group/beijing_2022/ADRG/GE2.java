package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCG_DRG;

public class GE2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"53.7100","53.7100x001","53.7101","53.7200x001","53.7201","53.7202","53.7500","53.8000x001","53.8001","53.8002","53.8301","53.9x00x016","53.9x00x017","53.9x00x020","53.9x00x021","53.9x00x022","53.9x01","53.9x02","53.9x03","53.9x04","53.9x05","53.9x06"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GE2入组条件，匹配规则：主手术匹配");
                
            if (MDCG_DRG.GE29_group(record)){
                return "GE29";
            }

            return "GE2";
        }else{
            return "";
        }
    }
}

