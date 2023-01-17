package drg_group.wuxi_2022.ADRG;

import java.util.HashSet;
import java.util.Set;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.DRG.MDCR_DRG;

public class RT2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"D15.200","D15.200x001","D15.200x002","D15.700","D15.701","D15.900","D17.400","D17.400x001","D17.500","D17.701","D17.702","D18.011","D18.012","D18.105","D18.106","D19.000","D19.100","D19.900x001","D20.000","D20.100","D20.101","D36.700x008","D36.700x009","D36.700x011","D36.700x012","D36.700x013","D36.700x014","D36.700x016","D36.700x018","D36.700x019","D36.700x021","D36.700x023","D36.700x024","D36.700x025","D36.700x028","D36.700x029","D36.700x030","D36.700x032","D36.700x035","D36.700x036","D36.700x038","D36.704","D36.705","D36.706","D36.707","D36.708","D36.709","D36.710","D36.711","D36.712","D36.713","D36.714","D36.715","D36.716","D36.717","D36.718"};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RT2入组条件，匹配规则：主诊断匹配");
                
            if (MDCR_DRG.RT29_group(record)){
                return "RT29";
            }

            return "RT2";
        }else{
            return "";
        }
    }
}

