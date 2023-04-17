package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCK_DRG;

public class KF1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"18.9x00x007","86.2200x011","86.2800x012","86.6301","86.6302","86.6303","86.6304","86.6701","86.6702","86.6903","86.6904","86.6905","86.6906","86.7100x009","86.7101","86.7102","86.7103","86.7104","86.7105","86.7200x001","86.7400x026","86.7400x031","86.7400x032","86.7400x033","86.7400x034","86.7400x035","86.7400x036","86.7400x037","86.7400x038","86.7400x039","86.7400x040","86.7400x041","86.7400x042","86.7401","86.7402","86.7403","86.7404","86.7405","86.7500x001","86.7500x010","86.7501","86.7503","86.9301","86.9302","86.9303","86.9305","86.9306"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合KF1入组条件，匹配规则：主手术匹配");
                
            if (MDCK_DRG.KF19_group(record)){
                return "KF19";
            }

            return "KF1";
        }else{
            return "";
        }
    }
}

