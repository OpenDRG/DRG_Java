package drg_group.changchun_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;
import drg_group.changchun_2022.DRG.MDCB_DRG;


public class BC2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"02.2101","02.2102","02.2200x001","02.2200x005","02.2201","02.2202","02.2203","02.2204","02.2205","02.2206","02.2207","02.2208","02.2208","02.2210","02.2211","02.2212","02.2213","02.2214","02.2215","02.2216","02.3101","02.3102","02.3103","02.3200x001","02.3201","02.3202","02.3203","02.3204","02.3300x001","02.3301","02.3400x002","02.3401","02.3402","02.3403","02.3404","02.3405","02.3501","02.3502","02.3901","02.4101","02.4102","02.4200x005","02.4201","02.4202","02.4203","02.4204","02.4301","02.4302","54.9502"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BC2入组条件，匹配规则：主手术匹配");
            
                
            if (MDCB_DRG.BC21_group(record)){
                return "BC21";
            }
    
            if (MDCB_DRG.BC23_group(record)){
                return "BC23";
            }
    
            if (MDCB_DRG.BC25_group(record)){
                return "BC25";
            }

            return "";
        }else{
            return "";
        }
    }
}

