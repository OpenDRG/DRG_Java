package drg_group.linfen_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;
import drg_group.linfen_2022.DRG.MDCM_DRG;

public class MA1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C60.000","C60.100","C60.200","C60.201","C60.800","C60.900","C60.901","C61.x00","C62.000","C62.001","C62.100","C62.900","C62.901","C63.000","C63.100","C63.200","C63.201","C63.700","C63.701","C63.702","C63.800","C63.801","C63.900","C79.800x231","C79.800x233","C79.815","C79.816","C79.817","C79.818","C79.819","C79.820","D07.400","D07.401","D07.402","D07.500","D07.601","D07.602","D07.603","D40.000x001","D40.001","D40.100x002","D40.101","D40.700x001","D40.700x002","D40.702","D40.900x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={"40.2400","40.2900x028","40.5400x001","40.5400x002","40.5400x003","40.5900x010","40.5907","57.7102","60.0x00x001","60.0x03","60.2100x001","60.3x01","60.4x01","60.5x01","60.5x02","60.6100x002","60.6101","60.6200","60.6201","60.6900x001","60.6900x002","62.0x00x001","62.2x00x002","62.2x01","62.3x00","62.3x01","62.3x02","62.4100x004","62.4101","62.4102","62.4103","64.3x01","64.3x02"};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合MA1入组条件，匹配规则：主诊断匹配、主手术匹配");
                
            if (MDCM_DRG.MA19_group(record)){
                return "MA19";
            }

            return "MA1";
        }else{
            return "";
        }
    }
}

