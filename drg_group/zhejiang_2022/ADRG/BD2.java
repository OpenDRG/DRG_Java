package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCB_DRG;

public class BD2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"01.1000x001","01.2001","01.2002","01.2200","02.9302","02.9404","04.9201","04.9202","04.9203","04.9300x001","86.0900x009","86.9401","86.9402","86.9500x001","86.9500x002","86.9501","86.9502","86.9600x001","86.9600x002","86.9601","86.9602","86.9701","86.9702","86.9800x001","86.9800x002","86.9801","86.9802"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合BD2入组条件，匹配规则：某一手术匹配");
                
            if (MDCB_DRG.BD29_group(record)){
                return "BD29";
            }

            return "BD2";
        }else{
            return "";
        }
    }
}

