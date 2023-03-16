package drg_group.yancheng_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yancheng_2022.Base;
import drg_group.yancheng_2022.MedicalRecord;
import drg_group.yancheng_2022.DRG.MDCE_DRG;

public class EB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"32.2000x002","32.2000x003","32.2001","32.2002","32.2003","32.2004","32.2200x004","32.2201","32.2500x001","32.2903","32.2905","32.3001","32.3900x003","32.3901","32.3902","32.4100","32.4100x002","32.4101","32.4900x002","32.4900x003","32.4901","32.4902","32.4903","32.5000x001","32.5001","32.5900x001","32.5901","32.6x00x002","32.6x00x004","32.9x00","33.0x00x004","33.3901","33.3902","33.3903","33.4300x002","33.4801","33.4802","33.4803","33.4804","33.4901","33.4902","34.0200x003","34.0300x001","34.0301","34.0900x011","34.0901","34.0902","34.0904","34.0905","34.0906","34.5100x004","34.5100x005","34.5101","34.5200","34.5903","34.7301","34.7303","34.7900x002","34.9901","34.9901","34.9902","34.9904","34.9905","38.0500x002","38.1500x001","38.1501","38.3500x002","38.3501","40.5900x012"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合EB1入组条件，匹配规则：主手术匹配");
                
            if (MDCE_DRG.EB19_group(record)){
                return "EB19";
            }

            return "EB1";
        }else{
            return "";
        }
    }
}

