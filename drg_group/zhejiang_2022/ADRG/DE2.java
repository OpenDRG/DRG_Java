package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCD_DRG;

public class DE2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"28.2x00x002","28.2x00x003","28.2x01","28.2x02","28.2x03","28.2x04","28.3x01","28.3x02","28.3x03","28.4x00","28.5x01","28.5x02","28.5x03","28.6x00x001","28.6x00x002","28.6x00x004","28.6x00x005","28.6x01","28.6x02","28.6x03","28.7x02","28.9200x002","28.9201","28.9202","28.9900"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合DE2入组条件，匹配规则：某一手术匹配");
                
            if (MDCD_DRG.DE21_group(record)){
                return "DE21";
            }
    
            if (MDCD_DRG.DE23_group(record)){
                return "DE23";
            }
    
            if (MDCD_DRG.DE25_group(record)){
                return "DE25";
            }

            return "DE2";
        }else{
            return "";
        }
    }
}

