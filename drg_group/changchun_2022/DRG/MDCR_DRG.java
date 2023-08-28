package drg_group.changchun_2022.DRG;

import java.util.Arrays;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;

public class MDCR_DRG {

    public static boolean RA19_group(MedicalRecord record){
        return true;
    }

    public static boolean RC19_group(MedicalRecord record){
        return true;
    }

    public static boolean RT29_group(MedicalRecord record){
        return true;
    }

    public static boolean RW19_group(MedicalRecord record){
        return true;
    }

    public static boolean RB11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RB21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RD11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RE11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RG11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RR11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RS11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RS21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RT11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RU11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RV11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RW21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean RA23_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean RB13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean RD13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean RE13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean RR13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean RS13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean RS23_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean RU13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean RW23_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean RA25_group(MedicalRecord record){
        return true;
    }

    public static boolean RB15_group(MedicalRecord record){
        return true;
    }

    public static boolean RB25_group(MedicalRecord record){
        return true;
    }

    public static boolean RD15_group(MedicalRecord record){
        return true;
    }

    public static boolean RE15_group(MedicalRecord record){
        return true;
    }

    public static boolean RG15_group(MedicalRecord record){
        return true;
    }

    public static boolean RR15_group(MedicalRecord record){
        return true;
    }

    public static boolean RS15_group(MedicalRecord record){
        return true;
    }

    public static boolean RS25_group(MedicalRecord record){
        return true;
    }

    public static boolean RT15_group(MedicalRecord record){
        return true;
    }

    public static boolean RU15_group(MedicalRecord record){
        return true;
    }

    public static boolean RV15_group(MedicalRecord record){
        return true;
    }

    public static boolean RW25_group(MedicalRecord record){
        return true;
    }

}