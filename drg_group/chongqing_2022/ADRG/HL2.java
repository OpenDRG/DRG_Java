package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCH_DRG;

public class HL2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"45.3001","50.2302","50.2400x003","50.2910","50.9101","50.9102","50.9103","50.9200x001","50.9201","50.9300","50.9400x005","50.9401","50.9402","51.0103","51.5900x001","51.5900x009","51.6400x002","51.6400x003","51.8400x001","51.8401","51.8402","51.8403","51.8404","51.8501","51.8502","51.8503","51.8600x002","51.8700x001","51.8700x004","51.8700x005","51.8701","51.8702","51.8800x009","51.8801","51.8802","51.8804","51.8806","51.9500","51.9501","51.9600x001","51.9601","51.9800x001","51.9800x005","51.9800x008","51.9800x009","51.9800x010","51.9800x012","51.9800x013","51.9800x015","51.9800x016","51.9801","51.9803","51.9804","51.9805","51.9806","51.9807","51.9808","52.2200x001","52.4x00x007","52.4x00x008","52.4x00x009","52.4x00x010","52.4x00x011","52.4x00x012","52.9200x001","52.9201","52.9300","52.9300x002","52.9301","52.9400","52.9400x002","52.9700","52.9800x001","97.0502","97.5501","97.5506","97.5601","98.5201","98.5202","98.5900x003"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HL2入组条件，匹配规则：主手术匹配");
                
            if (MDCH_DRG.HL29_group(record)){
                return "HL29";
            }

            return "";
        }else{
            return "";
        }
    }
}

