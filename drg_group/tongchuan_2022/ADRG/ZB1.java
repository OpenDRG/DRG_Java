package drg_group.tongchuan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.tongchuan_2022.Base;
import drg_group.tongchuan_2022.MedicalRecord;
import drg_group.tongchuan_2022.DRG.MDCZ_DRG;

public class ZB1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"01.0900x006","01.0900x007","01.0900x008","01.0900x009","01.2100x001","01.2300","01.2400x005","01.2400x009","01.2400x013","01.2400x018","01.2402","01.2405","01.2407","01.2413","01.2414","01.2500x003","01.2502","01.2503","01.2504","01.3101","01.3102","01.3103","01.3104","01.3105","01.3106","01.3107","01.3108","01.3201","01.3202","01.3203","01.3204","01.3205","01.3900x002","01.3900x009","01.3900x012","01.3902","01.3903","01.3904","01.3906","01.3907","01.3908","01.4101","01.4102","01.4103","01.4104","01.4105","01.4201","01.4202","01.4203","01.4204","01.5100x001","01.5100x006","01.5100x007","01.5101","01.5102","01.5103","01.5104","01.5105","01.5106","01.5107","01.5108","01.5200","01.5301","01.5302","01.5303","01.5304","01.5900x022","01.5900x030","01.5900x032","01.5900x036","01.5900x037","01.5900x038","01.5900x040","01.5900x041","01.5900x043","01.5900x044","01.5900x048","01.5900x049","01.5900x050","01.5901","01.5901","01.5902","01.5903","01.5904","01.5905","01.5906","01.5907","01.5908","01.5909","01.5910","01.5911","01.5912","01.5913","01.5914","01.5915","01.5916","01.5917","01.5918","01.5919","01.5920","01.5921","01.5922","01.5923","01.5924","01.5925","01.5926","01.5927","01.5928","01.5929","01.5931","01.5932","01.5933","01.5935","01.5936","01.5937","01.5938","01.5939","01.5940","01.5941","01.6x00","01.6x01","02.0101","02.0102","02.0201","02.0202","02.0203","02.0300x001","02.0400x003","02.0401","02.0402","02.0500x004","02.0500x005","02.0501","02.0502","02.0503","02.0504","02.0505","02.0600x003","02.0601","02.0602","02.0603","02.0700","02.1100x001","02.1201","02.1202","02.1203","02.1204","02.1205","02.1206","02.1207","02.1208","02.1209","02.1210","02.1211","02.1212","02.1301","02.1302","02.1401","02.1402","02.1403","02.1404","02.2101","02.2102","02.2102","02.2200x001","02.2200x005","02.2201","02.2202","02.2203","02.2204","02.2205","02.2206","02.2207","02.2208","02.2208","02.2210","02.2211","02.2212","02.2213","02.2214","02.2215","02.2216","02.3101","02.3102","02.3103","02.3200x001","02.3201","02.3202","02.3300x001","02.3400x002","02.3402","02.3502","02.3901","02.4101","02.4102","02.4201","02.4202","02.9100","02.9301","02.9401","02.9402","02.9403","02.9404","02.9405","02.9501","02.9502","02.9503","02.9600","02.9901","04.4100x003","04.4101","04.4102","07.6100x002","07.6100x003","07.6200x003","07.6200x007","07.6201","07.6202","07.6301","07.6400x001","07.6500","07.6501","07.6800","07.6900x001","07.7100","07.7200x002","07.7200x003","07.7201","07.7202","07.7203","07.7901","38.6102"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合ZB1入组条件，匹配规则：主手术匹配");
                
            if (MDCZ_DRG.ZB19_group(record)){
                return "ZB19";
            }

            return "ZB1";
        }else{
            return "";
        }
    }
}

