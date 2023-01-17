package drg_group.wuxi_2022.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.DRG.MDCT_DRG;

public class TT1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"F50.000","F50.100","F50.200","F50.300","F50.401","F50.501","F50.502","F50.800x002","F50.801","F50.900","F51.000","F51.100","F51.200","F51.200x002","F51.200x003","F51.300","F51.400","F51.500","F51.800","F51.900","G47.000","G47.000x001","G47.000x002","G47.100","G47.800x001","G47.800x002","G47.801","G47.900"};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合TT1入组条件，匹配规则：主诊断匹配");
                
            if (MDCT_DRG.TT13_group(record)){
                return "TT13";
            }
    
            if (MDCT_DRG.TT15_group(record)){
                return "TT15";
            }

            return "TT1";
        }else{
            return "";
        }
    }
}

