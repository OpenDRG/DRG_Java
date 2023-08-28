package drg_group.changchun_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;
import drg_group.changchun_2022.DRG.MDCC_DRG;


public class CB4 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"12.3505","12.4201","12.4300x001","12.5100x001","12.5200x001","12.5300","12.5400","12.5501","12.5900x001","12.5900x003","12.5901","12.6400x001","12.6400x003","12.6400x009","12.6400x010","12.6401","12.6402","12.6403","12.6404","12.6405","12.6406","12.6407","12.6408","12.6500x004","12.6601","12.6700x002","12.6700x003","12.6700x004","12.6700x008","12.6700x009","12.6700x010","12.6700x010","12.6701","12.6702","12.6703","12.6704","12.7100","12.7200","12.7300","12.7401","12.9100x002","12.9100x004","12.9100x006","12.9101","12.9102","12.9801","12.9802","12.9803","12.9900x004","12.9900x008","12.9900x009","12.9900x010","12.9901","12.9903","12.9904","12.9905"};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合CB4入组条件，匹配规则：主手术匹配");
            
                
            if (MDCC_DRG.CB49_group(record)){
                return "CB49";
            }

            return "";
        }else{
            return "";
        }
    }
}

