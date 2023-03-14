package drg_group.xian_2020.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;
import drg_group.xian_2020.DRG.MDCF_DRG;

public class FV3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"I95.100","I95.101","R55.x00x001","R55.x00x002","R55.x00x003","R55.x00x004","R55.x00x005","R55.x00x006","R55.x00x007","R55.x00x008","R55.x00x009","R55.x00x010","R55.x00x011","R55.x00x012","R55.x00x013","R55.x00x014","R55.x02"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FV3入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FV39_group(record)){
                return "FV39";
            }

            return "FV3";
        }else{
            return "";
        }
    }
}

