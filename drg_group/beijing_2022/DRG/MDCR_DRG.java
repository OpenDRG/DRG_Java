package drg_group.beijing_2022.DRG;

import java.util.Arrays;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;

public class MDCR_DRG {

    public static boolean RA49_group(MedicalRecord record){
        return true;
    }

    public static boolean RT29_group(MedicalRecord record){
        return true;
    }

    public static boolean RA39_group(MedicalRecord record){
        return true;
    }

    public static boolean RG19_group(MedicalRecord record){
        return true;
    }

    public static boolean RU11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean RA21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean RT11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean RR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean RD11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean RB11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean RS11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean RA11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean RW11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean RB21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean RW21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean RA23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean RS13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean RR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean RS23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean RD15_group(MedicalRecord record){
        return true;
    }

    public static boolean RR15_group(MedicalRecord record){
        return true;
    }

    public static boolean RB15_group(MedicalRecord record){
        return true;
    }

    public static boolean RS25_group(MedicalRecord record){
        return true;
    }

    public static boolean RA25_group(MedicalRecord record){
        return true;
    }

    public static boolean RT15_group(MedicalRecord record){
        return true;
    }

    public static boolean RA15_group(MedicalRecord record){
        return true;
    }

    public static boolean RW25_group(MedicalRecord record){
        return true;
    }

    public static boolean RU15_group(MedicalRecord record){
        return true;
    }

    public static boolean RS15_group(MedicalRecord record){
        return true;
    }

    public static boolean RW15_group(MedicalRecord record){
        return true;
    }

    public static boolean RB25_group(MedicalRecord record){
        return true;
    }

    public static boolean RC12_group(MedicalRecord record){
        return record.inHospitalTime>=13;
    }

    public static boolean RC14_group(MedicalRecord record){
        return record.inHospitalTime>=6 && record.inHospitalTime<13;
    }

    public static boolean RC16_group(MedicalRecord record){
        return record.inHospitalTime>=2 && record.inHospitalTime<6;
    }

    public static boolean RC18_group(MedicalRecord record){
        return record.inHospitalTime==1;
    }

    public static boolean RC22_group(MedicalRecord record){
        return record.inHospitalTime>=14;
    }

    public static boolean RC24_group(MedicalRecord record){
        return record.inHospitalTime>=7 && record.inHospitalTime<14;
    }

    public static boolean RC26_group(MedicalRecord record){
        return record.inHospitalTime>=3 && record.inHospitalTime<7;
    }

    public static boolean RC28_group(MedicalRecord record){
        return record.inHospitalTime>=1 && record.inHospitalTime<3;
    }

    public static boolean RE12_group(MedicalRecord record){
        return record.inHospitalTime>=14;
    }

    public static boolean RE14_group(MedicalRecord record){
        return record.inHospitalTime>=7 && record.inHospitalTime<14;
    }

    public static boolean RE16_group(MedicalRecord record){
        return record.inHospitalTime>=1 && record.inHospitalTime<7;
    }

}