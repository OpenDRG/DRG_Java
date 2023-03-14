package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCO_DRG;

public class OR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"O75.700x001","O80.000","O80.100","O80.800","O80.900","O84.000","Z38.000x001","Z38.100x001","Z38.200x001","Z38.300x001","Z38.400x001","Z38.500x001","Z38.600x001","Z38.700x001","Z38.800x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合OR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCO_DRG.OR11_group(record)){
                return "OR11";
            }
    
            if (MDCO_DRG.OR13_group(record)){
                return "OR13";
            }
    
            if (MDCO_DRG.OR15_group(record)){
                return "OR15";
            }
    
            if (MDCO_DRG.OR19_group(record)){
                return "OR19";
            }

            return "OR1";
        }else{
            return "";
        }
    }
}

