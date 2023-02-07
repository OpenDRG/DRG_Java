package drg_group.beijing_2022.DRG;

import java.util.Arrays;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;

public class MDCN_DRG {

    public static boolean NG19_group(MedicalRecord record){
        return true;
    }

    public static boolean NA19_group(MedicalRecord record){
        return true;
    }

    public static boolean NF19_group(MedicalRecord record){
        return true;
    }

    public static boolean NZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean NC19_group(MedicalRecord record){
        return true;
    }

    public static boolean NE19_group(MedicalRecord record){
        return true;
    }

    public static boolean ND19_group(MedicalRecord record){
        return true;
    }

    public static boolean NR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean NS13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean NJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean NB13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean NA23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean NS15_group(MedicalRecord record){
        return true;
    }

    public static boolean NB15_group(MedicalRecord record){
        return true;
    }

    public static boolean NA25_group(MedicalRecord record){
        return true;
    }

    public static boolean NJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean NR15_group(MedicalRecord record){
        return true;
    }

}