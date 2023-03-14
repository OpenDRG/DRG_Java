package drg_group.xian_2020.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;
import drg_group.xian_2020.DRG.MDCQ_DRG;

public class QS4 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"D46.000","D46.000x002","D46.000x003","D46.001","D46.100","D46.100x002","D46.100x012","D46.200","D46.201x001","D46.203","D46.400","D46.500","D46.600","D62.x00","D64.000","D64.001","D64.100","D64.200","D64.300","D64.300x002","D64.400x001","D64.401","D64.800x002","D64.801","D64.802","D64.803","D64.900","D64.900x006","D64.900x007","D64.901","D64.902","D64.903","D64.904","E80.200x007","E80.200x008","N18.900x012+D63.8*"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合QS4入组条件，匹配规则：主诊断匹配");
                
            if (MDCQ_DRG.QS49_group(record)){
                return "QS49";
            }

            return "QS4";
        }else{
            return "";
        }
    }
}

