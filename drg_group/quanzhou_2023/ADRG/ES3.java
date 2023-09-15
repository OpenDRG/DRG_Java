package drg_group.quanzhou_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;
import drg_group.quanzhou_2023.DRG.MDCE_DRG;


public class ES3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A01.000x005+J17.0*","A02.201+J17.0*","A06.500+J99.8*","A06.500x002+J99.8*","A06.501+J99.8*","A06.502+J17.3*","A21.201+J17.0*","A22.102+J17.0*","A43.000x001+J99.8*","A52.704+J99.8*","A54.806+J17.0*","B01.200+J17.1*","B05.200+J17.1*","B06.801+J17.1*","B25.000+J17.1*","B58.300+J17.3*","B65.902+J99.8*","B65.907+I52.1*","B66.401+J99.8*","B67.100x001+J99.8*","B77.801+J17.3*","J09.x00","J09.x01","J09.x02","J10.000","J10.000x001","J10.001","J11.000x001","J12.000","J12.100","J12.200","J12.300","J12.800","J12.900","J13.x00","J14.x00","J15.000","J15.000x002","J15.100","J15.101","J15.200","J15.300","J15.400","J15.402","J15.500","J15.600x002","J15.600x003","J15.600x005","J15.600x006","J15.601","J15.602","J15.700","J15.800x001","J15.800x002","J15.900","J15.901","J15.902","J15.903","J16.000","J16.800x001","J18.000","J18.000x001","J18.000x002","J18.001","J18.002","J18.100","J18.200","J18.800x001","J18.800x002","J18.800x004","J18.800x006","J18.800x012","J18.801","J18.802","J18.803","J18.900","J18.901","J18.902","J18.903","J22.x00","J69.000","J69.000x002","J69.000x004","J69.001","J69.100x001","J69.101","J69.800x001","J85.000x002","J85.001","J85.002","J85.100","J85.200","J85.300","J86.000","J86.000x006","J86.000x012","J86.000x013","J86.001","J86.002","J86.003","J86.004","J86.005","J86.006","J86.007","J86.008","J86.009","J86.010","J86.011","J86.012","J86.013","J86.014","J86.015","J86.016","J86.017","J86.018","J86.019","J86.020","J86.901","J86.902","J86.903","J95.800x016","J95.802","J98.414","J98.501","J98.502","J98.503","J98.700","J98.802"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合ES3入组条件，匹配规则：主诊断匹配");
            
                
            if (MDCE_DRG.ES31_group(record)){
                return "ES31";
            }
    
            if (MDCE_DRG.ES33_group(record)){
                return "ES33";
            }
    
            if (MDCE_DRG.ES35_group(record)){
                return "ES35";
            }

            return "";
        }else{
            return "";
        }
    }
}

