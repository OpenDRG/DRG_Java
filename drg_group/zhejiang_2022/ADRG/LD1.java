package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCL_DRG;

public class LD1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"56.0x01","56.0x02","56.4100x012","57.0x00x003","57.0x00x005","57.0x00x006","57.0x01","57.0x02","57.0x03","57.0x04","57.4100x002","57.4900x001","57.4901","57.4902","57.4903","57.4904","57.9101","57.9102","57.9201","57.9301","59.8x00x004","59.8x00x005","59.8x00x006","59.8x03","59.8x04"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合LD1入组条件，匹配规则：某一手术匹配");
                
            if (MDCL_DRG.LD11_group(record)){
                return "LD11";
            }
    
            if (MDCL_DRG.LD13_group(record)){
                return "LD13";
            }
    
            if (MDCL_DRG.LD15_group(record)){
                return "LD15";
            }

            return "LD1";
        }else{
            return "";
        }
    }
}

