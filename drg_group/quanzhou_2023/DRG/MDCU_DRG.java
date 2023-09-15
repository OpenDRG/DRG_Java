package drg_group.quanzhou_2023.DRG;

import java.util.Arrays;

import drg_group.quanzhou_2023.Base;
import drg_group.quanzhou_2023.MedicalRecord;

public class MDCU_DRG {

    public static boolean US19_group(MedicalRecord record){
        return true;
    }

    public static boolean UR13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean UR15_group(MedicalRecord record){
        return true;
    }

}