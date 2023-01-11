package drg_group.chs_drg_11.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCR_DRG;

public class RG1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"Z51.800x095","Z51.800x951","Z51.800x952","Z51.800x981","Z51.801","Z51.805","Z51.807","Z51.810"};
        String[] adrg_ss={"99.2800x004","99.2800x005","99.2800x006","99.2801"};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null &&record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RG1入组条件，匹配规则：主诊断匹配、主手术匹配");
                
            if (MDCR_DRG.RG11_group(record)){
                return "RG11";
            }
    
            if (MDCR_DRG.RG15_group(record)){
                return "RG15";
            }

            return "RG1";
        }else{
            return "";
        }
    }
}

