package drg_group.lanzhou_2023.DRG;

import java.util.Arrays;

import drg_group.lanzhou_2023.Base;
import drg_group.lanzhou_2023.MedicalRecord;

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

    public static boolean ZC1B_group(MedicalRecord record){
        return true;
    }

    public static boolean ZJ1B_group(MedicalRecord record){
        return true;
    }

    public static boolean ZZ1B_group(MedicalRecord record){
        return true;
    }

}