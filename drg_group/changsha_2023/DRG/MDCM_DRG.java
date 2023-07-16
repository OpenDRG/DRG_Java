package drg_group.changsha_2023.DRG;

import java.util.Arrays;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;

public class MDCM_DRG {

    public static boolean MA19_group(MedicalRecord record){
        return true;
    }

    public static boolean MC19_group(MedicalRecord record){
        return true;
    }

    public static boolean MR19_group(MedicalRecord record){
        return true;
    }

    public static boolean MD1A_group(MedicalRecord record){
        return record.age<=6;
    }

    public static boolean MJ1A_group(MedicalRecord record){
        return record.age<=6;
    }

    public static boolean MD1B_group(MedicalRecord record){
        return true;
    }

    public static boolean MJ1B_group(MedicalRecord record){
        return true;
    }

    public static boolean MB11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean MS11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean MZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean MS13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean MB15_group(MedicalRecord record){
        return true;
    }

    public static boolean MS15_group(MedicalRecord record){
        return true;
    }

    public static boolean MZ15_group(MedicalRecord record){
        return true;
    }

}