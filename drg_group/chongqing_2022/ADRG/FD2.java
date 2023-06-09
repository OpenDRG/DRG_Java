package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCF_DRG;

public class FD2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"35.3200x003","35.3201","35.3202","35.3400x003","35.3400x004","35.3901","35.4100x001","35.4100x002","35.4101","35.4200x002","35.4200x003","35.4200x005","35.4200x006","35.4200x007","35.4200x008","35.4201","35.5000","35.5100x001","35.5100x002","35.5100x003","35.5101","35.5300x001","35.5300x003","35.5301","35.5500x001","35.6000","35.6101","35.6102","35.6201","35.6300x002","35.7000","35.7100x002","35.7100x003","35.7100x004","35.7100x005","35.7100x007","35.7100x008","35.7100x009","35.7200x001","35.7200x002","35.7300x002","35.7300x003","35.8100x001","35.8100x005","35.8200x006","35.8201","35.8400x001","35.9101","35.9300x004","35.9301","36.9900x005","36.9901","36.9903","37.3300x006","37.3300x009","37.3300x020","37.3300x021","37.3300x027","37.3300x028","37.3600x006","38.3400x003","38.3500x002","38.4500x004","38.4500x015","38.8500x001","38.8500x012","38.8505","39.4900x010","39.5000x015","39.5200x005","39.5900x031"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FD2入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FD21_group(record)){
                return "FD21";
            }
    
            if (MDCF_DRG.FD23_group(record)){
                return "FD23";
            }
    
            if (MDCF_DRG.FD25_group(record)){
                return "FD25";
            }

            return "";
        }else{
            return "";
        }
    }
}

