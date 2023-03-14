package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCL_DRG;

public class LF1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.0300x003","38.4301","38.4302","38.4303","38.9501","38.9502","39.2700x001","39.2700x002","39.2700x003","39.2700x004","39.2900x001","39.4200x001","39.4200x002","39.4200x003","39.4200x004","39.4300x001","39.4301","39.5000x032","39.5300x005","39.5300x013","39.5300x014","39.5300x017","39.9300","54.9800x009","54.9800x010","54.9800x011","54.9800x012","54.9800x013","54.9800x014","54.9800x015","54.9800x016","54.9801","97.8600x007","97.8600x008","97.8600x009","97.8601","97.8900x004","97.8900x005"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合LF1入组条件，匹配规则：某一手术匹配");
                
            if (MDCL_DRG.LF11_group(record)){
                return "LF11";
            }
    
            if (MDCL_DRG.LF13_group(record)){
                return "LF13";
            }
    
            if (MDCL_DRG.LF15_group(record)){
                return "LF15";
            }

            return "LF1";
        }else{
            return "";
        }
    }
}

