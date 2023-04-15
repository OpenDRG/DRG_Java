package drg_group.yancheng_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yancheng_2023.Base;
import drg_group.yancheng_2023.MedicalRecord;
import drg_group.yancheng_2023.DRG.MDCR_DRG;

public class RE1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"Z51.101","Z51.102","Z51.103","Z51.104"};
        String[] adrg_zd1={};
        String[] adrg_ss={"03.8x01","54.9701","54.9702","54.9703","99.2500x036","99.2500x037","99.2500x038","99.2500x039","99.2502","99.2503","99.2504","99.2505","99.2506","99.2800x006","99.2801"};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RE1入组条件，匹配规则：主诊断匹配、主手术匹配");
                
            if (MDCR_DRG.RE11_group(record)){
                return "RE11";
            }
    
            if (MDCR_DRG.RE13_group(record)){
                return "RE13";
            }
    
            if (MDCR_DRG.RE15_group(record)){
                return "RE15";
            }

            return "RE1";
        }else{
            return "";
        }
    }
}

