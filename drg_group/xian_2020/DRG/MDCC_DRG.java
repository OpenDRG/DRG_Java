package drg_group.xian_2020.DRG;

import java.util.Arrays;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;

public class MDCC_DRG {

    public static boolean CB19_group(MedicalRecord record){
        return true;
    }

    public static boolean CB29_group(MedicalRecord record){
        return true;
    }

    public static boolean CB39_group(MedicalRecord record){
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

    public static boolean CS19_group(MedicalRecord record){
        return true;
    }

    public static boolean CU19_group(MedicalRecord record){
        return true;
    }

    public static boolean CW19_group(MedicalRecord record){
        return true;
    }

    public static boolean CX19_group(MedicalRecord record){
        return true;
    }

    public static boolean CR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean CT11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean CV11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean CZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean CR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CT13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CV13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean CR15_group(MedicalRecord record){
        return true;
    }

    public static boolean CT15_group(MedicalRecord record){
        return true;
    }

    public static boolean CV15_group(MedicalRecord record){
        return true;
    }

    public static boolean CZ15_group(MedicalRecord record){
        return true;
    }

}