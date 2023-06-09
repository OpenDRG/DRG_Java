package drg_group.guangxi_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.guangxi_2022.Base;
import drg_group.guangxi_2022.MedicalRecord;
import drg_group.guangxi_2022.DRG.MDCF_DRG;

public class FL1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"I48.000","I48.100","I48.100x002","I48.100x003","I48.200","I48.300","I48.301","I48.400","I48.401","I48.900x003","I48.900x004","I48.900x015"};
        String[] adrg_zd1={};
        String[] adrg_ss={"37.3402","37.3403","37.3404","37.3405","37.3406"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0]) && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合FL1入组条件，匹配规则：主诊断匹配、主手术匹配、某一手术匹配");
                
            if (MDCF_DRG.FL11_group(record)){
                return "FL11";
            }
    
            if (MDCF_DRG.FL13_group(record)){
                return "FL13";
            }
    
            if (MDCF_DRG.FL15_group(record)){
                return "FL15";
            }

            return "";
        }else{
            return "";
        }
    }
}

