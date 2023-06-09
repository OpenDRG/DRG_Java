package drg_group.chongqing_2022.DRG;

import java.util.Arrays;

import drg_group.chongqing_2022.Base;
import drg_group.chongqing_2022.MedicalRecord;

public class MDCU_DRG {

    public static boolean US19_group(MedicalRecord record){
        return true;
    }

    public static boolean UR11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

    public static boolean UR13_group(MedicalRecord record){
        return record.zdList.length>1 && (Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)) || Base.has_cc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length)));
    }

    public static boolean UR15_group(MedicalRecord record){
        return true;
    }

}