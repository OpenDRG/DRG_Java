package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCG_DRG;

public class GK3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"45.4200x003","45.4201","45.4202","45.4300x008","45.4302","45.4303","45.4304","45.4305","45.4306","45.4900x005","46.8500x008","46.8500x009","46.8511","46.8600","46.9601","48.3200x001","48.3200x003","48.3201","48.3301","48.3508","48.3602","98.0303","98.0401","98.0500x003"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合GK3入组条件，匹配规则：某一手术匹配");
                
            if (MDCG_DRG.GK31_group(record)){
                return "GK31";
            }
    
            if (MDCG_DRG.GK33_group(record)){
                return "GK33";
            }
    
            if (MDCG_DRG.GK35_group(record)){
                return "GK35";
            }

            return "GK3";
        }else{
            return "";
        }
    }
}

