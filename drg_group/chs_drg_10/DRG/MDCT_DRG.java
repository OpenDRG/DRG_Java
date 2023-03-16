package drg_group.chs_drg_10.DRG;

import java.util.Arrays;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;

public class MDCT_DRG {

    public static boolean TB19_group(MedicalRecord record){
        return true;
    }

    public static boolean TR29_group(MedicalRecord record){
        return true;
    }

    public static boolean TS19_group(MedicalRecord record){
        return true;
    }

    public static boolean TS29_group(MedicalRecord record){
        return true;
    }

    public static boolean TU19_group(MedicalRecord record){
        return true;
    }

    public static boolean TV19_group(MedicalRecord record){
        return true;
    }

    public static boolean TW19_group(MedicalRecord record){
        return true;
    }

    public static boolean TR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean TT11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean TT21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean TR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean TT13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean TT23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean TR15_group(MedicalRecord record){
        return true;
    }

    public static boolean TT15_group(MedicalRecord record){
        return true;
    }

    public static boolean TT25_group(MedicalRecord record){
        return true;
    }

}