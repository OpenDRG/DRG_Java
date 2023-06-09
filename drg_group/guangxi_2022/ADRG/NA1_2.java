package drg_group.guangxi_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.guangxi_2022.Base;
import drg_group.guangxi_2022.MedicalRecord;
import drg_group.guangxi_2022.DRG.MDCN_DRG;

public class NA1_2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C45.100","C46.700x001","C51.000","C51.001","C51.100","C51.200","C51.800","C51.900","C52.x00","C53.000","C53.100","C53.800","C53.801","C53.900","C54.000","C54.001","C54.100","C54.200","C54.300","C54.800","C54.900","C55.x00","C56.x00","C56.x00x003","C57.000","C57.000x002","C57.100","C57.101","C57.200","C57.300","C57.300x001","C57.301","C57.400","C57.700","C57.701","C57.702","C57.800x004","C57.800x005","C57.801","C57.802","C57.803","C57.900","C58.x00","C58.x00x002","C58.x00x003","C77.500x003","C79.600","C79.800x202","C79.800x205","C79.800x206","C79.800x209","C79.800x211","C79.800x213","C79.800x214","C79.800x215","C79.800x216","C79.800x218","C79.800x219","C79.800x220","C79.800x222","C79.800x223","C79.812","C79.813","C79.814","C79.822","C79.823","C79.833","D06.000","D06.100","D06.900","D07.000","D07.100","D07.200","D07.301","D07.302","D07.303","D39.000x001","D39.000x002","D39.100x003","D39.700x001","D39.700x002","D39.900x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={"54.4x00x006","54.4x00x007","54.4x04","54.4x16","68.4101","68.4102","68.4902","68.4903","68.5101","70.4x01"};
        String[] adrg_ss1={"40.2900x023","40.2905","40.2907","40.2909","40.5000","40.5200","40.5300","40.5301","40.5400x001","40.5907","40.5908","40.5909","40.5910","40.5911","40.5912"};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss) && Base.intersect(record.ssList,adrg_ss1)){
            Base.groupMessages.putMessage(record.Index,"符合NA1_2入组条件，匹配规则：主诊断匹配、双手术匹配");
                
            if (MDCN_DRG.NA11_group(record)){
                return "NA11";
            }
    
            if (MDCN_DRG.NA13_group(record)){
                return "NA13";
            }
    
            if (MDCN_DRG.NA15_group(record)){
                return "NA15";
            }

            return "";
        }else{
            return "";
        }
    }
}

