package drg_group.taizhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.DRG.MDCL_DRG;

public class LS1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A40.901+N08.0*","A41.902+N08.0*","C90.004+N16.1*","C90.005+N08.1*","C90.005+N08.1*","C95.900x007+N16.1*","C95.900x017+N16.1*","D69.005+N08.2*","D89.101+N08.2*","E66.902+N08.4*","E72.006+N29.8*","E83.100x008+N16.3*","E85.002","E85.411+N29.8*","I12.900x001","I12.900x002","I12.900x003","I12.900x005","I12.900x006","M31.002+N08.5*","M31.003+N08.5*","M31.100","M31.102+N08.5*","M31.305+N08.5*","M31.701+N08.5*","M31.703+N08.5*","M32.101+N08.5*","M32.102+N16.4*","M35.006+N16.4*","M35.007+N16.4*","N02.001","N02.002","N02.101","N02.102","N02.201","N02.203","N02.301","N02.302","N02.401","N02.502","N02.600","N02.701","N02.702","N02.800x003","N02.801","N02.802","N03.000","N03.100","N03.200x001","N03.300x001","N03.400","N03.500x003","N03.501","N03.502","N03.503","N03.601","N03.700","N03.800x001","N03.800x003","N03.800x004","N03.801","N03.900","N03.900x002","N03.900x003","N03.900x004","N03.900x005","N03.900x006","N03.900x007","N03.901","N04.001","N04.101","N04.102","N04.200x001","N04.300x001","N04.300x003","N04.400x001","N04.501","N04.502","N04.601","N04.700","N04.800x002","N04.801","N04.900","N04.902","N04.903","N05.000x001","N05.000x004","N05.101","N05.201","N05.301","N05.400","N05.501","N05.600","N05.701","N05.801","N05.802","N05.803","N05.900","N05.900x002","N05.900x003","N05.900x006","N05.900x007","N05.900x009","N06.001","N06.100","N06.200","N06.300","N06.400","N06.500","N06.600","N06.700","N06.800","N06.900","N07.000","N07.100","N07.200","N07.300","N07.400","N07.500","N07.600","N07.700","N07.800","N07.900x001","N10.x00","N10.x01","N11.800x002","N11.900","N11.901","N12.x00","N12.x01","N12.x03","N13.801","N14.000","N14.101","N14.102","N14.201","N14.301","N14.400","N15.000","N18.901","N25.100","N25.800x006","N25.802","N25.803","N25.804","N25.805","N25.806","N26.x00","N26.x01","N26.x02","N28.800x001","N28.817","N28.900x004","N28.900x013","N28.900x017","N28.900x026","N28.901","N39.100","N39.200","Q61.400","Q61.401","Q61.402","Q61.403","Q61.404","Q61.500","Q87.800x903","Q87.808"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合LS1入组条件，匹配规则：主诊断匹配");
                
            if (MDCL_DRG.LS11_group(record)){
                return "LS11";
            }
    
            if (MDCL_DRG.LS13_group(record)){
                return "LS13";
            }
    
            if (MDCL_DRG.LS15_group(record)){
                return "LS15";
            }

            return "LS1";
        }else{
            return "";
        }
    }
}

