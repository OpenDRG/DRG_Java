package drg_group.xian_2020.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;
import drg_group.xian_2020.DRG.MDCK_DRG;

public class KR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C73.x00","C73.x00x003","C74.000","C74.100","C74.900","C75.000","C75.100","C75.200","C75.300","C75.900","C79.700","C79.800x839","C79.805","C79.825","D09.300","D09.301","D09.302","D09.303","D09.304"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合KR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCK_DRG.KR19_group(record)){
                return "KR19";
            }

            return "KR1";
        }else{
            return "";
        }
    }
}

