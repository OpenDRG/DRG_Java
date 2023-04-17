package drg_group.yantai_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yantai_2023.Base;
import drg_group.yantai_2023.MedicalRecord;
import drg_group.yantai_2023.DRG.MDCT_DRG;

public class TV1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"F40.000","F40.100","F40.200x001","F40.200x002","F40.200x003","F40.200x004","F40.800","F40.900","F40.901","F41.000","F41.001","F41.100","F41.101","F41.102","F41.200","F41.200x002","F41.201","F41.300x001","F41.800","F41.900","F42.000","F42.001","F42.003","F42.100","F42.101","F42.200","F42.800","F42.800x001","F42.900","F42.901"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合TV1入组条件，匹配规则：主诊断匹配");
                
            if (MDCT_DRG.TV19_group(record)){
                return "TV19";
            }

            return "TV1";
        }else{
            return "";
        }
    }
}

