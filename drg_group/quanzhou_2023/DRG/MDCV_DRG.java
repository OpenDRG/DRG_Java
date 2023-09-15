package drg_group.quanzhou_2023.DRG;

import java.util.Arrays;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;

public class MDCV_DRG {

    public static boolean VB19_group(MedicalRecord record){
        return true;
    }

    public static boolean VR19_group(MedicalRecord record){
        return true;
    }

    public static boolean VS19_group(MedicalRecord record){
        return true;
    }

    public static boolean VJ11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean VS21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean VZ11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean VC13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean VJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean VS23_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean VT13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean VZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean VC15_group(MedicalRecord record){
        return true;
    }

    public static boolean VJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean VS25_group(MedicalRecord record){
        return true;
    }

    public static boolean VT15_group(MedicalRecord record){
        return true;
    }

    public static boolean VZ15_group(MedicalRecord record){
        return true;
    }

}