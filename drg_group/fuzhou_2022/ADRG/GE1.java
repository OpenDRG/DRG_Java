package drg_group.fuzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.fuzhou_2022.Base;
import drg_group.fuzhou_2022.MedicalRecord;
import drg_group.fuzhou_2022.DRG.MDCG_DRG;

public class GE1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"17.1100x001","17.1200x001","17.1300x001","17.1300x002","17.2100x001","17.2200x001","17.2300x001","17.2400x001","53.0001","53.0002","53.0100x001","53.0101","53.0102","53.0201","53.0202","53.0203","53.0204","53.0301","53.0302","53.0401","53.0501","53.1000","53.1101","53.1200x001","53.1201","53.1202","53.1203","53.1301","53.1401","53.1501","53.1601","53.1701","53.2100x001","53.2101","53.2900x001","53.2901","53.3100x001","53.3101","53.3901","53.4101","53.4201","53.4301","53.4901","53.4902","53.5100","53.5101","53.5900x001","53.5901","53.5902","53.6101","53.6200","53.6301","53.6302","53.6900x002","53.6901","53.9x00x015","53.9x00x018","53.9x00x019","53.9x00x023"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GE1入组条件，匹配规则：主手术匹配");
                
            if (MDCG_DRG.GE13_group(record)){
                return "GE13";
            }
    
            if (MDCG_DRG.GE15_group(record)){
                return "GE15";
            }

            return "GE1";
        }else{
            return "";
        }
    }
}

