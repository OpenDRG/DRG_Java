package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCH_DRG;


public class HL1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"50.1100x001","50.1100x005","50.1101","50.1900","50.2301","50.2303","50.2402","50.2403","51.0101","51.0102","51.1000","51.1100","51.1101","51.1102","51.1103","51.1105","51.1201","51.1202","51.1401","51.1402","51.1403","51.1404","51.1500","51.1900","51.9802","51.9809","52.1100x001","52.1101","52.1301","52.1303","52.1400","52.1900x001"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HL1入组条件，匹配规则：主手术匹配");
            
                
            if (MDCH_DRG.HL19_group(record)){
                return "HL19";
            }

            return "";
        }else{
            return "";
        }
    }
}

