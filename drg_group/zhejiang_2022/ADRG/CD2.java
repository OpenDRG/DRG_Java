package drg_group.zhejiang_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.DRG.MDCC_DRG;

public class CD2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"08.0100","08.0200","08.0901","08.0902","08.0903","08.0904","08.2000x003","08.2000x005","08.2000x006","08.2000x009","08.2000x010","08.2001","08.2002","08.2003","08.2100","08.2100x001","08.2100x004","08.2200x003","08.2201","08.2300x001","08.2400x001","08.2500","08.3101","08.3102","08.3200x001","08.3200x002","08.3200x003","08.3201","08.3202","08.3300x001","08.3400x001","08.3500","08.3600x002","08.3700","08.3800","08.4101","08.4102","08.4201","08.4202","08.4203","08.4204","08.4301","08.4302","08.4401","08.4402","08.4403","08.4901","08.4902","08.5100","08.5101","08.5200x002","08.5200x003","08.5200x004","08.5900x001","08.5900x004","08.5900x005","08.5900x006","08.5900x007","08.5901","08.5902","08.5903","08.5904","08.6100x002","08.6100x003","08.6100x004","08.6101","08.6102","08.6103","08.6201","08.6301","08.6400","08.6900","08.7001","08.7100x001","08.7200x001","08.7300x001","08.7400x001","08.8101","08.8102","08.8200x001","08.8300x001","08.8400x001","08.8500x001","08.8600x002","08.8700","08.8900x002","08.8900x005","08.8901","08.8902","08.8903","08.9100x001","08.9200","08.9300x001","08.9900x003","08.9901","11.3100x001","11.3201","11.3202","11.3203","11.3204","11.3900x001","11.3901","15.0100x001","15.1100","15.1200","15.1300","15.1900x001","15.2100","15.2200","15.2901","15.3x01","15.3x02","15.4x01","15.4x02","15.5x00","15.6x00","15.7x01","15.9x00x001","15.9x00x007","15.9x00x008","15.9x01","38.6000x012","86.2200x011","86.2201","86.2800x012","86.4x01","98.2200x004"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.intersect(record.ssList,adrg_ss)){
            Base.groupMessages.putMessage(record.Index,"符合CD2入组条件，匹配规则：某一手术匹配");
                
            if (MDCC_DRG.CD29_group(record)){
                return "CD29";
            }

            return "CD2";
        }else{
            return "";
        }
    }
}

