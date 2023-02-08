package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCV_DRG;

public class VS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"T78.000","T78.101","T78.102","T78.200","T78.201","T78.300","T78.300x003","T78.300x004","T78.301","T78.400","T78.400x002","T80.300","T80.300x001","T80.400","T80.500","T80.500x001","T80.600x004","T80.600x005","T80.600x006","T80.601","T80.602","T80.603","T80.900x003","T80.901","T80.903","T88.600","T88.601","T88.700x004"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合VS1入组条件，匹配规则：主诊断匹配");
                
            if (MDCV_DRG.VS19_group(record)){
                return "VS19";
            }

            return "VS1";
        }else{
            return "";
        }
    }
}

