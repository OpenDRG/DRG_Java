package drg_group.wuhan_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.ADRG.*;

public class MDCF{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"I80.901","S35.100x003","I21.200x010","I72.300","T82.500x002","I45.500x005","J94.000","I21.200x020","Q24.510","T81.700x002","Q26.300","I74.802","I49.800x005","T82.704","S45.301","I24.100x001","S85.300x001","R00.800x001","I10.x06","I24.801","R00.001","Q21.800x003","I10.x09","I72.300x003","I95.101","I21.200x022","S55.200x001","I83.905","I48.301","I95.900","B01.800x001+I41.1*","T81.700x302","I45.103","I42.800x005","I42.901","R94.304","I21.003","I72.900x003","I87.001","I45.600x007","I09.900x002","I20.005","I80.103","I20.101","I42.802","I08.800","D86.800x005+I41.8*","I77.801","T81.700x005","Q26.301","I77.800x006","T81.700x303","I47.200x009","T82.100x006","I77.112","I22.900x001","I21.002","R57.100","S55.100x001","I70.200x064","I08.300x007","I15.800x001","R57.803","D18.000x837","T82.901","Q24.803","S65.100x001","I77.105","I51.706","C49.402","I08.301","I77.800x020","I44.602","I77.000x015","T82.800x006","A39.500","Q21.000","I08.100x002","Q24.100","T82.100","Q25.302","I27.200x018","I01.200","I72.400x010","S26.900","I30.101","Z03.500x001","I74.307","T82.807","I72.300x012","I97.803","I31.901","I01.000","I77.113","I77.800x007","E16.800x021","I28.000x002","E05.903+I43.8*","J11.801+I41.1*","Q27.815","I77.005","I67.200x003","I10.x13","I15.800x002","I77.605","T81.700x401","T82.800x203","I25.300x007","I10.x00x007","I72.101","I71.000x028","I83.902","Z03.400","R55.x00x006","I70.200x065","I51.700x015","I80.800x002","Q24.502","D18.000x005","I27.200x020","D18.010","T81.700x403","I70.203","I30.801","I44.101","I72.000x013","Q25.700x011","I24.003","Q23.000","I36.800x004","I70.218","I77.800x011","I74.202","I21.200x023","I80.209","S26.010","B67.903","I47.201","I80.203","I34.800x003","I45.300","I87.104","R93.101","T82.800x201","I44.000","I50.900","I50.000x006","I72.000x022","I30.900x003","I49.403","S75.000x005","I35.000x003","I72.300x022","I36.800x003","I21.205","I71.000x022","T81.700x103","S85.400x001","S85.500","Q26.801","S65.000x001","T82.814","Q23.901","I74.308","Q25.700x012","Q24.508","I72.400x112","Q26.000x001","I42.800x007","Q24.806","Q26.400","Q24.800x011","I78.803","I47.200x011","I72.400x420","Q26.200x004","I40.100","D18.000x001","I77.000x011","I74.300x510","I15.102","I87.115","I33.007","I50.907","I70.200x021","G90.800x004","I77.126","I35.806","A36.802+I41.0*","I25.901","Q25.703","I50.900x017","I47.107","S45.300x001","I77.014","S26.800x011","S45.000","I42.800x001","Q22.301","S26.800x021","I10.x05","I36.100","I33.008","I22.100x001","I82.803","I09.200x003","I21.105","I87.100x007","I50.001","A52.000x007+I39.1*","I50.105","I73.903","I08.000x001","I72.005","I70.214","I21.402","Z45.800x006","I97.900","I13.000x001","I09.200","I22.800x016","I38.x00x007","T86.200x001","I07.900","S95.100","I35.802","I87.100x009","I97.800x009","M05.200x092","Q26.800x006","S95.800","I07.100","I34.800x006","I28.801","I70.200x004","Q23.800x004","I21.200x017","I51.801","Q27.308","I31.900x009","I36.200","T86.300x002","T82.100x009","I97.800x008","I42.300","Q22.400x003","I45.804","S65.000x002","T82.800x411","Q27.808","I50.900x019","I48.300","I72.000","I33.000x019","I49.101","I77.201","S25.100x002","I44.303","S35.800x001","I70.000x011","I15.200x001","Q26.800x005","I74.300x233","I82.900x001","I70.200x062","I97.800x006","Q27.800x031","I25.400x005","S35.500x003","I06.800x001","Q25.701","Q23.803","E88.907+I43.1*","I07.100x001","I21.200x003","S35.500x008","E14.500x032+I43.8*","T82.900x002","I86.802","Q26.800x003","R01.100","T82.101","I47.100x005","I72.800x023","I33.000x022","I47.111","Q21.106","I74.300x123","I33.000x008","I25.102","I24.000x004","I49.804","T81.700x402","I34.201","E11.700x022","I71.002","Q25.600","I27.001","I77.108","S35.204","I51.701","I44.700","S35.500x001","Q25.403","I87.801","I77.800x019","R55.x00x002","I21.106","T82.100x011","I08.007","I21.206","I71.100x003","S35.500x005","R94.305","I74.200x006","B57.202+I41.2*","I08.100","S95.900x001","S35.201","M31.400","Q22.800x007","E16.800x102","I40.000x004","I10.x00x017","I47.100x001","I72.800x121","I09.802","C75.501","Z45.006","Q27.800x039","I97.800x001","I08.005","S55.800","I47.109","R55.x00x014","I34.001","I71.200x006","Q27.818","S25.400","D21.300x005","I47.106","C38.800","S35.101","I15.200x002","T82.800x204","I25.800x004","I77.602","I70.110","I08.004","I87.201","I51.000x001","E14.700x022","R96.000x001","T82.100x012","C79.800x819","I21.400x003","I77.800x021","I71.001","Q21.805","S75.901","I51.700x007","I83.903","I87.106","I21.200x014","Q21.104","B33.200x004+I41.1*","I72.501","I31.800x003","I34.803","D18.000x003","Q27.800x041","Q87.400","I33.000x001","Q28.200x007","I25.800x012","I20.000x005","I72.400x210","S85.100x002","I74.300x030","I72.300x013","I05.000","I51.900x003","A52.003+I79.0*","I74.402","I50.900x002","I45.101","Q20.300x002","T82.800x009","Q27.309","D15.101","I07.800","I27.200x003","T81.700x101","I25.401","I80.800x007","I47.200x010","I44.302","Q22.400","Q27.800x018","D18.000x840","I72.806","R09.800x081","Q20.601","S35.300x002","I71.100x002","R55.x00x013","S45.700x001","I07.200x001","I05.200x001","I89.100x003","I38.x00x005","I46.100x001","I74.502","I35.805","T82.800x410","I87.110","Q20.500","I51.400x006","S26.812","I97.800x014","I01.900","I71.600x005","A18.809+I32.0*","T82.202","T82.800x005","A54.802+I39.8*","Q25.405","I70.910","I83.901","S85.801","T81.800x010","I74.300x212","I45.401","I70.206","D44.700","I22.800x012","T82.100x014","I42.200x002","S35.501","Q21.206","R94.306","I71.202","Q27.803","I74.303","T82.800x307","T70.200x007","Q26.800x008","I72.303","I74.300x111","I33.000x020","I10.x14","R57.200","I73.803","I38.x00x006","I72.000x033","Q26.800x002","I73.800x008","Q27.806","I23.000x001","I01.800x001","I74.004","S35.102","I77.101","I70.209","Q21.101","I71.400x002","Q23.200x004","I80.001","Q24.810","Q21.900","I25.000x001","S35.302","I44.601","D15.103","I74.301","A52.004+I39.1*","I74.500x009","S65.100x002","D35.600x001","I25.300x008","I34.200","T82.400","I37.800","R07.200","I77.200","I71.000x017","I67.203","E11.502+I79.2*","I15.800x004","Q20.200x002","I83.001","I77.601","I80.207","I74.300x210","I78.101","I70.911","I21.104","I80.204","I72.400x110","Q25.100","S85.100x001","T82.401","I49.200x001","Q24.504","T82.003","I20.800x007","I15.101","I80.201","I21.300x005","C79.800x807","I72.000x023","S35.300x005","I71.000x004","I21.200x019","I08.102","I82.202","E10.700x022","I09.100x002","Q27.303","R00.801","S45.701","B25.803+I41.1*","I08.300","Q28.200x008","I72.100x005","C38.000","E16.804","I42.401","I22.800x008","E11.500x021+I79.2*","I71.000x016","I42.600","I51.404","I77.600x015","I10.x00x016","I21.004","I77.100x005","Q24.814","I77.000x008","I08.302","I77.111","T81.701","A18.820+I39.8*","I70.000x007","T82.800x409","A39.504+I52.0*","I34.801","I77.600x012","I08.100x005","I86.806","R93.102","I45.600","I08.000x005","I74.002","I10.x00x002","Q20.301","A52.009+I39.3*","I87.200x001","I72.304","I74.300x222","I40.000x007","T82.800x003","I72.400x310","I74.300x410","I31.900x010","A32.802+I39.8*","I08.003","I26.001","I27.202","I47.101","Q25.408","I05.900","Q21.204","B57.200x003","Q23.300x002","I49.500","I77.800x013","I86.801","I72.400x212","I28.100","Q24.800x025","Q21.804","Q28.900","E12.500","Q27.001","S35.500x002","T82.500x001","T82.903","R00.300","I97.800x004","Q87.809","I70.000x009","S75.200","T82.800x401","I51.700x014","Q25.200","B33.200x001+I32.1*","Q20.600","I24.800x001","I74.503","Q24.505","I25.100x003","I51.600x002","Q24.501","T82.800x202","Q24.807","I82.100x001","R68.800x001","I46.000","I71.000x013","Q20.400","I72.200","I21.200x027","I72.805","R57.901","I70.000x003","A18.818+I79.8*","I72.800x093","I51.301","I97.100x004","Q85.900x048","T82.800x403","I08.000x009","I22.800x013","I70.000x008","Q24.800x027","A54.805+I32.0*","I74.300x430","I44.500","Q25.300","I15.800x003","I97.000","I77.800x014","Q22.102","I47.203","S25.501","I70.900x002","I71.100","I51.400","I72.600","I49.800x006","I82.800x009","I83.900x004","Q24.800x017","I72.000x321","R55.x00x003","I74.200x005","S25.802","I49.800x015","Q26.600","I73.800x006","I07.000","I48.000","I74.300x320","I25.300","I77.805","I31.101","I42.000x001","M05.307+I39.8*","Q27.306","I15.100x001","I97.800x018","I72.400x320","I44.100","Q23.200x003","T82.810","I77.012","M05.306+I41.8*","I50.000x005","I42.100x002","S35.300x004","I08.000x006","I74.003","T82.702","R02.x00","Q27.800x007","S26.801","I49.401","I87.100x003","I77.600x013","D48.711","I97.800x011","I70.000x013","S75.100x003","I30.103","I72.400x123","I82.801","S65.900x001","T82.800x406","R94.301","I47.200x014","I74.201","I33.000x012","I71.200x014","I77.100x004","R57.900","I49.404","I77.106","Q20.500x001","I51.903","I27.200x021","E10.700x023","I74.300x121","S35.902","Q25.400x009","I49.300x005","I74.200x007","I45.901","I86.800x005","Q24.800x018","I22.000x001","I47.102","I44.201","J09.x03+I41.1*","I72.400x220","T82.501","I87.900","Q25.400x012","M05.304+I52.8*","Q21.800","S35.701","S45.001","R94.300","I71.205","Q23.800","Q24.509","Q27.800x037","I45.900x002","I49.802","I20.003","T81.700x003","I49.800x016","I72.305","R94.308","I51.500x002","I74.300x223","I73.800x001","Q24.808","Q24.812","Q21.300x003","I70.900x007","I31.100","I36.800x002","I47.103","A52.007+I41.0*","S35.500x006","S35.700x001","I83.100x001","I70.204","I77.013","S35.400x001","I71.000x012","I82.800x005","Q26.901","T82.800x405","I08.002","I25.300x009","I70.000x012","Q28.900x001","I27.200x004","I74.500x008","I20.808","I87.118","D15.104","I37.000","I74.806","I27.200x022","E13.500x241+I79.2*","Q27.301","I80.803","I77.120","I77.800x022","Q25.406","I77.804","Q25.400x013","Q24.400","I70.900x006","I21.300x003","S35.200x007","R00.000","I74.300x132","R03.100","T82.800x103","I72.405","I74.401","I77.203","A52.000+I98.0*","S35.100","T82.102","I31.900x008","T81.700x202","I25.300x010","I51.901","S75.000x003","I77.110","T82.800x004","S35.200x004","Z45.003","J10.800x003+I41.1*","I09.200x004","I42.701","T82.800x106","I77.300x003","Q20.302","I70.802","I08.300x004","T82.800x105","I80.104","D15.106","I70.900x003","I08.000x010","I21.200x015","I27.200x015","S25.301","I10.x01","I06.900","I33.000x011","R00.100x001","S65.401","I08.008","I80.202","I25.104","I80.300x006","Q26.100","I80.902","I42.800x006","Q27.809","I72.000x031","I83.904","I72.300x023","I77.100x028","I49.800x007","I77.123","Q22.801","I73.800x003","T81.700x203","E10.502+I79.2*","E16.800x011","Q25.500","I49.301","I20.900","R93.103","I72.400x122","I71.000x007","I74.500x010","D21.400x004","Q25.800x002","I70.200x031","I27.200x016","I20.000x004","I35.801","I51.304","I42.301","C45.200","B05.803","R03.001","I47.100x004","E83.103","I77.807","I21.213","I47.104","I49.900","I25.800x003","I27.200x006","I31.000","S65.500","E14.700x023","Q23.401","I71.003","I42.800x004","Z03.501","I21.302","R57.802","Q26.200x002","I10.x02","I87.116","I31.800x001","I74.101","I42.902","E74.008+I43.1*","T82.806","I70.213","I34.101","T82.803","I08.304","I70.902","Q21.205","B57.201+I98.1*","I99.x01","B57.001+I98.1*","I06.200","Q26.000x002","I72.300x033","T81.700x201","Q25.704","I37.200","Q20.000","I89.001","I33.000x024","Q20.802","R55.x00x009","S35.401","S75.000x002","I21.211","I51.800x004","I08.300x006","I24.800x004","I77.006","I72.400x133","Q25.700x007","I51.709","I82.203","S55.900x001","Q24.000x003","I72.800x103","I51.705","I70.200x005","I06.000","D18.000x836","R55.x00x007","I72.001","I51.302","I25.302","I71.000x023","I72.400x132","E14.500x031+I43.8*","I74.504","I25.800x011","Q24.800x030","Q23.200x002","I25.402","I33.003","Q24.800x026","I33.011","I72.103","M31.700","I70.810","A54.804+I41.0*","I20.807","I25.103","I74.300x230","I80.302","B58.800x001+I41.2*","I35.101","T82.100x008","I27.801","Q20.300","I44.102","I77.127","I33.009","T82.002","I25.500","I77.800x015","T82.500x003","I95.000","C79.800x830","I87.000","I77.800x010","Q27.811","S75.000x004","I72.400x213","Q21.103","S85.000","T82.000","E11.700x023","I33.004","I74.302","T82.800x308","I77.114","I77.100x014","Q22.200","I33.000x006","I70.011","I51.704","S65.300","I51.001","S45.200x002","T82.600x001","I97.800x016","Q24.507","D15.105","I45.102","I46.901","I77.600x014","I24.000x003","I09.200x001","Q21.201","I10.x12","I10.x00x009","Q21.100x001","T82.100x015","S85.800x001","I77.800x009","R94.300x010","Q82.811","I87.117","Z52.700","I08.000","I74.005","I87.100x008","B37.600+I39.8*","I47.110","I51.700","I71.402","R55.x00x004","I40.800x002","I49.501","I77.118","I70.200x063","I77.803","S85.101","Q24.800x010","I74.200x004","I49.400x001","I83.000","Q23.200","T13.400","I77.007","I40.800x001","Q24.800x012","I71.005","T81.700x404","Q23.101","M32.104+I43.8*","R07.301","I34.802","E10.700x031","I72.400x222","I42.100","T82.001","D35.601","I82.204","Q21.203","I08.000x007","M32.109+I39.8*","I40.000x006","Q27.800x035","T82.800x008","Q26.200x003","T82.100x002","S25.300x001","T81.700x405","E85.408","T81.700x204","I08.201","I47.108","I21.900x001","I24.002","Q24.602","I08.100x003","E13.500x541+I79.2*","I48.401","R55.x00x011","I07.200","I15.103","I77.000x014","Q26.902","I47.000","Q21.202","I24.001","I34.900","I42.900","I72.800x111","I08.000x002","I45.200","R09.800x082","I08.101","I08.000x004","I82.804","T82.302","I71.000x029","I72.400x223","I47.200x003","I45.000","I49.800x001","I70.210","S65.700x001","I25.600x001","S35.503","I78.102","I34.102","Q27.812","E63.901+I43.2*","I20.803","Q27.200x002","I49.100x001","Q25.402","D15.100","S09.000x001","I08.100x001","I08.900","Z45.002","I31.902","I20.000","S45.101","I36.000","A52.005+I52.0*","T82.800x305","I72.800x061","I51.403","I51.900x001","I70.219","I48.900x004","Q20.900","I23.500x001","I74.200x001","R07.101","S25.900","I72.800x102","I10.x00x015","M10.004+I43.8*","I97.001","Q27.900","S75.001","I09.900","I86.800x015","I47.105","I21.208","I71.000x002","I33.000x007","I74.006","I35.100x003","I25.800x002","I50.104","I31.001","I51.802","I24.000x005","I06.100","T82.103","I71.401","I72.301","Q23.001","I24.901","I28.803","I77.300x002","I10.x00x008","Q20.200","S55.101","E11.400x311+G99.0*","I21.103","I72.100x003","I87.802","I74.801","I74.102","I25.301","I72.804","I28.802","I70.111","I71.203","R57.101","I49.800x003","I10.x10","I40.002","I25.300x005","I71.800","I87.114","I77.600x016","I51.700x009","S35.300x001","I21.200x018","I72.400x131","I45.900x003","I45.600x003","I72.400x520","R55.x00x001","I08.801","D18.000x822","Q24.300x002","I05.900x001","I44.200","I31.904","I28.800x005","I72.302","E16.800x101","I15.800x006","I97.800x002","I34.000x001","Q22.100","I34.100","I21.204","I49.002","T81.700x104","Q26.000x004","I70.900x004","I74.305","I50.002","I74.902","S75.900x001","I51.803","I71.000x005","I51.700x004","A52.000x001+I52.0*","I21.200x021","S35.202","I25.300x012","Q22.800x005","I47.200","Q23.804","I74.500x011","I70.004","I72.808","I77.100x015","M32.105+I32.8*","I66.205+G46.2*","I77.800x024","I70.800x005","R55.x00x008","I20.801","I74.300x131","I97.101","T82.504","I78.801","I80.303","I49.303","Q24.603","I97.800x015","I80.002","I82.800x003","I23.100x001","I27.200x009","I09.000","T80.100","I24.000x010","I30.100","I21.200x011","I72.900x002","I33.900","I78.000","I08.006","T82.100x007","I72.000x011","I86.805","I22.800x002","R94.300x012","I86.815","I86.814","C75.500x001","I71.900x004","I20.806","Q24.511","I35.000","I10.x03","Q23.800x008","S35.801","I45.400x001","I72.401","Q25.404","S15.700x001","I21.300x004","C38.002","T82.800x407","I72.814","I22.000x003","D18.006","D44.702","Q24.503","I74.300x112","I73.902","I22.800x001","I22.100x003","Q27.817","I72.813","T82.900x001","T82.800x101","I20.102","I40.900","S95.700x001","I77.100x027","T82.201","Q25.900","T81.700x105","I73.100","I08.104","I74.800x007","I51.400x005","S25.801","R57.000","I77.107","Q25.800x004","I42.904","I97.800x005","I72.400x111","Q21.100","I70.002","R94.307","I97.800x020","I71.201","I35.000x002","S75.200x001","I33.000x021","I72.100x004","Q22.500","Q23.802","I27.000x007","I73.800x007","I31.903","T82.800x408","S26.800x031","S65.400","I80.301","C79.808","Q21.300x002","S26.800x082","I51.600x003","I08.300x003","I74.300x122","I77.011","I31.100x001","I70.217","I35.900","S65.501","I51.800x006","I25.800x009","A38.x00x002+I41.0*","S35.203","I47.200x006","I74.800x001","I70.804","M05.305+I32.8*","T82.800x102","I27.000x009","Q26.500x001","I70.010","I87.102","I07.900x001","T82.904","I89.007","I77.100x029","I21.210","I51.800x005","S35.200x003","S75.900x002","I74.310","Q20.800x003","I74.500x007","I49.402","I51.900","I50.908","I50.102","I22.800x004","I77.121","S35.800x002","I11.001","I87.202","R94.303","I34.800x002","Q22.600","R94.300x011","S45.900x001","I72.800x042","I71.300","I80.100x003","I31.000x002","I22.800x006","Q24.809","S95.000","I72.400x121","S26.910","I35.100","S35.903","T81.700x102","S35.001","I95.200","I77.100x012","I74.300x420","A52.000x011+I39.0*","S45.300x002","I70.207","I70.800x006","I45.800x004","I77.102","I48.900x015","I77.202","I71.200x010","Q26.800x007","I77.104","E10.400x311+G99.0*","I25.403","I25.800x006","T82.805","C38.001","I49.001","I25.300x006","R00.800","I49.800x002","I83.102","T81.700x308","I74.800x005","I42.500x001","I45.502","I72.300x031","T82.100x013","I70.805","I77.100x032","I37.900","I21.200x029","I97.804","I20.001","I77.800x018","B57.200x001","S35.200x005","Z45.001","I23.200x001","T82.809","I71.000x003","I71.000x011","Q27.800x034","Q24.800x028","I72.800x101","A52.000x006+I39.1*","E03.900x004+I43.8*","I74.000x003","I77.125","S35.500x004","I86.813","S45.800","Q82.800x015","S26.813","I97.801","T82.800x001","I70.112","Q26.800x004","I34.800x005","S25.500","D18.109","Q21.400x001","Q24.804","I22.800x009","I25.400x001","K55.000x015","R01.000","Q24.512","I35.200","M05.302+I43.8*","Q82.800x016","I50.100x006","S25.700","I82.900x003","I72.400x030","Q26.500","I35.807","R55.x00x010","Q25.301","S65.200","I08.901","I15.200x003","I22.000x005","I25.300x013","I45.501","I70.211","I08.303","T82.100x010","I72.403","B33.201+I41.1*","T79.101","I27.200x002","I22.800x014","I77.603","I47.200x005","R57.801","I45.801","S95.200","J10.802+I41.1*","I49.800x010","I77.600x004","I80.804","I48.100x002","I01.100","I73.805","I49.300x002","I70.201","I86.800x011","A39.503+I41.0*","R00.200","R94.300x007","I72.400","S35.200x001","I71.200x011","I31.301","I51.700x003","I47.200x013","I22.800x015","I33.005","Q24.601","I45.500x002","I50.900x001","Q24.805","I74.304","B49.x15","Q26.800x001","I72.800x051","S26.810","I72.004","S75.100x001","I50.103","T82.502","T82.811","I74.800x009","I95.800x001","I09.100x001","I97.000x002","A52.006+I39.8*","I70.003","I72.000x032","I45.601","I87.119","I48.100","I72.100x007","C38.000x004","T82.800x206","I08.300x005","I28.800x007","I82.806","R00.800x003","I70.014","I71.900x002","I38.x00x002","I77.800x017","D18.000x835","I22.800x011","I72.000x012","I22.800x017","I83.200x001","T11.400","Q24.506","T82.808","S75.100x002","I73.901","E10.700x011","I33.002","I08.300x002","T82.800x402","I72.100x006","S35.400x002","I51.401","I72.400x430","Q24.800x014","I74.300x232","S75.700x002","I42.001","E85.416+I43.1*","I33.000x004","I77.100x018","Q24.900","T82.100x003","A39.502+I39.8*","I05.000x001","I50.906","I97.102","I72.400x113","I72.900","I25.900","S35.700x003","I48.200","I47.200x007","I72.800x053","Q25.407","I77.604","I72.002","T86.300x001","Q20.101","S55.000x001","I71.000x014","R01.200x003","I47.100x014","S35.500x007","I40.000x003","I71.204","I07.000x001","I30.100x005","I80.800x006","I20.800x006","I51.900x002","I48.400","I40.000x005","S25.101","I27.200x017","S35.700x004","I71.902","C49.900x001","I08.200x002","Q82.812","I27.900","I71.600x004","Q27.200x003","I36.800x005","I11.901","I08.200","I30.000","I31.302","T82.800x404","I74.800x006","I71.901","T82.800x302","I31.300x005","I82.201","I25.400","I77.800x002","I21.212","I47.200x001","I45.602","I30.900x001","Q25.700x008","I36.900","Q24.813","I35.200x001","I70.812","I72.400x130","R93.100x002","I35.804","I25.802","I21.901","Q27.800x042","Q21.300x001","T82.700","I47.204","I86.804","I74.300x213","R57.900x002","Q26.000x003","S75.700x001","B33.200","D18.000x004","Q20.600x001","M31.804","I44.300x003","Q25.401","I15.200x004","I23.400x001","I47.200x008","I51.100x001","Q23.400","I42.501","R96.001","Q20.801","Q24.600x002","I71.101","I47.100","T82.600","T81.700x004","I82.800x004","R57.800x003","I72.300x006","T82.800x207","I21.000x005","Q22.302","I30.100x007","I21.300x008","I71.000x026","I10.x04","Q27.800x008","T80.000x001","I22.800x003","I08.300x001","T82.100x005","I45.500x004","I97.800x013","T82.301","E11.501+I79.2*","I34.202","T82.303","I87.112","I86.807","I77.103","I77.800x008","I49.805","I51.703","I20.002","I44.304","R00.100","I40.001","I74.300x133","I35.803","I24.800x007","I71.004","I87.111","I45.600x004","R94.300x003","I72.901","I71.500","I71.007","B33.200x002+I39.8*","T82.804","Q24.300","T82.703","I70.000x005","I30.900","S45.201","Q23.805","I22.800x018","I47.100x013","I77.600","S35.200x006","I70.200x011","I30.102","I11.002","Q26.800x010","I51.303","S25.800x003","I31.200x001","I21.200x016","I33.001","I70.000x010","Q26.200x005","I21.200x009","I22.000x004","I74.800x008","Q23.100","I28.900x001","I72.006","I44.400","I72.800x151","I47.900","S35.901","I20.004","I22.800x010","I72.400x232","Q24.513","I25.902","Q27.400","E76.300x002+I52.8*","I73.802","I49.801","I21.401","S26.000x002","I70.012","I42.201","I22.800x007","I80.102","I23.300x001","I74.901","I51.200x001","I08.009","I38.x02","Q21.200","I50.900x018","I71.000x006","A18.808+I32.0*","Q22.000","I38.x01","S35.300x003","I74.807","I02.000x001","I08.306","I87.101","Q27.300x009","I72.300x032","I51.502","R55.x00x005","C49.300x006","I21.001","I13.900x001","I33.010","I05.800","M05.200","Q25.601","I22.000x002","I72.400x530","Q24.000x002","I74.300x520","Q22.900","I71.000x015","T82.601","I27.201","I08.000x008","I77.800x012","I50.100","I50.101","Q87.203","I37.100","I70.208","I70.013","I97.800x017","Q26.302","S26.000x001","I67.200x004","Q25.702","I74.500x012","I51.700x006","S55.700x001","T82.800x205","I71.000x021","I70.200x061","T82.000x002","Q21.105","I20.006","S25.000","I48.900x003","I80.800","I28.800x008","Q23.300","I08.100x004","I27.000x008","Q24.811","I77.100x031","Q25.705","I21.303","I74.300x113","T82.800x104","I25.800x010","I77.802","I21.200x026","R55.x02","I70.000x006","I08.800x003","I22.800x005","Q25.400x010","I05.100","I21.200x025","I74.500x002","I72.400x410","I47.202","I70.001","S35.205","I72.400x330","Q26.200x001","S85.900x001","A39.501+I32.0*","I82.900x002","I51.500x006","Q22.802","I77.806","S25.201","T82.503","Q24.901","I70.901","I15.000","I36.801","S85.200","B26.803+I41.1*","I42.801","I51.707","I08.001","I71.903","I77.131","S26.811","Q23.900x001","T81.700x304","I23.800x001","I87.103","Q24.200","I50.000","I72.900x004","I74.501","I72.003","I15.200x005","I73.001","B57.002+I41.2*","I51.708","I30.100x006","I87.805","I71.801","I71.000x008","S85.700x001","I82.900x004","I08.103","I77.109","I21.900","I23.601","S35.000","S35.301","T82.000x001","T82.300","R07.400","D15.102","D18.000x841","I28.800x003","I08.305","I28.000x003","Q27.800x020","I80.206","S65.800","T82.800x306","M34.800x009+I52.8*","I34.000","S35.402","I74.300x310","I27.200x005","T82.800x208","I33.006","I72.402","I72.400x233","I22.100x002","I24.000x009","I27.200x012","I21.207","T81.703","S35.502","T81.702","S25.200x001","Q25.000","I80.101","I24.900x001","I09.801","I72.100","I42.800x002","Q27.100","Q24.400x003","I95.100","I21.200x024","I77.600x001","I25.800x005","I82.802","Q22.800x004","R55.x00x012","I70.912","A48.300","I27.900x002","I78.900","I27.000x010","I21.200x030","I42.905","Z45.005","I30.100x008","D48.100x024","S85.102","T81.700x301","A52.002+I79.1*","T82.800x301","F01.101","I77.204","T86.200x002","I08.800x002","I77.117","I74.300x330","I42.803","I86.800x017","Q20.100","I86.816","C79.800x863","Q25.303","I77.129","A52.008+I32.0*","Q25.700x006","Q27.307","I77.115","I51.402","I97.800x010","Q21.102","I45.800x002","I49.302","I27.100","I27.200x013","I74.500x013","S75.000","I71.000x027","I73.804","Q24.800","S75.800","I77.900","Q21.802","I72.400x230","I10.x08","I83.101","I28.804","I48.100x003","S25.001","E05.900x004+I43.8*","I80.208","S35.900x001","I82.200x001","I97.802","I71.600x001","I15.900","I80.300x005","I05.200","I08.000x003","T82.800x304","I74.300x220","Q23.801","I77.800x016","I40.800x003","A18.821+I41.0*","T82.801","T82.800x303","I08.200x001","I31.300","M31.600","I71.006","T80.000","A01.000x016+I41.0*","S26.800x083","I35.808","I82.805","I71.000x024","Q24.815","I71.000x025","I25.300x011","I27.200x019","I71.206","I87.113","I70.200x002","I45.600x005","I77.500","I20.802","I74.001","I35.800x003","T81.700x205","I38.x03","D48.712","I51.501","I51.702","I72.300x021","I72.404"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCF入组条件，匹配规则：主诊断匹配");
        String result;

