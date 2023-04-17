package drg_group.yantai_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yantai_2023.Base;
import drg_group.yantai_2023.MedicalRecord;
import drg_group.yantai_2023.DRG.MDCO_DRG;

public class OF1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"O01.001","O01.101","O01.102","O01.901","O01.902","O02.000x001","O03.900x001","O03.903","O04.502","O04.901","O04.902","O08.103","O35.002","O35.003","O35.004","O35.005","O35.006","O35.007","O35.008","O35.009","O35.010","O35.101","O35.102","O35.200x002","O35.200x003","O35.200x004","O35.201","O35.202","O35.203","O35.204","O35.205","O35.206","O35.800x003","O35.800x005","O35.800x006","O35.800x007","O35.800x009","O35.800x010","O35.800x011","O35.800x012","O35.800x015","O35.800x017","O35.800x018","O35.800x019","O35.800x020","O35.800x023","O35.800x025","O35.800x026","O35.800x027","O35.800x030","O35.801","O35.803","O35.804","O35.805","O35.806","O35.807","O35.808","O35.809","O35.810","O35.811","O35.812","O35.813","O35.814","O35.816","O35.817","O35.818","O35.819","O35.820","O35.821","O35.822","O35.823"};
        String[] adrg_zd1={};
        String[] adrg_ss={"69.0200x003","73.1x01","73.1x02","74.9100","74.9100x001","74.9101","75.0x01","75.0x01x001","75.0x02"};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合OF1入组条件，匹配规则：主诊断匹配、主手术匹配");
                
            if (MDCO_DRG.OF19_group(record)){
                return "OF19";
            }

            return "OF1";
        }else{
            return "";
        }
    }
}

