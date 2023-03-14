package drg_group.xian_2020.DRG;

import java.util.Arrays;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;

public class MDCP_DRG {

    public static boolean PB19_group(MedicalRecord record){
        return true;
    }

    public static boolean PC19_group(MedicalRecord record){
        return true;
    }

    public static boolean PJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean PK19_group(MedicalRecord record){
        return true;
    }

    public static boolean PT19_group(MedicalRecord record){
        return true;
    }

    public static boolean PT29_group(MedicalRecord record){
        return true;
    }

    public static boolean PU19_group(MedicalRecord record){
        return true;
    }

    public static boolean PV19_group(MedicalRecord record){
        return true;
    }

    public static boolean PR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean PS11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean PR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean PS13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean PR15_group(MedicalRecord record){
        return true;
    }

    public static boolean PS15_group(MedicalRecord record){
        return true;
    }

}