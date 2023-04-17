package drg_group.yantai_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yantai_2023.Base;
import drg_group.yantai_2023.MedicalRecord;
import drg_group.yantai_2023.DRG.MDCH_DRG;

public class HS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"B15.000","B15.001","B15.002","B15.003","B16.000","B16.000x001","B16.001","B16.200","B16.201","B16.202","B16.203","B16.204","B17.102","B17.103","B17.200x005","B17.204","B17.205","B17.800x001","B17.900x005","B17.900x006","B18.800x004","B18.803","B18.805","B19.000","B19.001","B19.002","B25.101+K77.0*","K70.400x002","K70.401","K70.402","K70.403","K71.100","K71.100x003","K71.100x005","K71.100x006","K71.100x007","K71.100x008","K71.101","K71.102","K71.103","K71.104","K72.000x004","K72.000x005","K72.000x013","K72.001","K72.002","K72.003","K72.005","K72.100","K72.900x001","K73.901","K76.700x001","T86.401"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HS1入组条件，匹配规则：主诊断匹配");
                
            if (MDCH_DRG.HS11_group(record)){
                return "HS11";
            }
    
            if (MDCH_DRG.HS15_group(record)){
                return "HS15";
            }

            return "HS1";
        }else{
            return "";
        }
    }
}

