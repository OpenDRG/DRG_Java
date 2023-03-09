package drg_group.lanzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2022.Base;
import drg_group.lanzhou_2022.MedicalRecord;
import drg_group.lanzhou_2022.DRG.MDCE_DRG;

public class EV1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"R04.200","R04.800x002","R04.802","R04.900","R05.x00","R05.x01","R05.x02","R06.000","R06.000x002","R06.000x003","R06.100","R06.200","R06.300","R06.301","R06.400","R06.600","R06.800x005","R06.801","R06.802","R06.803","R06.804","R06.805","R06.806","R09.000","R09.200","R09.201","R09.300","R09.800x091","R09.800x092","R09.800x093","R09.800x094","R09.800x095","R09.801","R91.x00x001","R91.x00x005","R91.x03","R93.801","R93.804","R93.805","R94.200","R94.204"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合EV1入组条件，匹配规则：主诊断匹配");
                
            if (MDCE_DRG.EV11_group(record)){
                return "EV11";
            }
    
            if (MDCE_DRG.EV13_group(record)){
                return "EV13";
            }
    
            if (MDCE_DRG.EV15_group(record)){
                return "EV15";
            }

            return "EV1";
        }else{
            return "";
        }
    }
}

