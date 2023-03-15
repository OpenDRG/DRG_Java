package drg_group.tongchuan_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.tongchuan_2022.Base;
import drg_group.tongchuan_2022.MedicalRecord;
import drg_group.tongchuan_2022.DRG.MDCF_DRG;

public class FW1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A18.818+I79.8*","A52.000x001+I52.0*","A52.002+I79.1*","A52.003+I79.0*","E10.700x011","E11.500x021+I79.2*","E11.501+I79.2*","E13.500x241+I79.2*","E13.500x541+I79.2*","E85.408","I12.902","I25.300","I25.300x005","I27.000x007","I27.000x008","I27.000x009","I27.000x010","I27.001","I27.200x002","I27.200x003","I27.200x004","I27.200x005","I27.200x006","I27.200x009","I27.200x012","I27.200x013","I27.200x015","I27.200x016","I27.200x017","I27.200x018","I27.200x019","I27.200x020","I27.200x021","I27.200x022","I27.201","I27.202","I28.000x002","I28.000x003","I28.800x008","I28.801","I28.803","I67.200x003","I67.200x004","I67.203","I67.203","I67.203","I70.000x003","I70.000x005","I70.000x006","I70.000x007","I70.000x008","I70.000x009","I70.000x010","I70.000x011","I70.000x012","I70.000x013","I70.001","I70.002","I70.003","I70.004","I70.010","I70.011","I70.012","I70.013","I70.014","I70.100x002","I70.101","I70.102","I70.110","I70.111","I70.112","I70.200x002","I70.200x004","I70.200x005","I70.200x011","I70.200x021","I70.200x031","I70.200x061","I70.200x062","I70.200x063","I70.200x064","I70.200x065","I70.201","I70.203","I70.204","I70.206","I70.207","I70.208","I70.209","I70.210","I70.211","I70.213","I70.214","I70.217","I70.218","I70.219","I70.800x005","I70.800x006","I70.802","I70.804","I70.805","I70.810","I70.812","I70.900x002","I70.900x003","I70.900x004","I70.900x006","I70.900x007","I70.901","I70.902","I70.910","I70.911","I70.912","I71.000x002","I71.000x003","I71.000x004","I71.000x005","I71.000x006","I71.000x007","I71.000x008","I71.000x011","I71.000x012","I71.000x013","I71.000x014","I71.000x015","I71.000x016","I71.000x017","I71.000x021","I71.000x022","I71.000x023","I71.000x024","I71.000x025","I71.000x026","I71.000x027","I71.000x028","I71.000x029","I71.001","I71.002","I71.003","I71.004","I71.005","I71.006","I71.007","I71.100","I71.100x002","I71.100x003","I71.101","I71.200x006","I71.200x010","I71.200x011","I71.200x014","I71.201","I71.202","I71.203","I71.204","I71.205","I71.206","I71.300","I71.400x002","I71.401","I71.402","I71.500","I71.600x001","I71.600x004","I71.600x005","I71.800","I71.801","I71.900x002","I71.900x004","I71.901","I71.902","I71.903","I72.000","I72.000x011","I72.000x012","I72.000x013","I72.000x022","I72.000x023","I72.000x031","I72.000x032","I72.000x033","I72.000x321","I72.001","I72.002","I72.003","I72.004","I72.005","I72.006","I72.100","I72.100x003","I72.100x004","I72.100x005","I72.100x006","I72.100x007","I72.101","I72.103","I72.200","I72.200x001","I72.200x003","I72.201","I72.300","I72.300x003","I72.300x006","I72.300x012","I72.300x013","I72.300x021","I72.300x022","I72.300x023","I72.300x031","I72.300x032","I72.300x033","I72.301","I72.302","I72.303","I72.304","I72.305","I72.400","I72.400x010","I72.400x030","I72.400x110","I72.400x111","I72.400x112","I72.400x113","I72.400x121","I72.400x122","I72.400x123","I72.400x130","I72.400x131","I72.400x132","I72.400x133","I72.400x210","I72.400x212","I72.400x213","I72.400x220","I72.400x222","I72.400x223","I72.400x230","I72.400x232","I72.400x233","I72.400x310","I72.400x320","I72.400x330","I72.400x410","I72.400x420","I72.400x430","I72.400x520","I72.400x530","I72.401","I72.402","I72.403","I72.404","I72.405","I72.501","I72.600","I72.800x023","I72.800x042","I72.800x051","I72.800x053","I72.800x061","I72.800x093","I72.800x101","I72.800x102","I72.800x103","I72.800x111","I72.800x121","I72.800x151","I72.804","I72.805","I72.806","I72.808","I72.811","I72.812","I72.813","I72.814","I72.900","I72.900x002","I72.900x003","I72.900x004","I72.901","I73.001","I73.100","I73.800x001","I73.800x003","I73.800x006","I73.800x007","I73.800x008","I73.802","I73.803","I73.804","I73.805","I73.901","I73.902","I73.903","I74.000x003","I74.001","I74.002","I74.003","I74.004","I74.005","I74.006","I74.101","I74.102","I74.200x001","I74.200x004","I74.200x005","I74.200x006","I74.200x007","I74.201","I74.202","I74.300x030","I74.300x111","I74.300x112","I74.300x113","I74.300x121","I74.300x122","I74.300x123","I74.300x131","I74.300x132","I74.300x133","I74.300x210","I74.300x212","I74.300x213","I74.300x220","I74.300x222","I74.300x223","I74.300x230","I74.300x232","I74.300x233","I74.300x310","I74.300x320","I74.300x330","I74.300x410","I74.300x420","I74.300x430","I74.300x510","I74.300x520","I74.301","I74.302","I74.303","I74.304","I74.305","I74.307","I74.308","I74.310","I74.401","I74.402","I74.500x002","I74.500x007","I74.500x008","I74.500x009","I74.500x010","I74.500x011","I74.500x012","I74.500x013","I74.501","I74.502","I74.503","I74.504","I74.800x001","I74.800x005","I74.800x006","I74.800x007","I74.800x008","I74.800x009","I74.800x010","I74.800x012","I74.801","I74.802","I74.805","I74.806","I74.807","I74.901","I74.902","I77.000x011","I77.000x014","I77.000x015","I77.005","I77.006","I77.007","I77.008","I77.010","I77.011","I77.012","I77.013","I77.014","I77.100x004","I77.100x005","I77.100x012","I77.100x014","I77.100x015","I77.100x018","I77.100x027","I77.100x028","I77.100x029","I77.100x031","I77.100x032","I77.101","I77.102","I77.103","I77.104","I77.105","I77.106","I77.107","I77.108","I77.109","I77.110","I77.111","I77.112","I77.113","I77.114","I77.115","I77.117","I77.118","I77.118","I77.120","I77.121","I77.123","I77.125","I77.126","I77.127","I77.129","I77.131","I77.200","I77.201","I77.202","I77.203","I77.204","I77.300x002","I77.300x003","I77.301","I77.500","I77.600","I77.600x001","I77.600x004","I77.600x012","I77.600x013","I77.600x014","I77.600x015","I77.600x016","I77.601","I77.602","I77.603","I77.604","I77.605","I77.800x002","I77.800x006","I77.800x007","I77.800x008","I77.800x009","I77.800x010","I77.800x011","I77.800x012","I77.800x013","I77.800x014","I77.800x015","I77.800x016","I77.800x017","I77.800x018","I77.800x019","I77.800x020","I77.800x021","I77.800x022","I77.800x024","I77.801","I77.802","I77.803","I77.804","I77.805","I77.806","I77.807","I77.900","I97.800x001","I97.800x002","I97.804","M31.400","M31.600","M31.804","Q25.700x012","Q25.800x002","Q25.800x004","Q27.001","Q27.100","Q27.200x002","Q27.200x003","Q27.301","Q27.303","Q27.306","Q27.307","Q27.308","Q27.309","Q27.800x007","Q27.800x018","Q27.800x041","Q27.808","Q27.812","Q28.200x007","Q28.200x008","Q28.800x007","S25.000","S25.001","S25.100x002","S25.101","S25.501","S25.802","S35.000","S35.001","S35.200x001","S35.200x003","S35.200x004","S35.200x005","S35.200x006","S35.200x007","S35.201","S35.202","S35.203","S35.204","S35.205","S35.400x001","S35.402","S35.500x001","S35.500x002","S35.500x003","S35.500x005","S35.500x007","S35.501","S35.800x001","S45.000","S45.001","S45.101","S55.000x001","S55.100x001","S55.101","S65.000x001","S65.000x002","S65.100x001","S65.100x002","S65.200","S65.300","S65.401","S65.501","S75.000","S75.000x002","S75.000x003","S75.000x004","S75.000x005","S75.001","S75.901","S85.000","S85.100x001","S85.100x002","S85.101","S85.102","S85.200","S85.801","S95.000","S95.100","T81.700x004","T81.700x101","T81.700x104","T81.700x105","T81.700x201","T81.700x204","T81.700x205","T81.700x303","T81.700x304","T81.700x308","T81.700x401","T81.700x404","T81.700x405","T81.701","T82.401","T82.702","T82.800x001","T82.800x003","T82.800x004","T82.800x005","T82.800x201","T82.800x204","T82.800x205","T82.800x206","T82.800x207","T82.800x208","T82.800x302","T82.800x303","T82.800x304","T82.800x305","T82.800x306","T82.800x307","T82.800x308","T82.800x401","T82.800x402","T82.800x403","T82.800x404","T82.800x405","T82.800x406","T82.800x407","T82.800x408","T82.803","T82.804","T82.806","T82.807","T82.809","T82.810"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合FW1入组条件，匹配规则：主诊断匹配");
                
            if (MDCF_DRG.FW11_group(record)){
                return "FW11";
            }
    
            if (MDCF_DRG.FW15_group(record)){
                return "FW15";
            }

            return "FW1";
        }else{
            return "";
        }
    }
}
