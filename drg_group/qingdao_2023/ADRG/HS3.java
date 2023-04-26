package drg_group.qingdao_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.DRG.MDCH_DRG;

public class HS3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"B15.900","B15.901","B15.902","B15.903","B15.905","B16.100","B16.100x002","B16.100x003","B16.100x004","B16.101","B16.901","B16.902","B16.903","B16.904","B16.905","B17.000","B17.100","B17.100x003","B17.100x006","B17.101","B17.200","B17.200x004","B17.202","B17.203","B17.800x002","B17.800x003","B17.801","B17.803","B17.900","B17.900x002","B17.900x002","B17.900x004","B17.902","B17.903","B17.904","B18.000","B18.001","B18.002","B18.003","B18.004","B18.100","B18.100","B18.100","B18.100x007","B18.104","B18.105","B18.106","B18.107","B18.200","B18.200","B18.200","B18.200x009","B18.201","B18.202","B18.203","B18.204","B18.800x001","B18.800x002","B18.800x003","B18.800x005","B18.801","B18.802","B18.804","B18.900","B18.900","B18.900","B18.900x006","B18.901","B18.902","B18.903","B19.900","B19.901"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HS3入组条件，匹配规则：主诊断匹配");
                
            if (MDCH_DRG.HS39_group(record)){
                return "HS39";
            }

            return "HS3";
        }else{
            return "";
        }
    }
}

