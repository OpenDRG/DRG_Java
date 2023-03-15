package drg_group.tongchuan_2022.DRG;

import java.util.Arrays;

import drg_group.tongchuan_2022.Base;
import drg_group.tongchuan_2022.MedicalRecord;

public class MDCZ_DRG {

    public static boolean ZB19_group(MedicalRecord record){
        return true;
    }

    public static boolean ZD19_group(MedicalRecord record){
        return true;
    }

    public static boolean ZC11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean ZJ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean ZZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean ZC15_group(MedicalRecord record){
        return true;
    }

    public static boolean ZJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean ZZ15_group(MedicalRecord record){
        return true;
    }

}