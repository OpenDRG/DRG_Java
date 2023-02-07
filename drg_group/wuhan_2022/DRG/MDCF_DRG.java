package drg_group.wuhan_2022.DRG;

import java.util.Arrays;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;

public class MDCF_DRG {

    public static boolean FD39_group(MedicalRecord record){
        return true;
    }

    public static boolean FR39_group(MedicalRecord record){
        return true;
    }

    public static boolean FK39_group(MedicalRecord record){
        return true;
    }

    public static boolean FC39_group(MedicalRecord record){
        return true;
    }

    public static boolean FW19_group(MedicalRecord record){
        return true;
    }

    public static boolean FR29_group(MedicalRecord record){
        return true;
    }

    public static boolean FD19_group(MedicalRecord record){
        return true;
    }

    public static boolean FC19_group(MedicalRecord record){
        return true;
    }

    public static boolean FN19_group(MedicalRecord record){
        return true;
    }

    public static boolean FV49_group(MedicalRecord record){
        return true;
    }

    public static boolean FF19_group(MedicalRecord record){
        return true;
    }

    public static boolean FL19_group(MedicalRecord record){
        return true;
    }

    public static boolean FK19_group(MedicalRecord record){
        return true;
    }

    public static boolean FS19_group(MedicalRecord record){
        return true;
    }

    public static boolean FV29_group(MedicalRecord record){
        return true;
    }

    public static boolean FT39_group(MedicalRecord record){
        return true;
    }

    public static boolean FB29_group(MedicalRecord record){
        return true;
    }

    public static boolean FT29_group(MedicalRecord record){
        return true;
    }

    public static boolean FM29_group(MedicalRecord record){
        return true;
    }

    public static boolean FK29_group(MedicalRecord record){
        return true;
    }

    public static boolean FB19_group(MedicalRecord record){
        return true;
    }

    public static boolean FU19_group(MedicalRecord record){
        return true;
    }

    public static boolean FC29_group(MedicalRecord record){
        return true;
    }

    public static boolean FM19_group(MedicalRecord record){
        return true;
    }

    public static boolean FV11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FW21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FT11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FF31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FR41_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FU21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FB31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FN21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FE11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FD2A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FL2A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FM3A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FJ1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FV3A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FF2A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FF4A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FU23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FF33_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FB33_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FE1B_group(MedicalRecord record){
        return true;
    }

    public static boolean FN2B_group(MedicalRecord record){
        return true;
    }

    public static boolean FR1B_group(MedicalRecord record){
        return true;
    }

    public static boolean FV1B_group(MedicalRecord record){
        return true;
    }

    public static boolean FT1B_group(MedicalRecord record){
        return true;
    }

    public static boolean FW2B_group(MedicalRecord record){
        return true;
    }

    public static boolean FR4B_group(MedicalRecord record){
        return true;
    }

    public static boolean FD25_group(MedicalRecord record){
        return true;
    }

    public static boolean FZ15_group(MedicalRecord record){
        return true;
    }

    public static boolean FJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean FF35_group(MedicalRecord record){
        return true;
    }

    public static boolean FU25_group(MedicalRecord record){
        return true;
    }

    public static boolean FV35_group(MedicalRecord record){
        return true;
    }

    public static boolean FB35_group(MedicalRecord record){
        return true;
    }

    public static boolean FM35_group(MedicalRecord record){
        return true;
    }

    public static boolean FF45_group(MedicalRecord record){
        return true;
    }

    public static boolean FF25_group(MedicalRecord record){
        return true;
    }

    public static boolean FL25_group(MedicalRecord record){
        return true;
    }

}