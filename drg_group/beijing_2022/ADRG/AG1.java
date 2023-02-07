package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCA_DRG;

public class AG1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"41.0000","41.0200","41.0300","41.0500","41.0600","41.0800x001"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合AG1入组条件，匹配规则：主手术匹配");
                
            if (MDCA_DRG.AG11_group(record)){
                return "AG11";
            }
    
            if (MDCA_DRG.AG15_group(record)){
                return "AG15";
            }

            return "AG1";
        }else{
            return "";
        }
    }
}

