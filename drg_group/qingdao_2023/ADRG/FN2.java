package drg_group.qingdao_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.DRG.MDCF_DRG;

public class FN2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.9300x001","38.9300x002","38.9300x003","38.9300x004","38.9300x005","38.9300x006","38.9300x007","38.9300x008","87.0800x002","88.4201","88.4202","88.4203","88.4204","88.4205","88.4300x002","88.4400x001","88.4402","88.4403","88.4404","88.4405","88.4500","88.4700x001","88.4700x002","88.4701","88.4702","88.4703","88.4704","88.4705","88.4706","88.4707","88.4800x005","88.4800x006","88.4801","88.4900x005","88.4900x006","88.4900x007","88.4901","88.4902","88.4903","88.4904","88.5101","88.5102","88.6000","88.6200x001","88.6400x001","88.6400x002","88.6400x003","88.6401","88.6500x002","88.6500x005","88.6500x006","88.6501","88.6502","88.6503","88.6600x002","88.6600x002","88.6601","88.6700x001","88.6701","88.6702","88.6703","99.1000x006","99.1000x007","99.1000x008","99.1000x009","99.1000x010","99.1000x011","99.1001","99.1002","99.1003","99.1004"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FN2入组条件，匹配规则：主手术匹配");
                
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

