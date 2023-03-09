package drg_group.fuzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.fuzhou_2022.Base;
import drg_group.fuzhou_2022.MedicalRecord;
import drg_group.fuzhou_2022.DRG.MDCE_DRG;

public class ES2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"B06.800","B37.100","B37.101+J17.2*","B37.800x083","B37.803","B38.000","B38.000x001+J17.2*","B38.100","B38.100x001+J17.2*","B38.200","B38.200x001+J17.2*","B39.000","B39.000x001+J17.2*","B39.100","B39.100x001+J17.2*","B39.200","B39.200x001+J17.2*","B40.000","B40.100","B40.200","B41.000","B42.000+J99.8*","B44.000x001+J99.8*","B44.101+J99.8*","B44.102+J17.2*","B45.000","B45.000x002+J99.8*","B46.000x001+J99.8*","B48.500+J17.2*","B48.501+J17.2*","B48.502+J17.2*","B49.x00x011","B49.x13","B49.x14+J99.8*"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合ES2入组条件，匹配规则：主诊断匹配");
                
            if (MDCE_DRG.ES21_group(record)){
                return "ES21";
            }
    
            if (MDCE_DRG.ES23_group(record)){
                return "ES23";
            }
    
            if (MDCE_DRG.ES25_group(record)){
                return "ES25";
            }

            return "ES2";
        }else{
            return "";
        }
    }
}

