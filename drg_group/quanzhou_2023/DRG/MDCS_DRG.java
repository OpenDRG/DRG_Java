package drg_group.quanzhou_2023.DRG;

import java.util.Arrays;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;

public class MDCS_DRG {

    public static boolean SU19_group(MedicalRecord record){
        return true;
    }

    public static boolean SB11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean SR11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean SS11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean SV11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean SB13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean SR13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean SS13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean ST13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean SV13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean SZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean SB15_group(MedicalRecord record){
        return true;
    }

    public static boolean SR15_group(MedicalRecord record){
        return true;
    }

    public static boolean SS15_group(MedicalRecord record){
        return true;
    }

    public static boolean ST15_group(MedicalRecord record){
        return true;
    }

    public static boolean SV15_group(MedicalRecord record){
        return true;
    }

    public static boolean SZ15_group(MedicalRecord record){
        return true;
    }

}