package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCN_DRG;

public class NC1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"38.8609","38.8700x008","38.8702","39.7900x019","67.3903","67.3905","67.4x02","67.4x04","67.4x05","67.4x06","67.5100","67.5101","68.0x00x004","68.0x00x005","68.0x00x006","68.0x01","68.1300","68.1400","68.1501","68.1601","68.2203","68.2205","68.2400","68.2401","68.2500x001","68.2501","68.2900x013","68.2900x035","68.2900x037","68.2901","68.2904","68.2905","68.2906","68.2908","68.2909","68.2910","68.2911","68.2912","68.2917","68.3100x002","68.3101","68.3102","68.3103","68.3104","68.3105","68.3106","68.3900x003","68.3901","68.3902","68.3903","68.3904","68.3905","68.3906","68.3907","68.4100","68.4101","68.4102","68.4103","68.4104","68.4900x004","68.4900x006","68.4901","68.4902","68.4903","68.4904","68.4905","68.5100x004","68.5102","68.5901","68.5902","68.6901","68.6902","68.9x00","69.1900x022","69.1901","69.1902","69.1903","69.1904","69.1905","69.1907","69.1908","69.1909","69.3x01","69.3x02","69.4100","69.4200","69.4201","69.4900x005","69.4900x006","69.4901","69.4902","69.4903","69.4904","70.3200x002","70.3201"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合NC1入组条件，匹配规则：某一手术匹配");
                
            if (MDCN_DRG.NC11_group(record)){
                return "NC11";
            }
    
            if (MDCN_DRG.NC13_group(record)){
                return "NC13";
            }
    
            if (MDCN_DRG.NC15_group(record)){
                return "NC15";
            }

            return "NC1";
        }else{
            return "";
        }
    }
}

