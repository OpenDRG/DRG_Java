package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCG_DRG;

public class GF1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"49.0100x004","49.0101","49.0200x001","49.0201","49.0300","49.0400x008","49.0400x009","49.0401","49.0402","49.1100","49.1200","49.3900x015","49.3900x016","49.3900x017","49.3901","49.3902","49.3903","49.3904","49.3905","49.3906","49.3907","49.4100","49.4200","49.4300","49.4301","49.4400","49.4500","49.4500x004","49.4501","49.4600","49.4601","49.4701","49.4900x002","49.4900x003","49.4901","49.4902","49.4903","49.5200x002","49.5900x001","49.5901","49.5902","49.5903","49.6x00","49.6x01","49.7100","49.7200","49.7301","49.7302","49.7400x001","49.7501","49.7502","49.7600","49.7900x005","49.7901","49.7902","49.7903","49.7904","49.7905","49.7906","49.9100","49.9200","49.9300x001","49.9300x002","49.9300x003","49.9300x004","49.9300x005","49.9301","49.9302","49.9400","49.9500x002","49.9900x007","49.9901","98.0501"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GF1入组条件，匹配规则：主手术匹配");
                
            if (MDCG_DRG.GF11_group(record)){
                return "GF11";
            }
    
            if (MDCG_DRG.GF13_group(record)){
                return "GF13";
            }
    
            if (MDCG_DRG.GF15_group(record)){
                return "GF15";
            }

            return "GF1";
        }else{
            return "";
        }
    }
}

