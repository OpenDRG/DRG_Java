package drg_group.tongchuan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.tongchuan_2022.Base;
import drg_group.tongchuan_2022.MedicalRecord;
import drg_group.tongchuan_2022.DRG.MDCG_DRG;

public class GR1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C15.000","C15.100","C15.100x002","C15.100x003","C15.100x004","C15.200","C15.300","C15.400","C15.500","C15.800x001","C15.800x002","C15.800x003","C15.800x004","C15.801","C15.802","C15.900","C15.900x003","C16.000","C16.000x003","C16.000x004","C16.001","C16.002","C16.100","C16.200","C16.301","C16.400","C16.401","C16.402","C16.500","C16.600","C16.800","C16.800x002","C16.800x003","C16.801","C16.802","C16.803","C16.804","C16.900","C16.900x003","C16.902","C16.903","C17.000","C17.100","C17.200","C17.300","C17.800","C17.801","C17.900","C17.900x002","C18.000","C18.001","C18.100","C18.200","C18.300","C18.400","C18.500","C18.600","C18.700","C18.800x002","C18.801","C18.802","C18.803","C18.900","C18.900x001","C18.901","C19.x00","C19.x01","C20.x00","C20.x00x003","C20.x01","C21.000","C21.100","C21.101","C21.200","C21.800","C21.801","C21.802","C26.000","C26.800","C26.800x001","C26.800x002","C26.800x003","C26.900","C26.901","C45.100","C45.101","C45.102","C45.700x002","C45.700x005","C45.703","C45.705","C48.000","C48.100","C48.103","C48.104","C48.105","C48.200","C48.201","C48.800","C76.200","C76.304","C77.106","C77.200x001","C77.201","C77.207","C77.208","C78.400","C78.401","C78.402","C78.403","C78.500x004","C78.500x006","C78.500x008","C78.501","C78.502","C78.503","C78.504","C78.505","C78.600x004","C78.601","C78.602","C78.603","C78.800x005","C78.800x010","C78.800x013","C78.800x014","C78.801","C78.802","C78.803","C78.804","C78.809","C79.800x834","C79.809","D00.100","D00.200","D00.200x002","D00.200x003","D01.000","D01.100","D01.200","D01.300x001","D01.301","D01.401","D01.402","D01.403","D01.404","D01.405","D01.900","D09.700x002"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GR1入组条件，匹配规则：主诊断匹配");
                
            if (MDCG_DRG.GR11_group(record)){
                return "GR11";
            }
    
            if (MDCG_DRG.GR15_group(record)){
                return "GR15";
            }

            return "GR1";
        }else{
            return "";
        }
    }
}

