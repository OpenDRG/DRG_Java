package drg_group.changchun_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;
import drg_group.changchun_2022.DRG.MDCN_DRG;


public class NS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A18.100x019+N77.1*","A18.100x024+N74.1*","A18.100x026+N74.1*","A18.100x030+N77.0*","A18.100x032","A18.102","A18.111+N74.1*","A18.112+N74.0*","A18.113+N74.1*","A18.114+N74.1*","A18.115+N74.1*","A51.400x009+N74.2*","A54.003","A54.004","A54.005","A54.102","A54.200x004+N74.3*","A54.201+N74.3*","A56.002","A56.003","A56.004","A56.100x003+N74.4*","A56.100x004+N74.4*","A56.101+N74.4*","A56.104+N74.4*","A59.002+N77.1*","A60.000x003+N77.1*","B26.800x009+N74.8*","B37.300+N77.1*","B37.300x002+N77.1*","B37.301+N77.1*","B37.302+N77.1*","N70.000","N70.001","N70.002","N70.100","N70.101","N70.102","N70.103","N70.900","N70.900x003","N70.900x007","N70.901","N70.902","N70.903","N70.904","N70.905","N70.906","N71.001","N71.002","N71.101","N71.102","N71.900x001","N71.901","N71.902","N72.x00x003","N72.x01","N72.x02","N72.x03","N73.001","N73.002","N73.003","N73.101","N73.102","N73.103","N73.104","N73.201","N73.202","N73.203","N73.300","N73.400","N73.500","N73.501","N73.800x002","N73.801","N73.902","N73.903","N75.100","N75.801","N75.802","N75.900","N76.000","N76.000x001","N76.000x003","N76.000x004","N76.000x006","N76.001","N76.100x001","N76.100x002","N76.101","N76.200","N76.201","N76.300x001","N76.301","N76.400","N76.401","N76.801","N76.802"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合NS1入组条件，匹配规则：主诊断匹配");
            
                
            if (MDCN_DRG.NS19_group(record)){
                return "NS19";
            }

            return "";
        }else{
            return "";
        }
    }
}

