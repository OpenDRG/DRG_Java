package drg_group.changsha_2023.DRG;

import java.util.Arrays;

import drg_group.changsha_2023.Base;
import drg_group.changsha_2023.MedicalRecord;

public class MDCK_DRG {

    public static boolean KB19_group(MedicalRecord record){
        return true;
    }

    public static boolean KC19_group(MedicalRecord record){
        return true;
    }

    public static boolean KE19_group(MedicalRecord record){
        return true;
    }

    public static boolean KR19_group(MedicalRecord record){
        return true;
    }

    public static boolean KV19_group(MedicalRecord record){
        return true;
    }

    public static boolean KD11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean KD21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean KJ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean KS11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean KT11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean KU11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean KZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean KS13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean KZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean KD15_group(MedicalRecord record){
        return true;
    }

    public static boolean KD25_group(MedicalRecord record){
        return true;
    }

    public static boolean KJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean KS15_group(MedicalRecord record){
        return true;
    }

    public static boolean KT15_group(MedicalRecord record){
        return true;
    }

    public static boolean KU15_group(MedicalRecord record){
        return true;
    }

    public static boolean KZ15_group(MedicalRecord record){
        return true;
    }

}