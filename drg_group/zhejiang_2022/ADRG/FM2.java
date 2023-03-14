package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCF_DRG;

public class FM2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.0200x001","00.6600x004","00.6601","17.5500x002","17.5500x003","17.5501","35.5200x001","35.5200x002","35.5500x001","35.5502","36.0400","36.3400","36.9900x011","36.9900x012","36.9901","37.2800","37.3500x004","37.9000x001","37.9300x001","37.9900x003","39.4901","39.4902","39.5000x011","39.5000x021","39.5006","39.7100x004","39.7101","39.7102","39.7103","39.7300x003","39.7300x004","39.7302","39.7800x001","39.7800x002","39.7900x003","39.7900x035","39.9000x022","39.9000x026","39.9000x027","39.9000x037","39.9005","39.9010"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合FM2入组条件，匹配规则：某一手术匹配");
                
            if (MDCF_DRG.FM21_group(record)){
                return "FM21";
            }
    
            if (MDCF_DRG.FM23_group(record)){
                return "FM23";
            }
    
            if (MDCF_DRG.FM25_group(record)){
                return "FM25";
            }

            return "FM2";
        }else{
            return "";
        }
    }
}

