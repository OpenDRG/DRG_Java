package drg_group.xian_2020.DRG;

import java.util.Arrays;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;

public class MDCJ_DRG {

    public static boolean JA19_group(MedicalRecord record){
        return true;
    }

    public static boolean JA29_group(MedicalRecord record){
        return true;
    }

    public static boolean JB19_group(MedicalRecord record){
        return true;
    }

    public static boolean JB29_group(MedicalRecord record){
        return true;
    }

    public static boolean JB39_group(MedicalRecord record){
        return true;
    }

    public static boolean JD29_group(MedicalRecord record){
        return true;
    }

    public static boolean JS19_group(MedicalRecord record){
        return true;
    }

    public static boolean JS29_group(MedicalRecord record){
        return true;
    }

    public static boolean JT19_group(MedicalRecord record){
        return true;
    }

    public static boolean JU19_group(MedicalRecord record){
        return true;
    }

    public static boolean JV29_group(MedicalRecord record){
        return true;
    }

    public static boolean JZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean JC11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean JD11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean JJ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean JR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean JR21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean JV11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean JC13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JD13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JR23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JV13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JC15_group(MedicalRecord record){
        return true;
    }

    public static boolean JD15_group(MedicalRecord record){
        return true;
    }

    public static boolean JJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean JR15_group(MedicalRecord record){
        return true;
    }

    public static boolean JR25_group(MedicalRecord record){
        return true;
    }

    public static boolean JV15_group(MedicalRecord record){
        return true;
    }

}