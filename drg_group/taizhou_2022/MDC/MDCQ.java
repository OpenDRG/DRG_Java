package drg_group.taizhou_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.ADRG.*;

public class MDCQ{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"D86.100","D84.900x002","I88.900x005","D64.000","E80.000x004","D68.200x009","D61.000","D73.807","D69.100x003","D68.900x006","D61.006","D65.x04","D69.501","M32.111+D77*","E80.100x002","D18.100x017","R59.100x002","D56.200","D56.100","D59.100x002","D68.900x003","D83.900","D61.102","D58.200x004","D60.800","D57.200x001","I89.800x011","E85.400x004","D61.802","D58.201","D57.301","D82.800x001","D53.001","D68.206","D69.100x002","D64.001","D69.400","D75.801","D81.601","R93.300x002","D60.000x001","D82.000","R59.004","D73.800x002","D64.802","D89.100x003","D80.102","D65.x01","D69.000x007","D55.800","D81.800","D59.100x005","D84.800","D80.200x001","D72.801","D75.103","D59.903","D69.000","D89.100","D59.500x001","D17.700x031","D59.404","E80.200x008","D58.206","D18.100x023","D52.001","S36.000","D68.200x007","S36.000x021","R16.100x001","D68.401","D50.102","D59.604","D68.300x001","D57.204","D73.200","D73.300","D53.801","D50.801","D52.800","D53.100","D61.000x006","D68.300x004","I86.810","D51.300","D73.400","I88.900x006","D59.000","D83.000","D71.x00x003","D81.901","D53.200","D80.500","D68.903","D72.001","D75.805","D58.202","D58.000x003","D55.000","D72.101","D51.002","D65.x03","D70.x04","R59.014","S36.002","D68.202","D70.x01","D80.400","D58.800","D55.203","E80.200x004","D89.002","D61.901","D72.105","D59.200","D69.006","D69.802","D70.x00x010","D57.203","D69.900","D55.204","D89.000","D68.601","D74.800x003","D60.100x001","D68.300","D61.002","D61.909","D68.200x005","D73.800x007","D64.900x007","D69.400x001","D68.203","D76.101","D55.200","D73.808","D46.000x003","D59.403","D68.901","D72.807","D69.801","D80.900","D89.900","L04.300","D69.100x001","D82.300x002","D69.500x003","D69.203","L04.900x005","D55.201","D69.007","D47.700x011","R23.301","D58.900","D61.908","D72.804","D50.800x001","D64.100","D72.808","D60.900x001","E80.201","D69.009","D55.900","R59.002","D81.000","D57.200","D61.007","D68.504","L03.901","D64.300","R59.010","D89.301","I89.010","D84.103","R59.008","D55.101","D68.503","D81.100","D57.302","D69.800","D64.901","D80.101","D81.803","D53.002","D76.300","D61.905","L04.202","D69.302","D70.x06","D58.203","D89.300","D73.504","D80.900x002","D59.105","D74.900","D69.010","D18.103","D68.100x001","D73.900","D68.505","D80.601","R59.012","D50.900","D69.000x013","D59.101","D67.x00x003","D47.700x009","D68.201","R59.000x012","D46.000","D58.200x002","D69.401","D68.000","D74.000x003","D73.503","D75.107","D75.000x002","D75.100","D80.100","D80.300","E80.001","D36.000","D74.801","D69.200x003","D64.900x006","D69.200x008","D56.800","D61.800x002","D70.x02","D66.x02","D72.900","D73.804","D68.302","D56.900","D68.600x003","D73.805","S36.000x031","D51.800","D76.302","D75.108","D64.900","D37.700x005","D72.806","D84.101","D51.301","L04.900x007","D57.201","D81.900x001","D73.502","D81.200","D50.100","D50.101","D61.200x002","D75.102","D18.100x003","D56.000","D47.700x010","D59.500","L04.201","D64.803","D72.104","D68.603","D74.800x001","I88.901","D70.x05","D68.900x005","E80.003","D75.802","D68.402","D66.x00x001","D75.803","D70.x00x011","D89.100x005","D75.902","L04.301","T86.000x004","D48.906+D63.0*","D58.200x006","D65.x00x001","D69.403","L04.100","D69.400x003","D82.900","D73.001","D84.102","D59.602","D76.200","D47.700x008","D59.600","D59.800","D72.000","D13.901","R59.000x009","D84.100","D68.502","D64.902","D37.703","D69.301","D57.100","D61.101","D72.803","D59.301","D82.100","D18.104","D75.901","D80.001","D57.202","D82.301","D51.102","D72.800","I88.900x003","D73.800x011","D53.000","R23.300x003","D59.400x002","D56.100x003","D18.100x002","D51.001","D68.300x003","D58.000","D69.200","D69.001","D69.300","D52.100","D69.000x011","D59.300x001","D68.501","D72.809","D75.800x003","D58.003","I88.108","D61.201","D56.100x001","D18.100x024","D59.601","D59.102","E80.200x007","D69.600","D58.204","D58.000x001","D50.001","D68.801","D75.101","D69.101","D53.901","D68.500","D81.700","D82.200","D70.x07","D83.800","D58.205","D58.002","R94.800x001","D73.800x010","D59.201","D70.x00","D71.x00x002","D80.002","D58.001","R59.005","D68.001","D76.100x005","T86.001","D89.000x003","D59.902","D82.300","D74.000x004","D83.200","D61.005","D69.406","C26.100","D59.901","S36.011","D75.111","D75.106","D61.904","D73.901","D69.103","D84.800x001","D68.101","L04.900x002","D68.400x002","D58.100x004","D18.100x006","D68.602","D59.103","D18.100x019","D68.902","D64.904","R59.011","Q89.208","D57.001","D55.100x001","N18.900x012+D63.8*","D68.301","D57.100x003","D73.000","L04.901","D69.004","D50.901","D68.303","D80.800x001","R23.300","D58.800x001","D75.806","S36.001","D81.400","R59.013","D70.x03","D89.100x007","D68.200x001","D57.000x001","D66.x01","D84.000","D59.401","D56.102","D72.805","D18.000x044","D59.104","D73.802","D74.000x002","D68.200x010","D62.x00","D61.903","D69.400x006","D86.101","E80.000","D55.001","D61.202","D51.200","R59.100","D72.802","D51.000","D69.200x005","D61.900","D65.x00x003","D80.000","D56.400","I89.802","D84.900x003","D69.002","R59.000x010","D68.205","E80.200x005","D56.901","D69.000x008","Q27.807","D80.100x003","T86.000","D71.x00","D69.504","D61.902","D68.400x003","D58.100x002","D57.300","D51.302+G32.0*","D82.800","D76.102","D89.100x001","D69.200x007","D64.801","D69.100x004","D73.100","D69.201","D55.202","D73.002","D69.503","Q85.907","D52.900x001","D74.000","D76.301","D52.000x003","D69.202","D70.x00x003","D71.x00x005","L04.900","D59.402","D55.100x003","D76.303","D69.003","D69.008","D56.301","I88.100","D76.100x003","D70.x00x001","D80.800","D21.900x015","D61.801","D51.200x001","I89.806","Q89.004","D68.208","D68.605","D65.x02","D52.000x001","D81.000x002","D61.907","D61.906","D72.100","D75.110","D69.405","D84.900","D69.407","D64.200","D70.x00x004","D71.x01","D18.107","D75.109","D64.903","D69.102","D89.000x004","D56.300","D65.x00x005","D71.x00x004","D61.004","D89.800x003","D61.001","D69.502","D75.809","D59.900","D56.101","D68.200x006","D64.401","R59.003","D72.800x003","D75.800","S36.000x081","D53.803","D68.000x002","D84.100x002","D84.100x005","D59.501","D81.802","D76.304","L04.902","D58.101","D89.100x004","R59.006","E80.200x001","D89.800","D70.x00x008","D80.901","D53.804","D61.003","D89.100x006","N18.400x001+D63.8*","D75.807","D53.900","D89.800x002","D68.204","D51.100","D69.000x010","D83.100","D82.400","D59.603","D72.102","D73.803","D68.200x008","R59.007","E80.202","I88.800x001","D58.901","D51.900","D58.801","D68.400","D46.000x002","D64.800x002","D69.800x002","L04.200","T86.000x003","D61.900x001","D69.500","D57.800","D18.100x018","D81.900","D51.101","D37.704","D55.300","D66.x03+M36.2*","E80.002","D89.001","D69.200x006","N18.500x001+D63.8*","D69.400x002","D73.801","D53.802","L04.800","R59.000x013","D80.700","C78.805","D75.000","D75.105","D64.400x001","D75.804","D68.604","D61.300","D68.000x001","E80.100","E83.101","N18.300x001+D63.8*","D73.500","D67.x01","D75.104","E80.203","D70.x00x005","D73.505","D76.100x004","D59.600x004","D81.801","D51.003+G32.0*","D81.600","D89.200","D73.501","D50.000","D64.300x002","D68.207","D58.100","D89.100x002","Q89.200x601","D59.400x001"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCQ入组条件，匹配规则：主诊断匹配");
        String result;

        result=QB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=QJ1.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合QQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "QQY";
        }

        result=QR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=QS1.group(record);
        if (result.length()>0){
            return result;
        }

        result=QS2.group(record);
        if (result.length()>0){
            return result;
        }

        result=QS3.group(record);
        if (result.length()>0){
            return result;
        }

        result=QS4.group(record);
        if (result.length()>0){
            return result;
        }

        result=QT1.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCQ的ADRG入组条件");
        return "";
    }
}

