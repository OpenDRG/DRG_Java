package drg_group.qingdao_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.DRG.MDCD_DRG;

public class DG2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"01.6x00","76.0101","76.0102","76.0900x001","76.0900x003","76.0900x004","76.0901","76.0902","76.0903","76.0904","76.0905","76.2x00x014","76.2x01","76.2x02","76.2x03","76.2x04","76.3100x001","76.3100x009","76.3100x010","76.3100x011","76.3100x012","76.3101","76.3102","76.3103","76.3104","76.3900x003","76.3900x013","76.3900x014","76.3900x016","76.3901","76.3902","76.3903","76.3904","76.3905","76.4100","76.4200x002","76.4300x003","76.4301","76.4400x002","76.4400x003","76.4500x003","76.4502","76.4503","76.4600x001","76.4600x005","76.4600x007","76.5x00","76.5x00x001","76.6100","76.6200","76.6300","76.6400x002","76.6400x008","76.6400x016","76.6400x017","76.6401","76.6402","76.6403","76.6404","76.6500x004","76.6500x006","76.6500x008","76.6500x009","76.6501","76.6502","76.6503","76.6600","76.6700","76.6800x002","76.6800x003","76.6801","76.6802","76.6900x003","76.6900x004","76.6901","76.6902","76.6903","76.6904","76.6905","76.7000","76.7100","76.7200","76.7200x001","76.7201","76.7300","76.7300x001","76.7301","76.7400","76.7401","76.7500","76.7501","76.7600","76.7601","76.7602","76.7700","76.7701","76.7702","76.7800x001","76.7800x003","76.7800x004","76.7900x006","76.7900x013","76.7900x014","76.7901","76.9100x002","76.9100x004","76.9100x007","76.9100x010","76.9100x011","76.9101","76.9102","76.9200x001","76.9200x003","76.9200x004","76.9200x005","76.9200x007","76.9200x008","76.9200x009","76.9200x010","76.9200x011","76.9200x012","76.9200x013","76.9201","76.9202","76.9300","76.9400","76.9500x003","76.9500x004","76.9500x005","76.9500x006","76.9500x007","76.9501","76.9601","76.9700x001","76.9700x002","76.9701","76.9702","76.9901"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DG2入组条件，匹配规则：主手术匹配");
                
            if (MDCD_DRG.DG21_group(record)){
                return "DG21";
            }
    
            if (MDCD_DRG.DG23_group(record)){
                return "DG23";
            }
    
            if (MDCD_DRG.DG25_group(record)){
                return "DG25";
            }

            return "DG2";
        }else{
            return "";
        }
    }
}

