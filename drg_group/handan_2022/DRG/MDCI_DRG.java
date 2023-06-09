package drg_group.handan_2022.DRG;

import java.util.Arrays;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;

public class MDCI_DRG {

    public static boolean IB19_group(MedicalRecord record){
        return true;
    }

    public static boolean IB29_group(MedicalRecord record){
        return true;
    }

    public static boolean IC19_group(MedicalRecord record){
        return true;
    }

    public static boolean IC29_group(MedicalRecord record){
        return true;
    }

    public static boolean IC39_group(MedicalRecord record){
        return true;
    }

    public static boolean ID19_group(MedicalRecord record){
        return true;
    }

    public static boolean IE19_group(MedicalRecord record){
        return true;
    }

    public static boolean IF19_group(MedicalRecord record){
        return true;
    }

    public static boolean IF29_group(MedicalRecord record){
        return true;
    }

    public static boolean IF39_group(MedicalRecord record){
        return true;
    }

    public static boolean IF49_group(MedicalRecord record){
        return true;
    }

    public static boolean IF59_group(MedicalRecord record){
        return true;
    }

    public static boolean IG19_group(MedicalRecord record){
        return true;
    }

    public static boolean IH19_group(MedicalRecord record){
        return true;
    }

    public static boolean IR19_group(MedicalRecord record){
        return true;
    }

    public static boolean IR29_group(MedicalRecord record){
        return true;
    }

    public static boolean IS19_group(MedicalRecord record){
        return true;
    }

    public static boolean IS29_group(MedicalRecord record){
        return true;
    }

    public static boolean IT19_group(MedicalRecord record){
        return true;
    }

    public static boolean IT39_group(MedicalRecord record){
        return true;
    }

    public static boolean IV19_group(MedicalRecord record){
        return true;
    }

    public static boolean IZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean IZ29_group(MedicalRecord record){
        return true;
    }

    public static boolean IC41_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IT21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IU31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IB33_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IC43_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IT23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IU23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IB35_group(MedicalRecord record){
        return true;
    }

    public static boolean IC45_group(MedicalRecord record){
        return true;
    }

    public static boolean IJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean IT25_group(MedicalRecord record){
        return true;
    }

    public static boolean IU15_group(MedicalRecord record){
        return true;
    }

    public static boolean IU25_group(MedicalRecord record){
        return true;
    }

    public static boolean IU35_group(MedicalRecord record){
        return true;
    }

}