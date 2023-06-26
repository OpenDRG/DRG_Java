package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCJ_DRG;


public class JA2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C44.501","C44.502","C50.000","C50.000x001","C50.001","C50.100","C50.200","C50.300","C50.400","C50.500","C50.600","C50.800","C50.800x005","C50.801","C50.802","C50.803","C50.804","C50.900","C50.900x005","C50.901","C50.902","C79.200x007","C79.806","D03.501","D04.501","D05.000","D05.100","D05.900"};
        String[] adrg_zd1={};
        String[] adrg_ss={"40.2200","40.5000","40.5100","40.5101","85.4300x003","85.4300x004","85.4301","85.4302","85.4303","85.4401","85.4402","85.4403","85.4500","85.4500x001","85.4500x003","85.4501","85.4600","85.4700","85.4800"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合JA2入组条件，匹配规则：主诊断匹配、主手术匹配");
            
                
            if (MDCJ_DRG.JA29_group(record)){
                return "JA29";
            }

            return "";
        }else{
            return "";
        }
    }
}

