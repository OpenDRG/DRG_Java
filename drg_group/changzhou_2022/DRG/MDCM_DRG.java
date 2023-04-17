package drg_group.changzhou_2022.DRG;

import java.util.Arrays;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;

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

    public static boolean MD19_group(MedicalRecord record){
        return true;
    }

    public static boolean MJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean MS19_group(MedicalRecord record){
        return true;
    }

    public static boolean MR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean MZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean MR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean MZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean MR15_group(MedicalRecord record){
        return true;
    }

    public static boolean MZ15_group(MedicalRecord record){
        return true;
    }

}