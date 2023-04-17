package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCL_DRG;

public class LK1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"55.0400x005","55.0400x006","55.0400x007","55.0400x008","55.0400x009","55.0400x010","55.0401","55.0402","55.0403","55.0404","55.0405","56.0x03","56.0x04","56.0x06","56.0x07","56.0x08","57.0x00x002","57.0x00x007","57.0x00x008","57.0x00x009","57.0x00x010","57.0x00x011","57.0x00x012","57.0x00x013","57.0x05","57.0x06","57.0x07","57.0x08","59.9502","98.5101","98.5102","98.5103","98.5104"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LK1入组条件，匹配规则：主手术匹配");
                
            if (MDCL_DRG.LK19_group(record)){
                return "LK19";
            }

            return "LK1";
        }else{
            return "";
        }
    }
}

