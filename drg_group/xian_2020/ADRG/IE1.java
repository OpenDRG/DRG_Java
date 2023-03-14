package drg_group.xian_2020.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;
import drg_group.xian_2020.DRG.MDCI_DRG;

public class IE1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"77.0900x005","77.0901","77.1901","77.2900x001","77.2900x008","77.2901","77.3901","77.3902","77.3903","77.3904","77.3905","77.6900x001","77.6900x004","77.6900x025","77.6900x057","77.6900x058","77.6901","77.7901","77.8502","77.8900x002","77.8900x004","77.8900x005","77.8900x017","77.8901","77.8902","77.9900x003","77.9901","78.0900x012","78.0900x016","78.0900x017","78.0900x022","78.0900x023","78.0900x024","78.0901","78.1901","78.4900x007","78.4900x008","78.4900x009","78.4901","78.5900x027","78.5900x028","78.5900x029","78.5900x030","78.5901","78.7901","79.0902","79.1903","79.3900x025","79.3900x026","79.3900x027","79.3900x037","79.3900x039","79.3900x043","79.3900x045","79.3900x046","79.3900x048","79.3900x050","79.3900x056","79.3900x057","79.3900x058","79.3901","80.8900x001","81.4001","84.1901"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IE1入组条件，匹配规则：主手术匹配");
                
            if (MDCI_DRG.IE19_group(record)){
                return "IE19";
            }

            return "IE1";
        }else{
            return "";
        }
    }
}

