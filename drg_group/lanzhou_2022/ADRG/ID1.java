package drg_group.lanzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2022.Base;
import drg_group.lanzhou_2022.MedicalRecord;
import drg_group.lanzhou_2022.DRG.MDCI_DRG;

public class ID1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"77.5200","77.5900x001","79.7801","79.7802","79.8801","79.8802","79.8803","80.0800x001","80.0800x002","80.0801","80.1800x003","80.1801","80.1802","80.4800x002","80.4800x005","80.4801","80.4802","80.4803","80.4804","80.7800","80.7800x002","80.7801","80.8800x003","80.8800x004","80.8801","80.8802","80.9800","80.9800x001","81.1400x002","81.1401","81.1700x001","81.1700x003","81.9301","81.9302","84.1101","84.1102","84.1103"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合ID1入组条件，匹配规则：主手术匹配");
                
            if (MDCI_DRG.ID1A_group(record)){
                return "ID12";
            }
    
            if (MDCI_DRG.ID15_group(record)){
                return "ID15";
            }

            return "ID1";
        }else{
            return "";
        }
    }
}

