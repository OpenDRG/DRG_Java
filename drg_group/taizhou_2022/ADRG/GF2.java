package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCG_DRG;

public class GF2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"48.0x00x002","48.0x00x003","48.0x01","48.0x02","48.0x03","48.0x04","48.1x00","48.2101","48.2500","48.3101","48.3200x001","48.3200x003","48.3201","48.3401","48.3501","48.3502","48.3503","48.3504","48.3505","48.3506","48.3507","48.3514","48.3600x002","48.3600x003","48.3600x004","48.3600x005","48.3600x006","48.3600x007","48.3601","48.3602","48.3603","48.4101","48.4102","48.4103","48.4104","48.4105","48.4106","48.4200","48.4300","48.5000","48.7100","48.7101","48.7200","48.7300x001","48.7301","48.7302","48.7303","48.7400","48.7401","48.7501","48.7600x001","48.7600x002","48.7600x008","48.7601","48.7602","48.7603","48.7604","48.7605","48.7900x003","48.7901","48.8100x001","48.8101","48.8102","48.8201","48.8202","48.8203","48.8204","48.8205","48.8206","48.9100","48.9200","48.9201","48.9300","48.9900","49.5100","70.5200","70.5201","70.5202","70.5500x001","70.5500x002","98.0502"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GF2入组条件，匹配规则：主手术匹配");
                
            if (MDCG_DRG.GF21_group(record)){
                return "GF21";
            }
    
            if (MDCG_DRG.GF23_group(record)){
                return "GF23";
            }
    
            if (MDCG_DRG.GF25_group(record)){
                return "GF25";
            }

            return "GF2";
        }else{
            return "";
        }
    }
}

