package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCJ_DRG;

public class JB3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"40.1900x002","40.2200","85.0x00x002","85.0x00x003","85.0x01","85.0x02","85.1100x003","85.1200x001","85.2500","85.8100","85.9100","85.9300","85.9400","85.9500","85.9600","85.9900"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合JB3入组条件，匹配规则：某一手术匹配");
                
            if (MDCJ_DRG.JB31_group(record)){
                return "JB31";
            }
    
            if (MDCJ_DRG.JB33_group(record)){
                return "JB33";
            }
    
            if (MDCJ_DRG.JB35_group(record)){
                return "JB35";
            }

            return "JB3";
        }else{
            return "";
        }
    }
}

