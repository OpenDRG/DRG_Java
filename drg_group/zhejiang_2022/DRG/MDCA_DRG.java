package drg_group.zhejiang_2022.DRG;

import java.util.Arrays;

import drg_group.zhejiang_2022.Base;
import drg_group.zhejiang_2022.MedicalRecord;

public class MDCA_DRG {

    public static boolean AA19_group(MedicalRecord record){
        return true;
    }

    public static boolean AB19_group(MedicalRecord record){
        return true;
    }

    public static boolean AC19_group(MedicalRecord record){
        return true;
    }

    public static boolean AD19_group(MedicalRecord record){
        return true;
    }

    public static boolean AE19_group(MedicalRecord record){
        return true;
    }

    public static boolean AF19_group(MedicalRecord record){
        return true;
    }

    public static boolean AG19_group(MedicalRecord record){
        return true;
    }

    public static boolean AG29_group(MedicalRecord record){
        return true;
    }

    public static boolean AH13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean AH11_group(MedicalRecord record){
        return record.ssList.length>1 && Base.contains(record.ssList,"39.6500");
    }

    public static boolean AH19_group(MedicalRecord record){
        return record.ssList.length>1 && Base.intersect(record.ssList,new String[]{"31.1x00x005","31.2100x001","31.2900x001","96.0400"}) && Base.contains(record.ssList,"96.7201");
    }

}