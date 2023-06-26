package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCG_DRG;


public class GK3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"45.4200x003","45.4200x003","45.4201","45.4300x008","45.4300x009","45.4300x012","45.4300x013","45.4301","45.4302","45.4303","45.4304","45.4305","45.4306","45.4307","46.8500x008","46.8500x009","46.8511","46.8600","46.9601","46.9602","48.3200x001","48.3200x003","48.3201","48.3301","48.3600x001","48.3600x002","48.3602","48.9900x005","97.5900x001","98.0303","98.0401","98.0500x003"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GK3入组条件，匹配规则：主手术匹配");
            
                
            if (MDCG_DRG.GK39_group(record)){
                return "GK39";
            }

            return "";
        }else{
            return "";
        }
    }
}

