package drg_group.handan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;
import drg_group.handan_2022.DRG.MDCS_DRG;

public class SU1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A92.000","A92.001","A92.100","A92.200","A92.300","A92.300x001","A92.400","A92.800","A92.900","A93.000","A93.100","A93.200","A93.802","A93.802","A94.x01","A95.000","A95.100","A95.900","A96.000","A96.100","A96.100x001","A96.200","A96.800","A96.900","A97.000","A97.100","A97.200","A97.900","A98.000","A98.100","A98.200","A98.300","A98.400","A98.400x001","A98.500x001+N08.0*","A98.800","A99.x00","B00.700","B00.900x005","B00.900x007","B00.901","B00.902","B01.900x001","B01.900x002","B02.700","B02.800x001","B02.900x002","B02.900x003","B03.x00x002","B03.x00x003","B03.x00x004","B04.x00","B05.800x008","B05.800x010","B05.900x001","B05.900x002","B05.900x005","B05.901","B06.900x001","B08.000x001","B08.000x002","B08.000x004","B08.400x003","B08.401","B08.800x006","B08.801","B25.900x001","B25.900x002","B27.000","B27.001","B27.100","B27.800","B27.900x001","B33.100","B33.300x001","B33.800","B33.801","B33.802","B34.000","B34.100","B34.101","B34.102","B34.200","B34.300","B34.300x002","B34.400","B34.400x001","B34.400x002","B34.800x002","B34.800x003","B34.800x004","B34.801","B34.900","J10.800x002"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合SU1入组条件，匹配规则：主诊断匹配");
                
            if (MDCS_DRG.SU19_group(record)){
                return "SU19";
            }

            return "";
        }else{
            return "";
        }
    }
}

