package drg_group.changzhou_2022.DRG;

import java.util.Arrays;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;

public class MDCC_DRG {

    public static boolean CS10_group(MedicalRecord record){
        return record.age<=17;
    }

    public static boolean CB29_group(MedicalRecord record){
        return true;
    }

    public static boolean CB49_group(MedicalRecord record){
        return true;
    }

    public static boolean CC19_group(MedicalRecord record){
        return true;
    }

    public static boolean CD19_group(MedicalRecord record){
        return true;
    }

    public static boolean CD29_group(MedicalRecord record){
        return true;
    }

    public static boolean CJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean CR19_group(MedicalRecord record){
        return true;
    }

    public static boolean CS19_group(MedicalRecord record){
        return true;
    }

    public static boolean CU19_group(MedicalRecord record){
        return true;
    }

    public static boolean CV19_group(MedicalRecord record){
        return true;
    }

    public static boolean CW19_group(MedicalRecord record){
        return true;
    }

    public static boolean CX19_group(MedicalRecord record){
        return true;
    }

    public static boolean CB11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean CB31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean CZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean CB13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CB33_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CT13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CB15_group(MedicalRecord record){
        return true;
    }

    public static boolean CB35_group(MedicalRecord record){
        return true;
    }

    public static boolean CT15_group(MedicalRecord record){
        return true;
    }

    public static boolean CZ15_group(MedicalRecord record){
        return true;
    }

}