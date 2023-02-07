package drg_group.wuhan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.DRG.MDCP_DRG;

public class PS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"P07.000","P07.001","P07.002","P07.102","P07.200","P07.200x021"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.weight>0 && record.weight<1500 && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PS1入组条件，匹配规则：主诊断匹配、体重小于1500克、新生儿");
                
            if (MDCP_DRG.PS19_group(record)){
                return "PS19";
            }

            return "PS1";
        }else{
            return "";
        }
    }
}

