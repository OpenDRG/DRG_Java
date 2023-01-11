package drg_group.chs_drg_11.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCT_DRG;

public class TR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"F20.000","F20.100","F20.200","F20.200x002","F20.201","F20.300","F20.301","F20.400","F20.500","F20.501","F20.600","F20.800x001","F20.800x002","F20.800x003","F20.801","F20.802","F20.803","F20.900","F21.x00","F23.100","F23.200","R44.000","R44.300"};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合TR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCT_DRG.TR19_group(record)){
                return "TR19";
            }

            return "TR1";
        }else{
            return "";
        }
    }
}

