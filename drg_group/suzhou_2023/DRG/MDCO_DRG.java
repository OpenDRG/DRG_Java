package drg_group.suzhou_2023.DRG;

import java.util.Arrays;

import drg_group.suzhou_2023.Base;
import drg_group.suzhou_2023.MedicalRecord;

public class MDCO_DRG {

    public static boolean OB19_group(MedicalRecord record){
        return true;
    }

    public static boolean OC19_group(MedicalRecord record){
        return true;
    }

    public static boolean OD19_group(MedicalRecord record){
        return true;
    }

    public static boolean OD29_group(MedicalRecord record){
        return true;
    }

    public static boolean OE19_group(MedicalRecord record){
        return true;
    }

    public static boolean OF19_group(MedicalRecord record){
        return true;
    }

    public static boolean OF29_group(MedicalRecord record){
        return true;
    }

    public static boolean OJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean OR19_group(MedicalRecord record){
        return true;
    }

    public static boolean OZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean OS21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean OS1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean OT1A_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean OS2B_group(MedicalRecord record){
        return true;
    }

    public static boolean OS15_group(MedicalRecord record){
        return true;
    }

    public static boolean OT15_group(MedicalRecord record){
        return true;
    }

}