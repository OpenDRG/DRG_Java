package drg_group.chs_drg_11.DRG;

import java.util.Arrays;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;

public class MDCM_DRG {

    public static boolean MA19_group(MedicalRecord record){
        return true;
    }

    public static boolean MB19_group(MedicalRecord record){
        return true;
    }

    public static boolean MC19_group(MedicalRecord record){
        return true;
    }

    public static boolean MJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean MZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean MR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean MD13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean MS13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean MD15_group(MedicalRecord record){
        return true;
    }

    public static boolean MR15_group(MedicalRecord record){
        return true;
    }

    public static boolean MS15_group(MedicalRecord record){
        return true;
    }

}