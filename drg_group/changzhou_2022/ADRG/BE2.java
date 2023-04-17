package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCB_DRG;

public class BE2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.5501","00.6100x008","00.6100x012","00.6101","00.6102","00.6200x005","00.6200x006","00.6200x007","00.6200x008","00.6200x009","00.6201","00.6202","00.6300","00.6300x005","00.6300x006","00.6300x007","00.6301","00.6400x009","00.6400x012","00.6400x013","00.6400x014","00.6401","00.6500x008","00.6500x010","00.6500x011","00.6500x012","00.6500x013","00.6500x014","00.6501","17.5300","17.5301","17.5400","39.7200x001","39.7200x004","39.7200x005","39.7200x007","39.7200x008","39.7201","39.7202","39.7203","39.7203","39.7205","39.7206","39.7208","39.7209","39.7211","39.7213","39.7213","39.7215","39.7216","39.7400x001","39.7400x002","39.7400x002","39.7400x003","39.7400x004","39.7401","39.7501","39.7501","39.7502","39.7503","39.7503","39.7504","39.7504","39.7505","39.7505","39.7506","39.7601","39.7601","39.7603","39.7604","39.7605","39.7606","39.7908","39.9000x034","39.9008"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BE2入组条件，匹配规则：主手术匹配");
                
            if (MDCB_DRG.BE29_group(record)){
                return "BE29";
            }

            return "BE2";
        }else{
            return "";
        }
    }
}

