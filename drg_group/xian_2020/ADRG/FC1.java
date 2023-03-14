package drg_group.xian_2020.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;
import drg_group.xian_2020.DRG.MDCF_DRG;

public class FC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"36.1000x001","36.1000x002","36.1100","36.1200","36.1300","36.1400","36.1500","36.1600","36.1700x001","36.1900x001","36.2x00"};
        String[] adrg_ss1={"00.6600x004","00.6601","17.5500x002","17.5500x003","17.5501","36.0400"};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss) && Base.intersect(record.ssList,adrg_ss1)){
            Base.groupMessages.putMessage(record.Index,"符合FC1入组条件，匹配规则：双手术匹配");
                
            if (MDCF_DRG.FC19_group(record)){
                return "FC19";
            }

            return "FC1";
        }else{
            return "";
        }
    }
}

