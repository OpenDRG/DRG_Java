package drg_group.quanzhou_2023.DRG;

import java.util.Arrays;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;

public class MDCX_DRG {

    public static boolean XT29_group(MedicalRecord record){
        return true;
    }

    public static boolean XR11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean XR21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean XR31_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean XS11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean XS21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean XJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean XR13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean XR23_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean XR33_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean XT13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean XT33_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean XJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean XR15_group(MedicalRecord record){
        return true;
    }

    public static boolean XR25_group(MedicalRecord record){
        return true;
    }

    public static boolean XR35_group(MedicalRecord record){
        return true;
    }

    public static boolean XS15_group(MedicalRecord record){
        return true;
    }

    public static boolean XS25_group(MedicalRecord record){
        return true;
    }

    public static boolean XT15_group(MedicalRecord record){
        return true;
    }

    public static boolean XT35_group(MedicalRecord record){
        return true;
    }

}