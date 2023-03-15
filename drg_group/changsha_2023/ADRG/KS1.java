package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCK_DRG;

public class KS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"E10.000","E10.000x001","E10.000x002","E10.000x005","E10.000x006","E10.001","E10.002","E10.003","E10.100","E10.100x012","E10.100x031","E10.100x051","E10.100x061","E10.101","E10.102","E10.103","E10.600x042","E10.600x043","E10.600x051","E10.700","E10.700x021","E10.700x024","E10.700x025","E10.800","E10.900","E10.900x003","E10.900x004","E10.901","E11.000","E11.000x001","E11.000x005","E11.000x006","E11.001","E11.002","E11.003","E11.100x051","E11.101","E11.102","E11.103","E11.600x042","E11.600x043","E11.600x051","E11.700x011","E11.700x021","E11.700x024","E11.700x025","E11.700x033","E11.800","E11.900","E12.000","E12.100","E12.600","E12.700","E12.800","E12.900","E13.000","E13.101","E13.102","E13.600","E13.700","E13.800","E13.900x003","E13.900x006","E13.901","E13.902","E13.903","E13.904","E13.905","E13.906","E13.907","E14.000","E14.000x001","E14.000x002","E14.000x003","E14.000x004","E14.000x005","E14.000x006","E14.100","E14.100x012","E14.100x031","E14.100x051","E14.600x042","E14.600x043","E14.600x051","E14.700","E14.700x011","E14.700x021","E14.700x024","E14.700x025","E14.800","E14.900x001","E16.800x011","E16.800x021","E89.800x002","R73.000","R73.001","R73.002","R73.003","R73.900x001","R81.x00x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合KS1入组条件，匹配规则：主诊断匹配");
                
            if (MDCK_DRG.KS11_group(record)){
                return "KS11";
            }
    
            if (MDCK_DRG.KS13_group(record)){
                return "KS13";
            }
    
            if (MDCK_DRG.KS15_group(record)){
                return "KS15";
            }

            return "KS1";
        }else{
            return "";
        }
    }
}

