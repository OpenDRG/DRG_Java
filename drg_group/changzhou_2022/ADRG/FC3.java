package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCF_DRG;


public class FC3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"36.1000x001","36.1000x002","36.1100","36.1200","36.1300","36.1400","36.1500","36.1600","36.1700x001","36.1900x001","36.1900x002","36.2x00"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FC3入组条件，匹配规则：主手术匹配");
            
                
            if (MDCF_DRG.FC39_group(record)){
                return "FC39";
            }

            return "";
        }else{
            return "";
        }
    }
}

