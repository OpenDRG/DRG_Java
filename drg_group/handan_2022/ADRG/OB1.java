package drg_group.handan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;
import drg_group.handan_2022.DRG.MDCO_DRG;

public class OB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"74.0x00","74.0x00x001","74.0x00x002","74.1x01","74.1x02","74.2x00","74.4x01","74.9900"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合OB1入组条件，匹配规则：主手术匹配");
                
            if (MDCO_DRG.OB19_group(record)){
                return "OB19";
            }

            return "";
        }else{
            return "";
        }
    }
}

