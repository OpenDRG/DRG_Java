package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCD_DRG;

public class DC2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"18.0100x002","18.0101","18.0200x003","18.0201","18.0202","18.0900x002","18.0901","18.0902","18.2100x006","18.2101","18.2900x003","18.2900x009","18.2900x013","18.2900x016","18.2900x017","18.2900x018","18.2901","18.2902","18.2903","18.2904","18.2905","18.2906","18.2907","18.3900x003","18.3900x004","18.3901","18.4x00","18.5x00x001","18.6x00x001","18.6x01","18.6x02","18.7100x001","18.7100x002","18.7100x009","18.7100x010","18.7101","18.7102","18.7103","18.7104","18.7105","18.7200","18.7900x002","18.7900x008","18.7900x009","18.7901","18.7902","18.7903","18.7904","18.7905","18.7906","18.9x00x002","18.9x00x004","18.9x00x005","18.9x00x007","18.9x01","18.9x02","18.9x03","20.0100x003","20.0900x008","20.0901","20.1x01","20.5100x002"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合DC2入组条件，匹配规则：某一手术匹配");
                
            if (MDCD_DRG.DC21_group(record)){
                return "DC21";
            }
    
            if (MDCD_DRG.DC23_group(record)){
                return "DC23";
            }
    
            if (MDCD_DRG.DC25_group(record)){
                return "DC25";
            }

            return "DC2";
        }else{
            return "";
        }
    }
}

