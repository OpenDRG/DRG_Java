package drg_group.wuxi_2022.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.DRG.MDCA_DRG;

public class AC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_ss={"52.8000","52.8200","52.8300"};
        String[] adrg_ss1={"55.6100","55.6901"};
        
        if (true && record.ssList!=null &&record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss) && Base.intersect(record.ssList,adrg_ss1)){
            Base.groupMessages.putMessage(record.Index,"符合AC1入组条件，匹配规则：双手术匹配");
            
            return "AC1";
        }else{
            return "";
        }
    }
}

