package drg_group.changzhou_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.ADRG.*;

public class MDCA{
    public static String group(MedicalRecord record){
        String[] mdc_zd={};
        String[] dept_list={};
        if (!(true && record.ssList!=null && record.ssList.length>0 && (Base.contains(Base.SS_VALID,record.ssList[0]) || Base.contains(new String[]{"96.0400","96.7201"},record.ssList[0])))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCA入组条件，匹配规则：存在手术");
        String result;

        result=AE1.group(record);
        if (result.length()>0){
            return result;
        }

        result=AG1.group(record);
        if (result.length()>0){
            return result;
        }

        result=AG2.group(record);
        if (result.length()>0){
            return result;
        }

        result=AH1_1.group(record);
        if (result.length()>0){
            return result;
        }

        result=AH1_2.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0 && Base.contains(Base.SS_VALID,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合AQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "AQY";
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCA的ADRG入组条件");
        return "";
    }
}

