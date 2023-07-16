package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCS_DRG;


public class SV1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A01.000","A01.000x004","A01.000x006","A01.000x007","A01.000x017","A01.000x018","A01.000x019","A01.000x020","A01.100","A01.200","A01.300","A01.400","A02.800","A02.900x002","A02.900x004","A02.901","A18.800x001","A19.100","A19.200","A19.200x001","A19.900","A19.900x004","A19.900x005","A19.901","A19.902","A20.000","A20.000x001","A20.801","A20.802","A20.803","A20.900x002","A21.000","A21.700","A21.800","A21.800x001","A21.900x001","A22.100x003","A22.900","A23.000","A23.000x001","A23.100","A23.100x001","A23.200","A23.300","A23.800","A23.900x001","A23.900x004","A24.000","A24.000x002","A24.001","A24.002","A24.101","A24.102","A24.201","A24.202","A24.300","A24.400","A25.000x001","A25.100x001","A25.900","A26.800x001","A26.900","A26.900x002","A27.000","A27.800","A27.800x001","A27.900x002","A28.000","A28.200","A28.801","A28.900","A30.000x001","A30.100x001","A30.200","A30.200x001","A30.300","A30.300x001","A30.300x002","A30.400","A30.400x001","A30.400x002","A30.500","A30.500x001","A30.800","A30.900","A30.900x002","A30.900x003","A30.900x004","A31.800x001","A31.800x002","A31.800x003","A31.800x004","A31.800x005","A31.800x006","A31.801","A31.803","A31.900x001","A31.901","A32.900","A35.x00x001","A36.900","A36.900x002","A38.x00","A38.x00x010","A38.x00x011","A38.x00x013","A38.x00x014","A42.900","A43.800x001","A43.900","A44.800","A44.900","A48.400","A48.800","A48.800x002","A49.000","A49.001","A49.002","A49.003","A49.004","A49.100x004","A49.100x005","A49.100x006","A49.101","A49.102","A49.103","A49.200","A49.201","A49.300","A49.301","A49.800x003","A49.800x014","A49.800x015","A49.800x019","A49.800x020","A49.800x023","A49.801","A49.802","A49.803","A49.804","A49.805","A49.806","A49.807","A49.808","A49.810","A49.811","A49.812","A49.813","A49.814","A49.815","A49.817","A49.900","A49.901","A49.902","Z03.000"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合SV1入组条件，匹配规则：主诊断匹配");
            
                
            if (MDCS_DRG.SV11_group(record)){
                return "SV11";
            }
    
            if (MDCS_DRG.SV13_group(record)){
                return "SV13";
            }
    
            if (MDCS_DRG.SV15_group(record)){
                return "SV15";
            }

            return "";
        }else{
            return "";
        }
    }
}

