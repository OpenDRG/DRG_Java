package drg_group.chongqing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;
import drg_group.chongqing_2022.DRG.MDCF_DRG;

public class FC2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"36.1000x001","36.1000x002","36.1100","36.1200","36.1300","36.1400","36.1500","36.1600","36.1700x001","36.1900x001","36.2x00"};
        String[] adrg_ss1={"00.2400x001","00.5900x003","00.5901","00.5902","37.2100","37.2200","37.2300","37.2600x001","88.5201","88.5202","88.5301","88.5302","88.5400x001","88.5500","88.5500x002","88.5600","88.5600x002","88.5700x003","88.5701","88.5800","88.5900"};
        String[] adrg_ss2={};
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss) && Base.intersect(record.ssList,adrg_ss1)){
            Base.groupMessages.putMessage(record.Index,"符合FC2入组条件，匹配规则：双手术匹配");
                
            if (MDCF_DRG.FC29_group(record)){
                return "FC29";
            }

            return "";
        }else{
            return "";
        }
    }
}

