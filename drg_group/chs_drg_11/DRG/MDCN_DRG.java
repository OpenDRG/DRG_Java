package drg_group.chs_drg_11.DRG;

import java.util.Arrays;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;

public class MDCN_DRG {

    public static boolean NA19_group(MedicalRecord record){
        return true;
    }

    public static boolean NA29_group(MedicalRecord record){
        return true;
    }

    public static boolean NB19_group(MedicalRecord record){
        return true;
    }

    public static boolean NC19_group(MedicalRecord record){
        return true;
    }

    public static boolean ND19_group(MedicalRecord record){
        return true;
    }

    public static boolean NE19_group(MedicalRecord record){
        return true;
    }

    public static boolean NF19_group(MedicalRecord record){
        return true;
    }

    public static boolean NG19_group(MedicalRecord record){
        return true;
    }

    public static boolean NJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean NS19_group(MedicalRecord record){
        return true;
    }

    public static boolean NZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean NR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean NR15_group(MedicalRecord record){
        return true;
    }

}