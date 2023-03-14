package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCM_DRG;

public class MA1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"40.2900x023","40.2905","40.2907","40.2909","40.5000","40.5200","40.5300","40.5301","40.5400x001","40.5907","40.5908","40.5910","40.5911","40.5912","57.7100","57.7101","57.7102","57.7103","60.0x00x001","60.0x03","60.1400","60.3x01","60.4x01","60.5x01","60.5x02","60.6100x002","60.6101","60.6200","60.6201","60.6900x001","60.6900x002","60.7300","61.0x00x003","61.3x00x007","61.3x01","61.3x02","61.3x03","61.4903","62.0x00x001","62.0x01","62.2x00x002","62.2x01","62.3x00","62.3x01","62.3x02","62.3x03","62.3x04","62.4100x004","62.4101","62.4102","62.4103","62.4104","62.4105","62.4200","62.6901","62.7x00","63.3x00x001","63.3x01","63.3x03","63.4x00","63.5300","63.7300","63.7300x003","63.7301","63.9200x001","63.9300","64.2x00x008","64.2x01","64.3x01","64.3x02","64.4300","64.4400","64.4500"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合MA1入组条件，匹配规则：某一手术匹配");
                
            if (MDCM_DRG.MA11_group(record)){
                return "MA11";
            }
    
            if (MDCM_DRG.MA13_group(record)){
                return "MA13";
            }
    
            if (MDCM_DRG.MA15_group(record)){
                return "MA15";
            }

            return "MA1";
        }else{
            return "";
        }
    }
}

