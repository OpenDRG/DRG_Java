package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCO_DRG;

public class OS2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"O01.001","O01.101","O01.102","O01.901","O01.902","O02.000x001","O02.001","O02.002","O02.100","O02.100x002","O02.900","O03.001","O03.002","O03.100x001","O03.101","O03.102","O03.200x001","O03.300","O03.300x031","O03.300x041","O03.300x061","O03.400x001","O03.501","O03.502","O03.503","O03.504","O03.600x001","O03.601","O03.602","O03.603","O03.604","O03.701","O03.702","O03.800","O03.800x031","O03.800x041","O03.800x061","O03.801","O03.802","O03.900x001","O03.900x002","O03.901","O03.902","O03.903","O03.904","O04.000x003","O04.001","O04.100x002","O04.101","O04.200x001","O04.300","O04.300x031","O04.300x041","O04.300x081","O04.400","O04.401","O04.402","O04.500x001","O04.500x002","O04.502","O04.503","O04.600x001","O04.601","O04.602","O04.700x001","O04.701","O04.800","O04.800x031","O04.800x041","O04.800x061","O04.801","O04.802","O04.900x001","O04.901","O04.902","O04.905","O05.000","O05.100","O05.200","O05.301","O05.400","O05.500","O05.600","O05.700","O05.801","O05.900","O06.000","O06.100","O06.200","O06.301","O06.400","O06.500","O06.600","O06.700","O06.801","O06.900","O07.000","O07.000x001","O07.000x002","O07.100x001","O07.200x001","O07.300","O07.300x001","O07.300x002","O07.401","O07.402","O07.500","O07.600","O07.700","O07.800","O07.900x001","O08.000","O08.000x002","O08.000x004","O08.000x005","O08.000x006","O08.000x007","O08.000x009","O08.000x010","O08.000x011","O08.002","O08.004","O08.005","O08.100x002","O08.100x004","O08.101","O08.102","O08.103","O08.200x001","O08.200x003","O08.202","O08.203","O08.204","O08.300x003","O08.301","O08.400x003","O08.401","O08.500","O08.600x004","O08.600x006","O08.601","O08.602","O08.603","O08.604","O08.700","O08.800x007","O08.801","O08.802","O08.803","O08.805","O20.000"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合OS2入组条件，匹配规则：主诊断匹配");
                
            if (MDCO_DRG.OS29_group(record)){
                return "OS29";
            }

            return "OS2";
        }else{
            return "";
        }
    }
}

