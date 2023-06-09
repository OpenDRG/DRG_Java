package drg_group.guangxi_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.guangxi_2022.Base;
import drg_group.guangxi_2022.MedicalRecord;
import drg_group.guangxi_2022.DRG.MDCB_DRG;

public class BD1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"03.0100x001","03.0200","03.0900x003","03.0900x004","03.0900x005","03.0900x006","03.0900x007","03.0900x009","03.0900x010","03.0900x014","03.0900x016","03.0900x019","03.0900x021","03.0901","03.0902","03.0903","03.0904","03.0905","03.0906","03.0907","03.0908","03.0909","03.0910","03.0911","03.0912","03.0913","03.0914","03.0915","03.1x00x001","03.1x00x003","03.1x01","03.1x02","03.2100x001","03.2101","03.2900x003","03.2900x004","03.2900x005","03.2901","03.2902","03.2903","03.3100x001","03.3201","03.3202","03.4x00x001","03.4x00x002","03.4x00x004","03.4x00x007","03.4x00x008","03.4x00x009","03.4x01","03.4x02","03.4x03","03.4x03","03.4x04","03.4x05","03.4x06","03.4x07","03.4x07","03.5100x003","03.5200x003","03.5900x005","03.5901","03.5902","03.5903","03.5904","03.5905","03.6x00x008","03.6x00x010","03.6x00x011","03.6x01","03.6x02","03.6x03","03.7100","03.7101","03.7200","03.7900x002","03.7901","03.7902","03.7904","03.7905","03.7906","03.9600","03.9700x001","03.9801","03.9900x003","03.9900x004","04.0300x003","04.0300x009","04.0300x010","04.2x04","04.2x05","04.2x06","38.6100x001","38.6100x005"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0]) && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合BD1入组条件，匹配规则：主手术匹配、某一手术匹配");
                
            if (MDCB_DRG.BD11_group(record)){
                return "BD11";
            }
    
            if (MDCB_DRG.BD13_group(record)){
                return "BD13";
            }
    
            if (MDCB_DRG.BD15_group(record)){
                return "BD15";
            }

            return "";
        }else{
            return "";
        }
    }
}

