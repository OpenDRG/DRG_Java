package drg_group.handan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;
import drg_group.handan_2022.DRG.MDCB_DRG;

public class BL1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"99.1005","99.1006","99.1008","99.1009"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BL1入组条件，匹配规则：主手术匹配");
                
            if (MDCB_DRG.BL19_group(record)){
                return "BL19";
            }

            return "";
        }else{
            return "";
        }
    }
}

