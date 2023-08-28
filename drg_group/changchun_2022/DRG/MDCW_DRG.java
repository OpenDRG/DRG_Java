package drg_group.changchun_2022.DRG;

import java.util.Arrays;

import drg_group.changchun_2022.Base;
import drg_group.changchun_2022.MedicalRecord;

public class MDCW_DRG {

    public static boolean WB19_group(MedicalRecord record){
        return true;
    }

    public static boolean WC19_group(MedicalRecord record){
        return true;
    }

    public static boolean WJ19_group(MedicalRecord record){
        return true;
    }

    public static boolean WR19_group(MedicalRecord record){
        return true;
    }

    public static boolean WZ13_group(MedicalRecord record){
        return record.zdList.length>1 && (record.mccList.length>0 || record.ccList.length>0);
    }

    public static boolean WZ15_group(MedicalRecord record){
        return true;
    }

}