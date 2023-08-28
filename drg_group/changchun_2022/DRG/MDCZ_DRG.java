package drg_group.changchun_2022.DRG;

import java.util.Arrays;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;

public class MDCZ_DRG {

    public static boolean ZB19_group(MedicalRecord record){
        return true;
    }

    public static boolean ZD19_group(MedicalRecord record){
        return true;
    }

    public static boolean ZC11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean ZJ11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean ZZ11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean ZC15_group(MedicalRecord record){
        return true;
    }

    public static boolean ZJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean ZZ15_group(MedicalRecord record){
        return true;
    }

}