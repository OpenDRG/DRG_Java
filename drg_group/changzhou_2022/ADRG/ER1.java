package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCE_DRG;


public class ER1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C33.x00","C34.000","C34.000x002","C34.000x003","C34.001","C34.100x003","C34.100x004","C34.101","C34.102","C34.201","C34.300x003","C34.300x004","C34.301","C34.800","C34.800x001","C34.800x002","C34.800x003","C34.801","C34.802","C34.803","C34.900x001","C34.900x004","C34.900x005","C34.900x006","C34.900x008","C34.901","C34.902","C38.100","C38.200","C38.300","C38.400","C38.400x003","C38.401","C39.800","C39.900x001","C45.000","C45.701","C45.702","C46.701","C77.100","C77.100x004","C77.101","C77.102","C77.103","C77.104","C77.105","C78.000","C78.000x003","C78.001","C78.002","C78.003","C78.100","C78.200","C78.304","C78.306","C79.810","D02.100","D02.200x002","D02.201","D02.300","D02.400","D14.200","D14.300x001","D14.301","D14.302","D14.400","D17.400x004","D17.400x005","D38.100x001","D38.100x002","D38.100x003","D38.101","D38.103","D38.105","D38.200x001","D38.201","D38.600x001","D38.601"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合ER1入组条件，匹配规则：主诊断匹配");
            
                
            if (MDCE_DRG.ER11_group(record)){
                return "ER11";
            }
    
            if (MDCE_DRG.ER13_group(record)){
                return "ER13";
            }
    
            if (MDCE_DRG.ER15_group(record)){
                return "ER15";
            }

            return "";
        }else{
            return "";
        }
    }
}

