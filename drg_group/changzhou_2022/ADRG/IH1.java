package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCI_DRG;

public class IH1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"04.0310","04.0715","04.0716","04.0717","04.0719","04.0720","04.0721","04.0733","04.1102","04.1103","04.3x06","04.3x15","04.3x16","04.4900x043","04.4900x044","04.4900x045","04.4912","04.6x09","04.7407","04.7408","04.7409","04.7410","04.7412","04.7413","04.7414","04.7417","04.7418","04.7900","04.8101","04.8106","04.8900"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合IH1入组条件，匹配规则：主手术匹配");
                
            if (MDCI_DRG.IH19_group(record)){
                return "IH19";
            }

            return "IH1";
        }else{
            return "";
        }
    }
}

