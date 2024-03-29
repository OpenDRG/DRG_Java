package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCF_DRG;

public class FK1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.5000x001","00.5001","00.5002","00.5301","17.5100","17.5200","37.8000x001","37.8001","37.8101","37.8201","37.8300x002","37.8301"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合FK1入组条件，匹配规则：某一手术匹配");
                
            if (MDCF_DRG.FK11_group(record)){
                return "FK11";
            }
    
            if (MDCF_DRG.FK13_group(record)){
                return "FK13";
            }
    
            if (MDCF_DRG.FK15_group(record)){
                return "FK15";
            }

            return "FK1";
        }else{
            return "";
        }
    }
}

