package drg_group.suzhou_2023.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.suzhou_2023.Base;
import drg_group.suzhou_2023.MedicalRecord;
import drg_group.suzhou_2023.ADRG.*;

public class MDCG{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"D17.500x003","I72.800x142","Q45.300x103","K31.810","K60.100","K66.800x008","T28.200x002","K91.302","B46.200x001+K93.8*","K56.203","A03.000x001","E16.400","K38.801","K62.901","A05.300","K52.203","K62.800x001","K63.200","E73.900","K40.401","K92.000","K27.200","A04.900","K55.100x008","C16.803","K28.500x001","D12.200","E14.400x340+G99.0*","K21.900x003","C16.902","K43.303","Q39.900","K64.500","K57.900","Q27.810","C16.500","K60.302","Q41.903","D37.301","D00.200x003","C18.900","K20.x03","K22.000x001","C16.804","K46.900x003","K42.100x001","A04.300x001","K59.200x002","K57.801","Q43.809","T28.702","K64.100","K31.400","R19.200","Q39.100x011","I78.802","Q40.200x004","K91.818","K41.000","K63.401","A04.401","K36.x00x004","A08.400","K56.401","K57.102","M32.115+K67.8*","K29.300","K92.901","K31.604","K22.000x002","K52.914","K56.500x003","Q43.800x019","I86.812","K63.900x002","K92.206","K91.831","K63.105","K55.202","C78.502","D20.101","K27.500x002","K51.001","Q43.300x901","K59.801","Q43.806","R19.300","D20.000","C78.802","K64.402","A09.003","K25.902","D17.700x027","A04.600","Q42.200x905","K31.800x801","K36.x00x003","Q39.501","C16.200","K57.500","K90.002","K62.821","Q40.000","C18.700","Q41.102","K65.804","K31.603","K40.303","K62.806","K22.808","R85.300","C26.000","K55.105","D37.203","K46.900x002","K57.300x006","S36.601","A03.900x002","K21.901","K57.800","R10.103","S36.810","K63.803","K63.000","K91.819","B77.000x001+K93.8*","K60.301","K62.815","K41.400x001","C18.000","A09.900x006","K29.606","C78.602","D48.402","K65.003","K50.104","K64.401","Q43.803","D48.401","A18.313+K93.0*","E10.400x340+G99.0*","K31.809","A18.800x014+K23.0*","K63.817","K57.202","Q40.200x010","C78.803","K64.200","T18.500x004","K55.300x001","K38.800x004","E73.000","Q43.200x002","S36.401","K91.100","K62.300x003","D00.200x002","K62.903","K55.106","C15.400","K64.809","D37.100x001","D13.200","K45.807","K63.900x005","D48.700x004","K65.006","K90.000x001","K38.200","A18.305+K93.0*","K57.201","K40.312","K38.000x002","Q45.300x104","C18.200","E16.401","I72.807","K63.819","Q39.800x903","D37.202","Q89.302","K56.200x011","Q79.200","A00.900x005","K22.800x003","D17.700x022","K63.208","Q42.903","D01.404","K22.103","K45.806","K62.400x002","K91.404","K52.912","K27.700x001","K63.102","K55.201","K91.834","K50.001","K63.901","Q39.600","K64.801","K52.201","K46.902","D36.700x014","C18.800x002","K51.500","S36.801","K26.501","K31.502","K62.804","S36.800x022","D12.603","A18.300x016","K43.304","Q39.300","R85.000","K26.600","K29.001","C48.100","K46.000","K22.201","Q89.300","K55.013","B49.x00x002","S36.701","D01.401","K63.814","Q43.004","R93.300x001","K92.209","K62.808","D37.702","T18.100","K27.500x001","C77.201","K51.201","Q89.300x001","K51.901","A04.902","K63.900x003","K40.900x004","Q39.100x021","D12.400","K42.900","S36.802","B37.805","K22.300","K91.303","C16.900","K91.800x117","K56.400x003","S36.500x092","A08.402","R10.400x002","S36.600x003","K90.401","R10.000","K62.902","K66.806","Q40.209","K91.405","D13.900","K90.402","R93.500x001","K90.400","K91.300x002","S39.909","D37.710","K50.103","A04.200x001","K59.100","K62.501","K35.301","K64.811","Q79.201","K31.802","K65.011","K29.101","D37.403","K91.837","K22.207","K62.100","K52.903","K63.818","K91.842","D37.501","K29.601","K43.000","Q42.200x902","K65.005","C78.400","D20.100","K31.815","K52.204","C45.102","A00.900x002","K63.301","C19.x01","K66.809","C15.800x004","A08.000","K63.400","K29.603","C78.500x008","K57.302","C26.800x002","K26.500x001","K59.900x002","K91.402","K50.800","Q40.100","K22.600x001","K63.107","C76.200","D48.301","K50.000x001","K22.200","K66.800","K25.000x001","K29.802","K40.309","Q42.302","K56.200x003","K64.900","Q40.900","D37.400x002","C18.803","K20.x02","E10.400x350+G99.0*","K25.500x001","K62.802","K90.400x003","Q41.203","C77.207","I86.400x001","Q39.601","Q43.602","Q41.902","C26.900","K22.900x001","K59.900x001","A07.300","K52.104","K91.000","E11.406+G99.0*","K43.001","Q43.808","D00.200","Q40.205","D18.000x859","K31.702","K51.302","K26.401","A18.318","K65.800x001","A18.302+K93.0*","K25.700","K66.807","K65.906","K22.813","K57.000","I89.006","K25.501","D48.129","S36.500","B82.901","K25.401","K31.807","Q79.301","R10.401","K57.301","C16.802","A18.310","R85.100","K50.900","K65.905","T80.200x001","K22.203","D17.500","K28.400x002","K27.500","K64.804","K65.010","C21.100","K91.812","K40.900x001","K52.804","A05.400","K41.301","K56.701","K63.100x001","S36.301","S36.813","K60.401","A03.900x009","C16.001","K65.801","T28.701","K22.804","A52.710+K67.2*","K50.002","S39.905","A09.904","A04.800x010","K29.600","K91.808","K22.800x011","K52.001","A74.801+K67.0*","K22.100","D37.201","K62.814","K56.503","K57.108","K64.300","R14.x00x006","A07.900x001","K55.000x005","K90.801","K20.x00x006","K63.203","K62.000","K55.002","Q45.300x102","K65.900","I89.803","K63.502","K22.401","K63.206","A04.801","K25.001","D01.100","R85.500","K51.002","C21.801","A04.500","K92.800x011","K55.001","K63.804","C17.100","D01.403","K92.200x005","S36.901","K40.310","Q39.802","T28.100","Q40.204","K66.802","K55.800x003","C78.403","D37.707","I89.800x006","R19.500x003","Q43.100","K31.703","K31.818","K63.306","K45.000","D48.700x005","K58.300","D17.500x007","K22.208","K91.800x007","K63.805","Q41.103","K66.100","K50.101","K50.801","A04.800x006","A18.312+K93.0*","Q39.100","K63.302","K56.602","D37.200x004","A05.200","S30.102","Q43.201","K90.404","K52.000x001","K63.501","A03.200x001","Q85.906","Q42.200x903","D18.000x041","K22.809","D37.700x002","K52.801","K31.816","A03.900x008","K65.002","S36.500x031","K91.813","Q42.000x301","K31.808","K62.819","K91.800x602","K66.103","K62.801","K31.819","D00.100","D48.400x002","A04.800x007","C18.900x001","K26.900x002","K61.300","I86.800x014","K65.807","D48.300x001","A04.802","K31.905","Q41.202","K91.821","T18.200","K62.001","T18.400","K55.003","D17.500x008","Q41.800","K38.900","D17.701","Q39.803","A00.100x001","K57.107","K46.905","Q44.500x008","K40.400x001","K22.400x003","I85.900x001","K31.500","A04.000x002","D37.503","Q43.812","D17.500x004","K35.800x001","K55.005","D12.500","K62.800x021","Q43.002","K62.809","K31.820","A18.812+K93.8*","K41.300x003","K63.807","Q43.003","K66.000x007","Q43.800x017","K37.x00x002","K91.800x116","C15.800x003","K92.210","K91.824","K51.401","K56.604","K52.103","K55.006","D18.000x046","K31.601","K63.815","C45.100","Q43.001","K22.700x001","K31.812","K62.500x001","K90.100x001","K63.503","K66.000","S36.500x093","K27.503","C76.304","S36.700","A18.300x015+K93.0*","K63.801","K63.403","K61.002","K91.200x002","K40.903","Q43.800x012","K64.901","K50.000x005","K57.400","K56.603","K90.000","K62.601","K22.204","C78.800x005","K50.000","C78.800x014","D37.402","Q43.403","C15.100x004","A09.001","Q79.300","K50.800x001","K63.205","K66.805","R10.000x004","K55.004","S36.404","K46.100x001","D18.000x045","I72.816","K60.000","Q43.404","K63.305","K46.002","K22.801","A18.308","K27.901","K56.501","K40.900x003","K63.103","K55.012","K40.402","K57.105","K66.901","K21.902","S36.412","I86.400x004","A09.004","C17.900x002","K62.400x004","R19.100","K55.011","R14.x00x003","K59.003","C16.900x003","K91.836","K59.800x002","K62.820","K64.805","A00.900","Q42.001","K25.400x002","C78.402","K56.200","K55.102","S36.500x091","K65.805","Q42.000x101","C78.600x004","C78.500x004","A03.900x005","K27.400x001","A08.101","K91.800x206","Q43.804","K44.901","K43.400","D09.700x002","Q43.900","K28.600","K29.100x001","I88.105","C78.601","K62.800x012","D12.602","K44.000x002","K31.821","K46.100","A04.600x001","D36.901","R19.100x002","K63.806","R19.200x002","K91.300","C18.901","Q79.500","D13.101","K51.800x001","A18.300x013+K93.0*","K66.102","R58.x01","K91.804","K31.300","K37.x00","C21.101","K25.200x001","K45.100","C18.600","K52.918","D37.901","K62.700","K22.601","K62.800x005","K91.102","D12.000","K61.101","S36.310","C16.600","K63.211","K25.000","K22.101","K91.408","K66.808","C78.505","D37.502","K55.000x015","K31.813","K64.803","K64.810","A18.314+K67.3*","K61.000","K52.800x003","K43.003","K55.100x005","D01.301","Q40.003","A05.000x001","K52.802","I72.802","K41.302","C17.801","K66.005","A08.301","K66.800x009","K29.605","A03.300x001","K22.805","C79.809","C78.501","D37.207","C26.800x003","K31.101","K55.801","D37.409","K40.300","K55.900","D48.713","A04.800x001","A04.702","D12.300","K65.000","D18.012","D12.302","K52.101","K29.400","Q40.002","Q42.200x904","A07.000","K63.204","S36.900","K51.903","D01.200","K66.810","K22.901","K38.800x003","A18.807+K23.0*","K91.800x412","Q42.901","K52.202","Q43.402","K91.800x103","K60.300","C20.x00x003","C45.700x002","Q41.002","K62.200x001","D37.404","D18.000x040","I72.800x132","S36.400x095","K56.600x005","C18.802","K63.303","K45.003","I88.000x003","K92.208","Q42.000x501","Q40.201","K28.500","A09.002","K91.811","C18.500","K90.900x002","S36.400x091","Q43.805","K31.806","K38.800x001","D13.302","K25.903","D01.402","K91.103","K61.001","C17.800","K27.900x001","K63.214","K46.101","K38.000","K27.900x005","K65.014","K29.600x006","K40.313","A09.901","K26.900x001","K90.001","B87.800x002+K93.8*","D13.303","K62.401","K55.101","K29.801","T18.801","K92.800x005","T28.700x002","A05.200x002","K63.812","K29.000","K21.903","A03.100x001","K22.209","C15.900","K56.400x001","C16.000x003","K40.900x005","K31.600x004","K43.700","A18.300x006+K67.3*","K55.902","Q85.913","Q42.200x901","D37.400x001","K40.304","K40.907","K57.002","C78.800x013","K31.102","K43.004","Q43.807","R19.500x002","K56.700","K56.202","K91.301","C48.000","D37.708","K55.200x013","R15.x00","I72.800x131","K91.401","D48.400x003","R10.101","A09.007","K91.810","K91.832","K90.200","K31.100x002","Q39.602","I85.000x001","K25.900x001","S36.300","K20.x01","K40.906","A09.900x004","A09.000x003","K43.900x001","K38.100","K90.100x003","D37.411","K66.811","K91.829","K63.500x084","K59.800x005","K58.801","B66.501","K56.700x003","K27.600x001","R19.500x004","D36.700x018","E16.400x003","K27.900x002","K27.902","K51.303","K27.000","K45.801","K91.100x001","Q39.800x904","R19.400","K63.200x008","S36.403","K92.800x004","K52.000","K31.800x802","Q43.801","K91.800x501","K91.800x111","R85.400","R93.300x003","K20.x00x001","A09.903","K63.213","R93.303","S36.600","K40.100x001","K31.800x806","C48.201","K63.802","I77.400","D17.500x005","Q40.200x005","I72.801","K64.802","Q42.002","K56.001","R93.300x004","A09.006","D17.702","K40.203","C77.106","K29.501","K65.902","I74.800x011","E14.400x330+G99.0*","K31.606","K91.815","K43.200","C18.400","K31.800x808","K40.311","B37.800x091","Q42.800x003","K90.802+M14.8*","K62.800x010","M34.800x006+K23.8*","K62.813","K60.403","K25.901","K43.604","K65.800x002","D13.301","K66.007","K60.500","T18.501","K62.803","K63.001","K92.202","A18.304+K93.0*","K57.103","C18.300","K40.308","K62.602","C45.703","S36.501","E84.102","I86.400","Q39.800x905","D18.000x043","K22.815","K40.000x001","K91.305","K63.809","D37.102","K40.302","C20.x00","A07.200","Q41.104","K55.900x004","C17.300","K41.200x001","R10.400x004","D37.700x007","K63.207","R19.501","K28.300x001","K59.200","Q43.800x014","D37.401","K66.008","Q43.500","A03.901","K38.802","K60.303","K27.500x005","E10.400x330+G99.0*","K51.900","K52.803","C15.200","K29.800","A60.102+K93.8*","K31.200","A04.901","K52.910","K27.300","K65.012","Q43.802","K45.804","K20.x00x003","K64.806","I86.800x022","Q41.101","D01.900","K27.401","D37.200x002","K62.822","K35.201","A03.902","K57.800x001","Q42.000x201","K31.701","K65.016","A07.100","K51.400","K26.200x001","C16.301","R10.301","D18.000x838","K28.901","K65.001","D12.301","K91.201","D37.100x002","Q40.300","A08.300","T18.300x003","Q41.201","K40.307","Q43.101","K42.902","D48.121","K62.201","K36.x01","K46.900x004","D13.000","A03.904","C16.402","A05.900","C15.500","D13.900x003","K31.000","K65.901","K63.108","B37.804","D18.000x042","K55.100","C18.001","K43.500","C17.000","K91.805","K59.400","K40.301","K31.902","K65.000x014","K29.600x007","Q42.101","A18.306+K93.0*","K43.603","Q43.104","K22.400","C78.804","C78.800x010","Q89.301","K56.601","K57.106","K55.010","S36.500x011","K57.401","K29.700x002","K44.000x001","C48.200","C78.401","A09.902","I89.800x019","K42.001","Q43.800x008","K63.902","M32.112+K93.8*","A00.900x004","D12.901","K26.200x002","Q85.900x002","K66.200","I85.901","K62.807","K52.902","K29.900","C17.900","K91.406","K57.305","Q85.900x036","S36.500x021","D12.100","D12.001","Q41.003","K63.209","E16.402","C15.300","Q42.800x002","K26.400x003","K64.000","C78.801","C26.901","K41.300x002","Q43.800x018","K64.807","Q43.105","T18.301","D37.607","K45.002","R85.800","K40.002","E14.400x370+G99.0*","A09.900x007","A04.400x004","D37.900x001","C19.x00","K57.003","K57.900x001","A18.317","D37.206","K62.202","K22.812","K62.600x002","C48.800","K55.000x011","K58.100","K62.811","K66.004","B37.806","K55.800x004","A07.800x002","C45.705","K90.100x002","K31.904","A03.900","S36.411","K56.201","K59.000","K63.900x001","K92.800x003","K52.102","K45.802","K31.100","Q41.001","A07.801","C15.100","K43.100","K90.901","A04.700x002","K65.008","A08.401","K43.605","R19.100x001","K40.901","D17.500x009","K91.820","A04.701","K46.001","D17.700x017","D48.714","K56.300","K31.811","K65.013","K62.400x003","K31.814","K91.835","Q43.800x006","K51.000","K59.002","K91.800x702","C16.801","K40.905","K91.800x106","Q42.802","K62.200","K63.210","K90.300x001","K63.212","K63.307","C21.802","K22.807","A49.809","K26.001","K26.300","K40.201","K62.812","S36.414","K31.104","D37.200x001","D37.407","K51.203","D13.902","K26.701","D37.205","Q42.000x401","D37.101","Q39.400","K45.808","K91.800x601","D37.701","K91.800x102","C21.800","K65.803","K31.602","A04.700","A05.202","C79.800x834","D37.405","S36.511","K21.001","K25.100x001","K63.215","K65.904","K91.830","E73.800","C17.200","K46.900x012","K43.902","K45.805","K28.900x001","A18.307+K93.0*","Q43.103","K40.902","S11.202","K52.909","K52.904","K60.402","D12.601","D13.304","C78.809","A00.900x003","D48.117","K91.828","T18.502","R19.800x001","K27.502","A08.200","K63.201","K55.200","K91.202","K66.201","K30.x00","K22.202","S36.812","K65.009","Q40.206","Q40.208","T28.200x001","K62.817","K59.301","K40.314","K31.901","K36.x02","A07.300x002","K90.403","K92.203","K46.900","D19.100","K40.200x001","S36.400x093","D18.000x801","K22.806","K46.901","K40.001","K22.301","R14.x00x007","K63.402","K30.x00x001","K91.803","Q40.207","K27.400x002","R19.600","K63.101","K31.605","C16.800x003","K56.600x001","K35.300","K31.609","S36.405","K27.100x001","D48.403","K28.700","K52.901","S36.611","C26.800","R14.x00x001","Q43.401","K62.810","K20.x00","K43.602","C26.800x001","K46.903","K55.901","E11.400x350+G99.0*","D36.700x019","K40.202","Q43.810","K27.600","K65.903","K40.900x006","K62.402","K66.006","D36.707","A09.900x003","K29.200","K40.305","C16.903","A03.800x001","Q43.700","K55.007","D18.000x825","K63.500","Q39.200x011","K31.600x005","K43.002","D37.500x002","A05.000","K58.800","K92.204","K63.200x003","A04.100x001","C15.802","K66.803","B82.000","C48.105","Q42.902","K63.308","K26.000","A03.900x007","K91.816","K45.800","D36.708","A18.316+K93.0*","K31.103","Q43.301","K51.300","T98.300x001","C77.200x001","K91.101","K51.902","Q79.400","K64.501","K31.608","A05.400x001","I72.815","K92.800x001","R85.700","K56.600x008","C45.101","Q45.801","K40.904","C16.000","K90.406","K51.003","D37.300x001","C78.500x006","K60.400","K29.500","C18.801","K22.500","K59.400x002","Q43.901","S36.814","K27.400","K91.814","K40.315","C15.801","D37.606","K59.200x003","K27.400x004","K63.500x002","K43.302","K25.000x002","E85.417+K93.8*","K91.817","R14.x00x002","C15.000","K92.100x001","K40.102","K31.903","K42.901","Q43.800x009","K41.900x001","T18.900","D12.700","D37.709","D37.500x001","K91.839","Q79.501","I89.005","K28.200","K59.303","K62.818","C78.504","A00.000x001","K29.604","K63.202","A08.500","B82.900","I89.801","K50.102","K57.104","K29.701","K62.301","D18.100x001","K52.200x004","D37.408","K61.100","S36.811","A03.800x002","C15.800x002","Q42.301","K63.813","Q39.801","K46.000x002","K26.100","K92.800x007","K62.805","A08.400x003","Q41.901","Q43.800x015","R12.x00x002","K25.600","K66.003","K63.810","D37.200x003","D12.000x002","C16.000x004","R12.x00","Q43.811","R10.102","S36.500x041","K65.017","A04.803","S36.910","C78.503","K55.000","J11.800x002","K28.401","R85.200","K61.400","K27.501","K91.802","K64.400","C15.100x003","Q42.201","K60.200","K22.802","A18.315+K93.0*","K57.200x001","K62.816","K55.100x006","S36.402","T28.600","A05.800","E10.400x370+G99.0*","K52.911","K65.802","K31.501","K25.400x001","K51.301","K92.800x002","K60.400x003","K90.200x001","K40.204","K31.804","K51.200x001","R10.402","I86.401","K22.206","C78.603","K56.101","K63.816","K61.200","D12.800","D13.100","D01.405","A18.300x009+K93.0*","K43.301","Q42.202","S36.413","K65.806","C18.100","A18.300x014+K93.0*","K31.801","D12.900x001","D37.406","C77.208","A54.807+K67.1*","A05.300x001","K66.101","K41.100x001","K55.009","K44.100x001","K66.801","K58.200","K92.200x001","Q45.300x105","C16.800x002","Q45.900","I88.001","K64.808","A18.303+K93.0*","C45.700x005","K52.907","K65.015","K63.104","K59.401","K51.202","K91.809","B49.x16","K40.306","K52.908","K90.405","Q39.000x001","D37.700x001","K43.900","Q40.202","I72.800x063","D37.410","K92.207","K22.803","K62.800x017","A03.903","K55.008","K35.200","Q42.803","Q42.102","A08.100x001","K55.300","K55.103","K29.700","A18.309","C48.103","C21.200","Q43.106","I86.400x002","K44.900x001","K57.100x005","K22.814","K66.001","Q85.902","K28.100","C16.002","K55.000x010","K62.800x009","E14.400x350+G99.0*","K55.104","C15.900x003","K40.900x002","K52.917","S36.803","D37.100x003","K43.601","R85.600","Q43.102","A09.005","C16.100","D20.102","Q43.200x003","C16.800","K63.304","A09.000x006","K92.201","K57.101","K91.833","K28.900x002","Q42.801","K40.101","K91.900","K56.000","K42.000x001","K22.102","K31.803","D12.600","A09.000x001","C16.400","C15.100x002","K29.602","K59.101","K62.300","C48.104","K22.205","K31.805","Q43.200","C15.800x001","K22.811","D01.000","Q43.601","D37.103","K25.300x001","E11.400x330+G99.0*","B77.001+K93.8*","K62.100x002","D37.204","A05.100","K66.812","K59.302","K65.004","Q43.300x201","K28.000","K55.100x001","K92.205","Q43.000","K63.216","Q51.702","C20.x01","K56.102","A18.311+K93.0*","K38.300","Q40.203","D01.300x001","K29.608","K56.100","Q40.800","R19.000x005","K66.002","B49.x12","K52.919","T18.300","K63.504","E11.400x340+G99.0*","B49.x17","K91.801","K31.607","C21.000","K28.600x001","A04.800x003","Q39.800x201","D17.500x001","K57.303","K57.001","K57.304","S36.400","K52.300","C16.401"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCG入组条件，匹配规则：主诊断匹配");
        String result;

        result=GB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GB2.group(record);
        if (result.length()>0){
            return result;
        }

        result=GC1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GC2.group(record);
        if (result.length()>0){
            return result;
        }

        result=GD1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GD2.group(record);
        if (result.length()>0){
            return result;
        }

        result=GE1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GE2.group(record);
        if (result.length()>0){
            return result;
        }

        result=GF1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GF2.group(record);
        if (result.length()>0){
            return result;
        }

        result=GG1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GJ1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GK1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GK2.group(record);
        if (result.length()>0){
            return result;
        }

        result=GK3.group(record);
        if (result.length()>0){
            return result;
        }

        if (record.ssList!=null && record.ssList.length>0 && Base.contains(Base.SS_VALID,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合GQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "GQY";
        }

        result=GR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GS1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GT1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GU1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GU2.group(record);
        if (result.length()>0){
            return result;
        }

        result=GV1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GW1.group(record);
        if (result.length()>0){
            return result;
        }

        result=GZ1.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCG的ADRG入组条件");
        return "";
    }
}

