package drg_group.wuxi_2022.DRG;

import java.util.Arrays;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;

public class MDCJ_DRG {

    public static boolean JS29_group(MedicalRecord record){
        return true;
    }

    public static boolean JT19_group(MedicalRecord record){
        return true;
    }

    public static boolean JB19_group(MedicalRecord record){
        return true;
    }

    public static boolean JV19_group(MedicalRecord record){
        return true;
    }

    public static boolean JR19_group(MedicalRecord record){
        return true;
    }

    public static boolean JA29_group(MedicalRecord record){
        return true;
    }

    public static boolean JA19_group(MedicalRecord record){
        return true;
    }

    public static boolean JZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean JB29_group(MedicalRecord record){
        return true;
    }

    public static boolean JD29_group(MedicalRecord record){
        return true;
    }

    public static boolean JB39_group(MedicalRecord record){
        return true;
    }

    public static boolean JV29_group(MedicalRecord record){
        return true;
    }

    public static boolean JC19_group(MedicalRecord record){
        return true;
    }

    public static boolean JU11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean JS11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean JU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JS13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JD13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JR23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JR25_group(MedicalRecord record){
        return true;
    }

    public static boolean JU15_group(MedicalRecord record){
        return true;
    }

    public static boolean JS15_group(MedicalRecord record){
        return true;
    }

    public static boolean JD15_group(MedicalRecord record){
        return true;
    }

    public static boolean JJ15_group(MedicalRecord record){
        return true;
    }

}