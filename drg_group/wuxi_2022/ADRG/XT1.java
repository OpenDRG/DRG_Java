package drg_group.wuxi_2022.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.DRG.MDCX_DRG;

public class XT1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"T95.000x001","T95.000x002","T95.000x003","T95.000x004","T95.000x005","T95.000x006","T95.000x007","T95.000x008","T95.000x009","T95.000x010","T95.000x011","T95.000x012","T95.001","T95.002","T95.100x001","T95.100x002","T95.100x003","T95.101","T95.102","T95.103","T95.200x001","T95.200x002","T95.200x003","T95.200x004","T95.200x005","T95.200x006","T95.201","T95.202","T95.300x001","T95.300x002","T95.300x003","T95.301","T95.400","T95.800x001","T95.800x002","T95.800x003","T95.800x004","T95.800x005","T95.800x006","T95.800x007","T95.800x008","T95.801","T95.802","T95.803","T95.900","Z42.000","Z42.900","Z43.100","Z43.101","Z43.102","Z43.200","Z43.201","Z43.300","Z43.301","Z43.302","Z43.400x002","Z43.400x003","Z43.400x004","Z43.400x005","Z43.401","Z43.402","Z43.403","Z43.500","Z43.600x002","Z43.601","Z43.602","Z43.603","Z43.604","Z43.700","Z43.801","Z43.802","Z43.900x001","Z44.200x002","Z44.300","Z45.101","Z45.200","Z45.201","Z45.202","Z45.802","Z45.803","Z45.804","Z45.805","Z45.806","Z45.807","Z45.900","Z46.500x001","Z46.501","Z46.502","Z46.503","Z46.700","Z46.701","Z46.900","Z47.800x003","Z47.800x004","Z47.800x005","Z47.800x006","Z47.800x007","Z47.800x008","Z47.800x009","Z47.800x010","Z47.800x011","Z47.800x012","Z47.800x013","Z47.800x014","Z47.800x015","Z47.800x016","Z47.800x017","Z47.800x018","Z47.800x019","Z47.800x020","Z47.800x021","Z47.800x022","Z47.800x023","Z47.800x024","Z47.800x025","Z47.800x026","Z47.800x027","Z47.800x028","Z47.800x029","Z47.800x030","Z47.800x031","Z47.800x032","Z47.800x033","Z47.800x034","Z47.800x035","Z47.800x036","Z47.900","Z48.000x001","Z48.000x002","Z48.900x001","Z54.900x001"};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合XT1入组条件，匹配规则：主诊断匹配");
                
            if (MDCX_DRG.XT13_group(record)){
                return "XT13";
            }
    
            if (MDCX_DRG.XT15_group(record)){
                return "XT15";
            }

            return "XT1";
        }else{
            return "";
        }
    }
}

