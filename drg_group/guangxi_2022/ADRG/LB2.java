package drg_group.guangxi_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.guangxi_2022.Base;
import drg_group.guangxi_2022.MedicalRecord;
import drg_group.guangxi_2022.DRG.MDCL_DRG;

public class LB2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"40.2900x023","40.2905","40.2909","40.5400x001","40.5909","40.5910","40.5911","40.5912","55.0100x010","55.0101","55.0103","55.0104","55.0105","55.0106","55.0107","55.0108","55.0109","55.0110","55.0200","55.0201","55.0300x005","55.0300x006","55.0303","55.1100x001","55.1100x002","55.1106","55.1107","55.1108","55.1200","55.1200x001","55.2400","55.3100","55.3200x001","55.3301","55.3302","55.3400x001","55.3400x001","55.3501","55.3900x001","55.3900x003","55.3900x004","55.3901","55.3902","55.3903","55.4x00","55.4x01","55.4x02","55.4x03","55.4x04","55.4x05","55.5100","55.5101","55.5102","55.5103","55.5104","55.5105","55.5106","55.5200","55.5201","55.5300x001","55.5400","55.5401","55.7x00","55.7x01","55.8101","55.8102","55.8201","55.8202","55.8301","55.8400","55.8500","55.8501","55.8600x006","55.8601","55.8602","55.8603","55.8604","55.8605","55.8606","55.8701","55.8702","55.8703","55.8704","55.8900x002","55.8900x003","55.8900x004","55.8901","55.8902","55.8903","55.9100","55.9100x003","55.9100x004","55.9100x005","55.9200x007","55.9701","55.9702","55.9800","55.9900x001","55.9901","55.9902","55.9903","56.3300x003","59.0200x007","59.0203","59.0300x002","59.0901","59.0902","59.0903","59.0904","59.9101"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0]) && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合LB2入组条件，匹配规则：主手术匹配、某一手术匹配");
                
            if (MDCL_DRG.LB21_group(record)){
                return "LB21";
            }
    
            if (MDCL_DRG.LB23_group(record)){
                return "LB23";
            }
    
            if (MDCL_DRG.LB25_group(record)){
                return "LB25";
            }

            return "";
        }else{
            return "";
        }
    }
}

