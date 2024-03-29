package drg_group.taizhou_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.ADRG.*;

public class MDCM{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"D29.000","N42.000","E29.000","Q53.902","N50.807","D07.602","Q55.802","Q55.801","N48.000x003","C79.800x228","N48.402","N50.800x025","A06.800x004+N51.2*","E89.501","D48.127","N45.902","E29.100x004","Q53.102","N50.800","Q55.300","T83.601","D29.701","N50.800x002","C60.201","D29.900","D29.400","A18.116+N51.8*","N46.x00","A18.118+N51.1*","Q55.002","Q55.400x006","C60.800","T19.800x002","Q54.900","N48.813","N50.806","N48.805","D17.700x033","N47.x03","Q56.001","R86.901","N45.000","R86.000","R86.902","Q53.202","D40.701","N42.101","N49.204","Q54.400","D40.101","N48.300","A60.000x004+N51.8*","C63.000","D29.401","N42.901","Q56.400","N42.200","N48.812","A18.109+N51.0*","N50.804","N43.201","N46.x00x007","R86.900x003","N41.900x002","Q53.101","Q55.101","N48.811","N50.821","N49.102","N50.900x007","Q55.603","N50.901","Q54.000","R86.700","Q55.800x001","S37.801","S31.301","N50.103","C63.702","N42.801","C63.900","N48.403","N50.800x023","S38.200x004","N48.101","Q55.405","N50.817","Q55.604","C60.000","Q55.800","N50.803","N48.802","A54.204+N51.1*","I89.000x025","N45.905","N49.001","C62.901","N48.800x009","N43.300","Q55.600x007","N48.800x005","N48.000","N50.801","C62.000","Q55.100x002","C63.201","C63.800","Q55.202","N49.101","N48.500","Q53.201","N50.900x008","N50.818","N50.800x038","C63.801","S30.202","N50.825","N48.301","A59.000x003+N51.0*","S30.205","E29.900","R86.800","N48.801","N48.400","A18.110+N51.8*","S38.000","D07.402","C63.701","D40.100x002","D40.900x001","N44.x01","N48.400x006","Q54.001","D29.703","D07.400","D29.100","A18.100x020+N51.8*","Q55.200x901","C79.820","N46.x02","S38.200x003","Q53.901","N41.000","N50.815","E29.100","B37.402+N51.2*","N50.903","N50.820","Q53.000x003","N50.101","Q55.900","S39.900x009","S31.300x002","N49.201","N50.813","Q55.201","S37.910","N50.823","N48.400x007","N41.300","N42.102","C79.818","E29.101","C79.800x231","S30.206","N49.800","N50.800x012","D40.700x002","S30.208","N40.x00","N45.001","N50.816","Q53.200","R86.300","D40.703","N50.000","D40.000x001","S31.501","N43.400","N50.826","E29.100x002","N41.800","I86.200","N49.202","C62.100","S31.300x001","D29.200","Q54.200","S37.804","N45.908","N40.x01","A18.100x018+N51.8*","Q53.100","B26.000+N51.1*","N50.812","D17.700x034","S39.900x007","Q55.004","D40.704","N42.301","N50.902","C62.900","N50.800x028","N48.804","E29.103","E29.105","N48.202","R86.400","Q56.000","N50.822","N50.827","I89.000x023","N36.801","Q56.002","N50.800x016","A18.119+N51.8*","N41.101","A18.117+N51.1*","D18.000x855","N48.901","N43.001","Q55.203","R86.100","N45.901","N45.903","Q53.000x002","N50.802","Q55.400x008","Q55.602","R86.500","D40.001","N48.400x008","N48.204","N48.102","R86.200","N50.824","Q56.100","Q54.300","N50.800x041","D29.700x004","N48.600","Q54.100","I86.101","N49.002","D40.702","N50.819","C63.200","N50.805","N48.808","N50.800x027","E29.000x002","D29.300","C63.100","N45.906","N44.x00","N49.205","N48.203","D18.000x818","I89.008","Q55.402","R86.600","N50.900x006","N41.100","Q55.601","N44.x02","N48.401","Z31.000x004","N48.803","D29.700x005","C60.900","Q55.404","N45.907","Q53.100x001","N48.807","C60.100","I86.100","S38.001","Z41.200","R93.802","Q55.001","I89.000x024","N46.x01","N41.200","D07.401","Q55.600x008","C79.816","D17.600x001","I89.800x010","S37.811","I87.120","Q55.605","I87.804","E29.002","N43.000","Q85.900x032","C79.815","E29.104","N50.800x014","D07.500","N50.810","N43.302","D07.601","D29.702","A54.203+N51.1*","N50.811","S30.203","Q54.901","C61.x00","Q55.600x009","N50.800x024","I89.000x022","Q53.000","N47.x02","E29.001","N42.802","N50.800x042","E29.800","N42.300","Q55.403","Q56.300","C79.819","C79.817","N43.100","N49.203","N45.904","N49.104","D18.000x815","Q55.901","C60.901","N50.800x001","E29.102","D40.901","N48.809","N47.x00x001","D40.700x003","N50.100x001","N43.101","S38.200x005","N50.102","E29.106","N48.810","T83.401","N48.201","N50.814","A54.202+N51.0*","C63.700","Q55.502","N47.x01","S39.900x010","N48.100","N43.301","N49.103","Q55.003","N45.002","N49.900","S39.904","R86.903","Q55.401","Q53.900","N50.809","C79.800x233","D07.603","N48.001","N50.900x005","Q55.606","N48.806","Q85.900x047","C62.001","Q53.200x001","S37.802","D29.001","C60.200","A56.102+N51.1*","D18.108","N41.900x001","D40.700x001","N50.808","S31.200","Q55.501","A60.003+N51.8*","Q54.800","T83.600","N48.400x005","A56.103+N51.1*"};
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

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
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

