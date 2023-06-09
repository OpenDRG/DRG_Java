package drg_group.guangxi_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.guangxi_2022.Base;
import drg_group.guangxi_2022.MedicalRecord;
import drg_group.guangxi_2022.DRG.MDCR_DRG;

public class RU1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"Z51.101","Z51.102","Z51.103","Z51.104","Z51.200x008","Z51.500x001","Z51.500x002","Z51.800x094","Z51.800x095","Z51.800x096","Z51.800x922","Z51.800x924","Z51.800x925","Z51.800x927","Z51.800x951","Z51.800x952","Z51.800x981","Z51.801","Z51.802","Z51.804","Z51.805","Z51.807","Z51.808","Z51.809","Z51.810"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RU1入组条件，匹配规则：主诊断匹配");
                
            if (MDCR_DRG.RU11_group(record)){
                return "RU11";
            }
    
            if (MDCR_DRG.RU13_group(record)){
                return "RU13";
            }
    
            if (MDCR_DRG.RU15_group(record)){
                return "RU15";
            }

            return "";
        }else{
            return "";
        }
    }
}

