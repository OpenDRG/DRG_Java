package drg_group.linfen_2022.DRG;

import java.util.Arrays;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;

public class MDCI_DRG {

    public static boolean IB19_group(MedicalRecord record){
        return true;
    }

    public static boolean IB29_group(MedicalRecord record){
        return true;
    }

    public static boolean IB39_group(MedicalRecord record){
        return true;
    }

    public static boolean IC29_group(MedicalRecord record){
        return true;
    }

    public static boolean ID19_group(MedicalRecord record){
        return true;
    }

    public static boolean IF39_group(MedicalRecord record){
        return true;
    }

    public static boolean IG19_group(MedicalRecord record){
        return true;
    }

    public static boolean IR19_group(MedicalRecord record){
        return true;
    }

    public static boolean IR29_group(MedicalRecord record){
        return true;
    }

    public static boolean IS19_group(MedicalRecord record){
        return true;
    }

    public static boolean IT39_group(MedicalRecord record){
        return true;
    }

    public static boolean IU29_group(MedicalRecord record){
        return true;
    }

    public static boolean IU39_group(MedicalRecord record){
        return true;
    }

    public static boolean IV19_group(MedicalRecord record){
        return true;
    }

    public static boolean IZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean IC31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IF51_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IS21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IT11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IT21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IZ21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IC13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IC43_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IE13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IF13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IF23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IF43_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IH13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IS23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IT23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IC15_group(MedicalRecord record){
        return true;
    }

    public static boolean IC35_group(MedicalRecord record){
        return true;
    }

    public static boolean IC45_group(MedicalRecord record){
        return true;
    }

    public static boolean IE15_group(MedicalRecord record){
        return true;
    }

    public static boolean IF15_group(MedicalRecord record){
        return true;
    }

    public static boolean IF25_group(MedicalRecord record){
        return true;
    }

    public static boolean IF45_group(MedicalRecord record){
        return true;
    }

    public static boolean IF55_group(MedicalRecord record){
        return true;
    }

    public static boolean IH15_group(MedicalRecord record){
        return true;
    }

    public static boolean IJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean IS25_group(MedicalRecord record){
        return true;
    }

    public static boolean IT15_group(MedicalRecord record){
        return true;
    }

    public static boolean IT25_group(MedicalRecord record){
        return true;
    }

    public static boolean IU15_group(MedicalRecord record){
        return true;
    }

    public static boolean IZ25_group(MedicalRecord record){
        return true;
    }

}