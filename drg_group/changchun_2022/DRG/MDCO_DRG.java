package drg_group.changchun_2022.DRG;

import java.util.Arrays;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;

public class MDCO_DRG {

    public static boolean OB19_group(MedicalRecord record){
        return true;
    }

    public static boolean OC19_group(MedicalRecord record){
        return true;
    }

    public static boolean OD19_group(MedicalRecord record){
        return true;
    }

    public static boolean OD29_group(MedicalRecord record){
        return true;
    }

    public static boolean OE19_group(MedicalRecord record){
        return true;
    }

    public static boolean OF19_group(MedicalRecord record){
        return true;
    }

    public static boolean OF29_group(MedicalRecord record){
        return true;
    }

    public static boolean OJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean OR19_group(MedicalRecord record){
        return true;
    }

    public static boolean OS29_group(MedicalRecord record){
        return true;
    }

    public static boolean OT19_group(MedicalRecord record){
        return true;
    }

    public static boolean OZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean OS13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean OS15_group(MedicalRecord record){
        return true;
    }

}