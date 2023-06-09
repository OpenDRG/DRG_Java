package drg_group.guangxi_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.guangxi_2022.Base;
import drg_group.guangxi_2022.MedicalRecord;
import drg_group.guangxi_2022.DRG.MDCA_DRG;

public class AH1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"37.5200x001","39.6500","96.7201"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0]) && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合AH1入组条件，匹配规则：主手术匹配、某一手术匹配");
                
            if (MDCA_DRG.AH11_group(record)){
                return "AH11";
            }
    
            if (MDCA_DRG.AH15_group(record)){
                return "AH15";
            }

            return "";
        }else{
            return "";
        }
    }
}

