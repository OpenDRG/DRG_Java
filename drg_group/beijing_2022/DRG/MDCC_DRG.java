package drg_group.beijing_2022.DRG;

import java.util.Arrays;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;

public class MDCC_DRG {

    public static boolean CJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean CW19_group(MedicalRecord record){
        return true;
    }

    public static boolean CX19_group(MedicalRecord record){
        return true;
    }

    public static boolean CB39_group(MedicalRecord record){
        return true;
    }

    public static boolean CR19_group(MedicalRecord record){
        return true;
    }

    public static boolean CB49_group(MedicalRecord record){
        return true;
    }

    public static boolean CV19_group(MedicalRecord record){
        return true;
    }

    public static boolean CC13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CB23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CB13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CD23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CT13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CS13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CZ15_group(MedicalRecord record){
        return true;
    }

    public static boolean CT15_group(MedicalRecord record){
        return true;
    }

    public static boolean CB15_group(MedicalRecord record){
        return true;
    }

    public static boolean CS15_group(MedicalRecord record){
        return true;
    }

    public static boolean CC15_group(MedicalRecord record){
        return true;
    }

    public static boolean CU15_group(MedicalRecord record){
        return true;
    }

    public static boolean CB25_group(MedicalRecord record){
        return true;
    }

    public static boolean CD25_group(MedicalRecord record){
        return true;
    }

    public static boolean CD1D_group(MedicalRecord record){
        return record.age<=6;
    }

    public static boolean CD19_group(MedicalRecord record){
        return true;
    }

}