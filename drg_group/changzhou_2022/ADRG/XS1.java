package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCX_DRG;

public class XS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"R10.200x001","R10.201","R11.x01","R11.x02","R11.x03","R13.x00","R17.000","R17.001","R18.x00","R18.x00x001","R18.x00x003","R18.x00x005","R18.x01","R19.000x003","R19.000x008","R19.000x009","R19.000x012","R19.000x013","R19.000x016","R19.001","R19.002","R19.003","R19.004","R23.000","R23.100","R23.100x002","R23.101","R23.200x002","R41.000","R41.001","R41.100","R41.200","R41.300x001","R41.800x002","R47.000x001","R47.000x005","R47.000x006","R47.000x008","R47.001","R47.002","R47.003","R47.004","R47.100x001","R47.100x002","R47.101","R47.801","R47.802","R49.800x003","R49.801","R52.000","R52.100","R52.200","R52.900","R52.901","R53.x00x001","R53.x00x002","R53.x00x003","R53.x00x004","R53.x00x005","R53.x00x006","R53.x00x008","R53.x00x009","R53.x00x010","R53.x00x011","R53.x00x012","R54.x00","R54.x00x002","R54.x00x003","R54.x01","R60.000","R60.001","R60.100","R60.900","R60.900x003","R60.901","R61.000","R61.001","R61.100","R61.900","R61.901","R62.000x002","R62.000x003","R62.801","R62.802","R62.803","R63.000","R63.100","R63.100x002","R63.200","R63.200x002","R63.300x002","R63.300x003","R63.400","R63.500","R64.x00x002","R68.100x001","R68.100x002","R68.101","R68.200","R68.300","R68.300x002","R68.800x002","R68.800x003","R70.000","R70.100","R70.101","R74.000x001","R74.001","R74.800x003","R74.800x005","R74.800x006","R74.800x007","R74.800x008","R74.801","R74.802","R74.803","R74.900x001","R76.000x001","R76.100","R76.100x001","R76.200","R76.200x002","R76.800x001","R76.802","R76.900","R77.000","R77.100","R77.101","R77.200","R77.200x001","R77.800x001","R77.800x002","R77.800x003","R77.800x004","R77.800x006","R77.801","R77.802","R77.803","R77.900","R77.901","R79.000","R79.000x001","R79.000x002","R79.000x003","R79.000x004","R79.000x006","R79.800x003","R79.800x005","R79.803","R79.805","R82.100","R82.500x001","R84.900x004","R84.901","R84.902","R84.903","R84.904","R85.901","R85.902","R87.900x001","R87.900x002","R87.900x003","R89.900x001","R89.900x002","R89.900x003","R93.501","R93.800x002","R93.800x003","T69.900","T70.400","T70.900","T73.100","T73.800","T73.900","T78.900","Z01.501","Z01.502","Z01.503","Z01.900","Z04.601","Z04.800","Z04.900"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合XS1入组条件，匹配规则：主诊断匹配");
                
            if (MDCX_DRG.XS10_group(record)){
                return "XS10";
            }
    
            if (MDCX_DRG.XS11_group(record)){
                return "XS11";
            }
    
            if (MDCX_DRG.XS13_group(record)){
                return "XS13";
            }
    
            if (MDCX_DRG.XS15_group(record)){
                return "XS15";
            }

            return "XS1";
        }else{
            return "";
        }
    }
}

