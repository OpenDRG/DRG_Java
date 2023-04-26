package drg_group.linfen_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;
import drg_group.linfen_2022.DRG.MDCB_DRG;

public class BU3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"G03.905","G04.800x004","G04.800x012","G04.800x013","G04.800x014","G04.800x015","G04.800x016","G04.801","G04.915","G35.x00","G35.x00x002","G35.x00x003","G35.x01","G35.x02","G35.x03","G35.x04","G35.x05","G35.x06+F02.8*","G36.000","G36.000x002","G36.100","G36.101","G36.800","G36.900","G36.901","G37.000","G37.000x002","G37.100","G37.100x002","G37.200","G37.200x001","G37.200x002","G37.300","G37.400","G37.500","G37.800","G37.800x006","G37.801","G37.802","G37.803","G37.804","G37.805","G37.900","G37.901"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BU3入组条件，匹配规则：主诊断匹配");
                
            if (MDCB_DRG.BU33_group(record)){
                return "BU33";
            }
    
            if (MDCB_DRG.BU35_group(record)){
                return "BU35";
            }

            return "BU3";
        }else{
            return "";
        }
    }
}

