package drg_group.zhejiang_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;
import drg_group.zhejiang_2022.ADRG.*;

public class MDCW{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"T20.000","T20.000x002","T20.000x003","T20.000x004","T20.000x006","T20.000x007","T20.000x008","T20.000x010","T20.000x011","T20.002","T20.003","T20.100","T20.100x002","T20.100x003","T20.100x004","T20.100x005","T20.100x006","T20.100x007","T20.100x008","T20.100x009","T20.100x010","T20.100x011","T20.100x012","T20.200","T20.200x002","T20.200x003","T20.200x004","T20.200x006","T20.200x007","T20.200x008","T20.200x009","T20.200x010","T20.200x011","T20.200x012","T20.201","T20.300","T20.300x002","T20.300x003","T20.300x004","T20.300x005","T20.300x006","T20.300x007","T20.300x008","T20.300x009","T20.300x010","T20.300x011","T20.300x012","T20.400","T20.400x002","T20.400x003","T20.400x004","T20.400x005","T20.400x006","T20.400x007","T20.400x008","T20.400x009","T20.400x010","T20.400x011","T20.400x012","T20.401","T20.500","T20.500x002","T20.500x003","T20.500x004","T20.500x005","T20.500x006","T20.500x007","T20.500x008","T20.500x009","T20.500x010","T20.500x011","T20.500x012","T20.600","T20.600x002","T20.600x003","T20.600x004","T20.600x005","T20.600x006","T20.600x007","T20.600x008","T20.600x009","T20.600x010","T20.600x011","T20.600x012","T20.700","T20.700x002","T20.700x003","T20.700x004","T20.700x005","T20.700x006","T20.700x007","T20.700x008","T20.700x009","T20.700x010","T20.700x011","T20.700x012","T21.000","T21.000x011","T21.000x021","T21.000x031","T21.000x032","T21.000x033","T21.000x041","T21.000x042","T21.000x043","T21.000x051","T21.000x052","T21.000x053","T21.000x054","T21.000x055","T21.000x056","T21.000x057","T21.000x091","T21.100","T21.100x011","T21.100x021","T21.100x031","T21.100x032","T21.100x033","T21.100x041","T21.100x042","T21.100x043","T21.100x051","T21.100x052","T21.100x053","T21.100x054","T21.100x055","T21.100x056","T21.100x057","T21.100x091","T21.200","T21.200x011","T21.200x021","T21.200x031","T21.200x032","T21.200x033","T21.200x041","T21.200x042","T21.200x043","T21.200x051","T21.200x052","T21.200x053","T21.200x054","T21.200x055","T21.200x056","T21.200x057","T21.200x091","T21.300","T21.300x011","T21.300x021","T21.300x031","T21.300x032","T21.300x033","T21.300x041","T21.300x042","T21.300x043","T21.300x051","T21.300x052","T21.300x053","T21.300x054","T21.300x055","T21.300x056","T21.300x057","T21.300x091","T21.400","T21.400x011","T21.400x021","T21.400x031","T21.400x032","T21.400x033","T21.400x041","T21.400x042","T21.400x043","T21.400x051","T21.400x052","T21.400x053","T21.400x054","T21.400x055","T21.400x056","T21.400x057","T21.400x091","T21.500","T21.500x011","T21.500x021","T21.500x031","T21.500x032","T21.500x033","T21.500x041","T21.500x042","T21.500x043","T21.500x051","T21.500x052","T21.500x053","T21.500x054","T21.500x055","T21.500x056","T21.500x057","T21.500x091","T21.600","T21.600x011","T21.600x021","T21.600x031","T21.600x032","T21.600x033","T21.600x041","T21.600x042","T21.600x043","T21.600x051","T21.600x052","T21.600x053","T21.600x054","T21.600x055","T21.600x056","T21.600x057","T21.600x091","T21.700","T21.700x011","T21.700x021","T21.700x031","T21.700x032","T21.700x033","T21.700x041","T21.700x042","T21.700x043","T21.700x051","T21.700x052","T21.700x053","T21.700x054","T21.700x055","T21.700x056","T21.700x057","T21.700x091","T22.000x001","T22.000x002","T22.000x003","T22.000x004","T22.000x005","T22.000x006","T22.100x001","T22.100x002","T22.100x003","T22.100x004","T22.100x005","T22.100x006","T22.200x001","T22.200x002","T22.200x003","T22.200x004","T22.200x005","T22.200x006","T22.300x001","T22.300x002","T22.300x003","T22.300x004","T22.300x005","T22.300x006","T22.400x001","T22.400x002","T22.400x003","T22.400x004","T22.400x005","T22.400x006","T22.500x001","T22.500x002","T22.500x003","T22.500x004","T22.500x005","T22.500x006","T22.600x001","T22.600x002","T22.600x003","T22.600x004","T22.600x005","T22.600x006","T22.700x001","T22.700x002","T22.700x003","T22.700x004","T22.700x005","T22.700x006","T23.000x001","T23.000x002","T23.000x003","T23.000x004","T23.000x005","T23.000x006","T23.000x007","T23.100","T23.100x002","T23.100x003","T23.100x004","T23.100x005","T23.100x006","T23.100x007","T23.200","T23.200x002","T23.200x003","T23.200x004","T23.200x005","T23.200x006","T23.200x007","T23.300","T23.300x002","T23.300x003","T23.300x004","T23.300x005","T23.300x006","T23.300x007","T23.400","T23.400x002","T23.400x003","T23.400x004","T23.400x005","T23.400x006","T23.400x007","T23.500","T23.500x002","T23.500x003","T23.500x004","T23.500x005","T23.500x006","T23.500x007","T23.600","T23.600x002","T23.600x003","T23.600x004","T23.600x005","T23.600x006","T23.600x007","T23.700","T23.700x002","T23.700x003","T23.700x004","T23.700x005","T23.700x006","T23.700x007","T24.000x001","T24.000x002","T24.000x003","T24.000x004","T24.100x001","T24.100x002","T24.100x003","T24.100x004","T24.200x001","T24.200x002","T24.200x003","T24.200x004","T24.300x001","T24.300x002","T24.300x003","T24.300x004","T24.400x001","T24.400x002","T24.400x003","T24.400x004","T24.500x001","T24.500x002","T24.500x003","T24.500x004","T24.600x001","T24.600x002","T24.600x003","T24.600x004","T24.700x001","T24.700x002","T24.700x003","T24.700x004","T25.000","T25.000x002","T25.000x003","T25.100","T25.100x002","T25.100x003","T25.200","T25.200x002","T25.200x003","T25.300","T25.300x002","T25.300x003","T25.400","T25.400x002","T25.400x003","T25.500","T25.500x002","T25.500x003","T25.600","T25.600x002","T25.600x003","T25.700","T25.700x002","T25.700x003","T27.000x002","T27.000x003","T27.401","T27.402","T27.500x001","T27.600x001","T27.700","T28.000x002","T28.000x003","T28.100","T28.200x001","T28.200x002","T28.300","T28.300x001","T28.300x002","T28.300x003","T28.401","T28.501","T28.502","T28.600","T28.700x002","T28.701","T28.702","T28.800","T28.800x001","T28.800x002","T28.800x003","T28.901","T29.000","T29.100x001","T29.200x001","T29.300x001","T29.400","T29.500x001","T29.600x001","T29.700x001","T30.000","T30.100","T30.200","T30.300","T30.400","T30.500","T30.600","T30.700","T31.000","T31.100","T31.200","T31.300","T31.400","T31.500","T31.600","T31.700","T31.800","T31.900","T32.000","T32.100","T32.200","T32.300","T32.400","T32.500","T32.600","T32.700","T32.800","T32.900","T33.000","T33.100","T33.200","T33.300x001","T33.300x002","T33.300x003","T33.400","T33.500x002","T33.500x003","T33.600x002","T33.600x003","T33.700x002","T33.700x003","T33.800x002","T33.800x003","T33.900x003","T33.901","T34.000","T34.100","T34.200","T34.300x001","T34.300x002","T34.300x003","T34.400","T34.500x002","T34.500x003","T34.600x002","T34.600x003","T34.700x002","T34.700x003","T34.800x002","T34.800x003","T34.900x002","T34.900x003","T35.000x001","T35.100x001","T35.200","T35.300x001","T35.300x002","T35.300x003","T35.300x004","T35.300x005","T35.300x006","T35.400","T35.500","T35.600x001","T35.700x002","T35.700x003","T35.700x004","T35.700x005","T35.700x006","T35.700x007","T35.700x008","T35.700x009","T95.000x001","T95.000x002","T95.000x003","T95.000x004","T95.000x005","T95.000x006","T95.000x007","T95.000x008","T95.000x009","T95.000x010","T95.000x011","T95.000x012","T95.001","T95.002","T95.100x001","T95.100x002","T95.100x003","T95.101","T95.102","T95.103","T95.200x001","T95.200x002","T95.200x003","T95.200x004","T95.200x005","T95.200x006","T95.201","T95.202","T95.300x001","T95.300x002","T95.300x003","T95.301","T95.400","T95.800x001","T95.800x002","T95.800x003","T95.800x004","T95.800x005","T95.800x006","T95.800x007","T95.800x008","T95.801","T95.802","T95.803","T95.900"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCW入组条件，匹配规则：主诊断匹配");
        String result;

        result=WB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=WC1.group(record);
        if (result.length()>0){
            return result;
        }

        result=WJ1.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合WQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "WQY";
        }

        result=WR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=WZ1.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCW的ADRG入组条件");
        return "";
    }
}

