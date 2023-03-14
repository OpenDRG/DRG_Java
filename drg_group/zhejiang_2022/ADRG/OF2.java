package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCO_DRG;

public class OF2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"69.0100x002","69.0101","69.0200x003","69.0201","69.0902","69.5101","69.5102","69.5103","69.5202","69.5901","73.4x00x004","73.8x00x003","96.4902"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合OF2入组条件，匹配规则：某一手术匹配");
                
            if (MDCO_DRG.OF21_group(record)){
                return "OF21";
            }
    
            if (MDCO_DRG.OF23_group(record)){
                return "OF23";
            }
    
            if (MDCO_DRG.OF25_group(record)){
                return "OF25";
            }

            return "OF2";
        }else{
            return "";
        }
    }
}

