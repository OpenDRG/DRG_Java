package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCR_DRG;

public class RU1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"Z51.101","Z51.102","Z51.103","Z51.104","Z51.200x008","Z51.800x094","Z51.800x096","Z51.800x922","Z51.800x924","Z51.800x925","Z51.800x927","Z51.800x981","Z51.801","Z51.804","Z51.806","Z51.807","Z51.809","Z51.811"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RU1入组条件，匹配规则：主诊断匹配");
                
            if (MDCR_DRG.RU19_group(record)){
                return "RU19";
            }

            return "RU1";
        }else{
            return "";
        }
    }
}

