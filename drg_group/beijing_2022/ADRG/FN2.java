package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCF_DRG;

public class FN2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.2101","00.2102","00.2201","00.2202","00.2300x002","00.2300x003","00.2300x004","00.2500x002","38.9300x001","38.9300x002","38.9300x003","38.9300x006","38.9300x007","38.9300x008","39.4900x011","39.4901","39.4902","39.5000x013","39.5000x019","39.5000x024","39.5000x025","39.5000x026","39.5000x031","87.0800x002","88.4201","88.4202","88.4203","88.4204","88.4205","88.4300","88.4300x002","88.4400x001","88.4402","88.4403","88.4404","88.4405","88.4500","88.4700x001","88.4700x002","88.4701","88.4702","88.4703","88.4704","88.4705","88.4706","88.4707","88.4800x005","88.4800x006","88.4801","88.4900x005","88.4900x006","88.4900x007","88.4901","88.4902","88.4903","88.4904","88.6000","88.6200x001","88.6400x001","88.6400x002","88.6400x003","88.6401","88.6500x002","88.6500x005","88.6500x006","88.6501","88.6502","88.6503","88.6601","88.6700x001","88.6701","88.6702","88.6703","99.1000x007","99.1000x008","99.1000x009","99.1000x010","99.1001","99.1002","99.1003","99.1004"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FN2入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FN29_group(record)){
                return "FN29";
            }

            return "FN2";
        }else{
            return "";
        }
    }
}

