package drg_group.handan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;
import drg_group.handan_2022.DRG.MDCL_DRG;

public class LV1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"E10.200x023+N08.3*","E10.200x024+N08.3*","E10.200x025+N08.3*","E10.200x026+N08.3*","E10.200x027+N08.3*","E10.200x028+N08.3*","E10.200x029+N08.3*","E10.200x030+N08.3*","E10.200x031+N29.8*","E10.200x091+N08.3*","E10.200x092+N08.3*","E10.200x212+N08.3*","E10.200x213+N08.3*","E10.200x214+N08.3*","E10.200x215+N08.3*","E10.201+N08.3*","E11.200x023+N08.3*","E11.200x024+N08.3*","E11.200x025+N08.3*","E11.200x026+N08.3*","E11.200x027+N08.3*","E11.200x028+N08.3*","E11.200x029+N08.3*","E11.200x030+N08.3*","E11.200x031+N29.8*","E11.200x091+N08.3*","E11.200x092+N08.3*","E11.200x212+N08.3*","E11.200x213+N08.3*","E11.200x214+N08.3*","E11.200x215+N08.3*","E11.201+N08.3*","E11.400x380+G99.0*","E11.400x381+N33.8*","E12.200","E13.200x521+N08.3*","E13.201+N08.3*","E14.200x021+N08.3*","E14.200x023+N08.3*","E14.200x024+N08.3*","E14.200x025+N08.3*","E14.200x026+N08.3*","E14.200x027+N08.3*","E14.200x028+N08.3*","E14.200x029+N08.3*","E14.200x030+N08.3*","E14.200x031+N29.8*","E14.200x091+N08.3*","E14.200x092+N08.3*","E14.200x212+N08.3*","E14.200x213+N08.3*","E14.200x214+N08.3*","E14.200x215+N08.3*","E14.400x380+G99.0*","E14.400x381+N33.8*","E85.403","I12.900x008","I12.900x009","I12.904","M10.001+N16.8*","N04.901","N05.000x003","N11.800x003","N25.001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LV1入组条件，匹配规则：主诊断匹配");
                
            if (MDCL_DRG.LV11_group(record)){
                return "LV11";
            }
    
            if (MDCL_DRG.LV15_group(record)){
                return "LV15";
            }

            return "";
        }else{
            return "";
        }
    }
}

