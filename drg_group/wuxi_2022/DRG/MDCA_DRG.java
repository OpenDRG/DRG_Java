package drg_group.wuxi_2022.DRG;

import java.util.Arrays;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;

public class MDCA_DRG {

    public static boolean AF19_group(MedicalRecord record){
        return true;
    }

    public static boolean AG19_group(MedicalRecord record){
        return true;
    }

    public static boolean AG29_group(MedicalRecord record){
        return true;
    }

    public static boolean AH11_group(MedicalRecord record){
        return record.zdList.length>1 && Base.has_mcc(record.Index,record.zdList[0],Arrays.copyOfRange(record.zdList,1,record.zdList.length));
    }

}