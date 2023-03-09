package drg_group.fuzhou_2022.DRG;

import java.util.Arrays;

import drg_group.fuzhou_2022.Base;
import drg_group.fuzhou_2022.MedicalRecord;

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

    public static boolean IE19_group(MedicalRecord record){
        return true;
    }

    public static boolean IF49_group(MedicalRecord record){
        return true;
    }

    public static boolean IF59_group(MedicalRecord record){
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

    public static boolean IF31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IT21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean ID13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IF13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IF23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IF33_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IG13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IT23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean ID15_group(MedicalRecord record){
        return true;
    }

    public static boolean IF15_group(MedicalRecord record){
        return true;
    }

    public static boolean IF25_group(MedicalRecord record){
        return true;
    }

    public static boolean IF35_group(MedicalRecord record){
        return true;
    }

    public static boolean IG15_group(MedicalRecord record){
        return true;
    }

    public static boolean IJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean IT25_group(MedicalRecord record){
        return true;
    }

}