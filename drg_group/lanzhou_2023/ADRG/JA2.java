package drg_group.lanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2023.Base;
import drg_group.lanzhou_2023.MedicalRecord;
import drg_group.lanzhou_2023.DRG.MDCJ_DRG;

public class JA2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C44.501","C50.200","C50.900","C50.900x005","C50.400","C50.901","D04.501","C50.800","C50.800x005","C50.500","C50.600","C50.801","C50.100","D05.000","D03.501","C50.902","D05.100","C50.804","C50.300","C50.802","C50.803","C50.001","C79.806","C79.200x007","C44.502","C50.000x001","D05.900"};
        String[] adrg_zd1={};
        String[] adrg_ss={"85.4303","85.4300x003","85.4300x004","85.4301","85.4302","85.4401","85.4402","85.4403","85.4500x001","85.4500x003","85.4501","85.4600","85.4700","85.4800","85.2100x003","85.2100x019","85.2200","85.2300x001","85.3300x001","85.3400x002","85.3500x001","85.3600x001","85.4100x001","85.4200x001","85.4200x003","40.2100","40.2200","40.2300","40.2900x002","40.2901","40.2910","40.3x00x001","40.3x00x002","40.3x00x003","40.3x00x005","40.4100","40.4200","40.5000","40.5100","40.5101","40.5901","40.5914"};
        String[] adrg_ss1={"1","1","1","1","1","1","1","1","1","1","1","1","1","1","2","2","2","2","2","2","2","2","2","2","2","3","3","3","3","3","3","3","3","3","3","3","3","3","3","3","3","3"};
        
        Set<String> ss_matched=new HashSet<String>();
        Base.Intersect(record.ssList,adrg_ss).forEach(x->{
            int i=0;
            for (String s:adrg_ss){
                if (s.equals(x)){
                    ss_matched.add(adrg_ss1[i]);
                }
                i++;
            }
        });
  
        if (true && Base.contains(adrg_zd,record.zdList[0]) && (ss_matched.contains("1") || (ss_matched.contains("2") && ss_matched.contains("3")))){
            Base.groupMessages.putMessage(record.Index,"符合JA2入组条件，匹配规则：主诊断匹配、NA1特殊规则、多手术处理");
                
            if (MDCJ_DRG.JA2A_group(record)){
                return "JA2A";
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

