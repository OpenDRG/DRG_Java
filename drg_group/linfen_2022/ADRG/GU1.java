package drg_group.linfen_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;
import drg_group.linfen_2022.DRG.MDCG_DRG;

public class GU1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"K25.100x001","K25.200x001","K25.500x001","K25.501","K25.600","K26.100","K26.200x001","K26.200x002","K26.500x001","K26.501","K26.600","K27.100x001","K27.200","K27.500","K27.500x001","K27.500x002","K27.500x005","K27.501","K27.502","K27.503","K27.600","K27.600x001","K28.100","K28.200","K28.500","K28.500x001","K28.600","K28.600x001","K28.900x002","K63.103","K63.104","K63.105"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GU1入组条件，匹配规则：主诊断匹配");
                
            if (MDCG_DRG.GU13_group(record)){
                return "GU13";
            }
    
            if (MDCG_DRG.GU15_group(record)){
                return "GU15";
            }

            return "GU1";
        }else{
            return "";
        }
    }
}

