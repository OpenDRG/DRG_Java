package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCJ_DRG;

public class JA2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"40.2200","40.5000","40.5100","40.5101","85.4300x003","85.4301","85.4302","85.4303","85.4401","85.4402","85.4403","85.4500x001","85.4500x003","85.4501","85.4600","85.4700","85.4800"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合JA2入组条件，匹配规则：某一手术匹配");
                
            if (MDCJ_DRG.JA21_group(record)){
                return "JA21";
            }
    
            if (MDCJ_DRG.JA23_group(record)){
                return "JA23";
            }
    
            if (MDCJ_DRG.JA25_group(record)){
                return "JA25";
            }

            return "JA2";
        }else{
            return "";
        }
    }
}

