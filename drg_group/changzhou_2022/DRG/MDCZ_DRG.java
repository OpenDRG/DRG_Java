package drg_group.changzhou_2022.DRG;

import java.util.Arrays;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;

public class MDCZ_DRG {

    public static boolean ZB19_group(MedicalRecord record){
        return true;
    }

    public static boolean ZD19_group(MedicalRecord record){
        return true;
    }

    public static boolean ZZ17_group(MedicalRecord record){
        return record.inHospitalTime<5 && (record.leavingType.equals("2") || record.leavingType.equals("5"));
    }

    public static boolean ZJ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean ZZ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean ZJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean ZZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean ZJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean ZZ15_group(MedicalRecord record){
        return true;
    }

    public static boolean ZC14_group(MedicalRecord record){
        return record.ssList.length>1 && Base.intersect(Arrays.copyOfRange(record.ssList,1,record.ssList.length),new String[]{"31.1x00x005","31.2100x001","31.2900x001","31.7400","31.7400x001","96.0400"});
    }

    public static boolean ZC18_group(MedicalRecord record){
        return true;
    }

}