package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCL_DRG;

public class LL1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"39.9500x005","39.9500x006","39.9500x007","39.9501","39.9600x002","39.9600x003","39.9700x001","39.9701","39.9702","39.9703","39.9704","39.9705","54.9800","54.9800x005","54.9800x006","54.9800x007","54.9800x008"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合LL1入组条件，匹配规则：某一手术匹配");
                
            if (MDCL_DRG.LL11_group(record)){
                return "LL11";
            }
    
            if (MDCL_DRG.LL13_group(record)){
                return "LL13";
            }
    
            if (MDCL_DRG.LL15_group(record)){
                return "LL15";
            }

            return "LL1";
        }else{
            return "";
        }
    }
}

