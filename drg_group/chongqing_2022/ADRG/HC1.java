package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCH_DRG;

public class HC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"51.2100","51.2200","51.2200x004","51.2201","51.2300","51.2301","51.2400"};
        String[] adrg_ss1={"51.1104","51.3900x005","51.3901","51.3902","51.3903","51.3904","51.3905","51.3906","51.4100x001","51.4201","51.4202","51.4302","51.4304","51.4900x002","51.4901","51.4902","51.5100","51.5101","51.5102","51.5900x005","51.5900x008","51.5901","51.5903","51.6100x001","51.6301","51.6303","51.6900x007","51.6900x008","51.6900x012","51.6901","51.6903","51.6904","51.7200x001","51.7201","51.7202","51.7203","51.7900x002","51.7900x005","51.7900x006","51.7902","51.7903","51.7904","51.8100","51.8803","51.9300x001","51.9301","51.9305"};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss) && Base.intersect(record.ssList,adrg_ss1)){
            Base.groupMessages.putMessage(record.Index,"符合HC1入组条件，匹配规则：双手术匹配");
                
            if (MDCH_DRG.HC11_group(record)){
                return "HC11";
            }
    
            if (MDCH_DRG.HC13_group(record)){
                return "HC13";
            }
    
            if (MDCH_DRG.HC15_group(record)){
                return "HC15";
            }

            return "";
        }else{
            return "";
        }
    }
}

