package drg_group.changchun_2022.DRG;

import java.util.Arrays;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;

public class MDCA_DRG {

    public static boolean AB19_group(MedicalRecord record){
        return true;
    }

    public static boolean AE19_group(MedicalRecord record){
        return true;
    }

    public static boolean AG19_group(MedicalRecord record){
        return true;
    }

    public static boolean AG29_group(MedicalRecord record){
        return true;
    }

    public static boolean AH11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean AH15_group(MedicalRecord record){
        return true;
    }

}