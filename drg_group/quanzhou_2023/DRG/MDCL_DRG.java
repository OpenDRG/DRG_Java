package drg_group.quanzhou_2023.DRG;

import java.util.Arrays;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;

public class MDCL_DRG {

    public static boolean LA19_group(MedicalRecord record){
        return true;
    }

    public static boolean LA29_group(MedicalRecord record){
        return true;
    }

    public static boolean LB19_group(MedicalRecord record){
        return true;
    }

    public static boolean LC19_group(MedicalRecord record){
        return true;
    }

    public static boolean LD19_group(MedicalRecord record){
        return true;
    }

    public static boolean LE19_group(MedicalRecord record){
        return true;
    }

    public static boolean LX19_group(MedicalRecord record){
        return true;
    }

    public static boolean LB21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean LF11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean LL11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean LR11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean LS11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean LT11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean LU11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean LV11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean LW11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean LZ11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean LJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean LR13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean LT13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean LU13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean LB25_group(MedicalRecord record){
        return true;
    }

    public static boolean LF15_group(MedicalRecord record){
        return true;
    }

    public static boolean LJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean LL15_group(MedicalRecord record){
        return true;
    }

    public static boolean LR15_group(MedicalRecord record){
        return true;
    }

    public static boolean LS15_group(MedicalRecord record){
        return true;
    }

    public static boolean LT15_group(MedicalRecord record){
        return true;
    }

    public static boolean LU15_group(MedicalRecord record){
        return true;
    }

    public static boolean LV15_group(MedicalRecord record){
        return true;
    }

    public static boolean LW15_group(MedicalRecord record){
        return true;
    }

    public static boolean LZ15_group(MedicalRecord record){
        return true;
    }

}