package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCP_DRG;

public class PT1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"P05.001","P05.100","P05.102","P07.100","P07.101","P07.300","P07.300x001","P07.300x011"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.intersect(record.zdList,adrg_zd) && record.weight>0 && record.weight>=1500 && record.weight<2500 && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PT1入组条件，匹配规则：某一诊断匹配、体重1500至2500克、新生儿");
                
            if (MDCP_DRG.PT11_group(record)){
                return "PT11";
            }
    
            if (MDCP_DRG.PT13_group(record)){
                return "PT13";
            }
    
            if (MDCP_DRG.PT15_group(record)){
                return "PT15";
            }

            return "";
        }else{
            return "";
        }
    }
}

