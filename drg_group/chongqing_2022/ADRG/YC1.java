package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCY_DRG;

public class YC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"B20.001","B20.002","B20.003","B20.004","B20.005","B20.006","B20.301","B20.801","B20.901","B21.300","B21.700","B21.800","B21.900","B22.000x003","B22.000x004","B22.000x005","B22.001+F02.4*","B22.100","B22.200","B22.700","B22.701","B23.000","B23.100","B23.100x001","B23.100x002","B23.200","B23.201","B23.800","B23.800x002","B24.x01","I33.000x018","R75.x00x001","Z20.600","Z21.x00x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.intersect(record.zdList,adrg_zd)){
            Base.groupMessages.putMessage(record.Index,"符合YC1入组条件，匹配规则：某一诊断匹配");
                
            if (MDCY_DRG.YC11_group(record)){
                return "YC11";
            }
    
            if (MDCY_DRG.YC13_group(record)){
                return "YC13";
            }
    
            if (MDCY_DRG.YC15_group(record)){
                return "YC15";
            }

            return "";
        }else{
            return "";
        }
    }
}

