package drg_group.tongchuan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.tongchuan_2022.Base;
import drg_group.tongchuan_2022.MedicalRecord;
import drg_group.tongchuan_2022.DRG.MDCI_DRG;

public class IT3 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A02.202+M01.3*","A18.000x019+M01.1*","A18.000x046+M68.0*","A18.000x053+M01.1*","A18.002+M01.1*","A18.027+M01.1*","A18.028+M01.1*","A18.029+M01.1*","A18.030+M01.1*","A18.031+M01.1*","A18.032+M49.0*","A18.033+M01.1*","A18.034+M01.1*","A18.035+M01.1*","A18.036+M01.1*","A18.037+M01.1*","A18.038+M01.1*","A18.039+M01.1*","A18.040+M01.1*","A18.043+M01.1*","A18.044+M01.1*","A23.902+M01.3*","A39.804+M01.0*","A39.805+M03.0*","A52.103+M14.6*","A52.706+M01.3*","A54.401+M01.3*","A69.900x002+M01.8*","B06.802+M01.4*","B26.800x001+M01.5*","B37.800x089+M01.6*","B49.x19+M01.6*","M00.000x091","M00.000x092","M00.001","M00.002","M00.003","M00.004","M00.005","M00.006","M00.100x001","M00.100x011","M00.100x021","M00.100x031","M00.100x051","M00.100x061","M00.100x071","M00.100x091","M00.200x001","M00.200x011","M00.200x021","M00.200x031","M00.200x051","M00.200x061","M00.200x071","M00.200x091","M00.900","M00.900x011","M00.900x021","M00.900x031","M00.900x051","M00.900x061","M00.900x071","M00.901"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IT3入组条件，匹配规则：主诊断匹配");
                
            if (MDCI_DRG.IT39_group(record)){
                return "IT39";
            }

            return "IT3";
        }else{
            return "";
        }
    }
}

