package drg_group.suzhou_2023.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.suzhou_2023.Base;
import drg_group.suzhou_2023.MedicalRecord;
import drg_group.suzhou_2023.DRG.MDCP_DRG;

public class PS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"P07.200","P07.200x011","P07.200x021","P07.300","P07.300x001","P07.300x011","P07.300x021"};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && record.weight>0 && record.weight<1500 && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PS1入组条件，匹配规则：其他诊断匹配、体重小于1500克、新生儿");
                
            if (MDCP_DRG.PS19_group(record)){
                return "PS19";
            }

            return "PS1";
        }else{
            return "";
        }
    }
}

