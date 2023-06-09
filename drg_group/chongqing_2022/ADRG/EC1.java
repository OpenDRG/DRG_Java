package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCE_DRG;

public class EC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"07.1600","07.8000","07.8001","07.8100","07.8100x009","07.8101","07.8201","07.8300","07.8300x002","07.8400","07.8401","07.9100","07.9200x001","07.9300","07.9400","07.9500","07.9800","07.9901","31.2100x001","34.1x01","34.1x02","34.1x03","34.1x04","34.1x05","34.2200","34.2501","34.2502","34.2600","34.3x01","34.3x02","34.3x03","34.3x04","34.3x05","34.9903","37.1200x005","37.1200x008","37.1201","37.1203","37.1204","37.3101","37.3102","37.3103","37.9100","40.1100x004","40.2902","40.2903","40.2904","40.5906","40.5914","40.6100","40.6200","40.6300","40.6400","40.6401","40.6900x002","40.6900x003","40.6900x004","40.6901","40.6902","42.5100","42.5200","42.5200x005","42.5201","42.5202","42.5300x001","42.5500x001","42.5801","42.5900x001"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合EC1入组条件，匹配规则：主手术匹配");
                
            if (MDCE_DRG.EC19_group(record)){
                return "EC19";
            }

            return "";
        }else{
            return "";
        }
    }
}

