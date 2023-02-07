package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCD_DRG;

public class DG3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"27.5301","27.5302","27.5400","27.5401","27.5700x006","27.5911","27.5915","27.6100","27.6200x002","27.6200x003","27.6201","27.6300x002","27.6301","27.6302","27.6400","27.6900x003","27.6900x004","27.6900x007","27.6900x008","27.6901","27.6902","27.6903","27.6904","27.6905","27.6906","27.6907","27.6908","27.6909","27.7100","27.7202","27.7300","27.9100x001","27.9101"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DG3入组条件，匹配规则：主手术匹配");
                
            if (MDCD_DRG.DG39_group(record)){
                return "DG39";
            }

            return "DG3";
        }else{
            return "";
        }
    }
}

