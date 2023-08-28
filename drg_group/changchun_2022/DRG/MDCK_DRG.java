package drg_group.changchun_2022.DRG;

import java.util.Arrays;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;

public class MDCK_DRG {

    public static boolean KB19_group(MedicalRecord record){
        return true;
    }

    public static boolean KC19_group(MedicalRecord record){
        return true;
    }

    public static boolean KD19_group(MedicalRecord record){
        return true;
    }

    public static boolean KD29_group(MedicalRecord record){
        return true;
    }

    public static boolean KE19_group(MedicalRecord record){
        return true;
    }

    public static boolean KR19_group(MedicalRecord record){
        return true;
    }

    public static boolean KJ11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean KS11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean KU11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean KV11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean KZ11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean KT13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean KU13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean KZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean KJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean KS15_group(MedicalRecord record){
        return true;
    }

    public static boolean KT15_group(MedicalRecord record){
        return true;
    }

    public static boolean KU15_group(MedicalRecord record){
        return true;
    }

    public static boolean KV15_group(MedicalRecord record){
        return true;
    }

    public static boolean KZ15_group(MedicalRecord record){
        return true;
    }

}