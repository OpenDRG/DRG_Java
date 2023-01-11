package drg_group.suzhou_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.suzhou_2022.Base;
import drg_group.suzhou_2022.MedicalRecord;
import drg_group.suzhou_2022.ADRG.*;

public class MDCH{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"B26.802+K77.0*","K70.900","B16.905","S36.200x031","S36.210","K80.502","K85.900x002","I72.800x072","T81.800x006","K86.816","I81.x00x003","K80.405","Q85.900x019","B65.903+K77.0*","K70.305+I98.3*","K74.600x030","E80.600x008","K75.801","K86.800x001","B17.204","Q44.500x006","K74.600x003","M35.003+K77.8*","B18.106","C25.000","R16.000x001","B17.205","B00.802+K77.0*","B15.001","K80.202","K83.004","B16.000","K80.505","C22.700","K74.612","K83.012","K83.810","B15.003","K76.700x001","K82.808","C25.200","K81.000","K76.001","B18.903","D37.604","K92.800x009","Q44.300","Q44.201","B18.002","R17.901","B16.201","S36.201","I86.809","R93.201","K85.302","K85.900","K76.901","K70.306+I98.3*","S36.200x011","B18.803","Q45.002","K85.001","Q44.600","K83.305","K76.810","K85.800x003","K83.104","D37.600x001","B17.800x002","Q45.802","K83.400x001","C78.808","K76.500x002","B15.903","B16.204","D18.000x031","Q27.304","S36.200x001","K92.800x006","K83.108","B54.x00x003+K77.0*","K83.101","K76.800x007","B15.902","K74.300x005+I98.2*","K75.000","K76.814","K82.000x003","B19.001","B18.105","C22.200","K86.815","K83.303","K70.402","K71.103","K80.504","K75.800x006","B18.805","K80.306","K83.306","T86.400x017","B26.300+K87.1*","K82.800x002","K74.607","K83.800x022","K75.803","K86.803","T86.400x016","B19.901","Q44.701","Q44.700x004","S36.200x092","K74.300x007+I98.2*","B15.900","Q44.704","K82.304","K81.004","B67.500x001+K77.0*","K80.503","R16.200x001","K86.105","B16.001","T86.400x018","T86.400x006","K76.800x021","C77.203","K76.800x026","K82.300","K80.301","A18.301","Q45.300x901","K72.000x004","C23.x00","K71.600x002","B16.200","R93.302","B18.804","K76.809","K83.502","K86.806","C24.100","K82.200x002","K85.900x003","M32.108+K77.8*","D13.500x001","K76.000","K83.501","K83.304","K74.614","K86.800x013","K91.823","Q44.700x003","K86.814","Q44.702","K80.403","K71.001","D01.700","K74.600x027","K72.900x001","B17.900x005","K71.600","K76.800x023","K74.613","I87.803","K83.808","C25.801","K72.002","C22.001","K75.200","K80.500x001","K81.008","B17.900","B16.902","D13.401","K70.201","K83.809","C78.800x009","K86.800x015","K83.815","K76.200","K83.001","K82.400","K91.822","K74.601","D01.503","K85.808","K83.800x012","K76.400","R93.205","K72.003","K76.700","B17.200","K73.000x001","K76.102","K83.818","Q44.503","K72.001","Q44.200","Q44.004","B18.900x006","K76.800x027","K76.401","K83.800x023","B65.906+I98.3*","K74.300x008+I98.3*","K80.506","K76.816","B17.904","Q44.700x002","B16.903","C25.900","D37.706","K72.000x013","K80.000x004","K86.812","K72.005","K83.813","Q45.300x904","T86.400x011","K83.802","D37.700x003","T82.813","A52.705+K77.0*","S36.100x011","A51.400x008+K77.0*","B17.100x006","K86.101","K82.303","S36.110","C24.001","B18.900","B18.201","K82.801","T85.800x802","K75.800x001","K82.800x009","Q44.502","K74.618+I98.3*","K75.002","K75.901","K75.810","K86.813","K86.801","K82.100x002","K74.611","K85.901","K83.109","K70.301+I98.2*","K82.101","K85.202","S36.100x013","C24.000x007","D37.600x002","K71.900","C25.701","K80.305","K83.008","K74.604","B18.800x001","B44.803","K75.100","B17.100x003","B65.900x010+K77.0*","K83.820","K76.600x002","K83.018","K86.811","K71.101","C22.400","K70.000","B18.000","T86.401","B19.000","N82.302","K83.103","B18.202","K86.107","K71.702","A06.400+K77.0*","B18.800x004","T86.400x014","B15.905","K86.106","K83.300","D37.605","K72.904","K81.801","B05.800x003+K77.0*","K80.800x001","K74.616+I98.2*","K70.901","K83.017","K86.808","K85.817","K83.107","K81.006","K91.807","K86.800x002","I81.x00","K70.100","K83.015","K71.102","K85.818","R93.200x002","K85.803","K71.200x001","K82.900x001","K71.902+I98.2*","K81.000x008","B17.000","K85.802","K86.807","B18.003","K74.620+I98.2*","C24.000","C24.004","Q45.301","K80.001","D18.013","K74.300x006+I98.3*","K74.602","Q85.900x044","K81.900","B17.800x001","K76.600x007","K73.901","B17.900x006","K83.100x001","Q45.003","K81.100","C22.301","K82.800x004","S36.100x041","B18.100x007","K71.500x002","T86.400x015","K75.001","I77.000x017","Q44.301","K76.900x002","K80.404","K80.400","K76.601","K74.300","K71.000x002","K86.200","K73.900","K82.200","K83.000","K83.016","K83.814","Q44.705","K85.002","C22.100","K80.200x001","K76.300","K74.600x036","K75.300","K75.000x003","C25.803","B16.101","K72.900x003+G94.3*","T86.800x021","K86.817","K75.804","K91.800x301","K74.500","K83.000x012","Q45.100","K76.800x003","K71.100x008","B18.800x005","T86.400x004","B18.800x002","T86.804","K80.304","B17.800x003","K85.816","K91.827","K72.902","K83.007","B18.107","K73.200x002","B16.100x003","K71.100x003","K76.500","K86.102","Q44.504","S36.103","B15.901","K83.014","K85.801","K70.403","K83.902","K76.800x015","B00.803+K77.0*","K81.007","K91.806","R93.203","S36.100x031","K74.600x031","C24.800x001","K74.600x034","K76.600x006","K92.800x012","K80.300x002","I74.800x016","K74.600","C25.800x001","K86.300","K85.301","C24.800","K73.100","K74.615+I98.3*","K82.804","C22.101","A52.700x007+K77.0*","K76.800x006","T86.400x001","S36.111","B16.901","K71.100","B16.100x004","K81.001","E80.600x006","S36.100x021","I87.121","K83.401","K83.307","K85.101","B17.200x005","B17.202","B16.904","B18.204","E83.102","K91.825","S36.113","K83.005","K76.800x022","K91.800x403","S36.101","K71.300x001","B16.100x002","K71.500x001","D13.400","B18.200","K85.814","B67.000x001+K77.0*","B16.203","D01.701","K83.804","K82.302","B54.x00","B17.203","K86.103","B18.200x009","E80.501","Q44.500x007","K72.000x005","K71.002","B16.000x001","C24.900","K80.203","A18.817+K87.1*","K80.801","K80.201","E80.600x005","Q44.101","K74.302+I98.3*","D37.600x003","D01.501","K91.826","R93.200x001","C25.802","K91.500","K80.100x001","A50.000x002+K77.0*","K83.105","B18.802","K74.605","A01.001+K77.0*","K82.000","B18.203","B17.803","K74.600x002","K80.300x005","Q44.505","B17.100","K71.601","Q44.500x005","I86.808","E80.400","K76.804","B65.904+I98.2*","E84.901","K74.301+I98.2*","K75.806","K82.001","K85.300","D01.502","K83.013","N82.201","I82.000x001","K76.603","K80.406","K86.809","Q44.703","E80.600x007","K82.805","B66.100x001+K77.0*","K83.100","B17.101","K71.100x006","K76.813","K83.817","K76.803","K74.617+I98.3*","Q44.102","C24.002","K86.804","K80.000x002","B15.002","K82.900x002","K86.100x004","K86.802","K83.102","K74.600x021","T86.400x007","K74.600x010","K83.302","D01.500x001","K80.303","K76.800x009","B65.900x004+K77.0*","K71.900x003","C25.100","K86.805","K71.901","B15.000","K82.807","K81.002","E80.500","S36.102","K70.001","K70.300","B25.100+K77.0*","K81.900x001","K76.819","C22.000","K82.306","Q85.912","K83.019","K76.806","K85.902","K76.700x003","B65.202+K77.0*","K72.004","K71.100x005","K71.800","Q44.002","D13.701","C77.204","B17.902","K91.840","K91.800x407","C25.401","I77.100x011","K80.302","K86.100x001","B25.101+K77.0*","K74.600x029","K74.100","K85.809","C45.704","B18.001","K71.104","Q85.911","T86.400x009","Q44.200x003","K82.305","K83.803","R93.204","E85.415+K77.8*","K85.822","S36.100x051","K83.011","K86.810","K74.600x041","K74.200","K85.821","R94.500","K65.007","K75.000x002","K80.002","C25.300","C24.101","K70.302+I98.3*","B18.801","K76.801","K83.301","K71.400x001","K74.603","Q44.001","D13.500","K83.010","B67.800x001+K77.0*","D13.501","K74.608","K83.006","K91.800x304","K76.500x001","D13.700x001","K76.602","K80.101","K83.807","K83.000x007","S36.112","I87.108","K91.841","K91.800x411","K81.005","K70.304+I98.2*","A18.814+K77.0*","S36.200x021","Q27.805","K83.009","K80.400x004","Q44.501","B16.202","K80.401","T86.400x013","K72.100","B19.002","K85.200","C78.807","Q44.100x002","K70.400x002","D13.500x003","I82.001","D37.602","K82.803","B45.800x001","D37.603","K76.807","K82.806","S36.202","K80.402","K74.000","I74.804","K82.301","A18.816+K87.0*","K74.606","K76.805","T86.400x005","B19.900","K81.003","I87.109","K76.817","E80.603","K83.100x008","K70.401","K75.400","A18.815+K87.0*","K86.000","K74.610","R17.900","K76.811","B18.004","S36.200x091","B17.103","K83.816","K82.802","K76.815","K85.800x001","B25.200+K87.1*","D13.600","I72.809","K85.201","K74.600x025","K76.101","K85.807","K85.815","D37.600x004","K85.102","Q27.800x004","B18.104","K91.800x401","S36.200","K73.800x001","E80.602","K86.901","Q44.003","B17.102","K71.100x007","Q45.300x902","S36.100x081","D37.601","B58.100+K77.0*","C22.900","Q45.001","T86.400x012","I74.803","K80.200x003","K71.700","Q44.400","T86.400x010","K83.819","B16.100","E80.601","K74.400","D17.700x015","C25.400","K70.303+I98.2*","B18.902","C24.003","K91.800x402","K75.300x001","K92.800x010","Q45.200","K75.805","K86.104","B17.900x004","K80.507","K74.619+I98.2*","Z52.600x001","B18.100","K80.501","K81.101","K85.813","K83.200x001","Q27.804","K74.600x042","K86.100x002","K73.801","K83.811","K85.800x002","Q44.601","T86.400x003","B18.800x003","D37.705","C22.300","B17.200x004","C78.700","K83.106","K83.901","K86.818","K83.805","K85.000","B66.301","B17.801","B17.900x002","K83.800x009","C78.806","K80.500x002","Q44.100x003","B17.903","K76.808","K75.401","B18.901","K71.903+I98.3*","R17.900x001","K75.003","K85.100","K71.701","K76.818","S36.100x001","K92.801"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCH入组条件，匹配规则：主诊断匹配");
        String result;

