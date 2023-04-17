package drg_group.wlmq_2022.DRG;

import java.util.Arrays;

import drg_group.wlmq_2022.Base;
import drg_group.wlmq_2022.MedicalRecord;

public class MDCY_DRG {

    public static boolean YR19_group(MedicalRecord record){
        return true;
    }

    public static boolean YR21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean YC13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean YR23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean YC15_group(MedicalRecord record){
        return true;
    }

    public static boolean YR25_group(MedicalRecord record){
        return true;
    }

}