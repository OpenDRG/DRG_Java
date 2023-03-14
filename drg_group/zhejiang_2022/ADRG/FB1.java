package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCF_DRG;

public class FB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"37.5200x001","37.5300x001","37.5400","37.5500","37.6000","37.6101","37.6200x002","37.6201","37.6301","37.6400x001","37.6500x001","37.6600x001","37.6600x002","37.6700","37.6800x001","37.6800x002","37.6800x003","37.6800x004","37.6800x005","39.6500"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合FB1入组条件，匹配规则：某一手术匹配");
                
            if (MDCF_DRG.FB19_group(record)){
                return "FB19";
            }

            return "FB1";
        }else{
            return "";
        }
    }
}