        result=FB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FB2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FB3.group(record);
        if (result.length()>0){
            return result;
        }

        result=FC1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FC2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FC3.group(record);
        if (result.length()>0){
            return result;
        }

        result=FD1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FD2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FD3.group(record);
        if (result.length()>0){
            return result;
        }

        result=FE1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FF1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FF2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FF3.group(record);
        if (result.length()>0){
            return result;
        }

        result=FF4.group(record);
        if (result.length()>0){
            return result;
        }

        result=FJ1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FK1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FK2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FK3.group(record);
        if (result.length()>0){
            return result;
        }

        result=FL1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FL2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FM1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FM2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FM3.group(record);
        if (result.length()>0){
            return result;
        }

        result=FN1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FN2.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合FQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "FQY";
        }

        result=FR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FR2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FR3.group(record);
        if (result.length()>0){
            return result;
        }

        result=FR4.group(record);
        if (result.length()>0){
            return result;
        }

        result=FS1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FT1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FT2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FT3.group(record);
        if (result.length()>0){
            return result;
        }

        result=FU1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FU2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FV1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FV2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FV3.group(record);
        if (result.length()>0){
            return result;
        }

        result=FV4.group(record);
        if (result.length()>0){
            return result;
        }

        result=FW1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FW2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FZ1.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCF的ADRG入组条件");
        return "";
    }
}

