package drg_group.fuzhou_2022.DRG;

import java.util.Arrays;

import drg_group.fuzhou_2022.Base;
import drg_group.fuzhou_2022.MedicalRecord;

public class MDCJ_DRG {

    public static boolean JS29_group(MedicalRecord record){
        return true;
    }

    public static boolean JT19_group(MedicalRecord record){
        return true;
    }

    public static boolean JV19_group(MedicalRecord record){
        return true;
    }

    public static boolean JV29_group(MedicalRecord record){
        return true;
    }

    public static boolean JZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean JU11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean JU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean JU15_group(MedicalRecord record){
        return true;
    }

}