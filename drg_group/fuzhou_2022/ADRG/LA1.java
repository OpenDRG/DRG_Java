package drg_group.fuzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.fuzhou_2022.Base;
import drg_group.fuzhou_2022.MedicalRecord;
import drg_group.fuzhou_2022.DRG.MDCL_DRG;

public class LA1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C64.x00x001","C64.x00x003","C64.x00x004","C65.x00","C65.x01","C65.x02","C68.800","C68.801","C68.802","C68.805","C79.000x001","C79.001","D09.101","D09.102","D30.000","D30.100","D41.000x001","D41.001","D41.100x001","D41.101","Q85.900x013","Q85.900x029","Q85.903"};
        String[] adrg_zd1={};
        String[] adrg_ss={"39.2605","39.5500","40.2900x023","40.2905","40.2909","40.5400x001","40.5900x016","40.5900x017","40.5909","40.5910","40.5911","40.5912","55.0101","55.3903","55.4x00","55.4x01","55.4x02","55.4x03","55.4x04","55.4x05","55.5101","55.5102","55.5103","55.5104","55.5105","55.5106","55.5400","55.5401","55.8600x006","55.8602","55.8603","55.8605","55.8606"};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LA1入组条件，匹配规则：主诊断匹配、主手术匹配");
                
            if (MDCL_DRG.LA19_group(record)){
                return "LA19";
            }

            return "LA1";
        }else{
            return "";
        }
    }
}

