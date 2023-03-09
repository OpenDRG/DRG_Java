package drg_group.lanzhou_2022.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.lanzhou_2022.Base;
import drg_group.lanzhou_2022.MedicalRecord;
import drg_group.lanzhou_2022.DRG.MDCO_DRG;

public class OZ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"A34.x00","O02.800","O02.800x001","O08.300x004","O08.400x005","O08.900","O10.001","O10.101","O10.201","O10.301","O10.401","O10.900x001","O11.x01","O12.000","O12.100","O12.200","O13.x00","O13.x01","O14.000x001","O14.000x002","O14.100x002","O14.200","O14.900","O15.001","O15.101","O15.900","O16.x00","O20.800","O20.900","O21.000","O21.001","O21.100","O21.100x002","O21.100x003","O21.100x004","O21.100x005","O21.100x006","O21.200","O21.800","O21.900","O22.000","O22.101","O22.102","O22.103","O22.200","O22.300","O22.400","O22.500","O22.801","O22.900","O22.901","O22.902","O23.000x001","O23.001","O23.101","O23.200","O23.300","O23.400","O23.500","O23.500x001","O23.500x002","O23.500x007","O23.500x009","O23.500x010","O23.501","O23.502","O23.503","O23.504","O23.505","O23.506","O23.901","O24.000","O24.000x021","O24.100","O24.100x011","O24.100x021","O24.200x001","O24.300x001","O24.301","O24.400","O24.900","O25.x00","O25.x01","O26.000","O26.100","O26.200","O26.300","O26.400","O26.501","O26.600x010","O26.600x011","O26.601","O26.602","O26.603","O26.604","O26.605","O26.606","O26.607","O26.608","O26.609","O26.701","O26.800","O26.800x011","O26.800x013","O26.800x015","O26.800x016","O26.801","O26.802","O26.803","O26.804","O26.806","O28.000","O28.100","O28.200","O28.300","O28.300x001","O28.400","O28.501","O28.502","O28.800","O28.900","O29.000x001","O29.000x002","O29.000x003","O29.000x004","O29.000x005","O29.100x001","O29.100x002","O29.200","O29.300","O29.400","O29.500","O29.600","O29.800","O29.900","O30.000","O30.100","O30.200","O30.800","O30.801","O30.900","O31.000","O31.000x001","O31.100","O31.200","O31.201","O31.800","O31.800x003","O31.800x004","O31.800x005","O31.800x007","O32.000x001","O32.100x004","O32.101","O32.102","O32.201","O32.202","O32.301","O32.302","O32.303","O32.401","O32.500","O32.601","O32.801","O32.802","O32.803","O32.900","O33.000x002","O33.000x003","O33.002","O33.101","O33.102","O33.201","O33.300x003","O33.300x004","O33.300x005","O33.301","O33.400","O33.501","O33.600","O33.700","O33.700x004","O33.700x005","O33.700x006","O33.800","O33.900","O34.000x003","O34.000x006","O34.000x007","O34.000x008","O34.000x009","O34.000x011","O34.000x012","O34.000x013","O34.001","O34.002","O34.003","O34.004","O34.005","O34.100x001","O34.100x003","O34.100x011","O34.101","O34.102","O34.200x002","O34.201","O34.301","O34.400x005","O34.400x009","O34.400x010","O34.400x011","O34.400x013","O34.400x014","O34.401","O34.402","O34.403","O34.404","O34.405","O34.406","O34.500x001","O34.500x002","O34.500x005","O34.500x007","O34.501","O34.502","O34.503","O34.600x004","O34.600x005","O34.600x006","O34.601","O34.602","O34.603","O34.604","O34.700","O34.700x002","O34.700x004","O34.700x005","O34.701","O34.800","O34.800x004","O34.800x005","O34.800x006","O34.800x010","O34.800x011","O34.800x012","O34.800x013","O34.800x014","O34.800x015","O34.800x017","O34.800x018","O34.800x019","O34.800x021","O34.800x022","O34.801","O34.802","O34.803","O34.804","O34.805","O34.806","O34.807","O34.900","O35.002","O35.003","O35.004","O35.005","O35.006","O35.007","O35.008","O35.009","O35.010","O35.101","O35.102","O35.200x002","O35.200x003","O35.200x004","O35.201","O35.202","O35.203","O35.204","O35.205","O35.206","O35.300x002","O35.300x003","O35.400","O35.500","O35.600x001","O35.700x001","O35.700x002","O35.700x003","O35.700x006","O35.701","O35.800x001","O35.800x002","O35.800x003","O35.800x005","O35.800x006","O35.800x007","O35.800x009","O35.800x010","O35.800x011","O35.800x012","O35.800x015","O35.800x017","O35.800x018","O35.800x019","O35.800x020","O35.800x023","O35.800x025","O35.800x026","O35.800x027","O35.800x028","O35.800x029","O35.800x030","O35.801","O35.803","O35.804","O35.805","O35.806","O35.807","O35.808","O35.809","O35.810","O35.811","O35.812","O35.813","O35.814","O35.816","O35.817","O35.818","O35.819","O35.820","O35.821","O35.822","O35.823","O35.900","O36.001","O36.002","O36.100","O36.100x002","O36.101","O36.201","O36.202","O36.203","O36.300x007","O36.300x008","O36.300x009","O36.301","O36.302","O36.303","O36.304","O36.305","O36.401","O36.501","O36.502","O36.503","O36.504","O36.601","O36.700x001","O36.800","O36.900","O40.x00","O41.000","O41.000x002","O41.100","O41.101","O41.102","O41.103","O41.104","O41.800","O41.800x001","O41.800x004","O41.801","O41.803","O41.900","O42.000x001","O42.000x002","O42.100x011","O42.100x012","O42.200x001","O42.900","O43.001","O43.002","O43.003","O43.004","O43.005","O43.100","O43.101","O43.102","O43.103","O43.104","O43.105","O43.106","O43.107","O43.110","O43.111","O43.112","O43.200","O43.200x001","O43.200x002","O43.800","O43.800x007","O43.801","O43.802","O43.803","O43.804","O43.805","O43.806","O43.807","O43.900","O44.000x001","O44.000x002","O44.000x003","O44.001","O44.002","O44.003","O44.100","O44.100x001","O44.100x002","O44.101","O44.102","O44.103","O45.000","O45.000x001","O45.000x003","O45.000x004","O45.001","O45.801","O45.900","O46.000","O46.000x001","O46.000x003","O46.000x004","O46.001","O46.801","O46.900","O47.000","O47.100","O47.900","O47.900x002","O48.x00","O60.001","O60.100x001","O60.100x002","O60.200","O60.300x001","O60.300x002","O61.000x001","O61.000x002","O61.100","O61.800","O61.900","O62.000","O62.001","O62.100","O62.101","O62.201","O62.202","O62.300","O62.400x005","O62.400x006","O62.400x007","O62.401","O62.402","O62.403","O62.404","O62.405","O62.406","O62.800","O62.900","O63.000","O63.001","O63.002","O63.003","O63.100","O63.201","O63.901","O64.001","O64.002","O64.100x002","O64.100x003","O64.101","O64.200","O64.200x002","O64.301","O64.401","O64.501","O64.800","O64.801","O64.802","O64.803","O64.900","O65.000x001","O65.000x002","O65.001","O65.101","O65.201","O65.300x002","O65.301","O65.401","O65.500x002","O65.501","O65.800","O65.900","O66.001","O66.101","O66.201","O66.300x001","O66.300x002","O66.300x003","O66.300x004","O66.300x005","O66.300x006","O66.300x007","O66.401","O66.500x001","O66.500x002","O66.800","O66.901","O67.000","O67.000x002","O67.800","O67.900","O68.001","O68.002","O68.003","O68.101","O68.201","O68.300x001","O68.800","O68.901","O69.001","O69.002","O69.101","O69.200","O69.200x006","O69.200x007","O69.201","O69.202","O69.203","O69.204","O69.205","O69.206","O69.207","O69.208","O69.209","O69.210","O69.301","O69.400","O69.401","O69.500x003","O69.500x004","O69.501","O69.503","O69.800x004","O69.800x005","O69.802","O69.804","O69.900x001","O70.000","O70.000x002","O70.000x003","O70.000x005","O70.100","O70.100x002","O70.100x003","O70.100x004","O70.100x005","O70.200","O70.200x001","O70.200x003","O70.300","O70.300x001","O70.300x002","O70.900","O71.001","O71.100x001","O71.101","O71.202","O71.301","O71.400","O71.401","O71.402","O71.403","O71.500","O71.500x004","O71.501","O71.502","O71.600","O71.601","O71.700x001","O71.700x002","O71.701","O71.702","O71.703","O71.704","O71.801","O71.802","O71.900","O72.000","O72.000x003","O72.001","O72.002","O72.003","O72.100","O72.101","O74.000x001","O74.000x002","O74.100","O74.200x001","O74.200x002","O74.300","O74.400","O74.500","O74.600","O74.700","O74.800","O74.900x001","O75.000","O75.101","O75.200","O75.300x001","O75.300x002","O75.401","O75.402","O75.403","O75.500","O75.600","O75.800x002","O75.800x004","O75.801","O75.900","O81.000","O81.100","O81.200","O81.301","O81.401","O81.500","O82.000","O82.100","O82.201","O82.800","O82.900","O83.000","O83.101","O83.200","O83.300","O83.400","O83.800","O83.900","O84.100","O84.200","O84.800","O84.900","O88.000","O88.100","O88.101","O88.200","O88.201","O88.300x001","O88.300x002","O88.800x001","O91.100x001","O91.200x001","O91.200x003","O91.200x004","O91.202","O94.x00","O95.x00","O96.000","O96.100","O96.900","O97.000","O97.100","O97.900","O98.000","O98.000x021","O98.001","O98.100","O98.100x021","O98.101","O98.200","O98.200x021","O98.201","O98.300","O98.300x013","O98.300x014","O98.301","O98.302","O98.400x005","O98.400x011","O98.400x021","O98.401","O98.402","O98.403","O98.404","O98.406","O98.500","O98.501","O98.502","O98.503","O98.506","O98.600","O98.601","O98.800","O98.800x002","O98.800x007","O98.800x009","O98.800x013","O98.800x033","O98.800x035","O98.800x036","O98.800x037","O98.801","O98.802","O98.803","O98.804","O98.805","O98.806","O98.808","O98.809","O98.810","O98.811","O98.900","O98.900","O99.000x021","O99.002","O99.003","O99.004","O99.005","O99.006","O99.007","O99.008","O99.100x005","O99.100x012","O99.100x013","O99.100x022","O99.100x023","O99.101","O99.102","O99.103","O99.104","O99.105","O99.106","O99.107","O99.108","O99.109","O99.200x002","O99.200x011","O99.200x017","O99.200x018","O99.200x021","O99.201","O99.202","O99.203","O99.204","O99.205","O99.206","O99.207","O99.208","O99.209","O99.210","O99.211","O99.212","O99.213","O99.214","O99.215","O99.216","O99.217","O99.218","O99.219","O99.220","O99.221","O99.222","O99.223","O99.224","O99.225","O99.300x012","O99.300x016","O99.300x021","O99.300x022","O99.301","O99.302","O99.303","O99.304","O99.305","O99.306","O99.307","O99.308","O99.309","O99.310","O99.311","O99.312","O99.313","O99.314","O99.315","O99.400x004","O99.400x008","O99.400x010","O99.400x011","O99.400x021","O99.400x022","O99.400x023","O99.400x027","O99.400x030","O99.400x031","O99.400x033","O99.403","O99.404","O99.405","O99.406","O99.407","O99.408","O99.409","O99.410","O99.411","O99.412","O99.413","O99.414","O99.415","O99.416","O99.418","O99.419","O99.420","O99.421","O99.422","O99.423","O99.424","O99.425","O99.426","O99.427","O99.428","O99.429","O99.430","O99.431","O99.432","O99.433","O99.434","O99.500x008","O99.500x011","O99.500x021","O99.500x031","O99.501","O99.502","O99.503","O99.504","O99.505","O99.506","O99.507","O99.508","O99.509","O99.510","O99.511","O99.512","O99.600x001","O99.600x011","O99.600x012","O99.600x014","O99.600x018","O99.600x021","O99.601","O99.602","O99.603","O99.604","O99.605","O99.607","O99.609","O99.610","O99.611","O99.614","O99.615","O99.616","O99.617","O99.618","O99.619","O99.620","O99.621","O99.622","O99.623","O99.624","O99.700x006","O99.700x008","O99.700x009","O99.700x010","O99.700x011","O99.700x012","O99.700x013","O99.700x021","O99.700x031","O99.701","O99.702","O99.703","O99.704","O99.705","O99.706","O99.707","O99.708","O99.709","O99.710","O99.711","O99.800","O99.800x012","O99.800x014","O99.800x016","O99.800x017","O99.800x018","O99.800x019","O99.800x021","O99.800x022","O99.800x023","O99.800x024","O99.800x031","O99.800x032","O99.800x033","O99.800x034","O99.800x111","O99.800x112","O99.800x113","O99.800x114","O99.800x115","O99.800x116","O99.800x121","O99.800x122","O99.800x131","O99.800x132","O99.800x211","O99.800x213","O99.800x215","O99.800x216","O99.800x217","O99.800x221","O99.800x231","O99.800x312","O99.800x314","O99.800x315","O99.800x316","O99.800x317","O99.800x318","O99.800x319","O99.800x321","O99.800x331","O99.800x411","O99.800x412","O99.800x413","O99.800x414","O99.800x415","O99.800x416","O99.800x417","O99.800x421","O99.800x431","O99.800x511","O99.801","O99.802","O99.803","O99.804","O99.805","O99.806","O99.807","O99.808","O99.809","O99.810","O99.811","O99.812","O99.813","O99.814","Z34.000x001","Z34.800","Z34.900x001","Z35.000","Z35.100","Z35.100x001","Z35.101","Z35.102","Z35.103","Z35.104","Z35.200","Z35.200x002","Z35.200x003","Z35.200x006","Z35.201","Z35.202","Z35.203","Z35.204","Z35.206","Z35.207","Z35.208","Z35.209","Z35.300x002","Z35.400x001","Z35.401","Z35.500x001","Z35.600x001","Z35.700","Z35.801","Z35.802","Z35.804","Z35.806","Z35.900","Z36.001","Z36.101","Z36.201","Z36.202","Z36.300x002","Z36.301","Z36.400x001","Z36.401","Z36.500","Z36.800x001","Z36.800x002","Z36.801","Z36.802","Z36.803","Z36.900","Z64.000x001"};
        String[] adrg_zd1={};
        String[] adrg_ss={};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0])){
            Base.groupMessages.putMessage(record.Index,"符合OZ1入组条件，匹配规则：主诊断匹配");
                
            if (MDCO_DRG.OZ11_group(record)){
                return "OZ11";
            }
    
            if (MDCO_DRG.OZ13_group(record)){
                return "OZ13";
            }
    
            if (MDCO_DRG.OZ15_group(record)){
                return "OZ15";
            }

            return "OZ1";
        }else{
            return "";
        }
    }
}

