package drg_group.handan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;
import drg_group.handan_2022.DRG.MDCD_DRG;

public class DD1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"21.0902","21.3200x010","21.3200x011","21.3201","21.8100","21.8200x006","21.8201","21.8202","21.8203","21.8300x001","21.8301","21.8302","21.8400x002","21.8400x003","21.8400x006","21.8401","21.8402","21.8500x002","21.8500x004","21.8500x005","21.8500x007","21.8500x008","21.8500x010","21.8500x011","21.8501","21.8502","21.8503","21.8504","21.8505","21.8600x004","21.8601","21.8602","21.8603","21.8700x003","21.8700x004","21.8700x005","21.8700x008","21.8700x009","21.8701","21.8702","21.8801","21.8802","21.8900x002","21.8900x003","21.8900x004","21.8901"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DD1入组条件，匹配规则：主手术匹配");
                
            if (MDCD_DRG.DD19_group(record)){
                return "DD19";
            }

            return "";
        }else{
            return "";
        }
    }
}

