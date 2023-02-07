package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCS_DRG;

public class ST1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"R50.800x002","R50.801","R50.802","R50.803","R50.900","R50.900x002","R50.901"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合ST1入组条件，匹配规则：主诊断匹配");
                
            if (MDCS_DRG.ST1A_group(record)){
                return "ST1A";
            }
    
            if (MDCS_DRG.ST15_group(record)){
                return "ST15";
            }

            return "ST1";
        }else{
            return "";
        }
    }
}

