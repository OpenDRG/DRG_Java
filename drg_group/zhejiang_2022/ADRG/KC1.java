package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCK_DRG;

public class KC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"01.5902","07.1300","07.1400","07.1500","07.5301","07.6100x002","07.6100x003","07.6200x003","07.6200x007","07.6201","07.6202","07.6301","07.6400x001","07.6500","07.6501","07.6800","07.6900x001","07.7100","07.7200x002","07.7200x003","07.7201","07.7202","07.7203","07.7901","92.3102","92.3200x001","92.3201","92.3900"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合KC1入组条件，匹配规则：某一手术匹配");
                
            if (MDCK_DRG.KC11_group(record)){
                return "KC11";
            }
    
            if (MDCK_DRG.KC13_group(record)){
                return "KC13";
            }
    
            if (MDCK_DRG.KC15_group(record)){
                return "KC15";
            }

            return "KC1";
        }else{
            return "";
        }
    }
}

