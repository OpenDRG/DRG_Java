package drg_group.beijing_2022.DRG;

import java.util.Arrays;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;

public class MDCW_DRG {

    public static boolean WC19_group(MedicalRecord record){
        return true;
    }

    public static boolean WB19_group(MedicalRecord record){
        return true;
    }

    public static boolean WR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean WZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean WJ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean WZ15_group(MedicalRecord record){
        return true;
    }

    public static boolean WR15_group(MedicalRecord record){
        return true;
    }

    public static boolean WJ15_group(MedicalRecord record){
        return true;
    }

}