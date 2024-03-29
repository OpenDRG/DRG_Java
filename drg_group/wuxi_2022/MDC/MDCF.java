package drg_group.wuxi_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.ADRG.*;

public class MDCF{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"I49.804","A18.808+I32.0*","I74.200x005","S26.812","I74.006","S65.800","I25.400x001","I25.104","I77.804","E11.700x022","S26.900","I47.106","I77.126","I34.800x006","I21.200x009","I42.800x001","S35.200x007","I51.402","C79.800x830","I51.900x002","I11.002","I35.900","I74.300x213","I97.801","Q25.400x012","I35.100x003","I08.300x003","I35.806","I44.304","I70.219","I72.300x023","I72.800x102","I51.401","I80.208","I44.300x003","I51.900","S35.204","T81.800x010","I50.000","I74.300x030","I97.800x020","I02.000x001","S85.102","M31.400","I72.400x010","D44.703","I71.300","T82.800x203","I47.105","I70.111","R96.001","I23.200x001","T82.704","Q24.800x026","I72.400x110","I77.118","E14.500x032+I43.8*","I48.200","I50.900x015","S26.800x082","I35.000","D15.100","I28.803","I34.201","R00.000","I08.300x005","I82.300x001","I08.000x004","I71.202","S65.900x001","I40.000x006","I27.200x009","I08.302","I38.x00x007","I72.301","I25.300x013","I05.200x001","T82.800x303","I74.102","I07.900","S85.000","I71.000x006","I74.807","I77.100x012","I77.100x015","I74.806","I31.904","I05.900x001","D86.800x005+I41.8*","I05.100","I49.301","I87.201","I25.301","I25.102","Z03.500x001","I11.001","I51.801","I36.800x003","I34.102","B37.600+I39.8*","T82.100x009","I70.911","I08.001","I70.201","R07.200","I21.104","I80.802","I82.806","I73.800x003","T81.700x303","I83.100x001","I01.200","I23.300x001","I35.000x003","I51.706","I71.005","I34.000x001","I71.800","I72.300x021","Q24.803","T82.901","I38.x02","I48.900x015","I70.000x011","Q27.811","J94.000","I08.007","I82.201","Q25.301","R55.x00x011","C38.000","I42.001","I70.200x011","S65.100x002","I49.002","S65.300","Q26.600","Q24.800x011","S75.100x003","E16.800x102","I72.302","C79.808","I21.204","I77.131","R00.300","J10.802+I41.1*","I86.806","S25.000","I28.802","D18.000x003","T82.503","S65.700x001","S75.900x002","Q21.900","S25.501","I08.100x001","I49.400x001","I47.200x013","I44.101","I71.001","E16.800x101","I74.300x220","I77.800x024","E11.501+I79.2*","Q25.701","I51.200x001","I08.000x007","I72.101","I22.800x012","I70.013","I72.806","S55.800","I50.907","I74.003","I35.100","Q24.806","I21.000x005","I44.100","Q20.300x002","I08.200","I07.200","T82.100x010","Z45.800x006","Q26.200x003","Q27.800x035","I71.100x002","I27.200x013","I20.800x007","T82.805","I72.900x002","Q20.900","T82.700","S55.700x001","I71.000x003","I72.400x111","I74.200x006","I86.800x005","Q22.102","I70.003","I44.602","I80.102","I72.804","I74.308","I05.800","I25.000x001","I77.204","A18.818+I79.8*","I67.200x004","Q26.200x004","Q20.801","Q24.810","I45.600x004","R94.308","I49.800x003","Q21.105","I27.200x003","I71.002","Q21.200","S35.501","Q24.800x028","I51.700x003","Q27.309","I21.900x001","I74.300x410","S95.900x001","I22.000x003","I45.800x002","Q26.800x005","T82.003","I77.800x019","D21.300x005","Q20.600","Q27.818","I71.000x015","T81.700x103","I51.702","I42.000x001","I77.000x008","I97.102","I22.900x001","I36.200","M05.304+I52.8*","I97.800x010","S25.300x001","I25.300x011","I74.300x510","I70.200x063","I77.120","I71.500","R55.x00x009","I71.000x013","I21.300x008","Q20.301","Q24.200","I01.800x001","I77.600x013","I01.000","R01.000","I72.000x013","T81.700x403","Q25.408","I35.802","I72.400x430","R57.000","S45.200x002","I70.004","I82.301","I74.300x330","I15.800x003","I20.802","I77.800x013","I72.900x003","I31.300x005","I89.001","S35.502","C79.800x819","E11.700x023","I71.000x002","I78.803","I25.403","I77.100x004","Q22.900","Q27.301","T82.102","Q21.800x003","I71.903","Q24.813","A39.500","I23.400x001","I31.000","Q22.801","I50.100x006","I71.000x022","I45.501","I95.100","E63.901+I43.2*","Q26.000x002","I10.x06","I72.400x123","I37.900","B33.200","I08.300x002","I08.101","I45.500x002","I20.000","R07.301","I09.200","I72.400x222","I51.400x006","I25.100x003","I33.003","I22.800x002","I70.214","I74.500x008","Q28.900x001","I74.500x010","I74.002","Q24.800x030","I31.900x009","Q25.500","I50.900x018","I77.111","Q27.806","I44.102","I47.200","I83.902","I25.600x001","I97.800x015","I50.002","Q23.401","S35.503","R57.900x002","I21.200x026","Q24.503","Q24.603","I27.200x015","T82.807","D15.103","I77.807","I47.000","S45.700x001","I70.200x002","I87.119","I51.400x005","I82.900x003","I73.800x001","T82.600","Q21.804","S75.000x004","R55.x02","B26.803+I41.1*","T82.800x306","I47.200x003","I87.801","S65.200","I78.101","I74.000x003","I50.900x009","I40.002","A52.009+I39.3*","I21.303","I38.x03","I74.300x232","I71.000x017","I22.000x002","I71.801","I42.501","I35.803","I21.200x019","I49.800x002","Q25.900","I70.014","I30.900x001","I22.100x001","I71.200x014","I72.004","Q27.800x031","I97.802","I87.001","Q27.808","I97.001","I70.902","I27.200x004","I73.804","I97.800x017","I21.212","Q20.200","T82.800x008","R94.304","I08.300x006","I74.401","I34.800x003","I50.900","I15.200x002","I97.800x005","I21.300x003","I87.118","I46.901","I82.804","I72.000x022","Q22.400","S25.201","I21.205","I21.300x004","Q20.500","Z52.700","I47.200x011","I72.100","I31.800x003","T82.100x007","Q27.800x039","R57.200","I45.500x005","S25.800x003","Z03.501","I31.200x001","I74.500x011","D35.600x001","I22.800x013","T86.200x002","I97.804","Q27.400","I83.000","Q25.400x013","S35.500x008","S65.100x001","Q24.600x002","I28.000x002","Q24.000x002","I71.000x021","I74.500x013","I45.600x007","I87.000","B33.200x002+I39.8*","Q24.504","I71.000x014","T82.103","I27.200x022","E88.907+I43.1*","I48.400","I72.300x032","T82.100x006","S75.001","Z45.001","D20.000x002","T82.800x411","I07.100","I77.200","I70.000x008","I77.010","I70.900x002","T82.601","I22.800x014","I28.804","R00.100x001","I71.200x010","A52.007+I41.0*","I34.801","E10.700x011","S55.100x001","D18.000x840","B33.200x004+I41.1*","S35.700x001","Q25.800x002","Q25.400x009","I74.805","Q25.703","I72.400x232","I31.800x001","I72.300x033","I20.002","I72.402","I21.105","I86.815","Q24.502","I71.206","I97.800x014","S85.800x001","I44.303","R55.x00x010","I51.802","S75.000x002","I30.102","I21.211","I05.900","E83.103","S65.500","I45.500x004","I74.800x006","I77.114","S35.500x002","S25.801","S55.900x001","T82.501","S85.101","I71.100x003","Q22.800x007","T82.800x208","T81.700x205","I77.102","I70.000x006","A39.502+I39.8*","Q24.513","T81.700x203","Q26.800x002","I15.900","Q27.817","T82.000x002","T82.002","S75.200x001","I21.200x029","I80.001","Q27.200x002","I45.401","R94.300x007","I77.603","I45.900x002","I49.300x005","Q20.802","Q26.800x004","T82.100x005","T81.700x005","R57.101","I08.104","I74.502","S25.101","I49.800x007","I74.307","I80.800x006","I45.601","I95.101","Q25.000","I35.804","I08.100x005","Q25.700x006","I74.301","I36.000","I72.000x321","I49.501","I06.100","I08.000x002","I08.006","I77.100x028","I51.304","I47.103","S75.700x001","I42.300","I71.000x023","A52.005+I52.0*","I80.100x003","S35.200x005","M31.600","I49.900","I22.800x016","I51.903","I71.901","I97.000","I27.000x010","I74.300x111","I10.x03","Q25.405","R94.301","Q27.306","I95.000","S85.100x001","Q27.303","Q25.200","I74.202","I74.300x121","I80.800","S45.300x002","I99.x01","T82.703","Q24.807","C75.500x001","I86.800x011","I33.004","I48.100x002","Q21.106","T82.800x009","D21.400x004","I31.300","S35.400x002","T81.703","E10.700x023","Q24.400","Q22.400x003","I23.800x001","T82.800x104","I08.100x002","I74.402","I42.802","T82.000","I72.501","S35.903","I77.125","Q23.800x008","I47.202","I70.010","A18.809+I32.0*","I71.100","Q21.000","I21.002","D44.601","I08.304","I27.200x016","I87.200x001","T82.808","Q85.900x048","J11.801+I41.1*","S75.000","I23.601","I77.202","Q25.402","I45.502","I21.106","I77.117","I72.811","Q24.506","I44.000","S35.203","I74.800x012","I77.129","I72.900","I21.207","I82.200x001","I70.206","I25.300x007","I30.000","I34.001","I73.100","I15.102","I97.800x004","I49.802","Q25.406","I33.900","Q22.301","I50.001","R55.x00x007","R94.305","S75.100x002","S35.700x004","I77.100x032","I13.200x001","I20.102","I34.000","Q27.800x037","S95.700x001","I44.302","I77.800x020","R09.800x081","Q26.000x004","I72.000x032","C49.300x006","T82.800x305","A01.000x016+I41.0*","I09.900","I70.213","I21.402","I72.400x130","I20.006","S26.811","I45.600x003","I71.000x008","I21.004","I33.000x006","Q26.500x001","Q25.100","I27.200x020","T86.300x001","Q23.800","I97.000x002","I49.403","Q23.801","I25.900","I35.000x002","I08.100x004","I71.000x024","I70.200x021","I95.800x001","I70.200x031","I77.604","I37.800","I72.103","I80.204","I72.200x003","Q24.602","I10.x13","I38.x00x002","I70.804","I51.800x006","I45.400x001","S85.500","T82.400","I08.301","I24.801","I72.100x004","I13.000x001","Q24.505","I20.800x006","I21.200x025","I77.300x002","I33.000x004","I74.300x123","I35.808","I42.902","I08.004","D48.100x024","Q24.512","E74.006+K77.8*","I45.000","T11.400","I51.703","I20.101","S25.700","R94.300x003","I82.800x005","I87.102","I72.303","T81.700x402","I50.900x017","I97.800x013","I70.812","I71.600x004","A52.004+I39.1*","R57.100","I80.201","Q27.812","I70.002","S35.500x001","I21.003","I50.000x005","A52.000x001+I52.0*","I83.905","Q23.901","S26.000x001","I77.800x017","D15.101","I77.100x014","I25.800x005","I77.115","I22.000x004","I09.100x002","M05.302+I43.8*","I87.805","I27.202","I74.500x009","S35.205","I25.800x004","Q22.600","D44.702","I45.901","I70.900x003","I38.x01","I80.300x005","I77.201","Q21.101","T82.600x001","Q27.307","I47.104","I34.100","I45.103","I45.101","I87.111","S35.500x007","I51.500x002","Q26.000x001","I28.000x003","Q23.900x001","S35.300x005","M10.004+I43.8*","I72.800x051","T82.100x008","I45.300","Q26.100","Q20.601","T82.100x014","I27.900x002","A38.x00x002+I41.0*","D21.400","I73.805","I71.900x004","T81.700x301","I51.400","Z45.002","I09.801","T82.302","I21.300x005","S26.801","I31.100","I74.802","I72.400x530","I74.300x113","C45.200","I70.209","I70.901","I51.000x001","I74.300x132","T82.804","I10.x00x007","I51.708","Q27.800x041","I42.701","R57.901","S65.000x001","I51.100x001","I15.800x002","I15.200x004","I77.800x002","I36.800x005","I08.000x006","I74.300x420","R57.800x003","S65.400","A39.503+I41.0*","Q27.800x034","E76.300x002+I52.8*","I25.402","S35.500x004","Q20.300","Q24.800x018","R93.102","Q23.101","I86.811","I09.200x003","I47.200x010","I25.901","Q21.300x003","I15.800x006","S35.701","I74.800x007","Q23.200","Q23.805","I49.800x005","I74.302","C49.402","I31.100x001","I21.213","I10.x04","I47.100x001","M05.305+I32.8*","S25.200x001","I80.207","Q27.815","I21.200x023","I70.100x002","I22.800x008","S35.302","I40.000x004","I74.501","I51.404","I77.100x005","I21.200x027","S35.300x001","I33.000x001","I70.207","I48.301","I73.903","Q21.205","Q27.200x003","I82.800x009","B58.800x001+I41.2*","I51.700x009","E11.500x021+I79.2*","T82.800x102","Q20.400","I77.108","T82.800x304","S25.900","I25.302","B01.800x001+I41.1*","E10.700x022","I24.000x003","I95.900","S25.001","I50.000x006","I71.101","D44.700x004","I51.900x001","S85.400x001","I70.000x010","T82.100x003","Q22.800x005","M05.306+I41.8*","I42.600","I44.400","R93.101","E10.502+I79.2*","I30.100","E14.700x023","I08.201","I77.127","I77.600x012","I10.x09","I70.218","I72.300x006","I40.000x007","I20.005","Q22.000","R00.001","I77.203","I86.802","I30.100x005","Q28.900","I28.800x008","I72.300x013","I80.902","I72.300x031","I27.100","I82.100x001","E03.900x004+I43.8*","I49.800x001","S35.300x004","I22.800x011","R93.100x002","I48.000","I33.000x020","I77.121","I33.005","A54.802+I39.8*","Q24.800","T82.800x201","B25.803+I41.1*","T82.800x410","I77.800x015","I72.400x132","I31.000x002","I71.201","I27.000x009","I42.905","I71.900x002","I10.x02","I78.900","I77.105","I80.800x007","C38.001","I27.200x002","I77.600x014","I77.011","S35.100x003","I15.101","S35.100","Q21.802","I12.902","I06.200","I20.801","T82.800x307","I27.200x005","I86.800x015","I36.801","S35.801","I24.003","Q26.902","I77.113","I72.400x113","I72.401","T82.100x013","I49.800x010","I74.800x001","I36.800x002","I46.100x001","I21.200x018","I97.101","I72.300","I72.100x003","Q28.200x007","I40.900","I15.200x001","I45.200","Q25.403","I33.002","T82.806","I72.100x007","I37.200","I97.800x016","Q26.400","T81.700x003","I72.002","Q23.200x004","Q25.400x010","I80.002","I71.402","I70.200x061","I50.104","Q27.800x042","I42.803","I21.200x010","I74.300x310","I20.000x004","I25.800x009","I77.601","Q21.300x001","I08.800x002","I25.802","T81.700x101","S26.810","I31.302","C75.400","I70.000x012","Q25.601","I34.200","I07.100x001","I23.100x001","I49.303","Q24.509","I42.901","I86.800x017","I08.100x003","I06.000","I45.804","I71.000x005","I71.204","I71.000x028","I74.005","Q21.800","Q20.500x001","I72.400x131","E10.400x311+G99.0*","I77.300x003","T82.800x003","I77.800x009","I08.300","I51.901","R00.100","I77.301","S15.700x001","I51.700x004","C38.002","I49.300x002","T82.800x004","I67.203","T79.101","I74.305","Q26.801","I08.000x008","S35.800x001","S65.401","I87.114","C79.800x863","T82.201","I33.000x007","I51.600x002","I37.000","I08.901","I25.902","I50.103","I71.000x027","I72.400x410","I50.900x019","I72.800x111","Q24.100","Q24.811","I48.100","I21.206","T70.200x007","I71.006","I20.003","I34.800x002","I74.300x233","S75.000x003","I05.000x001","I70.011","Q26.800x007","I38.x00x006","I10.x01","I72.300x012","I34.802","I82.800x003","S15.000x002","I77.008","R07.101","R94.300","T82.904","I72.304","C75.501","I97.900","I77.100x027","R55.x00x012","T82.800x308","S55.101","I72.003","I10.x00x002","Q21.100","I42.301","R57.801","T81.700x404","I24.100x001","I51.700x015","I70.900x007","I74.800x005","I97.803","Q27.800x033","I22.000x005","R01.200x003","T82.100x015","S45.001","I49.500","I22.800x007","I70.012","I15.103","T82.809","I34.900","I22.000x001","S65.000x002","T81.700x002","I50.900x002","I49.800x006","I25.401","S45.301","I07.000","I10.x08","T79.100","I21.001","I23.500x001","I51.700x007","I77.107","S45.701","I49.401","Q26.200x002","I49.101","I77.800x018","I71.000x007","D18.000x001","I42.800x004","A52.002+I79.1*","Q21.202","I51.900x003","I74.801","I72.400x212","D44.701","I27.000x007","I87.100x007","T82.300","I71.200x006","I25.300x009","I77.602","T82.801","I37.100","R55.x00x008","Q25.401","Q21.100x001","I72.000x033","M05.307+I39.8*","I49.800x015","I36.900","I42.900","Q23.200x002","Q24.601","E14.700x022","I28.801","Q21.206","I31.301","I47.108","I09.900x002","Q28.800x007","Q21.204","T81.700x201","Q26.901","I08.303","I77.110","Q24.800x017","M31.804","T82.811","T82.800x204","I74.800x010","I72.800x103","I74.300x112","Q26.800x001","T82.100x011","I47.100x004","I74.800x009","S85.200","I74.300x122","Q28.801","R57.803","I71.000x011","I08.000x005","I09.100x001","D18.000x822","I73.800x006","I08.103","I89.100x003","I09.200x001","I49.001","Q24.508","I72.403","I97.100x004","I07.200x001","I70.800x005","I49.800x016","I30.100x007","S75.800","I83.200x001","Q26.200x005","I47.109","I74.004","Q23.804","S35.900x001","T82.800x409","I70.110","I77.803","R94.300x012","I70.208","I51.700x014","I27.200x012","I50.900x001","I71.007","Q24.800x027","I72.400x112","I33.000x012","R55.x00x005","I80.206","I70.000x003","Q23.802","I50.900x008","B57.002+I41.2*","T82.800x106","Q22.802","I22.800x017","I82.203","T82.900x001","Q27.300x009","S45.900x001","I30.103","I70.200x004","Q23.400","Q26.000x003","R55.x00x004","I77.900","D18.000x841","Q21.203","I77.605","I72.800x061","I51.403","Q26.800x003","R94.307","I74.300x520","I82.302","I51.800x005","I05.200","I78.000","Q87.809","I05.000","I74.500x002","Q26.800x008","I74.500x012","I01.900","I25.400x005","S55.200x001","Q26.800x010","I33.007","I70.912","I71.902","D44.700","I21.200x022","I33.010","I70.900x006","I74.300x223","Q25.303","Q82.800x015","S09.000x001","I70.802","S26.010","I83.904","I77.100x029","Q25.704","I67.200x003","I74.303","S26.000x002","I10.x00x009","I30.900x003","I86.804","I72.405","I51.302","S26.800x021","I33.000x011","A52.006+I39.8*","Q24.507","I82.803","I06.900","S75.100x001","I47.200x008","Q27.809","I51.500x006","I71.003","B57.001+I98.1*","Q25.700x011","I78.102","I50.100","Q25.407","T82.100x012","I72.006","I50.102","Q87.203","I15.800x001","I49.200x001","R00.200","Q27.800x018","S85.700x001","I97.800x011","I22.100x002","I01.100","A52.000x007+I39.1*","I27.200x017","I22.800x004","Q26.302","I45.900x003","Q20.600x001","I51.704","I80.804","T81.701","T80.000","I70.000x007","D48.100x008","I21.210","I48.900x003","I89.007","I51.301","I49.402","S45.800","I21.200x017","Q25.300","I15.000","S26.910","A54.805+I32.0*","Q23.300x002","S65.501","I47.200x007","M34.800x009+I52.8*","I36.800x004","S85.100x002","D18.010","I72.400x213","C38.000x004","I72.812","Q25.705","E05.900x004+I43.8*","T82.800x006","I80.301","Q26.800x006","T81.700x204","I49.100x001","I24.001","Q25.302","I47.201","I30.801","T82.810","I50.900x007","R03.100","Q87.400","I97.800x001","I34.202","Q25.600","I22.800x001","I21.302","I73.901","R94.306","S26.800x011","I25.300x008","I20.808","I07.800","A39.501+I32.0*","I72.400x210","R94.303","I74.902","Q28.200x008","I72.813","N18.506+I32.8*","I87.103","I47.200x009","Q21.400x001","I87.100x003","I77.112","R57.900","T81.700x104","I51.700x006","I82.204","I71.000x012","I40.800x003","I71.400x002","I48.100x003","I51.709","I72.000x023","I77.005","I80.203","T82.800x103","I70.101","I80.300x006","I77.000x014","I77.104","I70.805","I35.801","I35.800x003","I72.400x420","S35.500x006","Z03.400","I25.800x003","R02.x00","I21.200x014","I77.123","I31.903","M32.105+I32.8*","S26.813","I83.001","I71.000x026","D44.700x002","I80.800x002","I42.201","I80.209","I72.400x520","I25.300x005","Q24.815","I82.900x001","I72.000","I08.000x003","I24.000x009","I22.800x003","I97.800x009","I70.000x013","I47.111","I80.103","I72.400x330","I15.800x004","I95.200","S35.401","T82.101","I48.300","S25.500","Q82.800x016","I74.800x008","I08.300x004","I27.200x018","I70.112","T82.803","I09.000","I70.200x065","D18.000x004","Q20.800x003","I82.802","I21.200x016","I70.200x005","I77.101","R55.x00x014","I71.200x011","I72.800x053","Q23.001","Q24.000x003","I20.004","I87.116","I72.001","I34.101","Q20.200x002","I77.007","I24.000x005","J10.800x003+I41.1*","Q21.104","I86.807","I25.800x010","Q82.811","I77.600x001","I70.810","I83.900x004","I70.910","I22.800x009","I77.800x014","R57.802","S26.800x031","I50.101","S35.102","D18.000x836","I74.300x210","I47.200x005","R01.100","I49.302","I70.001","S35.500x003","I77.802","A32.802+I39.8*","I24.002","D15.105","T82.202","A52.003+I79.0*","I35.200x001","I72.400","R55.x00x006","Q24.812","I40.100","Q23.000","T82.800x401","I83.901","I35.200","Q21.201","A54.804+I41.0*","I20.803","I80.302","I25.300x006","R94.300x011","J09.x03+I41.1*","I72.400x030","I45.600x005","S95.000","S95.200","I83.101","Q24.800x012","D18.000x835","Q24.300x002","Q24.900","T81.700x202","I21.103","Q26.300","R00.800x003","I77.800x008","Q26.301","Q24.800x025","I40.800x001","I87.106","S35.200x003","I40.800x002","I77.800x010","I47.100x005","T82.800x402","I33.008","S45.201","I74.300x230","A36.802+I41.0*","I80.104","I51.803","I08.000x009","I74.310","I42.401","I51.600x003","I87.100x009","I21.400x003","I40.000x003","R94.300x010","I77.801","Q22.200","I09.200x004","I23.000x001","T82.100","S95.800","T13.400","D18.000x005","I51.001","Q27.800x020","I72.404","I78.801","R55.x00x001","E14.500x031+I43.8*","S35.300x002","R03.001","I27.200x006","I21.200x024","I06.800x001","I77.500","I74.304","I77.600x015","I33.000x008","Q24.300","S45.000","I45.102","T82.800x404","R55.x00x003","I72.400x310","S35.901","S35.200x001","I10.x00x017","I87.117","T82.800x205","Q21.102","I42.100x002","I08.003","R55.x00x013","I82.900x004","I10.x00x016","I40.001","I45.602","I77.806","I77.006","I02.900x001","T82.500x003","C79.800x807","I72.800x101","T82.800x105","Q22.302","I46.000","E05.903+I43.8*","Q24.511","I82.801","I08.000x010","I77.106","I82.900x002","I70.204","A18.820+I39.8*","I42.801","A52.008+I32.0*","I42.800x006","R00.800x001","I74.200x007","S45.300x001","D15.104","Q27.803","Q24.804","T82.800x406","Q23.800x004","I35.807","I27.801","S35.400x001","Q20.100","I77.800x007","I83.102","I21.200x021","I27.200x019","Q23.100","I72.400x122","I70.203","I70.217","T82.500x002","I87.115","I07.000x001","I10.x05","C49.900x001","Q24.800x010","B57.201+I98.1*","Q24.501","I72.808","I82.202","I74.300x430","I51.502","I72.800x023","I44.500","S35.001","I25.300","I51.701","M32.104+I43.8*","Q20.000","I24.800x004","I47.100x014","T86.200x001","I10.x00x008","I45.800x004","I47.203","I11.901","Q23.300","I33.009","I97.800x002","S35.700x003","I42.904","I77.000x011","S26.800x083","T82.000x001","I86.813","I25.300x010","I72.000x012","R00.800","I72.201","I70.210","T81.700x105","I77.800x006","S35.301","I74.300x222","S35.500x005","I08.801","T82.800x005","T82.800x408","I49.805","Q24.805","I72.400x320","I28.800x007","I13.900x001","I15.200x003","T81.700x405","S85.801","I80.101","I47.102","I72.000x011","I82.800x004","E85.416+I43.1*","I70.211","I33.001","I80.202","B49.x15","I87.113","I42.800x002","I31.902","I77.800x011","Q27.100","I97.800x006","S25.100x002","I25.800x002","I87.104","I72.200","I72.000x031","I87.202","I15.100x001","I21.208","R09.800x082","I51.303","S35.402","I33.006","I86.816","Q25.700x008","I44.700","A52.000+I98.0*","Q22.500","T82.500x001","I27.001","I73.800x008","I77.100x031","I31.001","I49.404","E13.500x541+I79.2*","I80.901","I71.600x001","I70.200x062","T82.303","I74.101","I72.800x093","I10.x12","I72.800x121","T82.100x002","I34.800x005","I87.802","I08.008","T82.702","I25.800x011","Q25.800x004","I08.000","I36.100","S75.200","S35.201","I27.900","I28.800x003","T82.800x207","I77.800x022","T81.702","Q22.100","I31.101","I20.000x005","I42.800x005","Z45.005","T82.800x405","T81.700x004","I21.200x011","I83.903","I72.005","I72.900x004","I77.800x012","D44.700x003","I08.005","Q24.400x003","T80.100","I71.004","I71.000x016","I80.303","I77.600x016","S75.700x002","Q24.901","I50.900x016","I74.504","I42.100","Q24.809","I28.100","Q20.302","I50.908","I10.x00x015","Q24.808","T82.800x301","I30.100x008","I47.100","I25.300x012","I82.800x002","T82.800x001","S35.200x006","S35.202","I77.013","I20.900","Q26.500","E11.502+I79.2*","I25.800x006","S25.400","I47.107","R96.000x001","S35.000","I72.400x220","Q21.805","I22.800x006","I71.000x025","I15.200x005","Q27.800x007","I87.101","I87.900","I51.707","I77.800x021","I21.200x020","I73.902","T81.700x304","I40.000x005","I74.503","S75.901","Q82.812","T82.001","I47.100x013","T81.700x401","I72.100x005","Q24.510","I31.900x010","I47.900","I30.900","S45.101","I71.203","I73.802","T82.504","I22.800x018","T82.800x202","I49.801","N18.505+I68.8*","I72.300x003","T82.800x206","I20.806","I74.001","I35.101","Z45.006","B33.201+I41.1*","I87.100x008","I26.001","I71.000x029","I74.300x133","I31.901","I77.805","I87.112","I70.900x004","S25.802","I80.803","T82.800x302","I27.000x008","I33.000x019","I47.200x001","A39.504+I52.0*","I72.300x022","I70.000x009","I71.000x004","I86.801","I08.000x001","S35.200x004","I31.900x008","I72.400x230","T82.401","I08.100","I74.200x001","I72.400x233","Q25.404","I70.000x005","I24.901","I77.100x018","I71.401","R68.800x001","Q27.900","T82.900x002","I21.200x003","R00.801","I72.100x006","D15.106","S55.000x001","I25.800x012","I70.102","I24.000x004","I24.900x001","I74.300x131","S35.101","I77.109","I08.800x003","I21.901","T82.800x403","I74.800x004","I72.400x223","I33.000x024","I20.001","I72.800x042","I73.001","D48.712","T80.000x001","I08.200x001","I51.705","Q26.200x001","Q20.101","I42.500x001","I07.900x001","I51.501","A52.000x006+I39.1*","I22.800x005","I25.500","R07.400","T86.300x002","I50.900x010","I97.800x008","I08.002","I48.401","I08.900","Q23.803","I77.800x016","I30.101","E85.408","D18.000x837","I25.400","I72.805","Q27.800x008","Q23.200x003","Q27.001","I50.906","T82.502","I35.805","I72.901","I47.110","I77.000x015","I42.200x002","T82.903","I71.205","I24.800x001","I08.300x007","I77.103","B57.202+I41.2*","I72.305","S85.900x001","R93.103","I86.814","M32.109+I39.8*","I28.800x005","I50.900x014","I21.900","I24.000x010","I08.300x001","I86.805","I21.200x030","I74.300x212","I77.600x004","I45.600","Q22.800x004","I72.200x001","I72.400x121","I73.800x007","Q21.300x002","I09.802","I42.800x007","I44.201","E74.008+I43.1*","T82.814","I28.900x001","Q25.700x007","S95.100","I71.600x005","T81.700x308","I72.600","A18.821+I41.0*","D15.102","I30.100x006","I47.200x006","S35.800x002","I74.500x007","I34.803","D48.711","T81.700x102","I77.012","I10.x14","I20.807","I47.101","I44.200","I08.200x002","I50.105","I70.200x064","T82.800x407","I25.103","I73.803","S75.000x005","I27.200x021","I77.014","Q24.814","A52.000x011+I39.0*","I08.306","I74.200x004","I24.800x007","I45.801","S75.900x001","I02.900x003","I27.201","I08.305","I33.000x022","Q25.702","I74.300x320","I22.100x003","I51.700","I51.800x004","S35.300x003","T82.800x101","E13.500x241+I79.2*","I70.800x006","Q25.700x012","I33.011","I48.900x004","Q27.308","I47.200x014","I21.401","I77.600","I08.800","Q24.800x014","T82.301","Q21.103","I47.204","Z45.003","S85.300x001","I72.814","I87.110","I10.x10","I74.201","I44.601","I22.800x015","S35.902","I72.400x133","I72.800x151","I08.009","I74.901","I33.000x021","I38.x00x005","S25.301","I08.102","I21.200x015","T81.700x302","B33.200x001+I32.1*","I22.800x010","R55.x00x002","I82.805"};
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

        if (record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
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

