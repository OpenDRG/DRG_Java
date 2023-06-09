package drg_group.handan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;
import drg_group.handan_2022.DRG.MDCB_DRG;

public class BM1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"88.4100x001","88.4101","88.4102","88.4103","88.4104","88.4401","88.6101","88.6102","88.6103"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BM1入组条件，匹配规则：主手术匹配");
                
            if (MDCB_DRG.BM11_group(record)){
                return "BM11";
            }
    
            if (MDCB_DRG.BM15_group(record)){
                return "BM15";
            }

            return "";
        }else{
            return "";
        }
    }
}

