package drg_group.changchun_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;
import drg_group.changchun_2022.DRG.MDCY_DRG;


public class YR2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"R75.x00x001","Z20.600","Z21.x00x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.intersect(record.zdList,adrg_zd)){
            Base.groupMessages.putMessage(record.Index,"符合YR2入组条件，匹配规则：某一诊断匹配");
            
                
            if (MDCY_DRG.YR29_group(record)){
                return "YR29";
            }

            return "";
        }else{
            return "";
        }
    }
}

