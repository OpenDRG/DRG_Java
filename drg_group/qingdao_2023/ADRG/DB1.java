package drg_group.qingdao_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.DRG.MDCD_DRG;

public class DB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"01.2502","01.2503","01.2504","06.6x00","30.1x00","30.1x00x002","30.3x00","30.3x01","30.3x02","30.3x03","30.3x04","38.0200x002","38.0200x003","38.0201","38.3202","38.6200x002","38.6200x003","38.6200x005","38.6200x006","38.6200x007","38.6201","38.8200x003","38.8200x005","38.8200x006","38.8200x007","38.8200x008","38.8202","38.8203","39.2200x019","39.5900x006","39.5900x028","39.5900x029","39.8900x001","39.8901"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DB1入组条件，匹配规则：主手术匹配");
                
            if (MDCD_DRG.DB19_group(record)){
                return "DB19";
            }

            return "DB1";
        }else{
            return "";
        }
    }
}

