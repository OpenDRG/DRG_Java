package drg_group.taizhou_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.ADRG.*;

public class MDCN{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"D25.200x002","N84.200","Q51.802","D39.004","Q50.501","L29.200","Q50.000x021","N82.103","Q50.503","N81.400","Q52.103","C54.300","N73.202","N90.802","N90.404","N83.207","C53.900","S30.200x010","S31.402","Q51.100","N83.901","N90.800x011","N90.809","N92.000x002","E28.300x002","C56.x00","C45.100","N88.100","N94.600","N88.802","D39.000x002","N90.000","D28.204","N85.000","N76.301","N92.100x001","N76.100x002","D26.701","N90.700","N95.201","S38.200x001","N80.808","N83.500x004","C57.801","N76.000x004","N73.801","N83.810","N90.810","Q27.816","E28.300x001","Q52.703","N85.000x002","N80.300","N88.808","N80.200","S31.400x003","N70.104","Z31.200","N83.100","D39.000x001","N94.807","N94.803","N96.x00","Q85.900x045","N75.802","D06.700","A54.102","N83.812","C53.801","N89.600x001","N81.300","N88.804","Q51.502","C79.800x220","N83.807","N98.200","R87.300","N86.x01","N85.100","N85.300x001","Z31.100","N83.811","N88.300","D39.003","C48.100x006","R93.800x006","Z01.800x003","N90.806","N96.x00x002","D39.705","Q52.104","N91.100","N70.900x007","N90.800x024","N93.900","C79.823","D26.900","S37.400","D06.100","Z31.300x002","N76.500","N83.802","N70.900","N83.300x001","C79.800x219","Q52.402","C57.701","Q52.800x004","N85.809","A54.003","N97.300","A54.201+N74.3*","N88.000","C57.802","N81.800x005","N82.801","R87.100","N80.804","D07.301","Q52.300","N95.200","N83.000","N89.806","D26.100","Q52.700x004","T19.201","E89.401","N83.203","N85.600x001","Q50.603","C79.814","N83.808","N85.815","C79.800x211","N80.501","N94.000","A56.104+N74.4*","Q50.000x011","C76.307","N83.809","N83.805","N92.000x001","N70.002","Q51.100x001","C79.821","C79.813","N89.200","D25.200","Q50.600","N80.100","M35.202+N77.8*","N85.805","D28.205","D39.709","N73.600","N81.200","Q52.700x003","C57.800x004","Q52.700x005","C79.800x214","R93.800x007","S38.200x006","N81.602","N90.803","N99.300","N71.001","N95.300x001","Q51.805","D39.708","N98.800","N73.001","N83.206","N73.101","Q51.400","N98.000","I89.800x032","N93.000x001","N82.300","N85.813","A56.101+N74.4*","Q50.100","N89.700","N97.902","N89.901","B37.300x002+N77.1*","D28.200x003","Q52.403","N83.504","D27.x00","D28.201","N85.300","E28.000","Z31.200x003","N72.x02","N92.300","Q27.813","N96.x00x003","N80.805","N92.400","E28.302","N73.201","N80.802","I86.200","N92.401","D07.100x002","N85.808","E28.200x003","N73.902","N85.404","T28.300x003","A18.114+N74.1*","N81.203","N89.001","N83.806","S37.610","Q52.401","E28.301","D18.000x824","C79.833","D39.902","E89.400x001","Q50.600x903","Q50.601","N73.903","N90.807","C79.800x202","N85.402","N84.900","N76.000x006","N80.803","N83.800x012","E28.200","N82.303","C52.x00","E28.900","N90.501","N83.700","N87.901","Q51.201","C51.200","Q85.900x047","N73.002","N85.816","D25.000x002","N85.400","N73.501","C79.800x222","N94.900","S30.207","R93.803","N95.800","E30.900","N73.605","N84.001","Z31.300x001","N70.902","N91.400","C58.x00x003","C57.900","D39.706","N89.600","N83.600","N85.001","N94.805","Q51.901","N83.803","D28.202","N91.200","C54.200","N72.x00x003","T83.400","N85.700","Q51.000x001","Q52.408","Q52.000","N98.100","Q52.404","C79.800x223","N71.900x001","N97.801","N92.600","D07.303","T19.202","B37.302+N77.1*","N81.601","N87.900","Q51.001","N89.503","N95.101","R87.600","A59.002+N77.1*","Q50.200","Q50.302","C79.800x228","N97.400x002","Z01.400x001","N75.900","D25.900x001","Q51.804","N85.812","D39.201","N85.401","D26.702","N85.811","N85.801","D26.000","C57.101","D28.000x002","N84.300","N89.101","C79.812","N90.302","Q52.400x006","N76.300x001","D39.001","A18.115+N74.1*","C79.800x205","D28.100","N73.600x006","N76.100x001","N90.101","A56.004","Q50.602","N73.300","N92.400x003","N86.x00x004","Q50.301","N85.803","N92.400x001","N83.800x013","N76.401","D39.704","N80.801","N83.204","A18.100x030+N77.0*","N99.801","N82.500","N70.001","S37.710","N82.200","N88.805","N90.601","N84.800x002","N98.900","N87.100","C57.803","D07.000","N83.102","N88.102","E28.100","N80.200x001","N83.101","A18.112+N74.0*","N76.000x001","N88.400","N92.400x004","N89.502","D39.710","N85.002","Q51.900","N90.100","N82.000","D25.901","D25.100x001","D07.100","N90.500","N87.001","D39.707","N80.800x010","A56.002","N76.802","N87.101","N81.600","N89.805","D28.200x002","S37.500","R87.500","N82.401","S37.600","N88.806","N97.000x001","C51.900","D39.200x002","N94.806","N85.500","N83.201","C54.800","A18.102","D39.002","I86.300","N80.800x007","Q56.300","N73.606","N97.900","C57.300x001","N70.906","D25.000","D06.900","N83.902","Q52.702","N89.802","D06.900x002","N76.101","C79.800x206","N89.810","N90.808","A51.400x009+N74.2*","N97.101","N97.100x001","N73.500","N73.602","N83.000x002","N80.301","D26.100x002","D39.203","C56.x00x003","N91.000","A18.100x032","C57.400","Q50.000","N89.600x002","Q51.800x011","N76.201","D48.127","C57.100","N75.801","Q52.406","N73.103","N87.002","N85.810","N90.804","Q51.800x012","N81.100","Q51.808","S31.400x001","N95.900x001","D39.005","N94.100","D28.203","N85.807","N92.500","N72.x03","C57.700","D28.700x001","N88.801","N89.501","N82.901","Q51.800x007","S30.200x008","E28.300x008","D25.900","C54.001","N89.400","D18.000x856","N87.200x001","N99.807","S37.510","R87.400","N81.500x002","T28.300x002","N80.602","A18.100x019+N77.1*","D07.200x002","N80.401","Q85.900x016","N73.102","T83.302","N81.202","N97.400x001","D27.x01","N89.809","Q56.400","R87.000","N80.600","Q27.814","Q50.600x904","Q52.400x007","D26.700","E28.303","Q51.801","N93.801","Q52.101","D28.206","D39.100x001","N92.101","C58.x00","N71.102","A18.113+N74.1*","N85.403","N70.904","N80.001","N90.301","D07.200","N76.400","Q50.303","N90.800x012","N84.000","N76.200","C57.200","N99.800x005","D39.901","T19.300x001","N88.803","N80.302","N86.x02","N99.800x003","Q52.901","N89.300","D25.100x002","Q51.203","C57.301","C53.100","N70.900x003","N83.804","S31.401","D07.304","C46.700x001","N92.601","Z52.800x001","C79.800x218","Q51.202","T83.305","N99.800x010","N73.604","S39.902","N82.101","N76.001","N73.800x002","A18.111+N74.1*","S31.400x002","N90.701","N94.400","N81.800x004","N83.503","C51.800","N88.201","Q51.000","N84.100","N95.000","C77.500x003","C57.300","N88.807","N90.902","D28.900","N70.903","A56.003","B37.300+N77.1*","N89.000","N80.800x011","N89.811","N80.601","R87.800","N76.600","N90.901","Q51.501","N89.804","N82.900x003","N70.103","S37.602","N80.806","T28.300x001","N97.901","N90.805","N82.102","T83.400x001","N90.801","N90.403","N89.803","N80.900","N83.100x002","I89.000x018","N71.002","R87.200","N83.502","N88.101","D39.702","N75.000","N85.814","A18.100x026+N74.1*","N80.303","B26.800x009+N74.8*","N89.601","D39.204","N80.000","N97.100x003","N80.500","N83.801","N72.x00x006","N85.000x004","N89.800x009","N70.901","N91.300","A56.100x004+N74.4*","Q52.407","Q50.401","C53.800","N94.200","N82.902","C57.000x002","N90.800x010","C58.x00x002","N90.800x025","Q51.600","T28.800x003","N70.905","C54.000","N83.800x016","N89.807","Q52.701","N83.500x007","N89.801","N89.100","N83.800x017","N82.900","N70.102","N85.600","N83.800x015","N92.200","S37.600x002","N82.100x001","N85.200","N72.x01","N81.802","N90.400","N90.402","T83.303","Q51.806","C51.001","S38.200x002","D39.101","N89.808","N83.202","N98.300","C55.x00","N83.205","N83.501","D39.700x002","N81.803","Q50.502","N32.004","E89.400x002","T83.304","N83.100x003","N84.302","N99.800x007","N94.300","C79.800x213","C57.800x005","N81.301","B37.301+N77.1*","S37.410","N82.301","N71.101","N91.500","N76.801","N94.802","D17.300x003","N95.100","N90.200","D39.900x001","D39.903","N81.101","C51.000","C54.100","D17.700x024","N76.000","N90.401","N80.603","S37.601","N97.800x004","C79.800x209","N80.100x001","N85.802","C57.000","N73.603","I89.800x033","A54.004","N90.001","N91.200x002","N82.502","D39.100x003","C79.824","E28.800x002","N90.600","A18.100x024+N74.1*","Q56.000","N73.400","N85.901","S37.810","N83.300x002","D28.000","Q51.300","N84.301","D18.000x854","N94.500","A60.000x003+N77.1*","N76.601","N83.903","N85.806","D07.302","D39.703","N73.203","N94.800x009","N85.003","N85.800x003","N94.804","N88.800x010","N85.804","Q50.504","Q52.601","R87.700","A54.200x004+N74.3*","N88.900","N87.000","C54.900","T28.800x002","T28.800x001","C79.822","N90.811","I89.000x019","N71.902","N75.100","N73.104","N85.101","N93.901","C79.800x215","N81.900","N83.800x021","Q52.405","N73.003","C79.600","N70.100","N81.000","N70.101","N81.201","Q50.400","D20.103","N83.401","D39.700x001","N81.102","N90.800x009","D39.200x001","C51.100","N99.201","N73.601","Q51.803","Q56.200","D39.701","C79.800x216","N81.801","N81.500","N80.807","T83.301","I77.009","Q52.200","D39.202","D18.000x853","Z31.201","N83.001","N70.000","E28.300x005","N99.200","C53.000","N71.901","N97.200x001","D06.000","N97.200x002","N76.000x003","N83.601","S39.901","D18.000x817","A54.005","Q52.500x001","N94.808","S30.200x007","C57.702","N80.809","N82.501","Q50.300x101","Z31.000x001","N90.300","A56.100x003+N74.4*","N88.200x001","N81.500x003"};
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
