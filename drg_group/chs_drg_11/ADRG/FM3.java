package drg_group.chs_drg_11.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCF_DRG;

public class FM3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_ss={"00.2400x001","00.5601","00.5602","00.5700","00.5900x003","00.5901","00.5902","37.2000","37.2000x003","37.2100","37.2200","37.2300","37.2600x001","37.2700","37.2901","38.2400","38.2601","38.2602","88.5000","88.5201","88.5202","88.5301","88.5302","88.5400x001","88.5500x002","88.5600x002","88.5700x003","88.5701","88.5800","88.5900"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null &&record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FM3入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FM39_group(record)){
                return "FM39";
            }

            return "FM3";
        }else{
            return "";
        }
    }
}

