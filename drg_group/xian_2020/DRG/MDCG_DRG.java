package drg_group.xian_2020.DRG;

import java.util.Arrays;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;

public class MDCG_DRG {

    public static boolean GB19_group(MedicalRecord record){
        return true;
    }

    public static boolean GB29_group(MedicalRecord record){
        return true;
    }

    public static boolean GC19_group(MedicalRecord record){
        return true;
    }

    public static boolean GC29_group(MedicalRecord record){
        return true;
    }

    public static boolean GD19_group(MedicalRecord record){
        return true;
    }

    public static boolean GD29_group(MedicalRecord record){
        return true;
    }

    public static boolean GE19_group(MedicalRecord record){
        return true;
    }

    public static boolean GF19_group(MedicalRecord record){
        return true;
    }

    public static boolean GF29_group(MedicalRecord record){
        return true;
    }

    public static boolean GG19_group(MedicalRecord record){
        return true;
    }

    public static boolean GK19_group(MedicalRecord record){
        return true;
    }

    public static boolean GK29_group(MedicalRecord record){
        return true;
    }

    public static boolean GK39_group(MedicalRecord record){
        return true;
    }

    public static boolean GS19_group(MedicalRecord record){
        return true;
    }

    public static boolean GU19_group(MedicalRecord record){
        return true;
    }

    public static boolean GU29_group(MedicalRecord record){
        return true;
    }

    public static boolean GW19_group(MedicalRecord record){
        return true;
    }

    public static boolean GZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean GE21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GJ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GT11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GV11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GE23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GT13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GV13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GE25_group(MedicalRecord record){
        return true;
    }

    public static boolean GJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean GR15_group(MedicalRecord record){
        return true;
    }

    public static boolean GT15_group(MedicalRecord record){
        return true;
    }

    public static boolean GV15_group(MedicalRecord record){
        return true;
    }

}