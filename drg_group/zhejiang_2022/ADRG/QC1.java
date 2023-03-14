package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCQ_DRG;

public class QC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"07.8000","07.8001","07.8100","07.8100x009","07.8101","07.8201","07.8300","07.8300x002","07.8400","07.8401","07.9100","07.9200x001","07.9300","07.9400","07.9500","07.9800","07.9901","34.3x01","34.3x02","34.3x03","34.3x04","34.3x05","34.4x02"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合QC1入组条件，匹配规则：某一手术匹配");
                
            if (MDCQ_DRG.QC11_group(record)){
                return "QC11";
            }
    
            if (MDCQ_DRG.QC13_group(record)){
                return "QC13";
            }
    
            if (MDCQ_DRG.QC15_group(record)){
                return "QC15";
            }

            return "QC1";
        }else{
            return "";
        }
    }
}

