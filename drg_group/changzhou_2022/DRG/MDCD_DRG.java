package drg_group.changzhou_2022.DRG;

import java.util.Arrays;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;

public class MDCD_DRG {

    public static boolean DJ10_group(MedicalRecord record){
        return record.age<=17;
    }

    public static boolean DU10_group(MedicalRecord record){
        return record.age<=17;
    }

    public static boolean DZ10_group(MedicalRecord record){
        return record.age<=17;
    }

    public static boolean DA19_group(MedicalRecord record){
        return true;
    }

    public static boolean DB19_group(MedicalRecord record){
        return true;
    }

    public static boolean DB29_group(MedicalRecord record){
        return true;
    }

    public static boolean DC19_group(MedicalRecord record){
        return true;
    }

    public static boolean DD19_group(MedicalRecord record){
        return true;
    }

    public static boolean DD29_group(MedicalRecord record){
        return true;
    }

    public static boolean DE19_group(MedicalRecord record){
        return true;
    }

    public static boolean DE29_group(MedicalRecord record){
        return true;
    }

    public static boolean DG19_group(MedicalRecord record){
        return true;
    }

    public static boolean DG39_group(MedicalRecord record){
        return true;
    }

    public static boolean DK19_group(MedicalRecord record){
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

    public static boolean DV19_group(MedicalRecord record){
        return true;
    }

    public static boolean DR17_group(MedicalRecord record){
        return record.inHospitalTime<5 && (record.leavingType.equals("2") || record.leavingType.equals("5"));
    }

    public static boolean DC21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean DG21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean DJ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean DR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean DU11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean DW11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean DZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean DC23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DG23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DW13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean DC25_group(MedicalRecord record){
        return true;
    }

    public static boolean DG25_group(MedicalRecord record){
        return true;
    }

    public static boolean DJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean DR15_group(MedicalRecord record){
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