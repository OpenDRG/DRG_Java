package drg_group.suzhou_2023.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.suzhou_2023.Base;
import drg_group.suzhou_2023.MedicalRecord;
import drg_group.suzhou_2023.ADRG.*;

public class MDCM{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"D18.000x855","B37.402+N51.2*","N48.101","S37.910","D29.300","A18.118+N51.1*","C62.100","N48.802","C63.201","N49.101","S30.202","Q53.100","N49.900","Q85.900x047","I86.101","N50.816","N43.100","N48.810","N48.102","N48.808","Q55.200x901","Q55.400x008","R86.700","N48.400","N48.809","N44.x02","N45.001","R93.802","Q55.401","Q53.102","N50.808","N48.400x007","Q55.403","C63.900","I87.120","N49.002","N47.x00x001","N50.825","Q55.600x007","Q53.200","N48.100","D17.700x034","N50.803","C60.800","Q56.002","D29.401","N45.908","I87.804","S39.900x010","N42.802","R86.600","R86.000","N41.900x001","E29.000x002","N49.001","N41.000","N41.800","N50.800x024","N50.800x027","S38.200x003","C60.901","N50.815","N49.204","N42.102","A54.204+N51.1*","D40.901","Q55.901","C63.000","N45.906","N48.600","C79.815","N50.800x001","Q54.900","N36.801","D07.400","Q53.201","I89.000x025","C63.701","S30.206","N46.x00","N48.901","N45.000","N43.300","Q55.600x009","I89.800x010","N49.202","Q56.000","B26.000+N51.1*","N48.301","Q55.001","Q55.400x006","Q55.101","Q55.605","N44.x00","N50.823","D07.402","N50.000","E89.501","N50.800x012","N40.x01","D40.702","Q55.300","Q55.606","D17.600x001","N42.301","A06.800x004+N51.2*","N50.804","N48.300","Q56.001","N41.101","S30.203","N50.826","D29.001","D40.900x001","N49.104","C62.901","Q55.502","N48.803","Q55.404","D07.602","A18.116+N51.8*","Q53.000x003","N49.205","Q55.202","C63.700","N50.814","D48.127","Q55.004","N50.824","Q56.100","D29.400","N50.811","N49.103","A18.110+N51.8*","Q53.202","N49.201","S39.904","N49.203","S31.301","D40.101","D29.100","N50.800x023","N50.806","S37.811","S31.300x002","R86.200","Q55.604","Q55.800x001","Q55.602","A60.003+N51.8*","C79.816","C62.000","N48.000","N50.822","N48.401","N41.300","N50.821","C79.820","N50.800x002","E29.002","N49.800","S38.000","N50.900x008","C62.900","N46.x01","N45.901","N46.x02","R86.900x003","N45.905","D40.001","N40.x00","N50.100x001","Q54.001","S37.801","Q55.802","S38.200x005","N50.800x042","I89.000x023","S37.802","D40.704","S38.200x004","I86.200","N50.800x014","A18.119+N51.8*","Q55.600x008","N42.101","N43.001","N45.002","D29.700x004","E29.100","C61.x00","Z31.000x004","N50.903","S38.001","Q85.900x032","R86.903","E29.900","N45.907","N48.811","I89.000x022","C63.800","N50.820","N50.102","N44.x01","N48.804","N42.000","Q54.200","Q53.200x001","E29.101","N48.813","D18.000x818","C79.819","E29.800","E29.000","D40.701","A56.103+N51.1*","E29.102","N43.301","Q55.801","N50.900x006","T19.800x002","S30.208","Q53.900","D40.703","E29.100x002","A18.100x020+N51.8*","N50.101","S31.200","C79.818","Q55.900","Q54.400","Q56.400","N50.802","N41.200","N50.818","N48.403","S31.300x001","A54.202+N51.0*","N42.801","D17.700x033","N48.402","Q56.300","E29.105","R86.500","Q54.300","N48.400x008","N48.204","T83.600","D40.700x003","Q53.901","C60.200","A54.203+N51.1*","N50.800x028","Q53.101","I86.100","D29.900","N48.203","S30.205","D07.601","D40.700x002","N41.100","D40.000x001","N50.801","Q53.000x002","N50.902","Q55.800","Q54.800","D29.703","N47.x01","D29.000","N48.801","D40.700x001","I89.000x024","N43.201","N50.805","D07.401","R86.300","Q55.601","N50.810","Q54.100","D29.700x005","N42.300","A56.102+N51.1*","N45.904","E29.106","Z41.200","N48.800x009","C60.100","N50.901","R86.800","Q55.203","C63.200","C79.800x228","Q55.501","E29.104","N50.900x007","Q53.100x001","N48.800x005","N43.400","N48.001","N42.901","T83.401","N48.201","N49.102","N50.900x005","I89.008","R86.400","R86.100","A18.100x018+N51.8*","N48.400x005","N48.400x006","N48.807","Q55.402","R86.902","E29.100x004","Q53.902","D18.000x815","N48.805","D07.500","C60.900","C79.800x233","N50.819","Q54.901","N47.x03","C79.800x231","D29.200","C79.817","N50.800x038","Q55.002","C60.201","S37.804","N50.812","N41.900x002","C60.000","D40.100x002","Q55.100x002","N48.000x003","Q55.003","D18.108","N43.302","N50.813","E29.103","N46.x00x007","A59.000x003+N51.0*","N50.809","N48.812","Q55.603","N50.807","E29.001","N43.000","N48.500","N50.800x016","N50.827","N50.103","S39.900x007","D07.603","D29.701","N42.200","A18.117+N51.1*","Q53.000","T83.601","C62.001","C63.100","N45.903","S39.900x009","N50.800x041","N50.817","S31.501","C63.702","Q55.405","R86.901","Q55.201","N47.x02","N45.902","N50.800x025","N43.101","A60.000x004+N51.8*","N48.806","A18.109+N51.0*","N48.202","C63.801","Q54.000","D29.702","N50.800"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]) && record.gender!=null && record.gender.equals("1"))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCM入组条件，匹配规则：主诊断匹配、男性");
        String result;

        result=MA1.group(record);
        if (result.length()>0){
            return result;
        }

        result=MB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=MC1.group(record);
        if (result.length()>0){
            return result;
        }

        result=MD1.group(record);
        if (result.length()>0){
            return result;
        }

        result=MJ1.group(record);
        if (result.length()>0){
            return result;
        }

        if (record.ssList!=null && record.ssList.length>0 && Base.contains(Base.SS_VALID,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合MQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "MQY";
        }

        result=MR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=MS1.group(record);
        if (result.length()>0){
            return result;
        }

        result=MZ1.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCM的ADRG入组条件");
        return "";
    }
}