        result=HB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=HC1.group(record);
        if (result.length()>0){
            return result;
        }

        result=HC2.group(record);
        if (result.length()>0){
            return result;
        }

        result=HC3.group(record);
        if (result.length()>0){
            return result;
        }

        result=HJ1.group(record);
        if (result.length()>0){
            return result;
        }

        result=HK1.group(record);
        if (result.length()>0){
            return result;
        }

        result=HL1.group(record);
        if (result.length()>0){
            return result;
        }

        result=HL2.group(record);
        if (result.length()>0){
            return result;
        }

        if (record.ssList!=null && record.ssList.length>0 && Base.contains(Base.SS_VALID,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合HQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "HQY";
        }

        result=HR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=HS1.group(record);
        if (result.length()>0){
            return result;
        }

        result=HS2.group(record);
        if (result.length()>0){
            return result;
        }

        result=HS3.group(record);
        if (result.length()>0){
            return result;
        }

        result=HT1.group(record);
        if (result.length()>0){
            return result;
        }

        result=HT2.group(record);
        if (result.length()>0){
            return result;
        }

        result=HU1.group(record);
        if (result.length()>0){
            return result;
        }

        result=HZ1.group(record);
        if (result.length()>0){
            return result;
        }

        result=HZ2.group(record);
        if (result.length()>0){
            return result;
        }

        result=HZ3.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCH的ADRG入组条件");
        return "";
    }
}

