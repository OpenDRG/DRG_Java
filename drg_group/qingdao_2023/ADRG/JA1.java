package drg_group.qingdao_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.DRG.MDCJ_DRG;

public class JA1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"D05.000","C50.400","C50.200","C50.600","C50.802","C50.001","C50.300","D04.501","C44.501","C50.100","C50.500","C50.800x005","C50.901","D05.900","C50.000x001","C50.801","C50.900","C50.902","C79.200x007","C50.900x005","D03.501","C50.800","D05.100","C50.000","C50.803","C79.806","C50.804"};
        String[] adrg_zd1={};
        String[] adrg_ss={"85.5300x001","85.5400x001","85.7000x001","85.7100x001","85.7200x001","85.7300x001","85.7400x001","85.7500x001","85.7600x001","85.7900x001","85.4300x003","85.4300x004","85.4301","85.4302","85.4303","85.4401","85.4402","85.4403","85.4500x001","85.4500x003","85.4501","85.4600","85.4700","85.4800","85.2100x003","85.2100x019","85.2200","85.2300x001","85.3300x001","85.3400x002","85.3500x001","85.3600x001","85.4100x001","85.4200x001","85.4200x003","40.2100","40.2200","40.2300","40.2900x002","40.2901","40.2910","40.3x00x001","40.3x00x002","40.3x00x003","40.3x00x005","40.4100","40.4200","40.5000","40.5100","40.5101","40.5901","40.5914"};
        String[] adrg_ss1={"1","1","1","1","1","1","1","1","1","1","2","2","2","2","2","2","2","2","2","2","2","2","2","2","3","3","3","3","3","3","3","3","3","3","3","4","4","4","4","4","4","4","4","4","4","4","4","4","4","4","4","4"};
        
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
  
        if (true && Base.contains(adrg_zd,record.zdList[0]) && ((ss_matched.contains("1") && ss_matched.contains("2")) || (ss_matched.contains("1") && ss_matched.contains("3") && ss_matched.contains("4")))){
            Base.groupMessages.putMessage(record.Index,"符合JA1入组条件，匹配规则：主诊断匹配、JA1特殊规则、多手术处理");
                
            if (MDCJ_DRG.JA19_group(record)){
                return "JA19";
            }

            return "JA1";
        }else{
            return "";
        }
    }
}

