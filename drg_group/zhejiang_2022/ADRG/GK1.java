package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCG_DRG;

public class GK1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"42.3303","42.3305","42.3306","43.4106","43.4107","43.4108","45.3004","45.3005","45.3007","45.3300x012","45.3300x013","45.3300x014","45.4300x009","45.4300x012","45.4307","46.3200x002","46.3201","46.8504","46.8505","46.8506","46.8507","46.8508","46.8509","48.3509","48.3510","48.3512","97.5101","97.5201","97.5902","97.5903"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合GK1入组条件，匹配规则：某一手术匹配");
                
            if (MDCG_DRG.GK11_group(record)){
                return "GK11";
            }
    
            if (MDCG_DRG.GK13_group(record)){
                return "GK13";
            }
    
            if (MDCG_DRG.GK15_group(record)){
                return "GK15";
            }

            return "GK1";
        }else{
            return "";
        }
    }
}

