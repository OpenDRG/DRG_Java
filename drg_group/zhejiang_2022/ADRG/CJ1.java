package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCC_DRG;

public class CJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"04.0302","04.0403","09.0x00x001","09.2000","09.2100","09.2200x001","09.2300","09.3x00x001","09.3x01","09.3x02","09.4100","09.4100x001","09.4200","09.4300","09.4401","09.4402","09.4403","09.4404","09.4405","09.4900x002","09.4900x003","09.4901","09.5100","09.5200","09.5300","09.5900x001","09.6x00x001","09.6x00x006","09.6x01","09.6x02","09.6x03","09.6x04","09.7100","09.7200x001","09.7201","09.7300x001","09.7300x003","09.7300x004","09.7301","09.8100x004","09.8101","09.8200","09.8301","09.9100","09.9900x002","12.0000","12.0100","12.0200x002","12.0200x004","12.4000","12.8300x002","16.1x00x001","16.9100x002","38.5200x001"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合CJ1入组条件，匹配规则：某一手术匹配");
                
            if (MDCC_DRG.CJ19_group(record)){
                return "CJ19";
            }

            return "CJ1";
        }else{
            return "";
        }
    }
}

