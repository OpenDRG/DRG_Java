package drg_group.chs_drg_10.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;
import drg_group.chs_drg_10.DRG.MDCR_DRG;

public class RV1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"Z51.000x003","Z51.000x008","Z51.000x012","Z51.001","Z51.002","Z51.003"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RV1入组条件，匹配规则：主诊断匹配");
                
            if (MDCR_DRG.RV19_group(record)){
                return "RV19";
            }

            return "RV1";
        }else{
            return "";
        }
    }
}

