package drg_group.changchun_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;
import drg_group.changchun_2022.DRG.MDCF_DRG;


public class FD3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"35.4200x003","35.4200x009","35.5200x001","35.5200x002","35.5200x002","35.5201","35.5500x001","35.5500x001","35.9800x001","35.9800x002","36.9900x005","36.9901","39.7800x008","39.7900x402"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FD3入组条件，匹配规则：主手术匹配");
            
                
            if (MDCF_DRG.FD39_group(record)){
                return "FD39";
            }

            return "";
        }else{
            return "";
        }
    }
}

