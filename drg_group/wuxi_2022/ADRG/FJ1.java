package drg_group.wuxi_2022.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.DRG.MDCF_DRG;

public class FJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_ss={"00.6700x001","00.6701","37.0x00x002","37.0x01","37.2400","37.2401","37.2501","37.7901","37.7902"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null &&record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FJ1入组条件，匹配规则：主手术匹配");
                
            if (MDCF_DRG.FJ19_group(record)){
                return "FJ19";
            }

            return "FJ1";
        }else{
            return "";
        }
    }
}

