package drg_group.changchun_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;
import drg_group.changchun_2022.DRG.MDCK_DRG;


public class KC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"07.1300","07.1400","07.1500","07.5100x001","07.5200x001","07.5300","07.5301","07.5400x001","07.6100x002","07.6100x003","07.6100x004","07.6200x003","07.6200x007","07.6201","07.6202","07.6301","07.6400x001","07.6500","07.6501","07.6800","07.6900x001","07.7100","07.7200x002","07.7200x003","07.7201","07.7202","07.7203","07.7901"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合KC1入组条件，匹配规则：主手术匹配");
            
                
            if (MDCK_DRG.KC19_group(record)){
                return "KC19";
            }

            return "";
        }else{
            return "";
        }
    }
}

