package drg_group.changchun_2022.DRG;

import java.util.Arrays;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;

public class MDCF_DRG {

    public static boolean FB19_group(MedicalRecord record){
        return true;
    }

    public static boolean FC19_group(MedicalRecord record){
        return true;
    }

    public static boolean FD19_group(MedicalRecord record){
        return true;
    }

    public static boolean FD39_group(MedicalRecord record){
        return true;
    }

    public static boolean FE19_group(MedicalRecord record){
        return true;
    }

    public static boolean FE29_group(MedicalRecord record){
        return true;
    }

    public static boolean FF19_group(MedicalRecord record){
        return true;
    }

    public static boolean FJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean FK19_group(MedicalRecord record){
        return true;
    }

    public static boolean FK29_group(MedicalRecord record){
        return true;
    }

    public static boolean FK39_group(MedicalRecord record){
        return true;
    }

    public static boolean FL19_group(MedicalRecord record){
        return true;
    }

    public static boolean FL39_group(MedicalRecord record){
        return true;
    }

    public static boolean FM19_group(MedicalRecord record){
        return true;
    }

    public static boolean FM29_group(MedicalRecord record){
        return true;
    }

    public static boolean FM39_group(MedicalRecord record){
        return true;
    }

    public static boolean FP19_group(MedicalRecord record){
        return true;
    }

    public static boolean FR19_group(MedicalRecord record){
        return true;
    }

    public static boolean FR39_group(MedicalRecord record){
        return true;
    }

    public static boolean FT29_group(MedicalRecord record){
        return true;
    }

    public static boolean FV19_group(MedicalRecord record){
        return true;
    }

    public static boolean FB21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean FN21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean FR21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean FR41_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean FT11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean FT31_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean FU11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean FV21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean FW11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean FW21_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean FZ11_group(MedicalRecord record){
        return record.zdList.length>1 && record.mccList.length>0;
    }

    public static boolean FD23_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FF23_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FF33_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FL23_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FM43_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FN13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FR43_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FT13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FT43_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FU13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FU23_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FV23_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FV33_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean FB25_group(MedicalRecord record){
        return true;
    }

    public static boolean FD25_group(MedicalRecord record){
        return true;
    }

    public static boolean FF25_group(MedicalRecord record){
        return true;
    }

    public static boolean FF35_group(MedicalRecord record){
        return true;
    }

    public static boolean FL25_group(MedicalRecord record){
        return true;
    }

    public static boolean FM45_group(MedicalRecord record){
        return true;
    }

    public static boolean FN15_group(MedicalRecord record){
        return true;
    }

    public static boolean FN25_group(MedicalRecord record){
        return true;
    }

    public static boolean FR25_group(MedicalRecord record){
        return true;
    }

    public static boolean FR45_group(MedicalRecord record){
        return true;
    }

    public static boolean FT15_group(MedicalRecord record){
        return true;
    }

    public static boolean FT35_group(MedicalRecord record){
        return true;
    }

    public static boolean FT45_group(MedicalRecord record){
        return true;
    }

    public static boolean FU15_group(MedicalRecord record){
        return true;
    }

    public static boolean FU25_group(MedicalRecord record){
        return true;
    }

    public static boolean FV25_group(MedicalRecord record){
        return true;
    }

    public static boolean FV35_group(MedicalRecord record){
        return true;
    }

    public static boolean FW15_group(MedicalRecord record){
        return true;
    }

    public static boolean FW25_group(MedicalRecord record){
        return true;
    }

    public static boolean FZ15_group(MedicalRecord record){
        return true;
    }

}