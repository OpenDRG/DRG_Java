package drg_group.taizhou_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.ADRG.*;

public class MDCF{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"I35.801","I80.206","I80.101","I77.121","I07.900","I05.100","I74.301","I77.201","T82.800x307","B49.x15","Q21.104","Q26.300","I22.100x003","Q24.502","I70.912","I70.200x063","I10.x03","I72.100x007","I77.601","I77.110","I35.101","S35.205","I31.300","I80.100x003","I30.100x005","S35.300x002","T81.700x205","I74.300x030","Q25.000","I77.600x016","I72.400x212","S45.800","I72.000x031","Q24.806","I28.900x001","I31.000x002","I72.005","I45.600x007","R55.x00x011","I74.300x131","R96.001","A18.820+I39.8*","I72.400x213","I80.104","S75.100x002","I09.200","Q26.500","I33.000x012","I97.102","S25.201","I45.500x004","T70.200x007","T81.700x105","I42.100","I82.100x001","Q24.800x010","I08.302","I33.001","I36.900","Q22.400x003","I51.302","I74.300x410","I77.800x015","Q28.900","T82.800x003","S35.400x001","Q24.300","I70.000x012","I71.903","I97.800x014","I97.800x020","I25.302","I47.103","I73.805","Q23.200x004","I72.200","Q24.602","C75.400","I87.116","Q27.800x041","I33.004","I86.800x017","I21.002","I80.902","I74.300x223","I95.200","T81.703","I74.305","I95.900","I45.804","I72.000x032","I72.400x030","I42.800x004","I49.300x005","I87.100x003","S15.000x002","S35.402","I78.102","I44.602","D48.100x008","I44.700","I80.203","I87.801","I28.800x003","M32.105+I32.8*","I97.800x013","T82.800x203","E74.008+I43.1*","I71.902","S65.700x001","I11.901","I10.x12","S35.204","I77.117","I72.804","I05.900x001","I83.901","S35.800x001","I74.006","I97.803","T82.100x011","I08.000x002","I20.800x007","I33.000x024","I20.900","I36.800x004","I70.010","I20.005","I51.600x002","I08.300x003","T82.807","I35.800x003","I47.900","Q24.901","I08.002","I86.800x011","Q85.900x048","I72.808","Q25.406","R94.300","I47.200x014","I71.000x025","I73.803","I28.100","I09.100x002","I30.100","I51.900x002","I74.300x122","I70.810","I35.803","B57.002+I41.2*","I80.901","B33.200x001+I32.1*","S35.200x001","T82.703","I21.401","I34.800x002","I34.900","I35.808","I77.800x018","I27.001","I37.200","I25.000x001","I95.800x001","I72.006","T82.800x406","R94.301","E11.700x022","D35.600x001","I50.900","S65.800","T82.201","I49.300x002","T81.700x203","I05.000x001","Q21.800","A52.003+I79.0*","Q21.203","I47.203","Q25.302","I71.200x010","I72.400x112","A39.500","J94.000","I86.813","I51.700x003","I72.404","T82.100x010","I07.200","Q28.200x008","T82.803","I08.000x005","I08.304","I74.401","I72.100x004","S55.101","I22.800x011","I25.800x006","I70.900x003","I25.300x008","I80.202","I87.111","S85.800x001","R55.x00x006","I82.802","I72.400x210","I82.900x001","I25.800x003","S35.700x001","J10.800x003+I41.1*","A52.000+I98.0*","I09.900","I97.800x001","S45.900x001","B01.800x001+I41.1*","T82.800x008","I72.400x430","I08.800x002","R07.200","I82.201","I71.000x026","I10.x04","T82.800x401","I77.100x015","S35.502","T82.503","I77.301","R68.800x001","Q24.503","I72.300x013","I30.100x008","Q21.800x003","I74.300x133","I47.100x004","I08.300x001","I83.200x001","T81.700x403","T82.800x306","I72.300x006","I72.300x031","I71.006","S35.300x004","T82.702","I27.100","E16.800x102","I51.708","I70.200x005","S55.000x001","I08.100x001","I27.900","I25.400x005","R00.000","I71.901","I22.900x001","I27.000x008","Q24.800x012","R00.800x003","I22.800x017","I08.305","I50.900x016","R57.000","Q24.809","I97.800x005","S85.300x001","I22.800x005","I10.x09","Q23.101","I31.301","S85.000","Q26.000x001","Q24.400","I97.800x004","I20.006","T82.800x105","I22.800x004","I28.800x008","I47.104","I27.202","I48.200","C49.300x006","I77.114","R03.001","S95.700x001","S26.810","I37.000","S26.812","I06.800x001","Q25.704","R94.304","I27.200x003","I72.400x232","I01.800x001","I80.802","Q26.302","I24.002","Q24.800x014","I70.910","I50.900x014","T82.800x204","I71.100x002","I78.900","E11.501+I79.2*","Q27.309","S35.200x006","I08.900","I10.x00x016","I48.900x004","I21.200x017","I37.900","Z45.003","R07.101","I33.007","I71.100x003","I25.100x003","I42.200x002","I31.904","I50.908","A18.808+I32.0*","I48.100","Q23.803","I23.200x001","I21.200x030","S26.813","I33.000x022","I21.204","S35.901","I74.500x002","I77.100x014","I44.601","I44.400","I08.300x007","Q21.300x003","I42.904","T82.900x001","Q24.400x003","I27.200x017","I28.800x005","I08.104","I45.102","I97.802","I22.800x006","Q24.800x025","Q25.300","I21.104","I50.000","I77.604","I51.702","I21.000x005","S35.401","I45.101","S35.503","I74.005","I97.900","I47.111","I45.600x004","I51.502","I13.200x001","A52.000x011+I39.0*","Q25.705","I51.803","I25.800x012","Q22.802","I71.000x028","I74.807","I02.900x001","M05.306+I41.8*","R09.800x081","M05.307+I39.8*","I70.200x064","Q26.800x004","I50.900x017","S35.100x003","Q25.401","I51.403","I01.000","Q20.600x001","I27.200x005","B33.200x004+I41.1*","S75.200","I51.703","I74.302","Q24.800","A18.818+I79.8*","T81.700x303","I70.217","I77.111","R94.307","I47.200x007","I77.010","I42.100x002","T82.800x302","Q25.402","Q27.812","I34.800x005","I47.109","I25.800x002","I36.100","I87.000","T82.800x304","I15.102","I70.000x013","I77.600x013","I05.800","I48.900x003","M05.304+I52.8*","E13.500x541+I79.2*","I47.100x001","I48.100x003","Q20.801","I74.300x121","Q22.800x007","I87.114","E03.900x004+I43.8*","I77.105","I33.008","I97.001","I44.101","Q20.601","I49.800x007","I70.014","I89.001","Q23.001","I34.201","I70.800x006","I70.000x010","D86.800x005+I41.8*","I23.000x001","I25.400x001","T81.700x204","S65.300","I09.801","D15.100","A52.009+I39.3*","I72.900x003","I08.102","Q22.500","I35.805","T82.800x102","I42.201","R07.400","Q26.200x002","I21.200x019","I73.800x007","I70.218","I71.003","I40.800x001","I74.800x008","Q27.809","Q23.804","I21.200x026","R55.x00x004","I01.100","I87.110","I71.300","I20.002","E76.300x002+I52.8*","I77.800x009","T82.300","I77.802","I33.006","Q22.400","I51.400","I86.804","I72.400x330","T82.700","I71.000x002","T82.601","I72.400x530","T82.800x303","D18.000x004","I31.900x010","I72.800x151","I28.801","I71.402","I36.801","T82.504","T82.800x411","I15.200x002","Q27.817","I30.103","I80.001","I73.800x003","S26.000x001","I21.103","Q25.303","I80.800x007","I73.902","I77.801","I15.800x001","S35.101","I24.800x004","I74.000x003","Q27.803","Q21.100x001","D15.102","I80.207","I97.000","T82.800x402","I72.800x093","Q24.807","I08.006","I70.000x006","I47.200x010","I72.000x013","I50.906","I73.800x008","T82.800x009","T81.700x401","I31.900x008","Q23.401","I34.100","I70.902","Q27.815","S35.100","I48.300","I70.800x005","I80.208","A52.005+I52.0*","I83.904","D15.105","I09.200x001","T82.000","C75.501","I74.300x113","I80.803","Q25.701","T82.100x009","I78.803","T82.202","Q24.805","R55.x00x007","I77.131","I77.115","I21.303","I82.804","Q24.509","I72.100x006","Q20.200x002","Q82.812","T82.800x201","D44.700x002","I33.000x020","I77.100x004","Q24.300x002","I15.800x006","I47.100","M05.302+I43.8*","I23.500x001","I72.800x111","I21.200x020","Q23.100","T82.501","I97.801","Q22.301","C38.000x004","I83.102","S45.300x002","S35.202","Q27.800x008","I82.302","I44.302","Q21.400x001","I72.800x103","T82.800x101","I77.104","I51.706","I71.000x008","I08.100x004","I87.805","I97.800x016","Q27.900","I86.800x005","T82.806","I07.100x001","A18.821+I41.0*","I27.200x015","I72.303","I70.002","I30.100x007","C49.900x001","I72.400x420","I77.000x011","R93.101","I70.213","Q26.200x005","I80.301","S26.811","I51.001","Q27.307","Q27.200x003","T82.103","Q25.500","I72.400x233","I22.800x016","I24.800x007","I30.900x003","I74.200x001","I70.102","I10.x02","I22.800x014","R55.x00x014","I82.800x003","I25.300x012","I77.005","I47.100x013","I80.300x005","I47.200x005","R94.300x012","I08.000x003","I40.800x003","I77.800x016","I45.502","I51.707","I77.129","Q26.000x002","I07.100","I05.200x001","I86.814","R00.200","I08.103","Q20.400","I74.200x005","R55.x00x008","I50.900x018","I20.800x006","I71.600x004","Q24.200","I08.009","I47.102","T82.800x305","I08.200x001","I33.003","Q25.405","R57.101","I74.500x008","I40.000x003","Q24.808","I77.800x022","S35.500x003","I70.200x062","S55.200x001","I21.106","I72.300x012","I50.900x001","I74.500x013","Q82.800x016","Q20.302","T82.805","I12.902","Q28.200x007","A52.000x006+I39.1*","I42.800x005","Q26.400","I33.005","Q27.800x033","I31.900x009","T82.800x405","I25.300","I45.602","I47.100x005","I71.400x002","I72.302","S35.000","T82.800x404","I10.x00x002","I49.805","D18.000x836","I50.900x015","I67.200x004","D15.104","E05.900x004+I43.8*","B57.001+I98.1*","I36.200","I51.704","I70.200x021","T81.800x010","D44.700x003","I21.207","I83.100x001","I72.402","S85.700x001","I74.300x213","A18.809+I32.0*","Q25.700x006","I82.900x003","R94.300x010","I15.200x004","Q21.802","E85.408","D18.000x835","I71.900x004","I77.014","S26.800x031","I72.814","I51.400x006","I71.202","I74.800x009","I22.800x002","T82.100x007","I72.000","I31.300x005","I27.200x019","I70.900x002","T82.800x104","I71.000x005","I74.500x010","R94.300x007","S35.700x004","I47.000","I70.200x002","Q24.800x011","R07.301","I74.310","I30.900x001","I08.300x004","R02.x00","T82.801","I51.903","R93.103","I51.802","I31.100x001","S25.001","I71.007","I10.x00x015","Q27.800x031","I80.002","I49.402","I34.200","I42.001","I33.011","I77.800x010","I80.209","I15.200x001","I22.100x002","D48.100x024","I70.203","R57.900","I89.100x003","I22.800x007","Q24.501","Q24.810","A38.x00x002+I41.0*","A52.002+I79.1*","I25.901","I72.300x021","I49.800x006","I82.806","I21.300x005","S75.000x003","I02.900x003","D18.000x840","I74.800x010","Q82.800x015","I50.900x002","I20.102","I74.800x005","Q26.500x001","T82.001","Z52.700","I21.200x014","T82.804","I72.300x023","I42.801","I35.802","I71.206","I74.800x004","S35.500x008","T82.100x015","T82.100","I82.800x004","R57.900x002","S95.800","I51.401","I49.804","I74.300x330","I45.800x004","I35.100","Z45.800x006","I87.101","I70.001","I77.203","I74.308","I15.800x002","I24.003","I09.000","I89.007","I74.102","I71.000x011","T82.400","I72.000x033","D18.000x003","I74.300x430","Z45.005","I34.800x003","I25.104","S25.000","I27.201","I21.900","I40.100","I44.300x003","I10.x06","I77.127","I74.504","S45.200x002","C38.001","T79.101","S35.700x003","I50.001","I50.100x006","S75.900x001","Q20.900","I71.600x001","I72.400x220","Q27.306","E14.500x032+I43.8*","S85.400x001","I08.008","I77.200","I77.800x020","I51.501","I20.801","S85.101","I36.800x005","T11.400","S35.102","Q24.000x003","I37.100","Q27.808","T82.800x206","I42.500x001","I27.200x021","I38.x02","I50.102","T82.600","I28.803","Q82.811","Q24.511","I08.000x006","I05.000","Q22.200","E13.500x241+I79.2*","I20.803","I67.200x003","Q24.000x002","I70.214","S65.400","I07.900x001","T81.700x402","S65.500","I72.400x132","T82.800x202","I82.805","E74.006+K77.8*","I77.125","I08.100x003","I31.800x003","I20.000x005","D18.000x837","I46.901","I77.013","Q20.300","Q25.404","I21.300x004","I08.005","S85.801","I07.800","I74.300x320","I33.000x004","I05.200","I49.500","I44.303","I72.300x033","S25.800x003","I21.212","R00.800","I71.801","I74.300x233","T82.800x004","I80.102","I70.200x061","R55.x00x005","R57.901","Q24.800x030","I25.300x013","I25.402","Q27.800x037","I49.200x001","I21.200x009","T82.102","S15.700x001","I71.101","D15.101","I77.000x008","E10.700x022","I49.800x001","I97.800x006","E11.502+I79.2*","E63.901+I43.2*","B26.803+I41.1*","E05.903+I43.8*","I71.401","D44.700x004","I71.000x029","I77.008","I10.x13","S55.700x001","S75.000x002","Z45.001","I87.802","Q23.300","I21.001","Z03.501","I77.800x019","I74.200x006","I72.901","T86.300x002","I74.307","I70.111","I71.000x006","I72.000x023","I51.700x007","I45.901","I42.800x007","I72.900x004","S25.802","I45.800x002","I80.303","I71.001","I10.x08","I25.800x010","Q20.300x002","I44.000","I50.900x010","D21.300x005","I51.900x003","I25.300x011","I74.300x212","I44.102","I70.000x007","I27.000x010","I70.000x011","I80.804","Q22.100","I08.003","I10.x14","I71.000x022","I77.204","I38.x00x007","I50.105","R57.802","I42.802","I71.205","I24.000x010","Q25.408","I22.800x012","I21.200x015","Q27.800x035","I15.103","I36.800x002","I50.002","A52.007+I41.0*","I25.400","T82.100x005","B58.800x001+I41.2*","I82.203","I49.900","D18.000x822","S25.101","T81.700x405","I72.305","I77.100x012","S55.800","S85.100x002","Q25.800x004","I70.100x002","I70.204","I27.200x012","T81.700x005","I70.012","I24.000x009","M10.004+I43.8*","I22.800x018","Q22.600","Q20.301","S26.800x021","I15.900","I50.900x008","I97.800x008","I72.800x061","I42.800x001","I47.107","D20.000x002","Q27.303","I50.104","I77.800x002","I45.600x003","I82.800x005","Q25.700x008","I34.102","D15.106","T81.700x004","S35.500x002","I49.800x016","Q21.205","I77.106","Q21.106","I70.901","I08.200","S25.300x001","I06.000","I77.112","T82.100x008","I47.106","D21.400","I74.202","I72.000x022","I77.011","T81.700x102","I80.300x006","Q24.800x017","I74.300x232","R01.200x003","I49.404","I72.004","I25.102","D44.700","I82.200x001","S75.001","I70.112","I25.403","I77.803","I74.800x001","S75.100x001","Q23.900x001","B33.200","I72.100x005","R94.300x003","I87.202","I48.401","Q25.200","Q27.001","I86.815","I72.400x310","I70.011","R00.801","Z45.002","R00.001","I51.402","I74.800x007","I36.000","I72.800x042","Q25.700x012","I22.800x013","I74.300x222","I72.000x011","I67.203","I74.503","I70.209","S25.100x002","I20.000","I07.000x001","I72.400x520","S75.100x003","I71.201","I25.802","I51.700x014","I25.902","I77.600x004","Q25.407","A52.000x001+I52.0*","I30.801","I25.600x001","I51.304","I80.204","S65.900x001","I21.200x018","I87.100x009","I48.000","I77.800x024","I70.805","I06.200","S45.300x001","I83.905","I72.400x222","I72.400x410","I25.300x006","I21.004","I09.100x001","I87.100x008","N18.505+I68.8*","S95.100","I51.800x004","I38.x00x006","I72.400","I70.110","I71.004","I86.801","Q25.400x009","I77.102","I51.600x003","I49.101","Q27.800x034","S35.903","S75.700x002","I31.903","T82.903","I08.901","S75.901","S35.900x001","I50.100","I74.806","S35.400x002","Q26.800x001","S35.701","I45.601","Q20.200","D48.712","Q21.105","I49.802","S35.500x001","I20.807","I80.800x006","S85.102","I08.201","I82.800x002","J10.802+I41.1*","Q87.400","I71.204","Q23.200x003","B25.803+I41.1*","S25.400","T82.000x001","S35.200x005","I49.002","I10.x00x008","Q22.000","D44.601","I74.802","I74.304","Q27.800x007","T82.904","I08.000x010","A01.000x016+I41.0*","M31.400","S85.900x001","I26.001","Q21.900","I86.800x015","I44.100","I82.900x002","R94.300x011","E11.700x023","I21.200x023","I77.100x031","I35.200x001","Q24.507","I74.300x520","I70.208","I97.101","I33.010","R00.300","I08.300x002","I38.x00x002","I47.200x008","I87.106","D18.000x841","I35.900","I44.500","Q27.800x020","Q24.601","I31.000","Q22.800x005","I25.300x007","Q27.818","I73.903","I82.204","Q24.513","T81.700x003","I25.800x005","Q87.809","I31.200x001","I72.900","I71.000x007","I71.000x003","I15.800x004","Q25.400x013","I77.103","I74.300x420","I45.500x005","R94.306","I30.101","I74.500x007","I33.000x008","T82.800x407","I51.801","I21.200x024","A32.802+I39.8*","I07.000","I86.806","I74.902","I80.103","S65.401","Q26.800x002","I72.800x051","I78.000","I74.805","S35.200x007","I47.202","I74.200x007","I45.500x002","Q24.100","S45.101","I70.206","I45.501","S65.100x001","I08.000x001","Q21.102","I22.800x010","I70.101","I47.200x003","I22.000x005","Q21.804","Q23.300x002","Q23.801","I20.003","I33.009","Q24.800x027","E14.700x023","I51.700x006","Q24.803","I47.201","I51.500x006","I23.300x001","I70.200x031","I77.800x012","I11.002","T82.302","E10.502+I79.2*","I72.002","Q28.800x007","R57.801","T81.700x301","S35.001","I08.300x006","Q26.200x001","I08.100x002","Q27.800x039","I09.200x003","I49.400x001","I74.300x210","I44.201","R55.x00x012","I33.000x019","I73.901","I97.800x017","I20.806","I74.300x220","I71.005","I51.700x004","I06.100","I28.000x003","I74.800x012","I21.300x003","I70.812","I74.502","I77.100x027","S35.301","I42.701","I70.211","T82.800x408","C49.402","S25.501","B57.202+I41.2*","Q22.800x004","I77.500","S75.200x001","Q20.500x001","I08.800","I82.300x001","I71.000x023","I08.007","I40.002","A52.006+I39.8*","D21.400x004","I05.900","I47.101","I42.900","I45.103","I25.800x011","S75.800","I77.100x032","I31.902","I51.700x009","I70.200x065","I77.000x015","I77.600x014","I31.100","I45.200","I70.911","I51.800x006","I28.000x002","I21.402","S35.500x007","Q24.510","I31.001","I77.300x002","I77.123","I74.901","I74.101","T81.701","Q21.202","R00.100x001","M34.800x009+I52.8*","I30.900","I33.000x011","I73.802","I77.600","C75.500x001","I42.803","Q23.805","I35.000x003","Q24.900","I21.105","I08.000","R09.800x082","I51.701","I82.800x009","I70.000x003","I09.900x002","I38.x00x005","I87.100x007","I71.100","Q27.300x009","T82.900x002","S35.201","I25.300x005","I72.403","I10.x00x017","Q25.900","S26.900","I82.301","I49.800x010","E14.700x022","I71.000x016","B57.201+I98.1*","I20.000x004","S09.000x001","I22.800x001","I38.x03","I10.x01","I50.000x006","I15.101","I10.x10","I51.303","T80.000","S75.900x002","C38.002","I72.400x130","I77.600x012","R57.803","T82.800x403","I21.400x003","E16.800x101","I51.100x001","T82.002","I72.100","M31.600","I40.000x004","I51.500x002","I15.100x001","I72.800x121","T86.300x001","I27.200x009","T82.100x006","I42.800x002","S35.300x001","I87.201","Q25.600","R57.800x003","I86.807","I42.905","I08.301","I97.000x002","I72.811","T82.808","Q26.100","I49.303","S26.800x082","I45.600x005","I74.003","A52.004+I39.1*","C79.800x863","C79.800x830","R57.100","I36.800x003","I34.801","S35.300x005","I71.200x014","I20.101","Q21.300x002","Z03.400","T82.301","I72.304","I70.210","I40.000x007","I87.001","I71.000x012","I87.117","I97.800x011","M32.104+I43.8*","I72.400x113","I23.800x001","I77.900","I13.000x001","I74.002","T82.500x003","I74.201","M31.804","T13.400","Q24.512","S25.801","Q24.504","I97.800x009","Q24.804","S35.801","Q21.103","I40.000x005","I42.301","I27.200x004","A39.503+I41.0*","I87.118","I46.100x001","Q26.800x007","I97.800x015","I86.816","T81.700x103","I28.804","I21.205","I23.400x001","I15.800x003","I74.300x310","I77.100x029","Q21.204","I74.500x011","T86.200x001","I34.000","I25.500","I49.001","I83.001","I72.400x223","A52.000x007+I39.1*","S95.900x001","I70.003","D44.702","I72.812","C79.808","I44.200","I51.900x001","I70.219","I87.119","I70.200x004","Q22.102","S35.500x004","I77.602","I10.x00x007","I86.802","I80.302","S65.100x002","E10.700x023","I71.200x006","Q25.700x007","S45.000","I70.207","I87.112","Q22.900","C79.800x807","Q27.806","S25.700","I25.401","Q23.901","Q21.805","I77.108","R94.305","I71.600x005","E88.907+I43.1*","I73.800x001","I74.300x112","I10.x00x009","I22.000x002","S35.501","I25.800x009","Q27.100","T82.101","I49.403","I71.500","I77.600x001","S65.000x002","S35.200x003","I74.800x006","I95.101","R55.x00x009","T82.800x106","S26.910","I21.200x025","Q24.508","I22.800x008","I35.200","I30.000","T82.303","I21.003","Q27.400","I35.000x002","I74.300x123","Q27.200x002","I71.000x014","I42.600","Q23.000","I74.500x012","I77.600x015","T81.700x202","S45.001","I47.105","I71.000x015","S35.300x003","I70.900x007","I15.200x005","I24.800x001","I74.004","I72.400x010","I71.200x011","I70.900x006","I77.806","I97.800x010","S45.301","T82.600x001","I44.304","I30.100x006","Q24.811","I06.900","Q27.800x042","Q24.800x026","I20.808","I77.100x028","I72.000x321","Q21.206","S25.200x001","I47.200x011","D18.010","I08.100x005","I45.000","R55.x00x013","I87.104","I72.100x003","I87.103","R01.000","I34.800x006","I72.103","I74.200x004","T81.700x002","I72.800x023","A39.501+I32.0*","Q26.801","S95.000","I25.800x004","I72.300x022","I21.200x027","I21.302","I72.400x122","Q23.800x008","R55.x00x001","I77.100x005","I24.000x005","I47.108","T82.800x409","I34.802","E10.700x011","S65.000x001","Q22.801","I72.200x001","T82.800x005","J09.x03+I41.1*","T82.100x014","I34.101","I31.800x001","Q20.802","I70.201","I24.000x003","R55.x00x010","I45.300","Q26.901","Q25.700x011","T82.800x001","Q23.800x004","T82.704","R00.100","I34.001","I87.115","D18.000x001","S25.500","Q25.601","T82.800x301","I72.400x230","Q20.500","I51.301","T81.700x404","I20.802","T82.100x013","Q26.200x003","R93.100x002","I49.800x015","I83.903","I34.202","I72.000x012","I87.113","S45.701","I77.800x013","Q25.703","I77.603","Z45.006","S85.200","I40.000x006","I80.800x002","R01.100","T82.500x001","Q25.100","I25.300x010","I70.804","T81.700x308","T82.809","I38.x01","Q26.800x010","I86.805","Z03.500x001","I27.200x022","I23.601","I33.000x021","Q26.800x008","I27.200x002","I07.200x001","T82.401","T82.100x012","I25.300x009","I21.208","I72.400x133","I77.120","M32.109+I39.8*","S35.500x006","I21.200x021","Q22.302","I49.501","I77.000x014","I48.301","I77.804","Q20.101","I22.800x009","I70.200x011","I24.001","I42.300","T82.800x205","Q21.000","I42.000x001","I77.118","J11.801+I41.1*","I22.800x003","I30.102","I49.801","T81.700x304","I72.800x102","N18.506+I32.8*","I40.001","Q20.000","I33.900","I72.400x320","A52.008+I32.0*","Q26.800x005","S85.100x001","I21.200x029","A54.804+I41.0*","Q25.301","I77.807","I77.202","I95.000","I72.200x003","I48.900x015","Q23.200x002","I77.800x021","I47.200x001","I01.200","I47.200x009","Q26.800x003","D48.711","I28.802","Q20.600","I72.400x121","I77.107","E83.103","T82.800x103","I72.900x002","A54.805+I32.0*","I77.605","I77.300x003","I15.000","I77.800x014","I09.802","I51.200x001","C79.800x819","I21.200x003","I35.804","Q24.600x002","S75.700x001","S75.000","I25.301","I71.000x027","I72.101","I50.900x007","I31.302","I49.800x003","I21.206","I27.000x009","I50.900x009","D44.701","I46.000","Q26.000x004","I72.300x003","I77.126","I24.900x001","I87.200x001","E14.500x031+I43.8*","I24.100x001","M05.305+I32.8*","I82.801","I77.113","I02.000x001","I08.306","S75.000x005","I42.401","Q27.308","I08.000x008","I97.800x002","I77.800x017","I72.400x111","I21.211","Q23.200","Q26.000x003","I34.000x001","R55.x02","I51.705","I71.000x024","I51.404","I11.001","I08.800x003","I74.501","S35.902","I71.000x017","I21.200x010","I47.200x006","Q21.201","T81.702","Q28.801","I77.800x006","S85.500","I80.800","I51.700","I33.002","I45.400x001","I77.109","D15.103","I72.400x123","S35.203","I74.001","T82.000x002","Q24.603","R55.x00x003","I08.004","I45.900x002","Q26.301","I77.101","I42.800x006","I72.805","T82.810","I35.807","T82.800x208","I72.405","S35.500x005","I28.800x007","Q24.505","I47.100x014","I42.501","I72.201","T82.100x003","A54.802+I39.8*","I21.200x011","I24.801","Q24.815","S26.800x011","I45.801","I74.300x230","I74.500x009","S45.700x001","I20.001","I72.800x101","I08.300x005","I72.401","I42.901","I78.801","I82.900x004","I51.901","S26.801","I51.709","Q24.800x028","S25.301","R55.x00x002","I72.400x131","I48.100x002","I08.001","I77.800x007","S26.000x002","I49.302","I82.202","I25.900","E11.500x021+I79.2*","A39.502+I39.8*","I74.300x111","T82.800x207","I71.203","I35.000","I71.900x002","A36.802+I41.0*","I71.000x004","I40.900","Q25.800x002","S75.000x004","I49.301","Q26.800x006","B33.201+I41.1*","I22.800x015","A39.504+I52.0*","Q20.100","I50.900x019","I83.902","I13.900x001","I47.110","T82.800x308","I31.101","I47.200x013","Q24.812","I25.103","D18.000x005","S55.900x001","Q27.301","T81.700x104","Q21.101","Q21.200","Q28.900x001","S65.501","I45.600","I51.700x015","I27.000x007","I73.100","I21.210","Q23.802","I49.800x005","T81.700x302","S26.010","I74.300x132","R96.000x001","I27.200x016","Q26.902","T81.700x101","Q87.203","I27.900x002","I51.400x005","I09.200x004","I70.802","B37.600+I39.8*","I45.900x003","I87.900","T82.003","T82.800x006","I78.101","C45.200","I70.004","I77.006","I73.001","I23.100x001","Q23.400","I95.100","I71.000x013","I08.801","I72.813","Q23.800","I71.002","S95.200","I87.102","I27.200x006","I70.013","S25.900","I22.000x004","T80.100","I72.600","I97.804","Q24.800x018","I50.103","I21.300x008","I72.300","I24.000x004","I50.907","I08.300","I72.501","T82.814","I21.901","I77.805","R94.303","E85.416+I43.1*","I86.811","S35.200x004","I33.000x001","I83.000","I08.200x002","I49.401","I08.000x004","I08.101","I72.300x032","I72.001","I24.901","I73.804","I51.000x001","I22.100x001","I33.000x006","I71.800","I77.100x018","S55.100x001","T81.700x201","I70.900x004","I72.400x110","I77.800x011","I21.213","I21.200x016","I21.900x001","R00.800x001","Q25.702","I31.901","I08.000x009","I35.806","Q26.200x004","I72.301","I21.200x022","Q25.400x012","S65.200","T82.500x002","T82.100x002","I72.806","I08.303","I27.801","D44.703","Q27.811","T79.100","B33.200x002+I39.8*","I08.100","Q24.813","T82.901","I74.303","I77.007","R57.200","I73.800x006","Q26.600","I49.100x001","I74.300x510","I48.400","I42.902","C38.000","I77.800x008","S35.800x002","Q21.100","I82.803","I71.000x021","I50.000x005","I80.201","I08.000x007","Q25.400x010","R03.100","R94.308","Q25.403","Q27.800x018","I72.003","T80.000x001","I47.204","S35.302","I27.200x013","I74.402","I27.200x018","S26.800x083","T86.200x002","I70.000x008","I27.200x020","I33.000x007","I01.900","I22.000x003","I34.803","I50.101","I74.801","I37.800","T82.800x410","Q21.300x001","I99.x01","I15.200x003","I45.401","I49.800x002","T82.811","I35.100x003","E10.400x311+G99.0*","I22.000x001","I47.200","I83.900x004","I83.101","I40.800x002","I70.000x009","Q24.506","R93.102","I51.800x005","S45.201","T82.502","I51.900","Q24.814","I70.000x005","I20.004","I72.800x053","I10.x05","Q20.800x003","I77.012","I97.100x004"};
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

        result=FC1.group(record);
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

        result=FE2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FF2.group(record);
        if (result.length()>0){
            return result;
        }

        result=FF1.group(record);
        if (result.length()>0){
            return result;
        }

        result=FF3.group(record);
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

        result=FL3.group(record);
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

        result=FM4.group(record);
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

        result=FP1.group(record);
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

        result=FT4.group(record);
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
