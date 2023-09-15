package drg_group.quanzhou_2023.DRG;

import java.util.Arrays;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;

public class MDCN_DRG {

    public static boolean NA19_group(MedicalRecord record){
        return true;
    }

    public static boolean NA29_group(MedicalRecord record){
        return true;
    }

    public static boolean NB19_group(MedicalRecord record){
        return true;
    }

    public static boolean NC19_group(MedicalRecord record){
        return true;
    }

    public static boolean ND19_group(MedicalRecord record){
        return true;
    }

    public static boolean NE19_group(MedicalRecord record){
        return true;
    }

    public static boolean NF19_group(MedicalRecord record){
        return true;
    }

    public static boolean NJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean NS19_group(MedicalRecord record){
        return true;
    }

    public static boolean NZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean NR13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean NR15_group(MedicalRecord record){
        return true;
    }

}