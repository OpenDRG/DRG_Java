package drg_group.qingdao_2023.DRG;

import java.util.Arrays;

import drg_group.qingdao_2023.Base;
import drg_group.qingdao_2023.MedicalRecord;

public class MDCW_DRG {

    public static boolean WC19_group(MedicalRecord record){
        return true;
    }

    public static boolean WJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean WZ19_group(MedicalRecord record){
        return true;
    }

    public static boolean WB11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean WR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean WR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean WB15_group(MedicalRecord record){
        return true;
    }

    public static boolean WR15_group(MedicalRecord record){
        return true;
    }

}