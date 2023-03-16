package drg_group.yancheng_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yancheng_2022.Base;
import drg_group.yancheng_2022.MedicalRecord;
import drg_group.yancheng_2022.DRG.MDCI_DRG;

public class IT1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A02.204+M90.2*","A02.204+M90.2*","A18.000x063+M90.0*","A18.000x064+M90.0*","A18.000x065+M90.0*","A18.000x067+M90.0*","A54.403+M90.2*","B37.800x090","H05.003","M46.200","M46.200x021","M46.200x041","M46.200x061","M86.000","M86.100","M86.200","M86.300","M86.400","M86.500","M86.600x061","M86.601","M86.602","M86.603","M86.604","M86.605","M86.606","M86.607","M86.608","M86.609","M86.610","M86.800x071","M86.800x095","M86.801","M86.803","M86.804","M86.805","M86.807","M86.808","M86.809","M86.810","M86.811","M86.812","M86.900","M86.900x001","M86.900x071","M86.900x073","M86.901","M86.902","M86.903","M86.904","M86.905","M86.906","M86.907","M86.908","M86.909","M86.910","M86.911","M86.912","M86.913","M86.914","M86.915","M86.916","M86.917","M86.918","M86.919","M86.920","M86.921","M86.923","M87.000","M87.001","M87.002","M87.100","M87.101","M87.102","M87.200x021","M87.200x042","M87.200x072","M87.200x073","M87.202","M87.203","M87.204","M87.300","M87.800x021","M87.800x041","M87.800x051","M87.800x091","M87.800x101","M87.900","M87.900x021","M87.900x061","M87.900x071","M87.901"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IT1入组条件，匹配规则：主诊断匹配");
                
            if (MDCI_DRG.IT19_group(record)){
                return "IT19";
            }

            return "IT1";
        }else{
            return "";
        }
    }
}

