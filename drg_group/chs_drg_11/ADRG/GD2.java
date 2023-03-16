package drg_group.chs_drg_11.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCG_DRG;

public class GD2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"47.0100","47.0901","47.0902","47.0903","47.1100","47.1900x001","47.2x00","47.2x01","47.9100","47.9200","47.9901"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GD2入组条件，匹配规则：主手术匹配");
                
            if (MDCG_DRG.GD23_group(record)){
                return "GD23";
            }
    
            if (MDCG_DRG.GD25_group(record)){
                return "GD25";
            }

            return "GD2";
        }else{
            return "";
        }
    }
}

