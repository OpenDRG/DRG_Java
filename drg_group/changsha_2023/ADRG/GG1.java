package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCG_DRG;


public class GG1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"54.5100","54.5100x005","54.5100x009","54.5101","54.5102","54.5103","54.5900x007","54.5901","54.5902","54.5903","54.5904","54.5905","54.5906"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GG1入组条件，匹配规则：主手术匹配");
            
                
            if (MDCG_DRG.GG11_group(record)){
                return "GG11";
            }
    
            if (MDCG_DRG.GG13_group(record)){
                return "GG13";
            }
    
            if (MDCG_DRG.GG15_group(record)){
                return "GG15";
            }

            return "";
        }else{
            return "";
        }
    }
}

