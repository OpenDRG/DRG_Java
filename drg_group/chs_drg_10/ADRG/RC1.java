package drg_group.chs_drg_10.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;
import drg_group.chs_drg_10.DRG.MDCR_DRG;

public class RC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"Z51.000x003","Z51.000x008","Z51.000x012","Z51.001","Z51.002","Z51.003","Z51.806","Z51.811"};
        String[] adrg_zd1={};
        String[] adrg_ss={"14.2700x001","92.2000","92.2001","92.2100","92.2200","92.2201","92.2300","92.2301","92.2302","92.2303","92.2400","92.2400x002","92.2400x003","92.2400x004","92.2400x005","92.2400x006","92.2400x007","92.2500","92.2501","92.2601","92.2602","92.2700x002","92.2701","92.2702","92.2703","92.2704","92.2705","92.2706","92.2800","92.2900x001","92.2900x002","92.2900x003"};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RC1入组条件，匹配规则：主诊断匹配、主手术匹配");
                
            if (MDCR_DRG.RC19_group(record)){
                return "RC19";
            }

            return "RC1";
        }else{
            return "";
        }
    }
}
