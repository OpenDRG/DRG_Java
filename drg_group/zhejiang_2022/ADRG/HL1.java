package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCH_DRG;

public class HL1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"50.1101","50.2303","51.0102","51.1000","51.1100","51.1101","51.1102","51.1103","51.1105","51.1201","51.1202","51.1301","51.1302","51.1402","51.1403","51.1404","51.1500","51.9802","51.9809","52.1101","52.1301","52.1303","52.1400","52.1900x001"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合HL1入组条件，匹配规则：某一手术匹配");
                
            if (MDCH_DRG.HL11_group(record)){
                return "HL11";
            }
    
            if (MDCH_DRG.HL13_group(record)){
                return "HL13";
            }
    
            if (MDCH_DRG.HL15_group(record)){
                return "HL15";
            }

            return "HL1";
        }else{
            return "";
        }
    }
}

