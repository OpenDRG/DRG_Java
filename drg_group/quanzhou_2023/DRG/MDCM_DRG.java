package drg_group.quanzhou_2023.DRG;

import java.util.Arrays;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;

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
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean MD13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean MS13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
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