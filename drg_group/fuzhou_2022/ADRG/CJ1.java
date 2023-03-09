package drg_group.fuzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.fuzhou_2022.Base;
import drg_group.fuzhou_2022.MedicalRecord;
import drg_group.fuzhou_2022.DRG.MDCC_DRG;

public class CJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"08.5200","08.8600","09.4300x001","09.4900x004","09.4900x005","09.8100","09.8100x004","09.8101","09.8300x001","09.9900x003","09.9900x004","10.1x00x003","10.9100","10.9900x004","11.3100x001","11.3200","11.9900x003","11.9900x004","11.9900x005","12.0100","12.0200x002","12.0200x004","12.8300x002","15.7x00","16.0200","16.1x00x001","16.7200x002","16.9100","16.9100x001","16.9100x002"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合CJ1入组条件，匹配规则：主手术匹配");
                
            if (MDCC_DRG.CJ19_group(record)){
                return "CJ19";
            }

            return "CJ1";
        }else{
            return "";
        }
    }
}

