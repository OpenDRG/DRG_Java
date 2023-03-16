package drg_group.chs_drg_11.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCE_DRG;

public class EC2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"04.0300x012","04.2x10","07.8100x009","07.9100","07.9200x001","07.9300","07.9400","07.9500","07.9800","07.9901","31.2100x001","31.7100x001","31.7302","31.7900x006","31.7904","31.9901","31.9904","31.9905","32.0900x005","33.7800x001","33.7900x004","34.0100x003","34.0400x001","34.1x01","34.1x02","34.1x05","34.2200","34.2502","34.2600","34.3x01","34.3x03","34.5200x001","34.5900x001","34.6x02","34.7100","34.7101","34.7200","34.7300x002","34.7302","34.8100x001","34.8100x002","34.8200","34.8200x002","34.8500","34.8900x002","34.9100x001","34.9203","34.9903","37.1200x005","37.1200x008","37.1201","37.1203","37.1204","37.2400","37.9100","38.8500x016","40.1100x004","40.6100","40.6200","40.6300","40.6300x003","40.6900x003","40.6901","40.6902","53.8100x001","53.8101","53.8102","53.8103","53.8200","53.8300x001","53.8301","53.8400"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合EC2入组条件，匹配规则：主手术匹配");
                
            if (MDCE_DRG.EC29_group(record)){
                return "EC29";
            }

            return "EC2";
        }else{
            return "";
        }
    }
}

