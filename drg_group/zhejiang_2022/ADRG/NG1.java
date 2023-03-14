package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCN_DRG;

public class NG1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"65.9900x006","69.9200x004","69.9200x006","69.9200x007","69.9200x008","69.9202","75.9900x004"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合NG1入组条件，匹配规则：某一手术匹配");
                
            if (MDCN_DRG.NG19_group(record)){
                return "NG19";
            }

            return "NG1";
        }else{
            return "";
        }
    }
}

