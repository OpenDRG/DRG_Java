package drg_group.changzhou_2022.DRG;

import java.util.Arrays;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;

public class MDCI_DRG {

    public static boolean IG10_group(MedicalRecord record){
        return record.age<=17;
    }

    public static boolean IJ10_group(MedicalRecord record){
        return record.age<=17;
    }

    public static boolean IS10_group(MedicalRecord record){
        return record.age<=17;
    }

    public static boolean IU10_group(MedicalRecord record){
        return record.age<=17;
    }

    public static boolean IB19_group(MedicalRecord record){
        return true;
    }

    public static boolean IB29_group(MedicalRecord record){
        return true;
    }

    public static boolean IB39_group(MedicalRecord record){
        return true;
    }

    public static boolean IC19_group(MedicalRecord record){
        return true;
    }

    public static boolean IC29_group(MedicalRecord record){
        return true;
    }

    public static boolean IC39_group(MedicalRecord record){
        return true;
    }

    public static boolean IE19_group(MedicalRecord record){
        return true;
    }

    public static boolean IF19_group(MedicalRecord record){
        return true;
    }

    public static boolean IF29_group(MedicalRecord record){
        return true;
    }

    public static boolean IF39_group(MedicalRecord record){
        return true;
    }

    public static boolean IF49_group(MedicalRecord record){
        return true;
    }

    public static boolean IF59_group(MedicalRecord record){
        return true;
    }

    public static boolean IG19_group(MedicalRecord record){
        return true;
    }

    public static boolean IH19_group(MedicalRecord record){
        return true;
    }

    public static boolean IT39_group(MedicalRecord record){
        return true;
    }

    public static boolean IZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean IR27_group(MedicalRecord record){
        return record.inHospitalTime<5 && (record.leavingType.equals("2") || record.leavingType.equals("5"));
    }

    public static boolean IS27_group(MedicalRecord record){
        return record.inHospitalTime<5 && (record.leavingType.equals("2") || record.leavingType.equals("5"));
    }

    public static boolean IT27_group(MedicalRecord record){
        return record.inHospitalTime<5 && (record.leavingType.equals("2") || record.leavingType.equals("5"));
    }

    public static boolean IU27_group(MedicalRecord record){
        return record.inHospitalTime<5 && (record.leavingType.equals("2") || record.leavingType.equals("5"));
    }

    public static boolean ID11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IJ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IR21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IR31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IS11_group(MedicalRecord record){
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

    public static boolean IU11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IU21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean IU31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean ID13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IR23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IR33_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IS13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IS23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IT13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IT23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IU23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IU33_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IV13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean IZ23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean ID15_group(MedicalRecord record){
        return true;
    }

    public static boolean IJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean IR15_group(MedicalRecord record){
        return true;
    }

    public static boolean IR25_group(MedicalRecord record){
        return true;
    }

    public static boolean IR35_group(MedicalRecord record){
        return true;
    }

    public static boolean IS15_group(MedicalRecord record){
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

    public static boolean IU25_group(MedicalRecord record){
        return true;
    }

    public static boolean IU35_group(MedicalRecord record){
        return true;
    }

    public static boolean IV15_group(MedicalRecord record){
        return true;
    }

    public static boolean IZ25_group(MedicalRecord record){
        return true;
    }

}