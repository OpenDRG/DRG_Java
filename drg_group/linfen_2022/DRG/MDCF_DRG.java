package drg_group.linfen_2022.DRG;

import java.util.Arrays;

import drg_group.linfen_2022.Base;
import drg_group.linfen_2022.MedicalRecord;

public class MDCF_DRG {

    public static boolean FB19_group(MedicalRecord record){
        return true;
    }

    public static boolean FB29_group(MedicalRecord record){
        return true;
    }

    public static boolean FC19_group(MedicalRecord record){
        return true;
    }

    public static boolean FD19_group(MedicalRecord record){
        return true;
    }

    public static boolean FD39_group(MedicalRecord record){
        return true;
    }

    public static boolean FE19_group(MedicalRecord record){
        return true;
    }

    public static boolean FE29_group(MedicalRecord record){
        return true;
    }

    public static boolean FF19_group(MedicalRecord record){
        return true;
    }

    public static boolean FF29_group(MedicalRecord record){
        return true;
    }

    public static boolean FJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean FK19_group(MedicalRecord record){
        return true;
    }

    public static boolean FK29_group(MedicalRecord record){
        return true;
    }

    public static boolean FK39_group(MedicalRecord record){
        return true;
    }

    public static boolean FL19_group(MedicalRecord record){
        return true;
    }

    public static boolean FL29_group(MedicalRecord record){
        return true;
    }

    public static boolean FL39_group(MedicalRecord record){
        return true;
    }

    public static boolean FM19_group(MedicalRecord record){
        return true;
    }

    public static boolean FM29_group(MedicalRecord record){
        return true;
    }

    public static boolean FM39_group(MedicalRecord record){
        return true;
    }

    public static boolean FN19_group(MedicalRecord record){
        return true;
    }

    public static boolean FN29_group(MedicalRecord record){
        return true;
    }

    public static boolean FP19_group(MedicalRecord record){
        return true;
    }

    public static boolean FR39_group(MedicalRecord record){
        return true;
    }

    public static boolean FR49_group(MedicalRecord record){
        return true;
    }

    public static boolean FT19_group(MedicalRecord record){
        return true;
    }

    public static boolean FT29_group(MedicalRecord record){
        return true;
    }

    public static boolean FT39_group(MedicalRecord record){
        return true;
    }

    public static boolean FU29_group(MedicalRecord record){
        return true;
    }

    public static boolean FV19_group(MedicalRecord record){
        return true;
    }

    public static boolean FV29_group(MedicalRecord record){
        return true;
    }

    public static boolean FZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean FF31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FR21_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FV31_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FW11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean FD23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FM43_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FT43_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FU13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FW23_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean FD25_group(MedicalRecord record){
        return true;
    }

    public static boolean FF35_group(MedicalRecord record){
        return true;
    }

    public static boolean FM45_group(MedicalRecord record){
        return true;
    }

    public static boolean FR15_group(MedicalRecord record){
        return true;
    }

    public static boolean FR25_group(MedicalRecord record){
        return true;
    }

    public static boolean FT45_group(MedicalRecord record){
        return true;
    }

    public static boolean FU15_group(MedicalRecord record){
        return true;
    }

    public static boolean FV35_group(MedicalRecord record){
        return true;
    }

    public static boolean FW15_group(MedicalRecord record){
        return true;
    }

    public static boolean FW25_group(MedicalRecord record){
        return true;
    }

}