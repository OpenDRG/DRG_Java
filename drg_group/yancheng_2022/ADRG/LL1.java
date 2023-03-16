package drg_group.yancheng_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yancheng_2022.Base;
import drg_group.yancheng_2022.MedicalRecord;
import drg_group.yancheng_2022.DRG.MDCL_DRG;

public class LL1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"39.9500x004","39.9500x005","39.9500x006","39.9500x007","39.9501","39.9600x002","39.9600x003","54.9800","54.9800x005","54.9800x006","54.9800x007","54.9800x008","39.9500"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LL1入组条件，匹配规则：主手术匹配");
                
            if (MDCL_DRG.LL11_group(record)){
                return "LL11";
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

