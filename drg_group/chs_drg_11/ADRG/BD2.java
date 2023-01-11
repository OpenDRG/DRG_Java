package drg_group.chs_drg_11.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCB_DRG;

public class BD2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_ss={"01.0900x007","01.2001","01.2002","01.2200","01.2900","02.9300x001","02.9301","02.9302","02.9303","02.9304","03.9300x003","03.9300x004","03.9302","03.9400x001","03.9400x002","04.9200x001","04.9200x002","04.9200x003","04.9202","04.9203","04.9300x001","04.9301","39.8101","39.8102","39.8201","39.8202","39.8301","39.8302","39.8400","39.8500","39.8600","39.8700","39.8800","86.0501","86.0900x009","86.9401","86.9402","86.9500x001","86.9500x002","86.9501","86.9502","86.9600x001","86.9600x002","86.9600x003","86.9600x006","86.9601","86.9602","86.9701","86.9702","86.9800x001","86.9800x002","86.9801","86.9802","92.3001","92.3002"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null &&record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BD2入组条件，匹配规则：主手术匹配");
                
            if (MDCB_DRG.BD29_group(record)){
                return "BD29";
            }

            return "BD2";
        }else{
            return "";
        }
    }
}

