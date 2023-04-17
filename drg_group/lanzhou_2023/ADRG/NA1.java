package drg_group.lanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2023.Base;
import drg_group.lanzhou_2023.MedicalRecord;
import drg_group.lanzhou_2023.DRG.MDCN_DRG;

public class NA1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C79.800x211","C54.900","D07.301","C53.100","D07.000","C79.800x218","C54.001","C57.100","C79.800x205","D39.000x002","C79.813","C79.822","C79.800x214","C79.800x222","C57.000x002","C79.800x223","C79.600","C57.400","D06.000","C57.900","D07.200","D06.100","C57.800x005","C46.700x001","C79.800x206","C79.800x220","C57.301","C58.x00x003","C56.x00x003","C79.800x219","C79.800x209","C57.300","D39.900x001","C57.000","C54.300","C79.800x216","D07.303","C79.823","D07.100","C55.x00","C57.801","C53.900","C57.101","C57.702","C77.500x003","C57.802","C57.701","C79.833","C58.x00x002","D39.100x003","C57.200","C53.800","D39.700x002","C57.800x004","C54.100","C53.000","C79.814","C79.812","C51.800","C57.700","C54.000","C54.200","C51.900","C52.x00","C56.x00","C51.200","D06.900","C79.800x215","C51.000","C79.800x213","C79.800x202","C57.300x001","C51.100","C45.100","C58.x00","D39.700x001","C53.801","D39.000x001","C57.803","C54.800","C51.001","D07.302"};
        String[] adrg_zd1={};
        String[] adrg_ss={"67.4x00x002","68.4900x006","68.6100x001","68.6100x002","68.6101","68.6900x001","68.6900x001","68.6900x002","68.6901","68.6902","68.7100x001","68.7900x003","68.7901","68.8x01","71.5x00x001","71.5x00x003","71.5x00x004","54.4x00x006","54.4x00x007","54.4x04","54.4x16","68.4101","68.4102","68.4902","68.4903","68.5101","70.4x01","40.2900x023","40.2905","40.2907","40.2909","40.5000","40.5200","40.5300","40.5301","40.5400x001","40.5907","40.5908","40.5909","40.5910","40.5911","40.5912"};
        String[] adrg_ss1={"1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","1","2","2","2","2","2","2","2","2","2","2","3","3","3","3","3","3","3","3","3","3","3","3","3","3","3"};
        
        Set<String> ss_matched=new HashSet<String>();
        Base.Intersect(record.ssList,adrg_ss).forEach(x->{
            int i=0;
            for (String s:adrg_ss){
                if (s.equals(x)){
                    ss_matched.add(adrg_ss1[i]);
                }
                i++;
            }
        });
  
        if (true && Base.contains(adrg_zd,record.zdList[0]) && (ss_matched.contains("1") || (ss_matched.contains("2") && ss_matched.contains("3")))){
            Base.groupMessages.putMessage(record.Index,"符合NA1入组条件，匹配规则：主诊断匹配、NA1特殊规则、多手术处理");
                
            if (MDCN_DRG.NA15_group(record)){
                return "NA15";
            }
    
            if (MDCN_DRG.NA1A_group(record)){
                return "NA1A";
            }

            return "NA1";
        }else{
            return "";
        }
    }
}

