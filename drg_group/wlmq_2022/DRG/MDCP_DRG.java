package drg_group.wlmq_2022.DRG;

import java.util.Arrays;

import drg_group.wlmq_2022.Base;
import drg_group.wlmq_2022.MedicalRecord;

public class MDCP_DRG {

    public static boolean PB19_group(MedicalRecord record){
        return true;
    }

    public static boolean PC19_group(MedicalRecord record){
        return true;
    }

    public static boolean PJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean PS19_group(MedicalRecord record){
        return true;
    }

    public static boolean PS29_group(MedicalRecord record){
        return true;
    }

    public static boolean PS39_group(MedicalRecord record){
        return true;
    }

    public static boolean PS49_group(MedicalRecord record){
        return true;
    }

    public static boolean PV19_group(MedicalRecord record){
        return true;
    }

    public static boolean PK11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean PR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean PU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean PK15_group(MedicalRecord record){
        return true;
    }

    public static boolean PR15_group(MedicalRecord record){
        return true;
    }

    public static boolean PU15_group(MedicalRecord record){
        return true;
    }

}