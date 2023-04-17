package drg_group.yantai_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yantai_2023.Base;
import drg_group.yantai_2023.MedicalRecord;
import drg_group.yantai_2023.DRG.MDCQ_DRG;

public class QB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.6601","39.1x07","41.2x01","41.2x02","41.2x03","41.2x04","41.4100","41.4200x002","41.4200x003","41.4300","41.4301","41.5x00","41.5x01","41.9300","41.9301","41.9400","41.9500x001","41.9501","41.9502","41.9503","41.9504","41.9901"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合QB1入组条件，匹配规则：主手术匹配");
                
            if (MDCQ_DRG.QB13_group(record)){
                return "QB13";
            }
    
            if (MDCQ_DRG.QB15_group(record)){
                return "QB15";
            }

            return "QB1";
        }else{
            return "";
        }
    }
}

