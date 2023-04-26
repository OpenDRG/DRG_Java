package drg_group.linfen_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;
import drg_group.linfen_2022.DRG.MDCP_DRG;

public class PS4 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"P07.200","P07.200x011","P07.200x021","P07.300","P07.300x001","P07.300x011","P07.300x021"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.intersect(record.zdList,adrg_zd) && record.weight>0 && record.weight>=2500 && record.ageDay<=28){
            Base.groupMessages.putMessage(record.Index,"符合PS4入组条件，匹配规则：某一诊断匹配、体重大于2500克、新生儿");
                
            if (MDCP_DRG.PS49_group(record)){
                return "PS49";
            }

            return "PS4";
        }else{
            return "";
        }
    }
}

