package drg_group.tongchuan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.tongchuan_2022.Base;
import drg_group.tongchuan_2022.MedicalRecord;
import drg_group.tongchuan_2022.DRG.MDCB_DRG;

public class BX2 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C80.002+G63.1*","D48.900x011+G63.1*","D51.901+G32.0*","D86.800x002+G53.2*","E05.900x002+G73.0*","E10.400x021+G63.2*","E10.400x022+G63.2*","E10.400x024+G63.2*","E10.400x025+G63.2*","E10.400x026+G63.2*","E10.400x110+G59.0*","E10.400x111+G59.0*","E10.400x112+G59.0*","E10.400x121+G73.0*","E10.400x130+G59.0*","E10.400x140+G59.0*","E10.400x150+G59.0*","E10.400x160+G59.0*","E10.400x170+G59.0*","E10.400x180+G59.0*","E10.400x190+G59.0*","E10.400x191+G59.0*","E10.400x310+G99.0*","E10.400x380+G99.0*","E10.400x381+N33.8*","E10.400x390+G99.0*","E10.400x901+G99.0*","E10.400x910+G63.2*","E10.401+G63.2*","E10.402+G99.0*","E10.403+G63.2*","E10.404+G99.0*","E11.400","E11.400x021+G63.2*","E11.400x022+G63.2*","E11.400x024+G63.2*","E11.400x025+G63.2*","E11.400x026+G63.2*","E11.400x110+G59.0*","E11.400x111+G59.0*","E11.400x112+G59.0*","E11.400x121+G73.0*","E11.400x130+G59.0*","E11.400x140+G59.0*","E11.400x150+G59.0*","E11.400x160+G59.0*","E11.400x170+G59.0*","E11.400x180+G59.0*","E11.400x190+G59.0*","E11.400x191+G59.0*","E11.400x310+G99.0*","E11.400x390+G99.0*","E11.400x901+G99.0*","E11.401+G63.2*","E11.402+G99.0*","E11.403+G63.2*","E11.404+G99.0*","E11.405+G73.0*","E13.400x223+G63.2*","E14.400","E14.400x021+G63.2*","E14.400x022+G63.2*","E14.400x023+G63.2*","E14.400x024+G63.2*","E14.400x025+G63.2*","E14.400x026+G63.2*","E14.400x110+G59.0*","E14.400x111+G59.0*","E14.400x112+G59.0*","E14.400x121+G73.0*","E14.400x130+G59.0*","E14.400x140+G59.0*","E14.400x150+G59.0*","E14.400x160+G59.0*","E14.400x170+G59.0*","E14.400x190+G59.0*","E14.400x191+G59.0*","E14.400x310+G99.0*","E14.400x311+G99.0*","E14.400x312+G99.0*","E14.400x390+G99.0*","E14.400x901+G99.0*","E51.100x002+G63.4*","E51.100x003+G63.4*","E53.800x003+G32.0*","E53.800x014+G32.0*","E53.803+G63.4*","E53.900x002+G63.4*","E56.900x003+G63.4*","E56.901+G63.4*","E63.902+G63.4*","E71.303","E80.200x006","E85.100x002","E85.101+G63.3*","E85.400x008+G99.0*","E88.905+G99.0*","G50.000","G50.001","G50.002","G50.003","G50.004","G50.100","G50.801","G50.802","G50.803","G50.900","G51.000","G51.000x003","G51.002","G51.003","G51.100","G51.200","G51.201","G51.300","G51.301","G51.400","G51.800x003","G51.800x006","G51.801","G51.802","G51.803","G51.900","G52.000","G52.100","G52.100x003","G52.100x004","G52.101","G52.102","G52.200","G52.201","G52.202","G52.203","G52.204","G52.205","G52.300","G52.301","G52.302","G52.700","G52.700x005","G52.701","G52.702","G52.703","G52.704","G52.705","G52.800x004","G52.800x005","G52.800x006","G52.801","G52.802","G52.900","G52.901","G52.902","G54.000","G54.000x001","G54.000x004","G54.000x006","G54.001","G54.002","G54.003","G54.004","G54.100","G54.100x001","G54.100x002","G54.200","G54.200x001","G54.201","G54.300","G54.300x001","G54.400","G54.400x001","G54.500","G54.600","G54.700","G54.800x003","G54.800x004","G54.801","G54.900","G54.900x001","G54.901","G56.000","G56.100","G56.100x001","G56.100x002","G56.100x003","G56.100x004","G56.101","G56.200","G56.200x001","G56.201","G56.202","G56.203","G56.300","G56.301","G56.800x001","G56.900","G57.000","G57.000x003","G57.001","G57.100","G57.100x001","G57.200","G57.200x003","G57.201","G57.300","G57.300x001","G57.300x005","G57.301","G57.302","G57.303","G57.304","G57.400","G57.400x001","G57.401","G57.500","G57.500x001","G57.600","G57.600x002","G57.600x003","G57.601","G57.603","G57.604","G57.800x001","G57.800x002","G57.900","G57.901","G58.000","G58.001","G58.002","G58.700","G58.800x001","G58.800x004","G58.800x006","G58.800x007","G58.800x008","G58.801","G58.900","G58.900x002","G58.900x003","G60.000","G60.000x002","G60.000x003","G60.000x005","G60.000x008","G60.001","G60.002","G60.003","G60.100","G60.200","G60.300","G60.800x001","G60.800x002","G60.800x003","G60.800x004","G60.800x005","G60.800x006","G60.800x007","G60.800x010","G60.801","G60.802","G60.803","G60.900","G60.900x001","G61.000","G61.000x003","G61.000x004","G61.000x005","G61.000x006","G61.001","G61.002","G61.003","G61.100","G61.800x003","G61.800x004","G61.800x005","G61.800x006","G61.801","G61.900","G62.000","G62.001","G62.100","G62.100x002","G62.101","G62.200","G62.200x001","G62.200x003","G62.201","G62.800x005","G62.800x007","G62.800x008","G62.800x009","G62.803","G62.804","G62.805","G62.806","G62.807","G62.808","G62.809","G62.810","G62.900","G62.900x002","G62.900x003","G62.900x004","G62.900x011","G62.901","G62.908","G62.909","G64.x00","G64.x00x001","G83.400","G83.600","G90.000","G90.001","G90.100","G90.200","G90.400","G90.500","G90.501","G90.600","G90.600","G90.700","G90.800x001","G90.800x002","G90.800x003","G90.800x004","G90.800x004","G90.800x005","G90.801","G90.900","G90.900x001","G90.900x002","H49.000","H49.100","H49.200","M32.106+G63.5*","M33.102+G63.5*","M35.000","M35.009+G63.5*","M35.900x002+G63.5*","M53.000","M53.001","M53.002","M53.100","M79.200x001","M79.204","M79.205","M79.207","M79.208","M89.000","M89.000x093","M89.001","M89.003","Q14.200x005","S04.200","S04.300","S04.400","S04.500","S04.501","S04.502","S04.600","S04.700","S04.801","S04.802","S04.803","S04.804","S04.900","S14.300","S14.400","S14.500","S14.601","S24.300","S24.300x001","S24.400","S24.400x001","S24.400x002","S24.400x003","S24.400x004","S24.400x005","S24.500","S24.500x001","S24.600","S34.400","S34.500","S34.500x001","S34.500x004","S34.500x005","S34.501","S34.502","S34.503","S34.504","S34.600","S34.601","S34.602","S34.801","S34.802","S34.803","S44.000x001","S44.100x001","S44.101","S44.200x001","S44.300","S44.400","S44.500","S44.500x001","S44.501","S44.700x001","S44.701","S44.800x001","S44.900x001","S44.901","S54.000x001","S54.001","S54.100x001","S54.101","S54.200x001","S54.300x001","S54.700x001","S54.800","S54.900x001","S64.000x001","S64.000x002","S64.100x001","S64.100x002","S64.200x001","S64.200x002","S64.300","S64.400x001","S64.700x001","S64.800","S64.900x001","S74.000x001","S74.000x002","S74.000x003","S74.100x001","S74.100x002","S74.100x003","S74.200x001","S74.200x002","S74.700x001","S74.700x002","S74.801","S74.900x001","S74.900x002","S84.000x001","S84.000x002","S84.100x001","S84.200x001","S84.700x001","S84.800x001","S84.800x002","S84.900x001","S94.000","S94.100","S94.200x001","S94.200x002","S94.300x001","S94.700x001","S94.800x001","S94.900x001","T06.101","T06.200x001","T09.400","T09.400x001","T09.400x002","T09.400x003","T11.300","T13.300","T14.400","T90.300","T90.300x003","T90.301","T90.302"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BX2入组条件，匹配规则：主诊断匹配");
                
            if (MDCB_DRG.BX29_group(record)){
                return "BX29";
            }

            return "BX2";
        }else{
            return "";
        }
    }
}

