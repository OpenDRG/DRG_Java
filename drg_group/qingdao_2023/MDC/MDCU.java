package drg_group.qingdao_2023.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;
import drg_group.qingdao_2023.ADRG.*;

public class MDCU{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"F10.000","F10.001","F10.002","F10.003","F10.100","F10.100x002","F10.200","F10.201","F10.300","F10.400","F10.401","F10.500","F10.501","F10.502","F10.503","F10.504","F10.505","F10.600","F10.600x002","F10.601","F10.700","F10.700x091","F10.701","F10.800","F10.900","F11.000","F11.000x001","F11.100","F11.100x001","F11.200","F11.200x001","F11.200x003","F11.201","F11.202","F11.203","F11.204","F11.300","F11.400","F11.500","F11.600","F11.700","F11.800","F11.900","F12.000","F12.000x002","F12.100","F12.100x001","F12.200","F12.300","F12.400","F12.500","F12.600","F12.700","F12.800","F12.900","F13.100","F13.800","F14.000","F14.100","F14.100x001","F14.200","F14.300","F14.400","F14.400x001","F14.500","F14.600","F14.700","F14.800","F14.900","F15.000","F15.000x002","F15.000x003","F15.000x004","F15.100","F15.100x001","F15.100x002","F15.100x003","F15.100x004","F15.200x001","F15.200x002","F15.200x003","F15.200x004","F15.300x001","F15.300x002","F15.300x003","F15.300x004","F15.400x001","F15.400x002","F15.400x003","F15.400x004","F15.500x001","F15.500x002","F15.500x003","F15.500x004","F15.501","F15.600x001","F15.600x002","F15.600x003","F15.600x004","F15.700x001","F15.700x002","F15.700x003","F15.700x004","F15.800","F15.900x001","F15.900x002","F15.900x003","F15.900x004","F16.000","F16.000x002","F16.100","F16.100x002","F16.200","F16.300","F16.400","F16.400x001","F16.500","F16.600","F16.700","F16.800","F16.900","F17.100","F17.200","F17.300","F17.400","F17.400x001","F17.800","F18.000","F18.100","F18.200","F18.300","F18.400","F18.800","F19.100","R78.000","R78.100","R78.200","R78.300","R78.400","R78.500","R78.600","T40.000","T40.100","T40.200","T40.200x001","T40.201","T40.300","T40.400","T40.401","T40.500","T40.601","T40.700","T43.600","T43.600x003","T51.001"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCU入组条件，匹配规则：主诊断匹配");
        String result;

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合UQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "UQY";
        }

        result=UR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=US1.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCU的ADRG入组条件");
        return "";
    }
}

