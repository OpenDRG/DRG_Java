package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCW_DRG;


public class WB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"T20.000","T20.002","T20.003","T20.200","T20.201","T20.300","T20.401","T21.000","T21.200","T21.300","T23.200","T23.300","T25.000","T25.200","T25.300","T29.000","T29.700x001","T30.000","T30.200","T30.300","T31.000","T31.100","T31.200","T31.300","T31.400","T31.500","T31.600","T31.700","T31.800","T31.900","T32.100","T32.200","T32.300","T32.400","T32.500","T32.600","T32.700","T32.800","T32.900"};
        String[] adrg_zd1={};
        String[] adrg_ss={"18.9x00x007","85.8200","85.8300","85.8400","85.8500","86.6101","86.6200x002","86.6201","86.6202","86.6300x001","86.6301","86.6302","86.6303","86.6304","86.6501","86.6601","86.6701","86.6702","86.6901","86.6903","86.6904","86.6905","86.6906","86.7100x009","86.7101","86.7102","86.7103","86.7104","86.7105","86.7200x001","86.7300x003","86.7300x004","86.7301","86.7302","86.7303","86.7400x026","86.7400x031","86.7400x032","86.7400x033","86.7400x034","86.7400x035","86.7400x036","86.7400x037","86.7400x038","86.7400x039","86.7400x040","86.7400x041","86.7400x042","86.7401","86.7402","86.7403","86.7404","86.7500x001","86.7501","86.7502","86.7503","86.7504","86.9301","86.9302","86.9303","86.9305","86.9306"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合WB1入组条件，匹配规则：主诊断匹配、主手术匹配");
            
                
            if (MDCW_DRG.WB11_group(record)){
                return "WB11";
            }
    
            if (MDCW_DRG.WB13_group(record)){
                return "WB13";
            }
    
            if (MDCW_DRG.WB15_group(record)){
                return "WB15";
            }

            return "";
        }else{
            return "";
        }
    }
}

