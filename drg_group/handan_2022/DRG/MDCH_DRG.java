package drg_group.handan_2022.DRG;

import java.util.Arrays;

import drg_group.handan_2022.Base;
import drg_group.handan_2022.MedicalRecord;

public class MDCH_DRG {

    public static boolean HC19_group(MedicalRecord record){
        return true;
    }

    public static boolean HC29_group(MedicalRecord record){
        return true;
    }

    public static boolean HC39_group(MedicalRecord record){
        return true;
    }

    public static boolean HR19_group(MedicalRecord record){
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

    public static boolean HT29_group(MedicalRecord record){
        return true;
    }

    public static boolean HZ39_group(MedicalRecord record){
        return true;
    }

    public static boolean HB11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean HJ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean HK11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean HL11_group(MedicalRecord record){
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

    public static boolean HK13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean HL23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean HB15_group(MedicalRecord record){
        return true;
    }

    public static boolean HJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean HK15_group(MedicalRecord record){
        return true;
    }

    public static boolean HL15_group(MedicalRecord record){
        return true;
    }

    public static boolean HL25_group(MedicalRecord record){
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

}