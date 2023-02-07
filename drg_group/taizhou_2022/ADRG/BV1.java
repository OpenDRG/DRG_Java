package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCB_DRG;

public class BV1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"B69.002+G94.8*","G40.000","G40.001","G40.002","G40.003","G40.004","G40.005","G40.100","G40.100x001","G40.100x002","G40.100x003","G40.100x004","G40.100x005","G40.100x006","G40.100x007","G40.100x008","G40.100x009","G40.100x010","G40.100x011","G40.100x012","G40.101","G40.102","G40.103","G40.200","G40.200x001","G40.200x002","G40.200x003","G40.200x004","G40.200x005","G40.200x006","G40.200x010","G40.200x011","G40.200x013","G40.201","G40.202","G40.203","G40.204","G40.300","G40.300x001","G40.300x002","G40.300x003","G40.300x004","G40.300x006","G40.300x007","G40.300x008","G40.300x009","G40.300x010","G40.300x013","G40.300x014","G40.300x017","G40.300x018","G40.300x019","G40.300x020","G40.300x023","G40.300x025","G40.301","G40.302","G40.303","G40.304","G40.305","G40.306","G40.307","G40.308","G40.309","G40.310","G40.311","G40.400","G40.400x001","G40.400x002","G40.400x003","G40.400x005","G40.400x008","G40.401","G40.402","G40.403","G40.404","G40.405","G40.406","G40.500","G40.500x001","G40.500x003","G40.500x008","G40.500x009","G40.502","G40.503","G40.504","G40.505","G40.600","G40.601","G40.700","G40.700x001","G40.700x002","G40.800x003","G40.800x004","G40.800x008","G40.800x010","G40.800x013","G40.801","G40.802","G40.803","G40.804","G40.805","G40.900","G40.900x005","G40.903+F02.8*","G41.000","G41.000x002","G41.000x003","G41.000x004","G41.000x005","G41.001","G41.100","G41.101","G41.200","G41.200x002","G41.200x003","G41.200x004","G41.801","G41.802","G41.806","G41.807","G41.900","G83.803","R56.800x001","R56.800x003","R56.800x005","R56.801","R56.802","R56.803","T90.503"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BV1入组条件，匹配规则：主诊断匹配");
                
            if (MDCB_DRG.BV10_group(record)){
                return "BV10";
            }
    
            if (MDCB_DRG.BV11_group(record)){
                return "BV11";
            }
    
            if (MDCB_DRG.BV13_group(record)){
                return "BV13";
            }
    
            if (MDCB_DRG.BV15_group(record)){
                return "BV15";
            }

            return "BV1";
        }else{
            return "";
        }
    }
}

