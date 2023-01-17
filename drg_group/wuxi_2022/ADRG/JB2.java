package drg_group.wuxi_2022.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.DRG.MDCJ_DRG;

public class JB2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_ss={"40.5000","40.5100","40.5101","85.2100x023","85.2200","85.2300x001","85.2301","85.2400x006","85.3400x002","85.3401","85.3600x001","85.3601","85.4100x001","85.4200x001","85.4200x003","85.4300x003","85.4301","85.4302","85.4303","85.4401","85.4402","85.4403","85.4500","85.4500x001","85.4500x003","85.4501","85.4600","85.4700","85.4800"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null &&record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合JB2入组条件，匹配规则：主手术匹配");
                
            if (MDCJ_DRG.JB29_group(record)){
                return "JB29";
            }

            return "JB2";
        }else{
            return "";
        }
    }
}

