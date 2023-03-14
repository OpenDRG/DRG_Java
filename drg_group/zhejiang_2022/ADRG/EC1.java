package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCE_DRG;

public class EC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"31.2100x001","32.0900x005","34.1x01","34.1x02","34.1x03","34.1x04","34.1x05","34.2200","34.2501","34.2502","34.2600","34.3x01","34.3x02","34.3x03","34.3x04","34.3x05","34.9903","37.1200x005","37.1200x008","37.1201","37.1203","37.1204","37.3101","37.3102","37.3103","37.9100","40.1100x004","40.2902","40.2903","40.2904","40.5906","40.5914","40.6100","40.6200","40.6300","40.6400","40.6401","40.6900x002","40.6900x003","40.6900x004","40.6901","40.6902","42.6100","42.6200","42.6300","42.6400x002","42.6402","42.6403","42.6500","42.6601","53.8301"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合EC1入组条件，匹配规则：某一手术匹配");
                
            if (MDCE_DRG.EC11_group(record)){
                return "EC11";
            }
    
            if (MDCE_DRG.EC13_group(record)){
                return "EC13";
            }
    
            if (MDCE_DRG.EC15_group(record)){
                return "EC15";
            }

            return "EC1";
        }else{
            return "";
        }
    }
}

