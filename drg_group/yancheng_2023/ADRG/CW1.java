package drg_group.yancheng_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yancheng_2023.Base;
import drg_group.yancheng_2023.MedicalRecord;
import drg_group.yancheng_2023.DRG.MDCC_DRG;

public class CW1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"E10.300x091+H28.0*","E10.302+H28.0*","E11.300x091+H28.0*","E11.302+H28.0*","E14.300x061+H28.0*","E14.300x091+H28.0*","E20.902+H28.1*","E83.500x006+H28.1*","E88.906+H28.1*","H25.000","H25.000x002","H25.000x003","H25.000x005","H25.000x006","H25.000x007","H25.001","H25.002","H25.004","H25.100","H25.200","H25.800","H25.800x001","H25.800x002","H25.900","H26.000x001","H26.000x002","H26.000x005","H26.001","H26.002","H26.003","H26.100","H26.200","H26.200x005","H26.201","H26.202","H26.300","H26.300x001","H26.300x004","H26.301","H26.400","H26.400x002","H26.400x003","H26.401","H26.801","H26.802","H26.900","H26.901","H27.000","H27.100","H27.101","H27.102","H27.800","H27.800x001","H27.900","Q12.000","Q12.001","Q12.002"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合CW1入组条件，匹配规则：主诊断匹配");
                
            if (MDCC_DRG.CW19_group(record)){
                return "CW19";
            }

            return "CW1";
        }else{
            return "";
        }
    }
}

