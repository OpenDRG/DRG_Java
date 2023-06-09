package drg_group.handan_2022.DRG;

import java.util.Arrays;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;

public class MDCD_DRG {

    public static boolean DA19_group(MedicalRecord record){
        return true;
    }

    public static boolean DB19_group(MedicalRecord record){
        return true;
    }

    public static boolean DB29_group(MedicalRecord record){
        return true;
    }

    public static boolean DB39_group(MedicalRecord record){
        return true;
    }

    public static boolean DC19_group(MedicalRecord record){
        return true;
    }

    public static boolean DC29_group(MedicalRecord record){
        return true;
    }

    public static boolean DD19_group(MedicalRecord record){
        return true;
    }

    public static boolean DD29_group(MedicalRecord record){
        return true;
    }

    public static boolean DE29_group(MedicalRecord record){
        return true;
    }

    public static boolean DG19_group(MedicalRecord record){
        return true;
    }

    public static boolean DG29_group(MedicalRecord record){
        return true;
    }

    public static boolean DK19_group(MedicalRecord record){
        return true;
    }

    public static boolean DR19_group(MedicalRecord record){
        return true;
    }

    public static boolean DS19_group(MedicalRecord record){
        return true;
    }

    public static boolean DT19_group(MedicalRecord record){
        return true;
    }

    public static boolean DT29_group(MedicalRecord record){
        return true;
    }

    public static boolean DU19_group(MedicalRecord record){
        return true;
    }

    public static boolean DV19_group(MedicalRecord record){
        return true;
    }

    public static boolean DW19_group(MedicalRecord record){
        return true;
    }

    public static boolean DZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean DE13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DE15_group(MedicalRecord record){
        return true;
    }

    public static boolean DJ15_group(MedicalRecord record){
        return true;
    }

}