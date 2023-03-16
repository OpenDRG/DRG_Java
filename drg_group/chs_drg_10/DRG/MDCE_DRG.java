package drg_group.chs_drg_10.DRG;

import java.util.Arrays;

import drg_group.chs_drg_10.Base;
import drg_group.chs_drg_10.MedicalRecord;

public class MDCE_DRG {

    public static boolean EB19_group(MedicalRecord record){
        return true;
    }

    public static boolean EC19_group(MedicalRecord record){
        return true;
    }

    public static boolean ED19_group(MedicalRecord record){
        return true;
    }

    public static boolean EJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean ER29_group(MedicalRecord record){
        return true;
    }

    public static boolean ES19_group(MedicalRecord record){
        return true;
    }

    public static boolean ES29_group(MedicalRecord record){
        return true;
    }

    public static boolean ET19_group(MedicalRecord record){
        return true;
    }

    public static boolean ET29_group(MedicalRecord record){
        return true;
    }

    public static boolean EU19_group(MedicalRecord record){
        return true;
    }

    public static boolean EV19_group(MedicalRecord record){
        return true;
    }

    public static boolean EW19_group(MedicalRecord record){
        return true;
    }

    public static boolean EX19_group(MedicalRecord record){
        return true;
    }

    public static boolean EX29_group(MedicalRecord record){
        return true;
    }

    public static boolean EZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean ER11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean ER31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean ER13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean ER33_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean ER15_group(MedicalRecord record){
        return true;
    }

    public static boolean ER35_group(MedicalRecord record){
        return true;
    }

}