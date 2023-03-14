package drg_group.xian_2020.DRG;

import java.util.Arrays;

import drg_group.xian_2020.Base;
import drg_group.xian_2020.MedicalRecord;

public class MDCH_DRG {

    public static boolean HB19_group(MedicalRecord record){
        return true;
    }

    public static boolean HC19_group(MedicalRecord record){
        return true;
    }

    public static boolean HC29_group(MedicalRecord record){
        return true;
    }

    public static boolean HC39_group(MedicalRecord record){
        return true;
    }

    public static boolean HC49_group(MedicalRecord record){
        return true;
    }

    public static boolean HJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean HK19_group(MedicalRecord record){
        return true;
    }

    public static boolean HL19_group(MedicalRecord record){
        return true;
    }

    public static boolean HL29_group(MedicalRecord record){
        return true;
    }

    public static boolean HS19_group(MedicalRecord record){
        return true;
    }

    public static boolean HS29_group(MedicalRecord record){
        return true;
    }

    public static boolean HS39_group(MedicalRecord record){
        return true;
    }

    public static boolean HT19_group(MedicalRecord record){
        return true;
    }

    public static boolean HR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean HU11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean HZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean HZ21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean HZ31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean HR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean HU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean HZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean HZ23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean HZ33_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean HR15_group(MedicalRecord record){
        return true;
    }

    public static boolean HU15_group(MedicalRecord record){
        return true;
    }

    public static boolean HZ15_group(MedicalRecord record){
        return true;
    }

    public static boolean HZ25_group(MedicalRecord record){
        return true;
    }

    public static boolean HZ35_group(MedicalRecord record){
        return true;
    }

}