package drg_group.linfen_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;
import drg_group.linfen_2022.DRG.MDCB_DRG;

public class BR2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"G45.000","G45.001","G45.003","G45.100","G45.100x002","G45.101","G45.102","G45.200","G45.400","G45.800","G45.800x002","G45.800x003","G45.800x004","G45.801","G45.802","G45.900","I63.000","I63.001","I63.002","I63.003","I63.100","I63.101","I63.102","I63.103","I63.200","I63.201","I63.202","I63.203","I63.204","I63.205","I63.206","I63.207","I63.208","I63.300","I63.302","I63.401","I63.402","I63.500","I63.500x002","I63.501","I63.502","I63.600x001","I63.801","I63.900","I63.900x007","I63.901","I63.902","I63.903","I63.904","I63.905","I63.906","I63.907","I63.908","I63.909","I65.000x004","I65.001","I65.002","I65.003","I65.100x004","I65.101","I65.102","I65.103","I65.200x001","I65.200x009","I65.200x010","I65.200x011","I65.200x012","I65.200x013","I65.200x014","I65.200x015","I65.201","I65.202","I65.203","I65.204","I65.205","I65.206","I65.207","I65.208","I65.300x001","I65.300x002","I65.300x003","I65.800x007","I65.900x001","I65.900x002","I65.900x003","I66.001","I66.002","I66.003","I66.004+G46.0*","I66.100x003","I66.101","I66.102","I66.103+G46.1*","I66.200x002","I66.201","I66.202","I66.204","I66.300x005","I66.300x007","I66.300x008","I66.300x010","I66.300x011","I66.300x013","I66.300x014","I66.300x015","I66.301","I66.302","I66.303","I66.304+G46.3*","I66.400","I66.400x002","I66.400x003","I66.401","I66.800x001","I66.800x002","I66.800x003","I66.800x004","I66.800x005","I66.800x006","I66.800x007","I66.800x008","I66.900x003","I66.902","I66.903","I67.000x001","I67.000x002","I67.000x003","I67.000x005","I67.000x007","I67.000x009","I67.000x010","I67.100x035","I67.200x002","I67.301","I67.500","I67.600x007","I67.600x008","I67.601","I67.602","I67.603","I67.604","I67.605","I67.606","I67.800x005","I67.801","I67.802","I67.806","I67.900x005","I67.901+G46.3*","I67.902+G46.3*"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BR2入组条件，匹配规则：主诊断匹配");
                
            if (MDCB_DRG.BR29_group(record)){
                return "BR29";
            }

            return "BR2";
        }else{
            return "";
        }
    }
}

