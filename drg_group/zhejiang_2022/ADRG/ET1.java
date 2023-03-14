package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCE_DRG;

public class ET1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"D86.000","D86.200","E85.412+J99.8*","J60.x00","J60.x00x002","J60.x01","J61.x01","J62.001","J62.800x002","J62.800x003","J62.800x004","J62.800x005","J62.801","J62.802","J62.803","J62.804","J63.000","J63.001","J63.100","J63.200","J63.201","J63.301","J63.400","J63.500","J63.800","J63.800x001","J63.800x003","J63.800x005","J63.800x009","J63.800x010","J63.800x011","J63.801","J63.802","J63.803","J64.x00","J65.x00","J66.000","J66.100","J66.200","J67.000","J67.100","J67.200","J67.200x002","J67.200x003","J67.300","J67.400","J67.400x002","J67.500","J67.600","J67.600x001","J67.700x001","J67.700x002","J67.800x001","J67.800x002","J67.800x003","J67.800x004","J67.800x005","J67.900","J68.000x001","J68.000x002","J68.001","J68.002","J70.001","J70.101","J70.200","J70.200x002","J70.300","J70.400","J82.x00x001","J82.x00x002","J82.x00x004","J82.x00x005","J82.x01","J84.000x003","J84.001","J84.002","J84.100x006","J84.100x007","J84.100x008","J84.101","J84.102","J84.103","J84.104","J84.105","J84.108","J84.109","J84.110","J84.800x003","J84.800x004","J84.800x005","J84.800x006","J84.800x007","J84.801","J84.802","J84.803","J84.804","J84.805","J84.900","M05.101+J99.0*","M05.102+J99.0*","M05.103+J99.0*","M33.201+J99.1*","M34.801+J99.1*","M35.002+J99.1*","M35.904+J99.1*"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合ET1入组条件，匹配规则：主诊断匹配");
                
            if (MDCE_DRG.ET11_group(record)){
                return "ET11";
            }
    
            if (MDCE_DRG.ET13_group(record)){
                return "ET13";
            }
    
            if (MDCE_DRG.ET15_group(record)){
                return "ET15";
            }

            return "ET1";
        }else{
            return "";
        }
    }
}

