package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCB_DRG;

public class BC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.3000x001","38.3100x001","38.6100x002","38.6101","38.8000","38.8101","39.2801","39.2802","39.5100x004","39.5100x007","39.5102","39.5103","39.5104","39.5105","39.5106","39.5107","39.5108","39.5200x002","39.5200x003","39.5202","39.5203","39.7203","39.9800x003"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合BC1入组条件，匹配规则：某一手术匹配");
                
            if (MDCB_DRG.BC11_group(record)){
                return "BC11";
            }
    
            if (MDCB_DRG.BC13_group(record)){
                return "BC13";
            }
    
            if (MDCB_DRG.BC15_group(record)){
                return "BC15";
            }

            return "BC1";
        }else{
            return "";
        }
    }
}

