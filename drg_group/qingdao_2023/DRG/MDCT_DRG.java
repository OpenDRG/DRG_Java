package drg_group.qingdao_2023.DRG;

import java.util.Arrays;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;

public class MDCT_DRG {

    public static boolean TB19_group(MedicalRecord record){
        return true;
    }

    public static boolean TR19_group(MedicalRecord record){
        return true;
    }

    public static boolean TR29_group(MedicalRecord record){
        return true;
    }

    public static boolean TT19_group(MedicalRecord record){
        return true;
    }

    public static boolean TT29_group(MedicalRecord record){
        return true;
    }

    public static boolean TU19_group(MedicalRecord record){
        return true;
    }

    public static boolean TW19_group(MedicalRecord record){
        return true;
    }

    public static boolean TS13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean TS23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean TV13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean TS15_group(MedicalRecord record){
        return true;
    }

    public static boolean TS25_group(MedicalRecord record){
        return true;
    }

    public static boolean TV15_group(MedicalRecord record){
        return true;
    }

}