package drg_group.qingdao_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.DRG.MDCD_DRG;

public class DC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"19.0x00x002","19.0x00x003","19.0x01","19.0x02","19.0x03","19.1100","19.1900x002","19.1900x003","19.1900x004","19.1900x005","19.1900x006","19.1900x007","19.1900x008","19.1901","19.2100","19.2900x001","19.2901","19.2902","19.3x00x001","19.3x00x002","19.3x00x003","19.3x01","19.3x02","19.3x03","19.3x04","19.4x00x002","19.4x00x003","19.4x00x004","19.4x00x005","19.4x01","19.5200","19.5300","19.5400","19.5500","19.6x00x001","19.9x00x006","19.9x00x007","19.9x00x008","19.9x01","19.9x02","19.9x03","19.9x04","19.9x05","20.0100x005","20.0100x006","20.0100x007","20.2100x004","20.2101","20.2201","20.2300x001","20.2300x002","20.2300x007","20.2300x009","20.2301","20.2302","20.2303","20.4100","20.4200x002","20.4900x004","20.4900x007","20.4900x008","20.4900x009","20.4901","20.4902","20.5100","20.5100x002","20.5100x003","20.5101","20.5102","20.5900x003","20.5901","20.5902","20.5903","20.6100x004","20.6101","20.6102","20.6103","20.6200x002","20.7100","20.7900x001","20.7900x005","20.7900x006","20.7901","20.7902","20.7903","20.7904","20.7905","20.7906","20.8x00x004","20.8x00x005","20.8x00x006","20.8x01","20.8x02","20.8x03","20.8x04","20.8x05","20.9100","20.9201","20.9301","20.9302","20.9303","38.8200x011"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DC1入组条件，匹配规则：主手术匹配");
                
            if (MDCD_DRG.DC19_group(record)){
                return "DC19";
            }

            return "DC1";
        }else{
            return "";
        }
    }
}

