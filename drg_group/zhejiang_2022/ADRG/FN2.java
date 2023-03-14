package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCF_DRG;

public class FN2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.5500x010","00.5500x015","00.5500x016","39.5000x019","39.5000x025","39.5000x026","39.5007","39.5012","39.5017","39.7200x001","39.7400x001","39.7400x003","39.7900x015","39.7900x022","39.7900x023","39.7900x024","39.7900x029","39.7900x033","39.7900x037","39.7900x039","39.7900x043","39.7900x046","39.9000x011","39.9000x012","39.9000x016","39.9000x032","39.9000x033","39.9000x035","39.9003","39.9006","39.9014","39.9100x002","88.3900x001","88.5101","88.5102","88.6000","88.6102","88.6103","88.6200x001","88.6400x001","88.6400x002","88.6400x003","88.6401","88.6500x002","88.6500x005","88.6501","88.6502","88.6503","88.6600x002","88.6601","88.6602","88.6701","88.6702","88.6703","88.6800","99.1000x008","99.1000x010","99.1003"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合FN2入组条件，匹配规则：某一手术匹配");
                
            if (MDCF_DRG.FN21_group(record)){
                return "FN21";
            }
    
            if (MDCF_DRG.FN23_group(record)){
                return "FN23";
            }
    
            if (MDCF_DRG.FN25_group(record)){
                return "FN25";
            }

            return "FN2";
        }else{
            return "";
        }
    }
}

