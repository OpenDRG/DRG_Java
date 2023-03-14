package drg_group.xian_2020.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;
import drg_group.xian_2020.DRG.MDCN_DRG;

public class NG1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"Z31.100","Z31.200","Z31.200x003","Z31.201","Z31.300x001","Z31.300x002"};
        String[] adrg_zd1={};
        String[] adrg_ss={"65.9900x005","65.9900x006","65.9900x008","69.9200x004","69.9200x006","69.9200x007","69.9200x008","69.9201","69.9202","75.9900x004"};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合NG1入组条件，匹配规则：主诊断匹配、主手术匹配");
                
            if (MDCN_DRG.NG11_group(record)){
                return "NG11";
            }
    
            if (MDCN_DRG.NG13_group(record)){
                return "NG13";
            }
    
            if (MDCN_DRG.NG15_group(record)){
                return "NG15";
            }

            return "NG1";
        }else{
            return "";
        }
    }
}

