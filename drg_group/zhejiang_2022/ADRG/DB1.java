package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCD_DRG;

public class DB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"01.2502","01.5931","04.0401","06.6x00","18.3100","20.4200x002","25.4x00x001","29.3900x019","30.1x00","30.2900x001","30.2900x002","30.2900x003","30.2900x009","30.2900x011","30.2900x012","30.2904","30.3x00","30.3x02","38.0200x002","38.0201","38.3202","38.6200x002","38.6200x003","38.6200x005","38.6200x006","38.6200x007","38.6201","38.8200x003","38.8200x008","39.2200x019","39.5900x028","39.5900x029","39.8900x001","39.8901","42.3201"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合DB1入组条件，匹配规则：某一手术匹配");
                
            if (MDCD_DRG.DB11_group(record)){
                return "DB11";
            }
    
            if (MDCD_DRG.DB13_group(record)){
                return "DB13";
            }
    
            if (MDCD_DRG.DB15_group(record)){
                return "DB15";
            }

            return "DB1";
        }else{
            return "";
        }
    }
}

