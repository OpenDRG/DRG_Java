package drg_group.zhejiang_2022.DRG;

import java.util.Arrays;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;

public class MDCX_DRG {

    public static boolean XJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean XR29_group(MedicalRecord record){
        return true;
    }

    public static boolean XS19_group(MedicalRecord record){
        return true;
    }

    public static boolean XS29_group(MedicalRecord record){
        return true;
    }

    public static boolean XT19_group(MedicalRecord record){
        return true;
    }

    public static boolean XT39_group(MedicalRecord record){
        return true;
    }

    public static boolean XR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean XT21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean XR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean XT23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean XR15_group(MedicalRecord record){
        return true;
    }

    public static boolean XT25_group(MedicalRecord record){
        return true;
    }

}