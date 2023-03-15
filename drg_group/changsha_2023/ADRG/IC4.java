package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCI_DRG;

public class IC4 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"77.0600","77.1600x001","77.1601","77.2700x001","77.2700x003","77.2701","77.2702","77.2703","77.2900x007","77.6601","77.6900x013","77.8300x002","77.8300x005","77.8300x006","77.8300x007","77.8301","77.8302","77.8303","77.8600","77.9600","78.0600x001","78.0600x003","78.1601","78.4600x002","78.4600x003","79.2900x004","79.6900x002","79.7100","79.7200","79.7500","79.7600","79.7600x001","79.7700","79.7900x005","79.7900x007","79.8100x003","79.8200","79.8200x001","79.8201","79.8500","79.8500x001","79.8700","79.8800x001","79.8800x002","79.8900x001","79.8900x008","79.8901","80.0100x001","80.0100x002","80.0101","80.0200x001","80.0200x002","80.0201","80.0500x001","80.0500x003","80.0501","80.0600x001","80.0600x002","80.0601","80.0700x001","80.0700x002","80.0701","80.1100","80.1100x001","80.1101","80.1200","80.1200x001","80.1200x002","80.1201","80.1500","80.1500x001","80.1500x002","80.1501","80.1600","80.1600x001","80.1601","80.1602","80.1603","80.1604","80.1700","80.1700x001","80.1701","80.1702","80.4101","80.4102","80.4201","80.4202","80.4500x001","80.4501","80.4502","80.4601","80.4602","80.4603","80.4700x002","80.4701","80.4702","80.6x00x002","80.6x00x010","80.6x00x011","80.6x01","80.6x02","80.6x03","80.6x04","80.6x05","80.6x06","80.6x07","80.6x08","80.7100","80.7101","80.7200","80.7201","80.7500","80.7501","80.7600","80.7601","80.7700","80.7701","80.8101","80.8102","80.8200x003","80.8201","80.8202","80.8501","80.8502","80.8600x009","80.8601","80.8602","80.8700x007","80.8701","80.8702","80.8900x001","80.8900x004","80.8900x005","80.8901","80.9100","80.9200","80.9500","80.9600","80.9700","81.4401","81.4402","81.4403","84.0600","84.0800","84.0900x001","84.1300","84.1400","84.1600","84.1800","84.4500"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IC4入组条件，匹配规则：主手术匹配");
                
            if (MDCI_DRG.IC49_group(record)){
                return "IC49";
            }

            return "IC4";
        }else{
            return "";
        }
    }
}

