package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCF_DRG;

public class FK3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.5100x001","00.5101","00.5102","00.5401","00.5402","37.9401","37.9402","37.9403","37.9404","37.9500x001","37.9500x002","37.9600x001","37.9600x002","37.9700x001","37.9700x002","37.9800x001","37.9800x002"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合FK3入组条件，匹配规则：某一手术匹配");
                
            if (MDCF_DRG.FK31_group(record)){
                return "FK31";
            }
    
            if (MDCF_DRG.FK33_group(record)){
                return "FK33";
            }
    
            if (MDCF_DRG.FK35_group(record)){
                return "FK35";
            }

            return "FK3";
        }else{
            return "";
        }
    }
}

