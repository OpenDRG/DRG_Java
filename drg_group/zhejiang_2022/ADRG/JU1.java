package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCJ_DRG;

public class JU1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A42.800x002","A46.x00","A58.x00","A60.100x002","A60.101","B00.001","B00.100","B00.100x001","B00.100x004+H62.1*","B00.100x005","B00.101","B00.102","B08.800x004","B08.800x007","B09.x00x002","B09.x01","B26.800x004","B69.800x004","B69.805","I89.100x002","L01.004","L01.005","L01.008","L02.100","L02.200","L02.200x004","L02.200x009","L02.200x010","L02.201","L02.202","L02.203","L02.205","L02.206","L02.300","L02.401","L02.402","L02.403","L02.800","L02.801","L02.802","L02.803","L02.804","L02.900x001","L02.900x002","L02.900x006","L02.901","L02.902","L02.903","L03.000","L03.000x015","L03.001","L03.002","L03.004","L03.101","L03.103","L03.104","L03.105","L03.106","L03.107","L03.108","L03.109","L03.200","L03.300","L03.301","L03.302","L03.303","L03.304","L03.305","L03.306","L03.800","L03.801","L03.802","L03.900","L05.000","L05.000x001","L08.000x001","L08.001","L08.002","L08.800x005","L08.800x006","L08.800x008","L08.801","L08.803","L08.804","L08.805","L08.901","L08.902","L08.903","L08.904","L08.905","L08.906","L08.907","L08.908","L08.909","L08.911","L56.800","L98.000","L98.001","L98.300"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合JU1入组条件，匹配规则：主诊断匹配");
                
            if (MDCJ_DRG.JU11_group(record)){
                return "JU11";
            }
    
            if (MDCJ_DRG.JU13_group(record)){
                return "JU13";
            }
    
            if (MDCJ_DRG.JU15_group(record)){
                return "JU15";
            }

            return "JU1";
        }else{
            return "";
        }
    }
}

