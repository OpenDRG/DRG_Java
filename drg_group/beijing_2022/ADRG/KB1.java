package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCK_DRG;

public class KB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"07.0000","07.0100","07.0200","07.1200","07.1200x003","07.2100","07.2102","07.2200","07.2201","07.2900x001","07.2900x003","07.2901","07.2902","07.3x00","07.3x01","07.4101","07.4102","07.4103","07.4200","07.4300","07.4400","07.4501","07.4900","07.4900x001","07.4900x002"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合KB1入组条件，匹配规则：主手术匹配");
                
            if (MDCK_DRG.KB19_group(record)){
                return "KB19";
            }

            return "KB1";
        }else{
            return "";
        }
    }
}

