package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCJ_DRG;

public class JB2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"85.2100x003","85.2100x019","85.2100x020","85.2100x021","85.2100x022","85.2101","85.2200","85.2300x001","85.2301","85.2400x004","85.2400x005","85.2401","85.2402","85.3400x002","85.3401","85.3600x001","85.3601","85.4100x001","85.4200x001","85.4200x003","85.4300x003"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合JB2入组条件，匹配规则：某一手术匹配");
                
            if (MDCJ_DRG.JB21_group(record)){
                return "JB21";
            }
    
            if (MDCJ_DRG.JB23_group(record)){
                return "JB23";
            }
    
            if (MDCJ_DRG.JB25_group(record)){
                return "JB25";
            }

            return "JB2";
        }else{
            return "";
        }
    }
}

