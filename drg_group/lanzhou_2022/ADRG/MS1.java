package drg_group.lanzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2022.Base;
import drg_group.lanzhou_2022.MedicalRecord;
import drg_group.lanzhou_2022.DRG.MDCM_DRG;

public class MS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A06.800x004+N51.2*","A18.100x018+N51.8*","A18.100x020+N51.8*","A18.109+N51.0*","A18.110+N51.8*","A18.116+N51.8*","A18.117+N51.1*","A18.118+N51.1*","A18.119+N51.8*","A54.202+N51.0*","A54.203+N51.1*","A54.204+N51.1*","A56.102+N51.1*","A56.103+N51.1*","A59.000x003+N51.0*","A60.000x004+N51.8*","A60.003+N51.8*","B26.000+N51.1*","B37.402+N51.2*","N41.000","N41.100","N41.101","N41.200","N41.300","N41.800","N41.900x001","N41.900x002","N43.100","N43.101","N45.000","N45.001","N45.002","N45.901","N45.902","N45.903","N45.904","N45.905","N45.906","N45.907","N45.908","N48.001","N48.100","N48.102","N48.201","N48.202","N48.203","N48.204","N49.001","N49.002","N49.101","N49.102","N49.103","N49.104","N49.201","N49.202","N49.203","N49.204","N49.205","N49.800","T83.600","T83.601"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合MS1入组条件，匹配规则：主诊断匹配");
                
            if (MDCM_DRG.MS1A_group(record)){
                return "MS12";
            }
    
            if (MDCM_DRG.MS15_group(record)){
                return "MS15";
            }

            return "MS1";
        }else{
            return "";
        }
    }
}

