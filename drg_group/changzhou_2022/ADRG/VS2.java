package drg_group.changzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.changzhou_2022.Base;
import drg_group.changzhou_2022.MedicalRecord;
import drg_group.changzhou_2022.DRG.MDCV_DRG;

public class VS2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"F13.000","F13.000x001","F13.100x001","F13.200","F13.200x001","F13.201","F13.300","F13.400","F13.500","F13.600","F13.700","F13.900","F14.000x001","F17.000","F17.000x001","F17.100x001","F17.500","F17.600","F17.700","F17.900","F18.000x001","F18.100x001","F18.500","F18.600","F18.700","F18.900","F19.000","F19.000x002","F19.100x004","F19.200","F19.200x001","F19.201","F19.300","F19.400","F19.400x001","F19.500","F19.600","F19.700","F19.800","F19.900","F19.900x002","F19.900x003","F19.900x004","F19.900x005","F19.900x006","F19.900x007","F19.900x008","F19.900x009","F55.x00","F55.x00x001","F55.x00x101","F55.x00x201","F55.x00x301","F55.x00x401","F55.x00x501","F55.x00x601","F55.x00x702","F55.x00x703","F55.x00x704","G25.803","R50.200","R78.700","R78.801","T36.000","T36.100x003","T36.101","T36.102","T36.200","T36.300","T36.300x001","T36.400","T36.500","T36.500x003","T36.501","T36.502","T36.600","T36.700","T36.800","T36.900","T36.900x001","T37.000","T37.100","T37.100x001","T37.200","T37.300","T37.300x001","T37.400","T37.500","T37.800","T37.800x001","T37.900x001","T37.900x002","T38.000","T38.000x001","T38.000x002","T38.100","T38.100x001","T38.200","T38.300","T38.300x001","T38.300x003","T38.301","T38.400","T38.401","T38.500","T38.500x001","T38.500x002","T38.501","T38.600","T38.600x001","T38.700","T38.800x001","T38.801","T38.901","T39.000","T39.100","T39.101","T39.200","T39.200x001","T39.201","T39.300","T39.300x002","T39.300x003","T39.400x001","T39.800","T39.801","T39.802","T39.900","T39.901","T39.902","T40.400x002","T40.800","T40.900x001","T40.900x002","T40.900x003","T40.901","T41.000","T41.100","T41.100x002","T41.200x002","T41.201","T41.300","T41.400","T41.500","T41.500x001","T41.500x003","T42.000","T42.001","T42.100","T42.101","T42.200x001","T42.200x002","T42.300","T42.301","T42.302","T42.400","T42.401","T42.402","T42.403","T42.404","T42.405","T42.406","T42.500x001","T42.600","T42.600x002","T42.600x004","T42.600x005","T42.600x006","T42.601","T42.602","T42.700x001","T42.700x003","T42.701","T42.702","T42.800","T42.800x001","T42.800x002","T42.800x003","T43.000x002","T43.000x003","T43.001","T43.002","T43.100","T43.200x001","T43.201","T43.300","T43.300x001","T43.300x003","T43.301","T43.302","T43.400x002","T43.400x003","T43.401","T43.500x001","T43.500x002","T43.500x003","T43.500x004","T43.500x005","T43.501","T43.502","T43.600x004","T43.601","T43.800","T43.900","T44.000","T44.001","T44.100x001","T44.200x001","T44.300","T44.301","T44.302","T44.303","T44.400x001","T44.400x002","T44.500x001","T44.600x001","T44.700x001","T44.701","T44.800x001","T44.900x001","T44.900x002","T44.900x003","T44.901","T45.000x001","T45.001","T45.002","T45.003","T45.100","T45.100x001","T45.100x002","T45.100x003","T45.100x004","T45.101","T45.102","T45.200x001","T45.201","T45.202","T45.300x001","T45.400","T45.500x002","T45.501","T45.600","T45.700x001","T45.700x002","T45.700x003","T45.800x001","T45.800x002","T45.800x003","T46.000","T46.001","T46.002","T46.100","T46.100x001","T46.200x001","T46.300x002","T46.300x003","T46.301","T46.302","T46.400","T46.500x002","T46.500x003","T46.500x004","T46.500x005","T46.501","T46.600","T46.600x001","T46.700","T46.700x001","T46.700x002","T46.800x001","T46.900x001","T46.901","T47.000","T47.100x001","T47.200","T47.200x002","T47.300","T47.300x001","T47.400","T47.400x001","T47.500","T47.600","T47.700","T48.000","T48.100","T48.300","T48.400","T48.500","T48.600","T48.600x002","T48.600x003","T48.601","T48.602","T48.603","T49.000","T49.000x003","T49.000x005","T49.001","T49.002","T49.003","T49.100","T49.200x001","T49.201","T49.300x001","T49.300x002","T49.300x003","T49.400x001","T49.400x002","T49.400x003","T49.500","T49.600","T49.700x001","T49.800","T49.800x001","T49.801","T50.000","T50.100","T50.200","T50.200x001","T50.200x002","T50.300","T50.300x001","T50.300x002","T50.400x001","T50.500","T50.600x001","T50.600x002","T50.600x003","T50.700x001","T50.700x002","T50.800","T50.900","T50.900x001","T50.900x002","T50.900x003","T50.900x004","T50.900x005","T50.900x006","T50.900x007","T51.000","T51.100","T51.200","T51.200x001","T51.300","T51.300x002","T51.300x003","T51.300x004","T51.800","T51.800x001","T51.900","T52.000","T52.000x002","T52.000x003","T52.000x004","T52.000x005","T52.000x006","T52.101","T52.200","T52.200x002","T52.200x003","T52.300","T52.400","T52.800","T52.800x001","T52.800x002","T52.800x003","T52.800x004","T52.800x005","T52.800x006","T52.900","T53.000","T53.000x002","T53.100","T53.100x002","T53.200","T53.200x002","T53.300","T53.300x001","T53.400","T53.500","T53.600","T53.600x001","T53.600x002","T53.600x003","T53.600x004","T53.700","T53.700x001","T53.900","T54.000","T54.000x002","T54.100","T54.201","T54.202","T54.203","T54.300","T54.300x002","T54.300x003","T54.301","T54.900","T54.900x002","T55.x00x001","T55.x00x002","T55.x00x003","T56.000x002","T56.000x003","T56.001","T56.100x002","T56.101","T56.200x001","T56.200x002","T56.300x001","T56.300x002","T56.400x002","T56.401","T56.500x001","T56.500x002","T56.600x001","T56.600x002","T56.700","T56.700x002","T56.800","T56.800x001","T56.800x002","T56.800x003","T56.800x004","T56.800x005","T56.800x006","T56.800x007","T56.800x008","T56.801","T56.900","T56.900x002","T56.900x003","T57.000x001","T57.000x002","T57.000x003","T57.100x001","T57.100x002","T57.100x003","T57.100x004","T57.100x005","T57.200x001","T57.200x002","T57.300","T57.800","T57.800x002","T57.800x003","T57.900","T58.x00","T59.000","T59.000x001","T59.100","T59.101","T59.200","T59.300","T59.401","T59.500x001","T59.500x002","T59.601","T59.700","T59.800","T59.800x001","T59.800x002","T59.800x004","T59.800x005","T59.800x006","T59.800x007","T59.800x008","T59.800x009","T59.800x010","T59.801","T59.802","T59.803","T59.900","T59.900x001","T59.900x002","T59.900x003","T59.900x004","T59.900x005","T60.000x003","T60.000x004","T60.001","T60.002","T60.100","T60.101","T60.200","T60.200x001","T60.300x001","T60.300x002","T60.300x003","T60.400","T60.401","T60.800","T60.900","T60.900x002","T60.900x003","T61.000","T61.001","T61.100","T61.100x002","T61.200x001","T61.200x003","T61.201","T61.900","T62.000x001","T62.000x002","T62.001","T62.002","T62.100x001","T62.200x002","T62.200x003","T62.202","T62.800","T62.800x002","T62.801","T62.802","T62.900x002","T63.000","T63.001","T63.100","T63.100x001","T63.200","T63.300","T63.400","T63.400x002","T63.400x003","T63.400x004","T63.401","T63.402","T63.500x001","T63.600x001","T63.600x002","T63.600x003","T63.600x004","T63.600x005","T63.800x001","T64.x00x001","T64.x00x002","T64.x01","T64.x02","T65.000","T65.100","T65.200x001","T65.200x002","T65.300","T65.300x001","T65.300x002","T65.300x003","T65.300x004","T65.400","T65.500x001","T65.500x002","T65.501","T65.600x001","T65.600x002","T65.600x003","T65.800","T65.800x002","T65.800x003","T65.800x004","T65.800x005","T65.800x006","T65.800x007","T65.801","T65.900","T65.900x001","T65.901+F02.8*","T78.800","T88.102","T88.500x001","T88.700","T88.700x002","T88.700x003","T88.700x007","T88.700x010","T88.700x012","T88.700x014","T88.701","T88.703","T97.x00x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合VS2入组条件，匹配规则：主诊断匹配");
                
            if (MDCV_DRG.VS21_group(record)){
                return "VS21";
            }
    
            if (MDCV_DRG.VS23_group(record)){
                return "VS23";
            }
    
            if (MDCV_DRG.VS25_group(record)){
                return "VS25";
            }

            return "VS2";
        }else{
            return "";
        }
    }
}

