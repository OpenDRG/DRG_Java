package drg_group.beijing_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.DRG.MDCB_DRG;

public class BT1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A80.000","A80.100","A80.200","A80.300x001","A80.301","A80.400","A80.400x001","A80.400x002","A80.900","A81.100","A81.101","A82.000","A82.100","A82.900","A83.000","A83.000x001","A83.000x002","A83.000x003","A83.000x004","A83.000x005","A83.100","A83.200","A83.300","A83.400","A83.500","A83.600","A83.800","A83.900","A84.000","A84.000x001","A84.100","A84.800x001","A84.900","A85.000+G05.1*","A85.000x002+G05.1*","A85.000x003+G05.1*","A85.001+G05.1*","A85.100+G05.1*","A85.101+G05.1*","A85.200","A85.200x001","A85.800","A86.x00","A86.x01","A86.x02","A87.000+G02.0*","A87.000x001+G02.0*","A87.000x002+G02.0*","A87.000x003+G02.0*","A87.100+G02.0*","A87.200x001+G02.0*","A87.200x002+G02.0*","A87.800","A87.801","A87.900","A87.901","A88.000","A88.100","A88.800x001","B00.300+G02.0*","B00.400+G05.1*","B00.400x001+G05.1*","B00.401+G05.1*","B01.000+G02.0*","B01.000x001+G02.0*","B01.100+G05.1*","B02.000+G05.1*","B02.000x002+G05.1*","B02.000x003+G05.1*","B02.001+G05.1*","B02.100+G02.0*","B05.000+G05.1*","B05.100+G02.0*","B06.000x002+G05.1*","B06.001+G05.1*","B06.002+G02.0*","B25.801+G05.1*","B26.100+G02.0*","B26.200+G05.1*","B26.201+G05.1*","B26.202+G05.1*","G04.000","G04.000x004","G04.001","G04.002","G04.800x005","G04.902","G04.909","G04.910","J09.x04+G05.1*","J10.800x001+G94.8*","J10.801+G94.8*","J10.804+G05.1*","J10.805+G05.1*","J11.800x001+G94.8*","J11.803+G05.1*"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BT1入组条件，匹配规则：主诊断匹配");
                
            if (MDCB_DRG.BT11_group(record)){
                return "BT11";
            }
    
            if (MDCB_DRG.BT13_group(record)){
                return "BT13";
            }
    
            if (MDCB_DRG.BT15_group(record)){
                return "BT15";
            }

            return "BT1";
        }else{
            return "";
        }
    }
}

