package drg_group.linfen_2022.DRG;

import java.util.Arrays;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;

public class MDCP_DRG {

    public static boolean PK19_group(MedicalRecord record){
        return true;
    }

    public static boolean PR19_group(MedicalRecord record){
        return true;
    }

    public static boolean PS19_group(MedicalRecord record){
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

    public static boolean PU11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean PU15_group(MedicalRecord record){
        return true;
    }

}