package drg_group.suzhou_2022.DRG;

import java.util.Arrays;

import drg_group.suzhou_2022.Base;
import drg_group.suzhou_2022.MedicalRecord;

public class MDCI_DRG {

    public static boolean IB19_group(MedicalRecord record){
        return true;
    }

    public static boolean IB29_group(MedicalRecord record){
        return true;
    }

    public static boolean IB39_group(MedicalRecord record){
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

    public static boolean IC49_group(MedicalRecord record){
        return true;
    }

    public static boolean ID19_group(MedicalRecord record){
        return true;
    }

    public static boolean IF19_group(MedicalRecord record){
        return true;
    }

    public static boolean IF39_group(MedicalRecord record){
        return true;
    }

    public static boolean IF49_group(MedicalRecord record){
        return true;
    }

    public static boolean IR29_group(MedicalRecord record){
        return true;
    }

    public static boolean IT39_group(MedicalRecord record){
        return true;
    }

    public static boolean IV19_group(MedicalRecord record){
        return true;
    }

    public static boolean IU31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IE1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IF2A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IF5A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IG1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IH1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IJ1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IR1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IS1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IS2A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IT1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IT2A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IU1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IU2A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IZ1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IZ2A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IU33_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IE15_group(MedicalRecord record){
        return true;
    }

    public static boolean IF25_group(MedicalRecord record){
        return true;
    }

    public static boolean IF55_group(MedicalRecord record){
        return true;
    }

    public static boolean IG15_group(MedicalRecord record){
        return true;
    }

    public static boolean IH15_group(MedicalRecord record){
        return true;
    }

    public static boolean IJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean IR15_group(MedicalRecord record){
        return true;
    }

    public static boolean IS15_group(MedicalRecord record){
        return true;
    }

    public static boolean IS25_group(MedicalRecord record){
        return true;
    }

    public static boolean IT15_group(MedicalRecord record){
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

    public static boolean IZ15_group(MedicalRecord record){
        return true;
    }

    public static boolean IZ25_group(MedicalRecord record){
        return true;
    }

}