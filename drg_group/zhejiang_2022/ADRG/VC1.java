package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCV_DRG;

public class VC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"01.2500x003","01.5925","02.0202","08.2000x009","08.2000x010","16.9801","18.2900x016","18.2900x017","20.9201","21.3200x010","21.3200x011","21.9900x002","27.4300x010","27.4300x011","34.7101","37.7901","49.3900x015","49.3900x016","52.4x00x009","52.4x00x010","54.3x00x011","54.3x06","61.3x00x005","61.3x00x006","64.2x00x006","64.2x00x007","71.3x00x021","71.3x00x022","71.3x00x023","71.3x00x024","76.2x03","79.6000","79.6100","79.6201","79.6202","79.6301","79.6302","79.6400","79.6500","79.6601","79.6602","79.6701","79.6702","79.6800","79.6900x002","79.6901","82.3601","83.4501","85.2000x001","85.2000x002","86.2200x011","86.2201","86.2701","86.2800x012","86.7501"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合VC1入组条件，匹配规则：某一手术匹配");
                
            if (MDCV_DRG.VC19_group(record)){
                return "VC19";
            }

            return "VC1";
        }else{
            return "";
        }
    }
}

