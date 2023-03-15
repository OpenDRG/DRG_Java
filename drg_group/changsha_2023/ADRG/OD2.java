package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCO_DRG;

public class OD2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"67.0x00","67.0x00x002","67.0x01","67.3100","67.3200","67.3200x009","67.3200x012","67.3201","67.3202","67.3203","67.3300","67.3301","67.3302","67.3901","67.3902","67.3903","67.3904","67.3905","67.5900x001","67.5900x002","67.5900x003","67.5901","70.1300","70.1400x002","70.1400x007","70.1400x011","70.1400x012","70.1401","70.1402","70.1403","70.1404","70.1405","70.1406","70.1407","70.1408","71.2200x001","71.2200x002","71.2400x001","71.2400x003","71.2900x002","71.3x00x001","71.3x00x007","71.3x00x011","71.3x00x013","71.3x00x021","71.3x00x022","71.3x00x024","71.3x01","71.3x04","75.8x00x002","75.9900x006","96.1800x001"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合OD2入组条件，匹配规则：主手术匹配");
                
            if (MDCO_DRG.OD29_group(record)){
                return "OD29";
            }

            return "OD2";
        }else{
            return "";
        }
    }
}

