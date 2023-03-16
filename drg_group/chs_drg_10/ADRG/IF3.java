package drg_group.chs_drg_10.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;
import drg_group.chs_drg_10.DRG.MDCI_DRG;

public class IF3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"77.0500","77.1500x001","77.1500x002","77.1500x003","77.1500x005","77.1500x006","77.1501","77.1502","77.2500x001","77.2500x002","77.2500x003","77.2500x004","77.2500x005","77.2500x006","77.2500x007","77.2500x008","77.2500x009","77.3500","77.6501","77.7500","77.8500","77.8501","77.9500","78.0500x001","78.0500x002","78.0501","78.1501","78.3500x001","78.4501","78.5500x003","78.5500x005","78.5500x006","78.5500x007","78.5500x008","78.5501","78.7500","78.9500","79.0500x002","79.1500x006","79.1500x007","79.1500x008","79.2501","79.3500x016","79.3500x017","79.3500x018","79.3500x019","79.3500x020","79.3501","79.4501","79.5501","79.6500","79.9500","84.1701"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IF3入组条件，匹配规则：主手术匹配");
                
            if (MDCI_DRG.IF39_group(record)){
                return "IF39";
            }

            return "IF3";
        }else{
            return "";
        }
    }
}

