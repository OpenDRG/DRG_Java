package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCC_DRG;

public class CD1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"01.2505","16.0101","16.0200","16.0900x004","16.0900x005","16.0900x006","16.0901","16.0902","16.0903","16.0904","16.1x01","16.1x02","16.3100x001","16.3900x001","16.4100x002","16.4200x001","16.4200x002","16.4900x001","16.4901","16.5200","16.5900x001","16.5901","16.5902","16.6100x001","16.6101","16.6200x001","16.6300x002","16.6300x003","16.6300x004","16.6400","16.6500","16.6600","16.6900","16.7101","16.7200","16.8100x002","16.8200","16.8900x001","16.8900x002","16.8901","16.8902","16.8903","16.8904","16.9100x003","16.9200","16.9201","16.9300x001","16.9300x003","16.9800x001","16.9800x002","16.9801","16.9900","76.4501","76.4600x003","76.4600x004","76.7801","76.7802","76.7900x001","76.7902","76.7903","76.9100x008","76.9100x009","76.9200x006","98.2101"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合CD1入组条件，匹配规则：主手术匹配");
                
            if (MDCC_DRG.CD19_group(record)){
                return "CD19";
            }

            return "";
        }else{
            return "";
        }
    }
}

