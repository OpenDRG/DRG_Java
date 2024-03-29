package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCB_DRG;

public class BX1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"F01.000","F01.100","F01.102","F01.200","F01.300","F01.800x001","F01.900","F01.901","F01.902","F03.x00","F03.x01","G10.x00","G10.x01+F02.2*","G93.804","M30.005+F02.8*","N18.502+F02.8*"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BX1入组条件，匹配规则：主诊断匹配");
                
            if (MDCB_DRG.BX11_group(record)){
                return "BX11";
            }
    
            if (MDCB_DRG.BX13_group(record)){
                return "BX13";
            }
    
            if (MDCB_DRG.BX15_group(record)){
                return "BX15";
            }

            return "";
        }else{
            return "";
        }
    }
}

