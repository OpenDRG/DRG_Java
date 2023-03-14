package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCL_DRG;

public class LA1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"39.2401","39.2600x004","39.2605","39.5500","40.2900x023","40.2905","40.2907","40.2909","40.5300","40.5301","40.5400x001","40.5908","40.5909","40.5910","40.5911","40.5912","55.0101","55.0109","55.3903","55.4x00","55.4x01","55.4x02","55.4x03","55.4x04","55.4x05","55.5100","55.5101","55.5102","55.5103","55.5104","55.5105","55.5106","55.5200","55.5201","55.5300x001","55.5400","55.5401","55.8600x006","55.8602","55.8603","55.8605","55.8606","56.4101","56.4200","56.4201","56.8900x001","57.5900x001","57.5901","57.5903","57.6x00","57.6x01","57.6x02","57.6x03","57.6x04","57.6x05","57.6x06","57.7100","57.7101","57.7102","57.7103","57.7900x001","57.7901","57.8700x005","57.8700x006","57.8700x007","57.8700x008","57.8700x009","57.8701","57.8702","57.8703","57.8704","57.8706","57.9103"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合LA1入组条件，匹配规则：某一手术匹配");
                
            if (MDCL_DRG.LA11_group(record)){
                return "LA11";
            }
    
            if (MDCL_DRG.LA13_group(record)){
                return "LA13";
            }
    
            if (MDCL_DRG.LA15_group(record)){
                return "LA15";
            }

            return "LA1";
        }else{
            return "";
        }
    }
}

