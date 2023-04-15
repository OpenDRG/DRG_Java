package drg_group.suzhou_2023.DRG;

import java.util.Arrays;

import drg_group.suzhou_2023.Base;
import drg_group.suzhou_2023.MedicalRecord;

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

    public static boolean DJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean DK19_group(MedicalRecord record){
        return true;
    }

    public static boolean DV19_group(MedicalRecord record){
        return true;
    }

    public static boolean DR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean DU11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean DZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean DE1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DS1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DT1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DT2A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DW1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DR1B_group(MedicalRecord record){
        return true;
    }

    public static boolean DE15_group(MedicalRecord record){
        return true;
    }

    public static boolean DS15_group(MedicalRecord record){
        return true;
    }

    public static boolean DT15_group(MedicalRecord record){
        return true;
    }

    public static boolean DT25_group(MedicalRecord record){
        return true;
    }

    public static boolean DU15_group(MedicalRecord record){
        return true;
    }

    public static boolean DW15_group(MedicalRecord record){
        return true;
    }

    public static boolean DZ15_group(MedicalRecord record){
        return true;
    }

}