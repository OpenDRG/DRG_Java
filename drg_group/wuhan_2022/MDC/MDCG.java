package drg_group.wuhan_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.ADRG.*;

public class MDCG{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"C16.804","K91.101","C15.500","K91.300","A06.100x002","K61.100","K90.000","E11.406+G99.0*","S36.500","K91.842","A04.900","C26.800","K63.210","D13.900x003","A09.900x003","S36.501","D12.301","K91.804","K55.001","K90.406","K42.902","C21.101","A09.001","Q39.800x905","Q43.800x009","T18.500x004","K41.300x003","B05.400","K64.900","K59.000","R93.303","C48.101","D01.200","B76.901","K64.802","K25.000x001","K65.002","K65.805","R85.100","I86.400","K62.201","K22.400","K59.200x003","K37.x00x002","Q40.205","Q39.802","C19.x00","K65.000","K92.800x004","K50.000x001","K27.900x001","D18.000x046","D18.000x801","R15.x00","K65.006","K31.600x005","A02.002","K62.602","A03.100x001","K29.101","C21.200","D37.701","C19.x01","A05.300","D37.409","K31.903","K52.200x004","A08.500","I78.802","K56.200x003","Q45.801","R19.500x002","A08.402","C18.803","K55.101","A08.401","D01.403","K62.601","Q43.602","K50.102","C16.400","K26.000","A00.900","K90.404","K40.900x002","K91.833","K40.902","B67.907","D37.301","Q39.801","Q42.200x901","K51.903","A08.100x001","K63.502","K31.502","K40.310","D37.901","K27.500x001","K52.903","D18.000x838","K55.105","S36.601","K31.607","E73.900","Q79.200","K91.800x501","K91.803","Q40.000","C77.208","K66.802","K66.800x009","K65.010","K60.403","D37.501","D12.400","K52.914","K25.501","K22.802","K22.201","K50.801","R93.300x004","I89.803","C18.600","K66.004","K92.200x001","K57.001","K62.822","K22.700x001","K56.604","A18.310","Q43.800x006","K59.900x002","D37.201","A18.307+K93.0*","K55.800x004","K46.001","K31.800x806","K63.304","K40.400x001","Q79.301","C18.802","C26.800x002","B81.800x001","K31.702","K28.900x001","K52.904","K91.830","C45.102","I86.812","Q40.200x010","K40.200x001","S36.500x041","K91.300x002","S36.413","C17.801","K22.814","K20.x03","K51.901","C78.402","K62.818","C18.901","K90.900x002","K63.307","K55.011","Q42.800x003","K91.405","K27.902","C16.402","E73.100","K43.001","A04.100x001","K52.104","K91.802","R19.500x004","K91.820","A21.300","K22.601","D18.000x825","K31.818","D12.900x001","K91.201","K40.302","K55.006","K90.100x002","K55.100","K63.900x003","Q42.301","K91.829","A04.702","K91.816","D12.700","K30.x00x001","K65.900","K36.x00x003","A18.303+K93.0*","C78.401","B82.000","T98.300x001","K55.009","K43.004","K63.818","D17.700x027","K29.601","K64.500","K64.805","K63.211","Q43.800x019","K22.207","K90.002","K29.001","K62.801","K62.803","Q85.900x002","D12.100","I88.000x003","K62.000","D00.200x002","K91.302","A03.904","K66.101","K57.301","K60.500","K63.209","D37.102","A07.900x001","K65.801","K40.303","R85.400","K63.807","A07.300x002","K57.900x001","A00.900x005","K90.200","K91.824","K63.201","D37.402","Q43.700","K62.400x003","A08.300","D13.902","E11.400x350+G99.0*","N88.803","A05.800","D37.202","A18.302+K93.0*","K51.301","K90.200x001","K26.300","K38.900","A09.007","K55.104","K63.105","K22.812","K40.000x001","K56.603","K56.100","K27.200","Q51.702","K51.800x001","K26.001","K31.606","K31.609","A00.900x002","A51.100x001","D48.121","K65.004","K45.800","Q43.800x018","K59.800x002","A02.000","A07.100","K51.202","K41.900x001","K63.200x008","K31.808","K65.903","A09.900x006","D37.408","K91.402","K92.202","K92.800x003","A05.200","Q43.900","I89.005","A54.807+K67.1*","C16.902","S36.813","E14.400x340+G99.0*","Q39.800x904","D37.203","R85.800","D01.402","K55.200x013","K51.500","K92.801","K20.x00x006","K65.803","K22.801","K64.100","K29.900","Q41.202","E14.400x330+G99.0*","K25.401","A09.000x003","Q39.501","K36.x02","C17.800","K52.300","A06.100","K52.000x001","K59.200x002","K29.300","D17.500x003","K50.103","K43.603","A09.900x007","A08.400x003","K91.812","K65.008","D12.602","K38.802","D12.800","K56.600x005","A54.602","C78.503","D13.303","Q43.105","R19.100x002","K21.902","K91.800x601","K62.813","K45.802","Q43.201","A06.800x002","C78.501","K59.400x002","K63.216","Q42.202","C78.809","K43.000","D37.403","K58.100","C16.002","A18.311+K93.0*","E16.401","K62.800x021","K59.101","C21.800","K29.801","B57.300","Q43.806","K38.100","K90.400x003","K25.901","K92.206","K91.837","K41.302","A18.800x014+K23.0*","K27.700x001","Q85.913","K59.900x001","K28.600","K64.803","B76.000","K56.503","A22.200","K57.305","S36.811","K62.806","Q43.300x201","A04.700x002","A05.900","R85.600","A18.300x014+K93.0*","Q39.602","K62.600x002","I72.800x063","K29.800","A02.001","K27.502","D13.200","K43.002","K66.812","K91.808","Q43.500","C15.802","K57.201","C45.703","K58.801","C15.801","K40.903","K40.101","K20.x00x003","K62.800x001","C78.804","A04.802","A09.000x006","Q42.800x002","K31.608","K63.817","Q40.003","Q43.401","Q42.801","K50.800","Q42.000x101","D01.900","D20.102","E16.402","K63.212","K31.807","A03.800x001","K31.300","K62.501","K27.400x002","D37.400x002","Q42.102","D12.000","K64.808","K66.805","K55.100x008","S36.400x093","K62.819","K21.903","B49.x12","K31.815","K62.817","C15.100x002","A03.900x008","K28.600x001","B49.x16","K61.300","Q40.900","K22.804","C15.100x003","Q43.803","C15.400","K66.002","S36.404","S36.403","Q79.300","K62.804","A18.305+K93.0*","K38.000","K92.208","K46.901","K55.200","K62.816","K63.302","K21.900x003","D18.000x040","K22.401","I89.800x019","K40.313","K28.401","K29.700","Q40.100","K63.809","T18.301","K31.901","K61.000","K40.314","K38.200","D18.000x041","I72.816","T80.200x001","K63.303","C17.000","Q85.906","K57.304","K52.800x003","K31.813","K91.303","K91.800x117","D48.403","K65.806","Q43.808","C18.800x002","B82.901","K45.808","K91.839","K43.003","K38.801","K22.811","K43.602","C18.400","K91.818","K66.800x008","C18.801","T18.900","K63.108","Q43.104","K22.815","K25.400x001","K63.305","C16.801","K92.204","K36.x00x004","K63.902","Q44.500x008","S36.411","K64.811","K26.100","S36.812","D36.901","K28.100","S36.400","I88.001","K61.001","K22.101","A04.800x003","D18.100x001","B66.500","K22.205","K25.902","K63.301","Q42.802","S36.400x091","C16.500","R10.000","K64.400","K56.000","K62.200x001","A06.000x001","Q42.903","Q39.100x021","C16.301","D37.410","B88.200x001","K63.100x001","A05.400","K91.100x001","R93.300x003","K41.400x001","K57.200x001","K63.401","K31.800x802","K92.210","Q41.101","A07.200","K56.203","A06.001","D37.200x001","C26.800x003","I88.105","K40.305","K65.017","K22.000x001","K63.215","K63.503","K92.207","K22.204","K20.x02","A09.002","A18.300x016","K57.101","K28.500x001","B81.300","K63.000","Q43.402","C16.000x004","K52.202","K62.300","K62.811","K66.100","S36.800x022","Q43.800x015","R19.500x003","K63.812","Q89.301","A07.800x002","K29.608","A22.200x001","A09.006","Q79.501","K51.000","K91.814","R19.200x002","K50.104","K40.901","K63.813","Q27.810","Q43.001","D12.603","K57.104","K92.800x001","C17.200","K43.303","R93.300x001","K55.202","K43.200","K64.300","A03.800x002","K56.001","D37.606","A04.200x001","E10.400x350+G99.0*","K66.803","K22.200","S36.511","Q41.102","D37.100x002","K55.900x004","K91.301","D37.404","K62.810","K63.806","A02.000x005","Q40.203","A09.000x001","I85.900x001","K28.300x001","K91.800x007","K62.100x002","C48.102","K63.306","K62.202","K22.209","K52.801","K52.102","D37.206","K57.303","E73.000","K92.901","C78.403","B37.804","K57.302","D13.301","K22.901","K26.501","C16.100","B81.400","K22.103","A02.000x007","R19.200","K57.000","K61.101","K22.102","K42.000x001","C26.901","K38.800x003","Q43.004","A07.000","K45.801","K25.300x001","K22.806","I89.800x006","R14.x00x001","S39.905","K57.103","D48.129","D17.700x017","K28.200","S36.500x031","A60.102+K93.8*","D37.406","K31.100x002","K91.819","K62.200","Q39.601","K63.805","K31.605","D12.000x002","K66.008","D17.500x009","A05.100","K63.308","A03.000x001","K59.301","A56.301","B46.200x001+K93.8*","K29.100x001","A04.600","K91.835","K57.800x001","K44.000x001","K22.100","K40.308","K60.401","D17.500x008","K40.102","Q40.201","K92.200x005","K64.401","A18.317","A08.200","K60.000","S36.803","E16.400","K21.001","K31.103","D37.407","Q39.900","D18.000x045","C16.401","K63.803","S36.402","K27.000","C45.101","Q89.300","C77.201","A03.900x002","S36.500x092","K55.013","T18.801","S36.611","K22.807","Q43.800x012","A01.000x008","C18.000","K52.902","K92.000","A18.304+K93.0*","S36.600","K52.908","K31.801","K65.906","C77.200x001","K57.801","R12.x00","K92.800x005","C15.900","K22.808","Q43.002","Q45.300x105","C78.505","K52.803","K57.400","Q45.300x103","K40.300","S36.500x091","K22.206","K51.902","K52.911","K26.900x001","Q42.002","K91.800x116","K63.403","S36.405","K62.800x012","K66.007","S36.500x093","K31.802","K63.214","K40.311","K40.301","R10.400x004","K91.810","Q41.201","K50.800x001","K59.302","Q43.301","K90.401","K63.204","K66.810","K65.001","K50.002","K22.301","K62.901","R12.x00x002","A02.000x006","K27.401","D01.100","K55.008","K60.402","Q40.207","D37.708","K65.005","E14.400x370+G99.0*","K57.003","K36.x01","K62.301","D37.100x003","R14.x00x007","A00.000x001","K91.831","A04.300x001","D37.707","K90.100x003","K66.103","C21.802","K27.100x001","K46.900x002","K55.000x011","K65.800x002","K43.301","K40.201","Q43.000","A02.000x009","K63.504","K56.600x008","K63.900x001","K60.400","Q40.200x005","C16.903","K22.800x011","K62.300x003","R10.103","Q43.102","Q42.200x905","D17.500x004","K65.807","K52.204","K52.912","Q79.201","D12.601","K29.200","K52.917","K31.601","K63.900x005","A02.000x010","K63.001","A18.318","I72.800x132","A06.200x001","K62.402","E16.400x003","K64.000","D37.103","Q42.200x904","E11.400x330+G99.0*","Q43.805","Q43.200x002","A09.903","K62.401","Q42.803","K27.900x002","K91.404","K46.000","K22.900x001","K44.000x002","K25.001","K40.900x005","K31.102","S36.901","T18.300x003","A01.000x010","K35.800x001","K63.402","K29.600","A00.900x003","K28.901","K52.001","K92.203","K45.807","C18.001","K62.800x009","K55.000x005","K55.902","A05.300x001","K26.900x002","Q41.903","K63.107","K65.902","K25.200x001","A05.000","K66.806","C15.100x004","E11.400x340+G99.0*","K22.803","K64.402","S36.401","Q79.400","K55.002","A08.000","K51.201","K61.400","K40.315","C15.800x004","K29.802","K62.821","K27.600","D37.405","K62.100","B81.801","C26.800x001","K91.800x106","K65.904","D37.709","Q79.500","D00.100","Q39.400","A18.309","A03.900","K57.900","Q43.601","K31.820","K25.900x001","R10.000x004","C18.900x001","K29.605","A04.400x004","A04.901","K50.001","A09.003","A54.601","A06.200","Q43.800x008","T18.100","K91.828","K59.801","K64.200","A04.800x001","K29.604","I72.815","K46.900x012","S30.102","K22.600x001","K22.800x003","C78.500x004","D37.207","K31.810","K66.005","B77.900","K55.100x001","D37.300x001","K27.400x001","A03.902","K43.604","A02.004","A03.901","K62.500x001","K63.900x002","K43.500","K25.500x001","K31.703","C18.700","D37.205","A03.900x009","S36.310","K35.301","C17.900x002","D37.100x001","C17.100","K52.203","K56.201","K57.202","B49.x17","D37.607","D12.600","R10.400x002","Q40.002","B82.900","K38.000x002","K51.900","K63.213","K51.401","K58.800","K91.202","A18.300x013+K93.0*","C18.500","K57.300x006","K55.000","K55.005","Q43.200x003","A02.003","K62.809","K38.800x001","K90.402","D18.000x042","K25.400x002","S36.414","K63.103","K31.812","K56.200x011","K31.501","K62.808","K45.100","K31.104","K57.108","K51.302","K56.700x003","K43.304","K51.400","B81.800x002","K55.100x006","K45.806","E10.400x370+G99.0*","K40.204","K56.602","R58.x01","K27.500","C78.504","K62.814","K59.303","Q89.302","K56.600x001","K28.700","K27.500x002","K91.836","A06.002","K52.907","I72.800x131","C15.000","K22.805","K63.814","B77.001+K93.8*","K50.101","K35.201","C78.500x008","B37.806","K91.408","C16.800x002","Q42.001","K57.106","K30.x00","A08.400","Q40.300","K55.201","A02.900x003","K40.002","Q45.900","K51.300","K63.500x002","K60.400x003","Q43.804","D48.117","K29.701","Q42.901","Q43.901","A04.700","K63.500","K65.804","C15.300","D13.302","K55.103","K27.500x005","A04.401","A56.300x001","K59.100","K42.900","K63.801","C16.001","S36.701","Q41.103","D12.302","K42.901","K40.900x006","K51.001","K42.100x001","K40.900x004","K60.303","Q41.104","K40.905","R19.100x001","K46.905","K63.101","A18.315+K93.0*","K50.000","K55.106","Q43.800x017","A18.812+K93.8*","D37.710","K45.805","K62.902","K63.816","D37.700x001","A04.800x006","A03.300x001","A18.300x009+K93.0*","Q40.208","Q41.002","K51.203","K63.400","K60.100","R85.700","E10.400x340+G99.0*","K52.103","K31.809","K66.201","C78.800x014","R10.401","Q43.809","C16.900x003","D17.500x001","S36.600x003","K31.602","K28.000","K91.834","K55.102","K57.102","S36.900","I86.401","K20.x01","K41.000","K22.203","C16.800x003","K91.200x002","Q40.202","C20.x00x003","K31.811","K63.104","B49.x00x002","C78.400","K90.000x001","R19.400","A09.901","R93.500x001","K63.202","I74.800x011","K56.202","K27.400x004","K92.800x011","Q41.001","C16.800","D00.200","K91.809","Q43.801","K92.209","K63.500x084","K22.400x003","C15.800x003","K40.900x001","R19.300","K92.205","Q42.200x902","Q42.101","K66.801","K55.300","A52.710+K67.2*","K91.817","A03.200x001","I85.000x001","K66.000x007","C17.300","K91.900","K92.800x007","K45.003","R10.301","K31.805","K62.400x004","K90.901","K27.400","Q40.200x004","K26.600","E85.417+K93.8*","Q40.206","K46.002","R14.x00x006","K56.701","C15.200","A08.101","Q42.000x401","K91.815","A04.800x010","K65.901","A18.807+K23.0*","K46.903","K29.000","K90.001","K64.810","K55.900","C18.300","B81.802","D12.901","Q43.812","K25.903","C78.603","A18.300x006+K67.3*","R85.300","K63.804","Q43.300x901","K60.300","Q42.000x301","Q41.203","K40.100x001","K46.100x001","K31.803","K52.909","C78.802","K63.203","Q45.300x102","K65.009","Q39.300","K51.003","K57.002","K56.401","K66.000","K91.401","K52.201","K56.300","C16.200","K22.202","C18.200","K31.821","K59.800x005","D37.400x001","K63.819","K56.601","K62.800x010","E84.102","S36.500x021","A05.400x001","K26.200x001","B87.800x002+K93.8*","Q39.800x903","Q85.902","K31.701","D37.700x002","K52.919","S36.802","K50.000x005","Q43.810","K62.812","K91.813","K91.800x602","Q43.802","Q41.902","C17.900","T18.501","A00.900x004","I72.800x142","K60.302","K52.802","Q41.003","K64.804","C16.802","K31.000","K66.102","K41.301","K62.820","K62.001","K65.011","I89.006","Q40.204","K63.802","K60.301","K65.905","K63.206","D18.000x859","K31.101","E10.400x330+G99.0*","I86.800x022","K46.900x003","K55.012","C16.803","K29.400","K55.003","C16.000x003","B77.000x001+K93.8*","A18.314+K67.3*","A09.005","A18.312+K93.0*","B66.501","K22.809","K92.100x001","K91.800x412","K91.406","K29.603","D13.000","K40.907","C21.801","K62.800x017","K91.800x103","A18.316+K93.0*","K52.910","K31.806","K31.603","K45.804","C16.600","S36.810","K25.600","K56.500x003","D17.500x007","K64.501","K29.600x007","K40.304","K46.100","K45.000","K22.208","K62.700","K46.101","Q39.000x001","K31.816","K62.807","R85.500","K91.000","K31.902","K44.900x001","C78.803","K22.300","K31.200","C20.x00","A06.000","K66.808","Q43.403","K31.604","K51.002","K91.800x702","I85.901","K44.901","K31.100","K56.400x001","Q39.800x201","K64.901","K64.807","C78.500x006","K91.832","T18.502","D17.500x005","K50.900","K28.900x002","A20.800x004","K62.815","D37.200x002","K46.902","K52.101","K63.901","K63.200","K43.605","K29.700x002","K46.000x002","K91.102","Q89.300x001","K91.801","C21.000","S11.202","A74.801+K67.0*","K40.906","K62.800x005","R19.000x005","K91.821","K21.901","A01.000x009","K31.904","A18.306+K93.0*","K27.600x001","K40.309","K29.501","I72.807","Q41.800","Q39.803","S36.400x095","K63.207","K43.302","A08.301","K41.100x001","K41.200x001","E73.800","D00.200x003","K31.804","K26.401","T18.200","K38.300","D01.300x001","A03.900x007","K66.001","Q41.901","C77.207","D18.000x043","K43.100","K66.800","K55.010","K62.805","Q85.900x036","K55.801","K41.300x002","K38.800x004","K57.500","K43.700","K56.501","D13.100","D01.404","K40.202","K65.800x001","A42.100","K46.900x004","K91.800x111","K59.400","C26.000","K29.600x006","S36.412","K62.400x002","I86.400x004","K90.100x001","R14.x00x003","Q42.302","A03.900x005","K22.813","K52.000","K66.006","S36.300","K45.002","K63.501","K91.805","Q43.003","K92.201","K91.305","K63.205","K35.200","B78.000","C16.900","K55.007","K65.012","D37.200x003","K91.800x206","D12.500","B37.800x091","K55.800x003","A07.300","Q43.200","K55.100x005","K42.001","D48.402","K55.300x001","A21.301","K40.402","Q39.100","R10.101","A04.902","A03.903","C77.106","K44.100x001","K90.802+M14.8*","T18.400","K64.809","D17.700x022","K59.200","K31.814","K27.300","D37.401","K59.003","B37.805","K25.100x001","D37.101","K40.312","R19.800x001","K31.905","D37.700x007","A04.803","T18.300","S36.700","K91.811","K92.800x002","C18.900","K91.103","K57.105","Q43.811","D12.001","C78.800x013","Q43.404","E14.400x350+G99.0*","R19.501","M32.112+K93.8*","A05.202","A04.600x001","A00.100x001","D37.502","K40.401","D12.300","Q43.106","K25.000x002","C78.800x005","K66.200","C15.800x001","D37.200x004","K43.601","A54.600x001","K20.x00x001","R19.600","K56.400x003","A04.000x002","K56.700","Q42.200x903","A09.900x004","K31.819","R10.402","A09.902","K20.x00","D13.101","K25.700","K52.804","K37.x00","C15.900x003","D01.000","K55.004","B76.902","Q42.902","S36.801","K52.918","K56.102","D37.411","K91.800x102","B81.100","K57.100x005","Q43.101","S36.814","R14.x00x002","K25.000","K63.810","A05.200x002","Q39.100x011","K57.401","K29.606","K29.602","K51.200x001","R85.000","K90.300x001","K28.500","C15.100","D37.900x001","K91.100","A18.308","K66.003","S36.500x011","D13.304","Q39.200x011","Q43.800x014","K52.901","K29.500","K26.701","C26.900","I72.801","A07.801","K31.800x808","C78.502","K56.200","K57.800","S36.301","K65.802","D37.500x002","Q43.807","A05.000x001","K59.401","K40.307","Q40.800","Q40.209","I86.400x001","K27.501","K40.001","K26.400x003","K66.811","A06.300","K31.500","D01.405","K56.101","K31.400","K40.203","K90.801","I89.801","K57.107","K64.806","K27.901","K62.802","Q39.600","K63.102","K40.306","K26.500x001","K66.807","K61.002","I72.802","Q45.300x104","K63.815","K66.809","K65.000x014","Q43.103","K64.801","A04.500","C16.000","Q43.100","C18.100","D37.204","K31.600x004","A18.300x015+K93.0*","K66.901","K43.400","K22.000x002","K35.300","J11.800x002","K62.903","R19.100","K65.003","K55.000x010","A56.302","K28.400x002","K61.200","I86.800x014","S36.910","D01.301","K22.500","D37.500x001","I86.400x002","K51.303","K46.900","K65.016","K55.901","Q42.000x501","K40.900x003","A04.800x007","D12.200","K40.904","A09.004","Q42.000x201","A09.904","C45.705","I77.400","C78.801","D37.503","C78.800x010","K26.200x002","C21.100","K27.900x005","C20.x01","D01.401","S39.909","K63.200x003","C45.700x005","C15.800x002","K31.800x801","K63.208","K59.002","K27.503","A04.801","R85.200","D37.702","R10.102","Q42.201","K60.200"};
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

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
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

