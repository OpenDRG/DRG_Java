package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCO_DRG;

public class OJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.7x01","38.7x02","38.7x03","38.7x04","54.1202","54.2100","54.2100x005","54.6101","54.7200x001","69.0101","69.0200x003","69.0201","69.5901","73.8x00x002","73.8x00x005","73.8x01","73.8x02","75.1x00","75.1x00x002","75.2x00x001","75.3100","75.3101","75.3200","75.3300x001","75.3301","75.3302","75.3600x002","75.3700","75.9900x002","75.9900x004","75.9900x005","97.7101","97.7102"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合OJ1入组条件，匹配规则：某一手术匹配");
                
            if (MDCO_DRG.OJ11_group(record)){
                return "OJ11";
            }
    
            if (MDCO_DRG.OJ13_group(record)){
                return "OJ13";
            }
    
            if (MDCO_DRG.OJ15_group(record)){
                return "OJ15";
            }

            return "OJ1";
        }else{
            return "";
        }
    }
}

