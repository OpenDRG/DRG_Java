package drg_group.beijing_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.ADRG.*;

public class MDCN{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"D28.000x002","N76.802","N71.101","N94.803","Q51.805","N95.101","N73.606","N83.000x002","C56.x00x003","N70.000","N89.101","N70.901","C57.300x001","N90.001","D07.200","R93.800x007","I86.200","N94.600","R87.700","A54.003","C54.900","D39.903","N85.814","N82.500","C58.x00","N92.300","S31.401","E28.300x008","I89.000x018","N81.400","N80.800x010","N90.805","D06.700","N80.100x001","N93.801","N98.000","N90.807","N80.300","N89.600","S31.402","N85.812","N83.500x004","Q51.600","Z31.300x002","C79.800x211","N85.400","N83.204","N70.001","N70.902","I89.800x032","N83.100x003","R87.400","N83.812","Q51.400","S30.200x007","N71.002","N80.600","D25.000","N80.806","N97.000x001","N98.900","C53.801","Q52.408","N95.300x001","N83.800x017","A18.100x030+N77.0*","N76.100x001","Q50.504","N71.901","C54.000","N73.500","N90.800x024","N82.303","N73.600","N87.101","D39.100x001","Q51.203","C79.800x216","N88.800x010","N70.002","N83.102","Q51.806","D39.707","N82.801","D39.004","T28.300x001","D25.900x001","N83.203","N85.401","N90.200","N96.x00x002","N80.802","N88.101","D28.200x003","E28.800x002","D25.901","Q52.702","N83.401","Q50.200","L29.200","S39.901","N88.201","D39.700x002","N72.x00x003","B37.301+N77.1*","N89.802","D07.200x002","N76.801","N80.001","C57.900","N83.504","N76.000x006","Q52.400x007","N91.100","N94.807","D39.708","N70.900","Q51.502","N90.801","N80.805","N76.101","S31.400x001","N94.800x009","N81.101","N81.900","N89.001","N89.901","N83.902","N83.800x013","N92.000x002","T83.303","Q51.803","Z31.200x003","C79.823","N93.901","N85.300x001","N97.101","S31.400x002","N81.801","Q52.700x003","C57.301","T28.300x003","C57.803","N73.002","N89.808","E28.000","A56.100x003+N74.4*","N85.403","N75.802","N90.401","E30.900","N84.300","N90.810","A56.002","N73.603","N70.103","N89.400","D28.900","T19.300x001","N95.000","Q50.000x011","N86.x00x004","Q52.104","Q85.900x016","N85.813","Q51.802","A51.400x009+N74.2*","N80.803","D26.100","N98.200","Q51.100","N85.804","R87.000","D06.100","Q51.000","A60.000x003+N77.1*","N99.800x003","R87.600","C57.300","N88.802","N83.601","N83.502","D28.100","N90.800x025","N98.800","N94.804","N94.802","D26.100x002","N73.203","N88.900","N94.500","D25.200","N73.604","N80.500","D07.302","N80.800x007","Q50.501","C79.814","N88.300","N73.801","S30.200x010","C57.800x005","N73.902","N82.200","A18.113+N74.1*","N83.804","N89.600x002","N82.901","N71.102","D39.703","N90.802","S31.400x003","N92.601","D25.000x002","Q51.804","N70.900x003","N87.001","N90.804","D39.901","N93.900","C53.000","D39.706","N89.811","N85.811","N94.000","D28.000","N73.003","T83.301","D28.202","N84.001","N80.302","C57.801","A56.104+N74.4*","N99.800x007","Q50.603","C79.812","N81.300","C57.200","N83.100","C57.701","Q52.700x005","N85.816","N89.810","A54.201+N74.3*","N73.600x006","N81.203","S37.601","D18.000x824","N83.800x012","N83.001","N85.000x002","N85.001","N89.804","D39.704","N80.800x011","N91.200","D39.003","D07.100x002","N90.302","N90.700","R93.800x006","N80.807","N85.000x004","Z01.800x003","N80.602","D39.001","N88.801","N83.101","N90.800x009","N71.001","N97.100x003","Q52.407","Q52.800x004","N70.900x007","I89.800x033","N90.800x011","N85.808","N90.800x010","Q51.100x001","N81.601","E28.303","N83.809","Z01.400x001","N84.800x002","B37.302+N77.1*","Q51.800x012","N99.201","T28.300x002","N88.102","D25.900","N89.601","D39.000x002","N73.202","E28.300x002","N76.200","D39.902","N91.400","Z31.000x001","Q50.000","N80.401","N90.809","N99.801","D39.204","N81.202","D25.100x002","C79.800x209","A18.100x026+N74.1*","T83.304","N80.801","N85.300","N84.301","C57.400","N97.800x004","C57.000","C57.101","D39.201","N90.811","N90.701","N95.201","N70.903","N90.601","N71.900x001","N71.902","N81.500x003","N73.602","N80.603","N73.800x002","N90.501","C54.300","N94.300","N72.x01","N70.906","S38.200x001","N95.800","N85.805","N95.900x001","A18.112+N74.0*","Q85.900x045","N89.803","E28.301","N92.101","D27.x01","D39.200x002","D17.700x024","A18.100x019+N77.1*","D39.900x001","N81.500x002","N94.805","N82.501","N83.807","T28.800x002","T83.400x001","N92.100x001","N83.300x002","N89.800x009","I89.000x025","N81.600","Q52.402","N73.103","N89.700","N89.600x001","N85.801","N80.301","C79.800x215","D18.000x854","N89.502","N85.806","N90.808","N90.901","N73.300","N76.301","N75.900","C57.000x002","A56.004","N90.902","N97.100x001","Q50.502","N90.400","T83.305","B37.300x002+N77.1*","N85.003","N90.404","S39.902","D27.x00","C48.100x006","D28.203","N80.804","N80.303","N70.101","R93.803","C79.824","A18.100x032","I77.009","N90.803","N91.300","N97.801","Q52.406","N83.800x016","N89.807","D39.701","N70.102","N76.601","Q56.400","D06.000","N85.100","N81.100","C79.800x218","N85.101","N85.815","N90.403","N80.000","N76.000x004","N85.600x001","D18.000x856","E89.400x001","N76.100x002","Q27.816","Z52.800x001","N81.800x004","N83.811","I86.300","N92.400x004","Q50.300x101","N85.402","N86.x01","N88.400","Q56.200","N81.102","B37.300+N77.1*","C79.800x223","R87.300","A18.102","D39.005","N85.200","N97.200x001","N70.905","Q52.401","N83.206","E28.302","I89.000x019","N83.800x021","A54.200x004+N74.3*","D26.701","N94.100","D28.200x002","A18.100x024+N74.1*","C46.700x001","N90.800x012","N72.x03","E89.400x002","N98.100","N81.602","N82.103","N81.000","N83.501","N76.500","D28.206","C53.900","Q51.800x007","Q52.405","D28.205","N85.000","Q85.900x047","N89.805","N70.904","N92.500","C79.800x205","N89.100","C52.x00","N88.100","C57.802","C53.800","Q50.600x904","N75.100","N87.000","Q51.000x001","N85.901","Z31.201","D06.900","N75.801","N83.100x002","D26.700","N82.401","N99.300","N83.500x007","D39.700x001","N87.900","Z31.100","D39.100x003","Q50.602","Q56.000","A56.101+N74.4*","N91.500","N99.800x005","D39.203","N80.501","R87.500","D39.702","N76.000x001","N82.301","N92.600","Q50.601","N88.808","N90.402","Q52.901","S37.610","N70.100","C58.x00x003","N76.600","D39.710","C57.700","N89.501","N85.600","T28.800x001","N83.201","C79.800x202","N83.300x001","N76.000x003","N82.000","D07.303","Q50.303","N82.100x001","S37.600x002","D39.000x001","N76.401","N90.000","N88.803","C51.200","C79.800x222","N73.001","N87.002","C79.800x214","Q51.800x011","N90.101","D48.127","N84.000","T83.302","N85.802","N89.300","N84.200","N94.808","Q50.503","Q51.808","N83.800x015","S37.600","N95.200","N83.801","C51.900","Q52.403","N76.400","N80.900","N84.900","N92.000x001","S30.207","C77.500x003","N85.809","D26.000","Q50.400","N90.100","C79.800x213","A18.115+N74.1*","N82.102","A56.100x004+N74.4*","N81.802","N82.900x003","N92.400x001","N93.000x001","N90.500","C79.800x206","N80.200x001","N81.200","Q51.202","T83.400","Q51.501","Q52.500x001","D26.702","Q50.100","N88.000","C51.001","N81.301","C55.x00","N83.600","N88.807","S37.400","N85.803","Q52.200","E28.200","S38.200x002","N91.200x002","A54.005","D07.301","M35.202+N77.8*","S37.500","N87.901","N83.810","N73.601","N81.500","D26.900","N80.100","N85.700","C57.702","C51.000","N83.207","D39.705","E89.401","N72.x00x006","N83.805","N73.903","E28.300x005","N85.500","N76.000","N81.803","N73.605","Q51.801","N83.205","C79.800x219","N88.806","N82.900","E28.300x001","D18.000x853","N96.x00x003","R87.200","Q51.900","N80.200","N88.805","N94.200","N82.300","N94.806","C79.600","N85.002","N89.000","N95.100","Q52.601","C54.800","D25.100x001","Q51.001","Q52.000","N76.300x001","Q52.700x004","Q50.000x021","N85.807","N76.001","N90.300","N90.806","N92.401","C79.800x220","C56.x00","N89.806","N97.400x002","S37.410","N80.809","Q52.404","N99.200","A18.114+N74.1*","N87.100","Q52.400x006","N80.808","N84.100","N89.801","N83.700","N97.901","N73.201","N83.802","T28.800x003","N90.600","N94.900","N76.201","Q51.300","D39.101","N87.200x001","C79.833","C51.800","N97.900","Q50.600","N73.501","S37.710","S30.200x008","Q50.600x903","C58.x00x002","A54.004","D39.200x001","N97.300","Z31.300x001","D17.300x003","N97.400x001","N97.200x002","Q51.901","N88.200x001","N83.903","A18.111+N74.1*","N85.404","Q52.703","N32.004","C57.800x004","D28.700x001","N82.101","Q50.302","N73.101","C54.200","Q52.300","D39.709","N72.x02","N91.000","N81.800x005","C79.813","N99.807","N82.502","N89.809","N83.803","N89.200","D39.002","E28.200x003","D07.000","N83.503","D28.201","Q50.401","C57.100","Q51.201","Q27.813","N96.x00","B26.800x009+N74.8*","S37.510","N97.902","D25.200x002","C79.822","T19.202","D39.202","C53.100","N83.000","N84.302","N90.301","N80.601","E28.900","N99.800x010","C54.001","N85.800x003","Q50.301","N82.902","A54.102","N73.400","E28.100","Q56.300","A56.003","C79.821","N81.201","R87.800","N83.808","N92.400x003","S37.602","N98.300","C79.800x228","N70.104","C76.307","D07.304","N73.104","N83.202","N92.400","Q52.701","N94.400","N83.901","N88.804","Q27.814","N89.503","N73.102","N83.806","S37.810","Z31.200","D28.204","D20.103","N86.x02","A59.002+N77.1*","T19.201","S38.200x006","N85.810","D18.000x817","N75.000","Q52.103","Q52.101","D07.100","R87.100","C54.100","N92.200","C51.100","D06.900x002"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]) && record.gender!=null && record.gender.equals("2"))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCN入组条件，匹配规则：主诊断匹配、女性");
        String result;

        result=NA1.group(record);
        if (result.length()>0){
            return result;
        }

        result=NA2.group(record);
        if (result.length()>0){
            return result;
        }

        result=NB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=NC1.group(record);
        if (result.length()>0){
            return result;
        }

        result=ND1.group(record);
        if (result.length()>0){
            return result;
        }

        result=NE1.group(record);
        if (result.length()>0){
            return result;
        }

        result=NF1.group(record);
        if (result.length()>0){
            return result;
        }

        result=NG1.group(record);
        if (result.length()>0){
            return result;
        }

        result=NJ1.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合NQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "NQY";
        }

        result=NR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=NS1.group(record);
        if (result.length()>0){
            return result;
        }

        result=NZ1.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCN的ADRG入组条件");
        return "";
    }
}

