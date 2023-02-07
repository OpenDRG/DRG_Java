package drg_group.wuhan_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.ADRG.*;

public class MDCM{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"N46.x00","Q55.300","N50.801","N48.202","S38.200x005","S38.001","N50.804","D07.603","Q56.400","N45.901","N49.203","S39.900x009","N43.001","N42.000","N50.800x041","N97.400x002","N47.x01","N49.102","S39.904","N50.800x016","S38.200x004","S31.300x002","D40.101","N48.809","C63.700","I89.000x023","N44.x01","S37.802","N45.902","N50.808","I86.200","A18.117+N51.1*","N48.806","Q55.202","N46.x00x007","C60.100","N48.803","I89.000x025","N47.x02","N50.800x025","N50.901","C60.901","A58.x00","C62.901","N41.900x002","N44.x02","N48.804","Q56.100","B45.800x002","Q55.400x006","N47.x00x001","N50.817","N50.800x028","N50.800x024","N43.201","R86.000","Q55.601","S30.205","D40.901","N50.811","N48.101","A63.002","D17.700x034","N48.203","A18.118+N51.1*","D29.700x005","N48.807","N49.103","C79.818","D40.900x001","N42.300","D29.700x004","N49.900","C60.900","N41.900x001","Q55.801","N50.823","N44.x00","N45.904","S30.203","C79.816","N45.000","Q85.900x032","N42.102","I89.000x022","N43.100","N48.800x009","N50.818","N50.812","Q55.200x901","C63.702","N47.x03","A57.x00x002","N50.805","K65.013","Q55.101","N43.000","D07.401","R86.900x003","Q55.402","C79.800x233","C60.200","Q55.605","C62.900","N48.810","N48.801","N50.810","N49.201","Q55.004","N97.400x001","Q55.403","A60.000x004+N51.8*","C62.000","E89.501","C63.100","N42.901","N50.813","N49.202","N50.806","A54.204+N51.1*","Q53.900","S31.501","T83.401","N48.100","S30.202","S37.804","I89.000x024","C60.000","D29.200","N50.100x001","A18.110+N51.8*","N43.301","I89.800x010","R86.600","N46.x01","Q53.000x003","R86.901","Z31.000x004","S37.801","Q53.000x002","A18.119+N51.8*","N50.000","N50.900x007","N48.901","N50.824","C61.x00","Q55.800","D17.600x001","N42.200","C63.000","N41.100","R86.100","C60.800","D40.001","A18.116+N51.8*","C79.817","S31.200","N48.402","N49.104","A60.001","D29.702","N42.801","Q55.404","S39.900x007","Q56.300","Q55.900","N48.805","D40.700x001","N48.808","Q55.401","E11.400x360+G99.0*","Q55.003","C63.200","S30.206","D07.400","Q96.300","N50.102","N50.809","Q55.002","D29.703","C63.701","Q55.502","A60.900","N50.800x042","D48.127","S31.300x001","E10.400x360+G99.0*","N50.902","Q56.000","N36.801","N48.300","Q55.400x008","N45.001","N50.800x023","N42.802","I87.804","N48.301","N50.819","D40.700x003","N48.500","N50.825","C79.800x228","N48.204","A18.100x031","N50.900x005","N41.800","N48.400x008","N50.821","Q53.200","I89.008","Q53.100","C62.100","N50.800x002","E29.101","A60.003+N51.8*","N50.903","N45.002","A54.203+N51.1*","E29.000","N50.822","R86.400","K65.015","N50.815","D07.602","I86.100","N50.800x014","N50.807","D07.402","A56.102+N51.1*","Q55.100x002","N48.403","N43.101","C63.900","N50.103","N50.800x027","N41.000","S31.301","D29.100","N48.802","S37.910","Q55.901","N50.814","N45.908","B26.000+N51.1*","D07.601","Q53.902","D29.000","A54.202+N51.0*","N49.204","N48.600","C76.303","R86.300","N50.800","N49.002","N50.826","A57.x00x003","E14.400x360+G99.0*","E29.800","K65.014","N48.201","C79.815","S30.208","A18.100x021+N37.8*","N43.400","E29.102","R86.700","R93.802","A56.103+N51.1*","N45.903","N48.401","N48.400x007","N49.001","N50.900x008","A06.800x003","A18.100x020+N51.8*","N48.001","Q53.100x001","N46.x02","I86.101","S37.811","D18.108","I87.120","D17.700x033","T19.800x002","C60.201","Z41.200","C79.819","N49.800","Q55.600x008","A59.000x003+N51.0*","Q55.501","L29.300","D40.702","N50.827","A51.000","D29.001","C79.800x231","Q56.001","N45.907","S39.900x010","Q53.201","N48.102","A51.002","R86.200","N45.906","Q55.602","Q55.201","A06.800x004+N51.2*","N50.800x001","N42.301","Q55.603","N50.101","N48.812","L29.100","N48.400x005","R86.902","S38.000","D18.000x818","N50.800x012","N43.302","T83.600","N48.813","N48.400","R86.903","Q55.203","D29.701","N50.803","Q53.200x001","D29.401","D40.701","B37.402+N51.2*","N43.300","D40.704","N41.101","D29.300","D40.100x002","Q53.101","N49.205","C63.801","C62.001","N50.802","R86.800","Q55.800x001","T83.601","N48.811","A18.109+N51.0*","Q55.604","Q55.600x007","N42.101","Q53.901","N45.905","N40.x01","D07.500","N48.000","N41.200","Q53.000","N48.000x003","N50.800x038","N50.816","A51.000x002","N48.400x006","D29.400","N50.820","Q55.001","Q55.405","D29.900","N48.800x005","N50.900x006","N40.x00","Q55.606","N49.101","Q53.102","S38.200x003","C63.800","D18.000x815","C79.820","Q53.202","Q56.002","R86.500","A51.001","D40.700x002","D40.703","Q55.802","D40.000x001","C63.201","A18.100x018+N51.8*","Q55.600x009"};
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
