package drg_group.qingdao_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.DRG.MDCL_DRG;

public class LB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"55.0102","55.0111","55.0300x002","55.0300x003","55.0300x007","55.0301","55.0302","55.0400x005","55.0400x006","55.0400x007","55.0400x008","55.0400x009","55.0400x010","55.0401","55.0402","55.0403","55.0404","55.0405","55.1101","55.1102","55.1103","55.1104","55.1105","55.1109"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LB1入组条件，匹配规则：主手术匹配");
                
            if (MDCL_DRG.LB19_group(record)){
                return "LB19";
            }

            return "LB1";
        }else{
            return "";
        }
    }
}

