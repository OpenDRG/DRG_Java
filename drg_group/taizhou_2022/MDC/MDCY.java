package drg_group.taizhou_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.ADRG.*;

public class MDCY{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"B23.100x001","B20.400x001","B21.900","B20.004","B21.300","B21.000x001","B20.000x001","B21.800","B23.100x002","B22.000x001","B20.301","B22.001+F02.4*","Z21.x00x001","B24.x01","B20.005","B23.200","B23.801","B20.901","B23.800","B20.006","B22.200","B21.200x001","B22.000x003","B22.100","B20.500x001","B23.800x002","B20.600x001","B20.200x001","B22.000x004","O98.700","B21.700","B20.003","I33.000x018","B22.000x005","B20.801","B23.201","B20.002","B23.100","B22.700","B23.800x001","B22.701","B21.100x001","B20.100x001","B20.300x001","B23.000","Z20.600","B20.001","R75.x00x001","B20.700x001"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCY入组条件，匹配规则：主诊断匹配");
        String result;

        result=YC1.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合YQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "YQY";
        }

        result=YR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=YR2.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCY的ADRG入组条件");
        return "";
    }
}

