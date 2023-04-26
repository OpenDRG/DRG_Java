package drg_group.qingdao_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.DRG.MDCD_DRG;

public class DG1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"25.2x00","25.2x01","25.3x00","25.4x00x001","26.0x00x002","26.0x00x004","26.0x00x005","26.0x01","26.2100x001","26.2101","26.2901","26.2902","26.2903","26.2904","26.2905","26.2906","26.3000","26.3100x008","26.3100x009","26.3101","26.3102","26.3103","26.3104","26.3105","26.3200x001","26.3201","26.3202","26.3203","26.4100x001","26.4200x001","26.4200x002","26.4900x001","26.4900x005","26.4900x006","26.4900x007","26.4900x008","26.4900x009","26.4900x010","26.4900x011","26.4901","26.4902","26.4903","26.4904","26.4905","26.4906","26.9900x001","26.9900x002","26.9901","27.0x07"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DG1入组条件，匹配规则：主手术匹配");
                
            if (MDCD_DRG.DG19_group(record)){
                return "DG19";
            }

            return "DG1";
        }else{
            return "";
        }
    }
}

