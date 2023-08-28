package drg_group.changchun_2022.DRG;

import java.util.Arrays;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;

public class MDCP_DRG {

    public static boolean PB19_group(MedicalRecord record){
        return true;
    }

    public static boolean PS39_group(MedicalRecord record){
        return true;
    }

    public static boolean PK11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean PR11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean PS11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean PS21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean PC13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean PK13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean PR13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean PS13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean PS43_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean PU13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean PV13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean PC15_group(MedicalRecord record){
        return true;
    }

    public static boolean PK15_group(MedicalRecord record){
        return true;
    }

    public static boolean PR15_group(MedicalRecord record){
        return true;
    }

    public static boolean PS15_group(MedicalRecord record){
        return true;
    }

    public static boolean PS25_group(MedicalRecord record){
        return true;
    }

    public static boolean PS45_group(MedicalRecord record){
        return true;
    }

    public static boolean PU15_group(MedicalRecord record){
        return true;
    }

    public static boolean PV15_group(MedicalRecord record){
        return true;
    }

}