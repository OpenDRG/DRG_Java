package drg_group.qingdao_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.DRG.MDCR_DRG;

public class RT1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C45.100x005","C45.103","C45.706","C45.900","C46.300","C46.700","C46.800","C46.900","C46.900x002","C46.900x003","C46.900x004","C48.101","C48.102","C49.901","C76.101","C76.200x002","C76.300","C76.302","C76.305","C76.306","C76.700","C76.700x002","C76.800","C76.801","C77.202","C77.300","C77.300x001","C77.301","C77.500","C77.800","C77.900","C77.900x001","C78.604","C78.605","C79.800x804","C79.800x811","C79.800x816","C79.800x818","C79.800x837","C79.800x862","C79.811","C79.829","C79.900","C79.900x001","C80.000","C80.000x001","C80.001","C80.900","C80.901","C80.902","C80.903","C80.904","C80.905","C96.403","C97.x00","C97.x01","D09.700","D09.700x001","D09.900","D48.700x001","D48.700x015","D48.700x023","D48.707","D48.708","D48.715","D48.716","D48.722","D48.723","D48.725","D48.900","D48.901","D48.902","Q85.802","Q85.909"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合RT1入组条件，匹配规则：主诊断匹配");
                
            if (MDCR_DRG.RT11_group(record)){
                return "RT11";
            }
    
            if (MDCR_DRG.RT13_group(record)){
                return "RT13";
            }
    
            if (MDCR_DRG.RT15_group(record)){
                return "RT15";
            }

            return "RT1";
        }else{
            return "";
        }
    }
}

