package drg_group.handan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;
import drg_group.handan_2022.DRG.MDCL_DRG;

public class LC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"56.0x00x001","56.0x00x002","56.0x00x003","56.0x00x004","56.0x00x005","56.0x00x006","56.0x00x007","56.0x00x008","56.0x00x009","56.0x00x010","56.0x00x011","56.0x00x012","56.0x00x013","56.0x00x014","56.0x00x015","56.0x00x016","56.0x01","56.0x02","56.0x03","56.0x04","56.0x05","56.0x06","56.0x07","56.0x08","56.1x00x001","56.1x01","56.2x00x002","56.2x00x007","56.2x01","56.2x02","56.2x03","56.2x04","56.2x05","56.3400","56.4100","56.4100x008","56.4100x009","56.4100x011","56.4100x012","56.4101","56.4102","56.4104","56.4105","56.4106","56.4107","56.4200","56.4201","56.5200x001","56.6100x001","56.6100x003","56.6100x004","56.6201","56.7102","56.7104","56.7105","56.7400","56.7402","56.7501","56.7900","56.8100","56.8200x002","56.8201","56.8300","56.8400x001","56.8401","56.8500","56.8600","56.8900x001","56.8900x006","56.8901","56.8902","56.8903","56.8904","56.8905","56.8906","56.8907","56.8908","56.9100","56.9101","56.9200","56.9300","56.9400","56.9500","56.9500x001","56.9900","59.0201","59.0202","59.0303","59.8x00x001","59.8x00x004","59.8x00x005","59.8x00x006","59.8x00x007","59.8x01","59.8x03","59.8x04","59.8x05","59.9900x002","59.9901","59.9902"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LC1入组条件，匹配规则：主手术匹配");
                
            if (MDCL_DRG.LC19_group(record)){
                return "LC19";
            }

            return "";
        }else{
            return "";
        }
    }
}

