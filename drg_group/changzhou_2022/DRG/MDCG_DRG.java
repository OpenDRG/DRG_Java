package drg_group.changzhou_2022.DRG;

import java.util.Arrays;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;

public class MDCG_DRG {

    public static boolean GU10_group(MedicalRecord record){
        return record.age<=17;
    }

    public static boolean GV10_group(MedicalRecord record){
        return record.age<=17;
    }

    public static boolean GW10_group(MedicalRecord record){
        return record.age<=17;
    }

    public static boolean GD19_group(MedicalRecord record){
        return true;
    }

    public static boolean GD29_group(MedicalRecord record){
        return true;
    }

    public static boolean GE19_group(MedicalRecord record){
        return true;
    }

    public static boolean GF19_group(MedicalRecord record){
        return true;
    }

    public static boolean GF29_group(MedicalRecord record){
        return true;
    }

    public static boolean GG19_group(MedicalRecord record){
        return true;
    }

    public static boolean GK19_group(MedicalRecord record){
        return true;
    }

    public static boolean GK29_group(MedicalRecord record){
        return true;
    }

    public static boolean GK39_group(MedicalRecord record){
        return true;
    }

    public static boolean GU29_group(MedicalRecord record){
        return true;
    }

    public static boolean GW19_group(MedicalRecord record){
        return true;
    }

    public static boolean GZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean GB17_group(MedicalRecord record){
        return record.inHospitalTime<5 && (record.leavingType.equals("2") || record.leavingType.equals("5"));
    }

    public static boolean GB27_group(MedicalRecord record){
        return record.inHospitalTime<5 && (record.leavingType.equals("2") || record.leavingType.equals("5"));
    }

    public static boolean GC17_group(MedicalRecord record){
        return record.inHospitalTime<5 && (record.leavingType.equals("2") || record.leavingType.equals("5"));
    }

    public static boolean GR17_group(MedicalRecord record){
        return record.inHospitalTime<5 && (record.leavingType.equals("2") || record.leavingType.equals("5"));
    }

    public static boolean GS17_group(MedicalRecord record){
        return record.inHospitalTime<5 && (record.leavingType.equals("2") || record.leavingType.equals("5"));
    }

    public static boolean GB11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GB21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GC11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GC21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GE21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GJ11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GS11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GT11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GU11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GV11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean GB13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GB23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GC13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GE23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GJ13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GS13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GT13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GV13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean GB15_group(MedicalRecord record){
        return true;
    }

    public static boolean GB25_group(MedicalRecord record){
        return true;
    }

    public static boolean GC15_group(MedicalRecord record){
        return true;
    }

    public static boolean GC25_group(MedicalRecord record){
        return true;
    }

    public static boolean GE25_group(MedicalRecord record){
        return true;
    }

    public static boolean GJ15_group(MedicalRecord record){
        return true;
    }

    public static boolean GR15_group(MedicalRecord record){
        return true;
    }

    public static boolean GS15_group(MedicalRecord record){
        return true;
    }

    public static boolean GT15_group(MedicalRecord record){
        return true;
    }

    public static boolean GU15_group(MedicalRecord record){
        return true;
    }

    public static boolean GV15_group(MedicalRecord record){
        return true;
    }

}