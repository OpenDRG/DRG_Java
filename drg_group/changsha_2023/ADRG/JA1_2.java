package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCJ_DRG;


public class JA1_2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C44.501","C50.000","C50.000x001","C50.001","C50.100","C50.200","C50.300","C50.400","C50.500","C50.600","C50.800","C50.800x005","C50.801","C50.802","C50.803","C50.804","C50.900","C50.900x005","C50.901","C50.902","C79.200x007","C79.806","D03.501","D04.501","D05.000","D05.100","D05.900"};
        String[] adrg_zd1={};
        String[] adrg_ss={"85.5300x001","85.5400x001","85.7000x001","85.7100x001","85.7200x001","85.7300x001","85.7400x001","85.7500x001","85.7600x001","85.7900x001"};
        String[] adrg_ss1={"85.2100x003","85.2100x019","85.2200","85.2300x001","85.3300x001","85.3400x002","85.3500x001","85.3600x001","85.4100x001","85.4200x001","85.4200x003"};
        String[] adrg_ss2={"40.2100","40.2200","40.2300","40.2900x002","40.2901","40.2910","40.3x00x001","40.3x00x002","40.3x00x003","40.3x00x005","40.4100","40.4200","40.5000","40.5100","40.5101","40.5901","40.5914"};
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss) && Base.intersect(record.ssList,adrg_ss1) && Base.intersect(record.ssList,adrg_ss2)){
            Base.groupMessages.putMessage(record.Index,"符合JA1_2入组条件，匹配规则：主诊断匹配、三手术匹配");
            
                
            if (MDCJ_DRG.JA19_group(record)){
                return "JA19";
            }

            return "";
        }else{
            return "";
        }
    }
}

