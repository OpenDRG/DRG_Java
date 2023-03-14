package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCJ_DRG;

public class JD2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"08.2000x009","08.2000x010","21.3200x010","21.3200x011","21.9900x002","27.4300x010","27.4300x011","54.3x00x011","71.3x00x021","71.3x00x022","71.3x00x023","71.3x00x024","85.2000x001","85.2000x002","86.2200x011","86.2201","86.2202","86.2800x012"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合JD2入组条件，匹配规则：某一手术匹配");
                
            if (MDCJ_DRG.JD21_group(record)){
                return "JD21";
            }
    
            if (MDCJ_DRG.JD23_group(record)){
                return "JD23";
            }
    
            if (MDCJ_DRG.JD25_group(record)){
                return "JD25";
            }

            return "JD2";
        }else{
            return "";
        }
    }
}

