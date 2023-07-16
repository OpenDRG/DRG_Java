package drg_group.changsha_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;
import drg_group.changsha_2023.DRG.MDCD_DRG;


public class DW1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A18.202","A18.203","A18.800x006+K93.8*","A18.800x025+K93.8*","A18.800x034+K93.8*","A18.802+K93.8*","A18.803+M63.0*","A18.804+K93.8*","A18.805+K93.8*","A69.000","A69.000x002","A69.100x003","B00.200x001","B00.201","B00.203","B08.000x003","B37.000","B37.001","B37.002","B37.003","B37.800x084","B48.300x002+K93.8*","E10.600x031","E10.600x032","E11.600x031","E11.600x032","E14.600x031","E14.600x032","E34.800x005","E85.405","K00.000","K00.000x003","K00.000x004","K00.001","K00.002","K00.100x001","K00.101","K00.200x001","K00.200x002","K00.200x003","K00.200x005","K00.200x009","K00.200x010","K00.201","K00.202","K00.203","K00.204","K00.205","K00.206","K00.207","K00.300x002","K00.301","K00.400","K00.400x001","K00.400x002","K00.400x004","K00.401","K00.402","K00.500x002","K00.501","K00.502","K00.503","K00.600x002","K00.600x006","K00.600x007","K00.600x008","K00.601","K00.602","K00.603","K00.604","K00.605","K00.608","K00.700","K00.800x002","K00.801","K00.900","K01.000","K01.100","K02.000","K02.001","K02.100","K02.101","K02.200","K02.300","K02.400x001","K02.400x002","K02.400x003","K02.500","K02.800x001","K02.800x002","K02.800x003","K02.800x005","K02.800x006","K02.800x007","K02.800x008","K02.900x001","K02.901","K03.000","K03.000x002","K03.001","K03.100x001","K03.101","K03.102","K03.103","K03.104","K03.105","K03.106","K03.200x002","K03.201","K03.202","K03.203","K03.204","K03.300","K03.300x001","K03.300x002","K03.300x003","K03.400","K03.401","K03.500","K03.600x001","K03.601","K03.602","K03.603","K03.604","K03.700","K03.800x001","K03.800x002","K03.800x003","K03.800x005","K03.801","K03.900","K04.000","K04.000x007","K04.000x008","K04.001","K04.002","K04.006","K04.007","K04.100","K04.101","K04.200","K04.200x003","K04.201","K04.300","K04.400","K04.401","K04.500","K04.500x001","K04.501","K04.600","K04.700","K04.701","K04.702","K04.703","K04.800","K04.801","K04.802","K04.803","K04.900","K04.901","K04.902","K05.000","K05.000x002","K05.100","K05.100x005","K05.100x008","K05.100x010","K05.100x011","K05.100x012","K05.100x013","K05.101","K05.102","K05.103","K05.104","K05.105","K05.106","K05.200","K05.200x002","K05.201","K05.202","K05.203","K05.204","K05.300","K05.300x002","K05.301","K05.400","K05.400x002","K05.500x001","K05.500x002","K05.500x003","K05.500x005","K05.600","K06.000","K06.000x002","K06.000x003","K06.000x004","K06.200","K06.800x012","K06.800x013","K06.800x014","K06.800x015","K06.804","K06.805","K06.806","K06.808","K06.810","K06.900","K07.000x002","K07.000x004","K07.000x007","K07.000x008","K07.000x009","K07.000x011","K07.000x012","K07.000x013","K07.002","K07.003","K07.004","K07.005","K07.006","K07.007","K07.008","K07.009","K07.010","K07.011","K07.012","K07.100x008","K07.100x009","K07.100x010","K07.100x011","K07.100x012","K07.100x014","K07.100x015","K07.100x016","K07.100x017","K07.101","K07.102","K07.103","K07.104","K07.105","K07.106","K07.107","K07.108","K07.109","K07.110","K07.200x001","K07.200x002","K07.200x003","K07.200x005","K07.200x011","K07.200x012","K07.200x013","K07.200x014","K07.201","K07.202","K07.203","K07.204","K07.205","K07.300x003","K07.300x005","K07.300x006","K07.300x007","K07.300x008","K07.300x009","K07.301","K07.302","K07.303","K07.304","K07.305","K07.500x002","K07.600","K07.600x001","K07.600x003","K07.602","K07.603","K07.604","K07.800x001","K07.900","K07.901","K07.902","K07.903","K08.000","K08.101","K08.103","K08.104","K08.201","K08.202","K08.203","K08.204","K08.300x002","K08.302","K08.801","K08.802","K08.803","K08.804","K08.805","K08.806","K08.807","K08.808","K08.809","K08.900","K09.200x001","K10.000x002","K10.000x003","K10.000x004","K10.001","K10.200","K10.201","K10.204","K10.205","K10.206","K10.208","K10.211","K10.212","K10.213","K10.214","K10.300x003","K10.301","K10.302","K10.800x002","K10.803","K10.804","K10.808","K10.900x002","K12.000","K12.000x001","K12.001","K12.002","K12.003","K12.100x002","K12.100x011","K12.100x012","K12.100x013","K12.101","K12.102","K12.103","K12.106","K12.107","K12.108","K12.109","K12.111","K12.112","K12.114","K12.115","K12.200x003","K12.200x011","K12.200x012","K12.200x017","K12.200x018","K12.200x019","K12.201","K12.202","K12.203","K12.204","K12.205","K12.206","K12.207","K12.208","K12.209","K12.210","K12.211","K12.212","K12.213","K12.214","K12.215","K12.216","K12.217","K12.218","K12.301","K12.302","K12.303","K12.304","K12.305","K13.000x001","K13.000x006","K13.000x007","K13.000x012","K13.000x014","K13.000x016","K13.000x017","K13.000x018","K13.000x023","K13.001","K13.003","K13.004","K13.005","K13.010","K13.011","K13.013","K13.014","K13.015","K13.016","K13.100","K13.101","K13.500x002","K13.700x003","K13.700x004","K13.700x006","K13.700x007","K13.700x009","K13.700x011","K13.700x013","K13.700x018","K13.700x021","K13.700x022","K13.700x023","K13.700x024","K13.700x025","K13.703","K13.704","K13.705","K13.715","K14.000","K14.000x006","K14.000x007","K14.001","K14.002","K14.003","K14.004","K14.100x001","K14.102","K14.200","K14.300","K14.300x001","K14.300x003","K14.300x004","K14.301","K14.302","K14.400","K14.400x001","K14.401","K14.500x001","K14.500x002","K14.600x001","K14.800x003","K14.800x005","K14.800x010","K14.800x013","K14.802","K14.803","K14.804","K14.807","K14.808","K14.809","K14.900x002","K14.900x003","K14.900x004","L04.003","M31.300","M31.301","Q18.400","Q18.500","Q18.600","Q18.700","Q35.100","Q35.101","Q35.300","Q35.301","Q35.302","Q35.500","Q35.500x004","Q35.501","Q35.502","Q35.700","Q35.901","Q35.902","Q35.907","Q36.000","Q36.001","Q36.002","Q36.003","Q36.004","Q36.005","Q36.006","Q36.100","Q36.900","Q36.900x003","Q36.901","Q36.903","Q36.904","Q36.905","Q36.906","Q37.200","Q37.300","Q37.900","Q38.000x003","Q38.000x005","Q38.000x006","Q38.000x007","Q38.002","Q38.003","Q38.004","Q38.100","Q38.200","Q38.300","Q38.300x003","Q38.300x005","Q38.300x007","Q38.301","Q38.303","Q38.305","Q38.400","Q38.400x001","Q38.400x002","Q38.500x002","Q38.500x003","Q38.500x005","Q38.500x006","Q38.500x007","Q38.500x009","Q38.501","Q38.502","Q38.600x001","Q38.600x002","Q38.600x006","Q38.601","Q87.004","Q87.006","Q89.800x903","Q89.800x905","Q89.800x907","T18.000","T18.002"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        String[] adrg_ss2={};
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DW1入组条件，匹配规则：主诊断匹配");
            
                
            if (MDCD_DRG.DW11_group(record)){
                return "DW11";
            }
    
            if (MDCD_DRG.DW15_group(record)){
                return "DW15";
            }

            return "";
        }else{
            return "";
        }
    }
}

