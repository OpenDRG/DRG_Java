package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCX_DRG;

public class XT2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"Q87.800x905","Q89.901","Q90.100","Q91.000","Q91.100","Q91.200","Q91.400","Q91.500","Q91.600","Q91.700","Q92.000","Q92.100","Q92.200","Q92.300","Q92.400","Q92.500","Q92.600","Q92.700","Q92.800","Q92.900","Q93.000","Q93.100","Q93.200","Q93.600","Q93.700","Q93.800","Q95.000","Q95.100","Q95.200","Q95.300","Q95.400","Q95.500","Q95.800","Q95.900","Q96.000","Q96.100","Q96.200","Q96.400","Q96.800","Q96.900","Q97.000","Q97.100","Q97.200","Q97.300","Q97.800","Q97.900","Q98.000","Q98.100","Q98.200","Q98.300","Q98.400","Q98.500","Q98.600","Q98.700","Q98.800","Q98.900","Q99.000","Q99.100","Q99.100x003","Q99.101","Q99.102","Q99.200","Q99.800","Q99.801","Q99.802","Q99.900"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合XT2入组条件，匹配规则：主诊断匹配");
                
            if (MDCX_DRG.XT29_group(record)){
                return "XT29";
            }

            return "";
        }else{
            return "";
        }
    }
}

