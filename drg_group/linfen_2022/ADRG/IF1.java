package drg_group.linfen_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;
import drg_group.linfen_2022.DRG.MDCI_DRG;

public class IF1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"77.0200","77.0301","77.0302","77.1200x001","77.1200x002","77.1300x001","77.1301","77.1302","77.2200x001","77.2200x002","77.2200x003","77.2300x001","77.2300x002","77.2301","77.2302","77.3200","77.3301","77.3302","77.6100x008","77.6101","77.6102","77.6103","77.6104","77.6201","77.6301","77.6302","77.7200","77.7301","77.7302","77.8100x007","77.8100x009","77.8101","77.8102","77.8103","77.8104","77.8105","77.8106","77.8107","77.8200","77.8200x002","77.9101","77.9102","77.9103","77.9104","77.9105","77.9106","77.9200","77.9301","77.9302","78.0200x001","78.0200x002","78.0300x004","78.0300x005","78.0301","78.0302","78.1201","78.1301","78.1302","78.2200","78.2300x001","78.2301","78.2302","78.2903","78.3200x001","78.3301","78.3302","78.4201","78.4301","78.4302","78.5200x003","78.5200x004","78.5200x005","78.5200x006","78.5201","78.5300x002","78.5300x003","78.5300x004","78.5300x005","78.5300x006","78.5300x007","78.5300x008","78.5300x009","78.5301","78.5302","78.7200","78.7301","78.7302","78.9100","78.9200","78.9301","78.9302","79.0100x001","79.0201","79.0202","79.0901","79.1100x002","79.1100x003","79.1100x004","79.1100x005","79.1200x003","79.1200x004","79.1200x005","79.1200x006","79.1200x007","79.1200x008","79.1200x009","79.1200x010","79.1201","79.1202","79.1900x006","79.1900x007","79.1900x008","79.1900x009","79.1902","79.2101","79.2201","79.2202","79.2901","79.3100x004","79.3100x005","79.3100x006","79.3100x007","79.3100x008","79.3100x009","79.3101","79.3200x001","79.3200x002","79.3200x009","79.3200x010","79.3200x011","79.3200x012","79.3200x013","79.3200x014","79.3201","79.3202","79.3900x028","79.3900x030","79.3900x040","79.3900x041","79.3900x042","79.3900x044","79.3900x051","79.3902","79.3904","79.4101","79.4201","79.4202","79.5100","79.5201","79.5202","79.6100","79.6201","79.6202","79.6901","79.9100","79.9200","84.0500","84.0701","84.2301","84.2302","84.2303","84.2304","84.2401","84.4101","84.4102","84.4201","84.4202","84.4300"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IF1入组条件，匹配规则：主手术匹配");
                
            if (MDCI_DRG.IF13_group(record)){
                return "IF13";
            }
    
            if (MDCI_DRG.IF15_group(record)){
                return "IF15";
            }

            return "IF1";
        }else{
            return "";
        }
    }
}

