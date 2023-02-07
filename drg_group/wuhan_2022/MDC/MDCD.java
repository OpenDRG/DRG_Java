package drg_group.wuhan_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.ADRG.*;

public class MDCD{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"J39.200x015","S13.500x006","C06.001","K06.800x015","J02.905","C49.001","D22.201","C79.800x833","D36.702","J38.001","C14.800x007","D37.000x007","H65.300x001","S10.000x003","Q38.501","B44.804","K11.700x002","S00.802","K13.000x006","J32.900x010","J01.300","Q18.802","J39.224","H70.100","K07.000x013","D18.000x503","K11.102","Q35.300","C32.104","C79.832","Q38.600x006","C32.800","S01.000","H61.800x005","J01.001","K00.400x001","C79.804","C79.830","C00.001","K08.202","S15.003","B44.802","K07.200x014","R49.000","C11.301","Q35.500x004","K09.805","J01.100","J01.000","J38.701","M95.208","Q67.401","H60.400x004","D18.000x508","J11.102","J32.301","Z41.103","D38.002","M85.000x081","J02.900x002","K00.002","S01.500x051","K04.500x001","K13.403","A42.200x002","K13.700x011","Q17.801","Q36.000","Q18.806","Q31.000","Q89.800x908","K12.205","D18.101","D22.200x002","K04.400","T17.300","J39.207","H74.900","J31.002","D10.300x007","S00.401","J35.800x008","H66.301","C44.200x001","K03.100x001","B08.802","D38.507","K14.900x003","S19.801","H95.900","J03.900","C79.800x806","S13.500","K09.806","K13.601","I88.900x004","K07.200x001","K07.204","K04.101","K02.400x002","J32.801","K12.208","D44.600x002","K04.703","J36.x00x003","D48.200x005","J06.900","K11.605","K13.200x004","S13.500x007","D37.018","K12.002","C10.300","C44.302","D03.301","S01.200x021","C47.000x009","C41.001","J34.001","I77.003","R06.501","S13.403","S09.902","S02.700x004","C31.900x001","C31.000","M95.201","C04.100","J39.225","H83.801","C11.200","C06.100x005","H60.100","K12.101","T16.x00","S08.801","K08.807","D48.701","Q85.900x037","D10.500x001","H61.102","D18.100x021","H73.802","J32.905","C49.000x005","K08.201","J33.001","K13.210","K07.105","K03.000x002","J38.101","S11.001","C79.834","K08.300x002","K03.203","K07.000x009","K13.016","D23.000","J34.108","J38.601","A21.300x002","J95.003","Q27.802","Q38.500x009","H93.200x002","J32.800x003","D37.000x013","H65.200","C78.300x008","S02.400x005","K13.200x011","H72.800","S00.300x051","J36.x00x001","Z42.000x015","S15.002","K05.500x005","S03.400x002","K13.015","D10.308","K04.200","Z42.005","J32.800x001","Q18.800x003","J00.x00x006","K07.305","H90.501","Q16.500","Q17.400","H60.000x002","A18.400x018","C79.200x008","S01.500x021","K12.000","D14.000x006","J32.900x011","J39.210","S15.301","J34.813","K07.100x008","H74.000","E10.600x031","J34.105","H90.500","D18.000x507","M95.210","H83.200","C11.300x004","K10.000x004","C02.400","Q17.900","S13.400x003","Q27.800x026","J34.800x019","K11.604","J95.800x013","H73.801","K09.003","K11.804","J39.209","Q30.300","K07.200x003","C14.002","Q67.407","H93.900x001","C14.800x006","S02.600x021","S02.912","C14.003","K11.401","K14.100x001","D14.103","K10.206","H92.100x001","H70.200","C11.202","D03.201","K14.001","K07.100x012","D00.000x007","Q17.400x002","D36.700x028","H60.300x006","H73.803","J39.000x001","S03.000x001","S11.003","Q30.800x007","S02.901","J35.804","J34.103","K09.103","D18.003","T17.200","B44.800x004+H62.2*","K06.000x003","K09.005","J32.005","K00.600x006","J35.805","Q38.700","J38.309","K06.000x002","K13.100","H95.102","K13.700x023","K14.800x010","Q38.000x006","D38.506","H70.000","H61.200","K00.000","S11.900","T17.001","C77.006","B05.300+H67.1*","K11.801","J38.002","Z46.300x001","J38.400","T17.101","J32.802","Q18.001","H61.902","J38.716","K09.001","H80.100x002","C03.100x002","K14.803","K04.701","K05.300","K03.800x001","K11.201","D10.000x003","C79.500x016","K13.705","Q87.000x301","J95.000","S09.101","H90.300","H93.102","C07.x00","C79.800x840","D16.500","J38.000x006","J39.206","J32.000x005","D16.407","Q38.305","K14.500x002","K10.809","H83.302","S10.004","K05.201","Q30.802","C76.003","D04.300x002","H60.300","K00.100x001","S19.900","K08.806","K10.002","D16.406","K03.105","B37.800x084","K07.300x005","K07.012","H61.802","H71.x01","J04.000x006","K13.500x002","K12.100x013","C41.000x018","H81.100","H70.800x002","K02.800x005","Q85.900x031","K12.100x012","K13.600","J38.312","K11.602","E85.400x005","C11.101","K13.400x001","J39.213","K08.801","K04.900","Q36.001","K05.103","Q27.300x010","S17.800","H70.103","J34.000x010","H91.100","Q37.500","H70.001","K09.000x005","Q89.202","K13.700x026","K04.901","C00.500x002","D21.000x008","J30.100","C41.000x023","J95.805","K06.800x012","D10.601","S02.600x031","D22.301","D21.004","J38.000x021","R49.100","C00.500x004","K14.301","J06.000x002","J95.807","D18.100x027","C14.800x003","K05.200","C00.400","H60.300x002","D10.400","H61.101","K07.800x001","S01.400x031","D14.007","K14.800x005","H66.900","C14.800x004","H72.200","K07.104","D16.405","K13.400x002","C14.800x005","Q31.804","C79.803","H69.000","K12.003","K00.201","S02.711","K07.004","J38.305","Q16.000","C77.000x005","D48.519","S01.802","S02.401","Z46.400","K13.204","J39.215","Q18.100x009","K03.800x002","Z45.303","K11.501","H70.000x009","H90.502","J39.212","S15.005","K03.202","K09.205","Q38.600x002","Q30.101","K04.401","R43.800x002","K00.604","H93.200x005","J38.703","D37.000x001","J95.000x001","N80.801","C14.800","C06.100x004","H91.200","H68.101","S01.401","A36.000x003","S01.504","S10.101","C00.401","K12.209","D36.703","C44.401","K00.603","K13.700x009","D18.100x004","Q36.002","D10.200","S01.500x052","C07.x00x003","C13.100x002","S00.403","K00.608","J34.807","J38.311","H66.000","K13.013","K05.204","K11.301","Q30.200x001","C14.800x002","A69.100x003","Z41.102","B49.x11","K10.208","C47.000x007","H60.303","K11.903","C11.300","C79.831","J05.000","K13.014","D37.014","Q18.100x003","K13.707","J11.100x001","H61.801","Q35.903","S00.501","J31.004","K11.302","C03.100","H90.200","K13.700x006","K03.300x003","S13.400x005","D16.410","J34.812","H60.801","K13.000x017","K04.803","B36.903+H62.2*","C47.000x008","J38.200x001","K07.010","C30.101","C32.100","J32.800x008","C79.800x828","Q75.801","J32.900x009","K13.101","H60.300x005","K09.102","S02.412","C12.x00x002","C77.003","D02.000","J34.806","J32.400x001","C31.801","A36.100","C39.000","H73.800x005","J37.005","S02.500x002","K07.603","C76.005","C32.001","Q87.006","S00.900","B08.501","J02.801","S09.800x002","J34.300","D38.504","K00.501","Q18.101","J37.004","Z45.801","Q30.800x004","S00.800x054","B05.800x009","C09.000","D16.409","S01.300x071","J04.001","K13.300","K00.200x010","I86.000","D23.300x004","S02.501","J04.004","H73.804","J38.600","D10.301","C03.101","J32.006","K07.300x007","M95.206","H95.900x001","K12.216","Q38.004","Q18.200x003","B37.000","K00.200x001","D03.000","J33.804","K12.103","D37.003","K13.005","A18.800x006+K93.8*","M95.204","C47.000x005","K09.000x007","K08.104","C08.100","H61.000","B48.100","D48.200x007","J32.300","J34.102","C43.201","M95.005","Q27.800x024","Q35.501","H71.x04","K07.003","S00.300","Q17.002","K13.700x007","H61.300","C06.100x003","S12.803","J38.717","C04.800","S10.002","H91.901","K10.102","K03.204","C44.300x005","J34.000x004","K07.009","J39.220","H70.102","K00.401","K10.800x010","D10.602","H93.901","H90.000","J34.800x002","H65.900x001","C00.200x002","C41.004","K00.000x004","K14.500x001","K12.100x002","K12.201","Q27.800x036","D18.100x007","Q38.303","S13.501","B00.205","D14.100x002","D38.505","K13.700x025","J02.901","Q18.800x002","C05.000","A69.100x002","C02.200","H70.101","K08.102","J39.214","H61.805","S01.506","J03.900x001","H60.900","J38.705","K01.100","M95.203","J03.800","J39.221","J30.101","J03.000","S00.002","R44.201","Q18.200","D17.002","S01.001","K11.100x004","S09.200","B49.x08","D14.003","C79.802","K10.800x002","C08.900x001","Q18.807","S01.501","J03.901","S12.813","S03.200","J01.400","J36.x00x004","D10.309","C00.200","J32.300x004","K03.300x001","J32.000x009","J38.000x012","K07.100x010","J04.002","S00.404","Q85.900x035","C00.102","J02.802","B00.201","D18.000x021","K03.801","S01.502","D10.600","D48.200x008","D04.000","S01.300x031","C00.100","D21.000x007","C39.801","J33.000x002","J34.811","Q17.300x004","Q75.900x005","H74.300x003","Q85.905","H70.000x007","K13.402","D36.700x004","D38.000x002","K07.200x013","K11.206","S01.500x022","T70.000","K07.008","C13.200","C00.303","H91.900x004","K06.800x014","A18.205","B44.800x006","C79.203","K05.000x002","H95.000x001","H72.001","C41.003","K00.206","S08.800","D10.000x002","M35.900x011","K13.009","K12.105","J38.307","D37.019","S15.001","D11.900","D10.402","Q89.800x909","J95.000x002","K13.709","K13.700x013","H61.103","D17.700x021","A36.000","H83.900x001","A69.000","C00.301","K06.801","K12.100x011","K07.300x009","J01.200","K07.011","Q31.805","T81.800x008","C06.200","H91.900x002","R04.801","H60.300x003","K05.500x003","J38.400x004","K00.200x009","J34.100x008","J37.003","C08.000","D37.000x006","K11.806","Q36.006","C11.300x001","J38.707","Q18.103","Q31.900","C02.800","D21.000","Z45.304","K08.101","C02.900x002","Q16.901","D37.005","Q17.303","A18.203","Q36.905","K10.302","Q18.102","K07.202","K11.500x005","D36.700x006","H70.900","K04.200x003","K13.203","Q38.000x007","C30.004","D00.001","J32.903","K13.000x001","M95.002","K00.800x002","S09.900","S13.400","K13.007","S09.906","C44.300","D18.001","Q35.101","H83.101","J39.200x016","D04.200x001","H60.401","K05.106","C79.835","J06.000","B49.x10","C00.002","K04.801","D21.001","H74.101","D16.411","H93.100","J32.201","S00.800x056","I77.001","Q38.001","K09.804","C78.300x005","D37.000x009","B49.x07","H68.100","J36.x00","J38.000x001","H60.000x005","Q89.800x904","C06.800","E85.402","D04.201","J38.720","K11.204","T18.000","K04.002","C10.100","C04.000","J39.811","K02.200","H93.103","J39.217","S10.902","K13.714","K07.100x014","J04.000x008","J34.004","K13.002","K11.400","C41.000x025","Q17.301","S01.803","A18.803+M63.0*","D10.504","C79.504","K04.006","J38.308","A18.400x019","J34.800x009","B37.802","H66.101","H74.802","S15.100","C14.200","C44.305","J32.400","H93.800x001","K10.100","J31.203","K10.201","K11.901","R04.000","K11.700x003","J38.300x015","K05.100x008","S10.001","C11.800","J38.719","K07.604","K07.000x008","Q27.800x030","B26.804","K12.203","Q16.300","J34.008","S02.802","K12.304","C11.801","K11.211","H83.800x003","J39.203","C76.000x007","K07.600x003","Q30.100x001","K02.800x007","J01.900","H92.200","Q17.003","K03.001","D37.000x004","K05.100","S13.500x005","K10.103","K06.901","K10.801","K12.114","J31.201","T16.x00x002","J38.313","K02.900x001","K13.500","J32.904","D23.200x002","K04.000x008","K10.800x006","J10.100x001","A63.003","J32.803","K12.213","H60.502","K12.115","A56.400","J38.700x022","A18.201","K10.213","H61.104","K12.116","K08.803","C44.306","K10.205","H61.001","D18.000x823","C43.300","J32.003","D18.000x510","J34.800x033","K05.102","J32.800x007","Q85.900x012","C43.200x003","C00.302","J32.004","I88.103","Q89.800x906","K05.100x005","K14.600x001","K07.900","J34.101","S12.814","C11.102","D11.702","S00.800x055","E85.405","Z46.100","Q31.200","K02.101","K07.000x012","M95.007","D00.003","S02.201","K11.205","K12.206","Q75.200x001","C44.201","J32.100","J38.000x011","C13.900","H61.100x006","K11.601","Q38.304","K13.603","J38.300x011","S02.813","S15.200","J39.001","H72.000","K04.500","J06.900x001","C03.000x002","D38.003","H65.300","R04.100","J38.700x027","D00.006","D00.007","J38.721","Q31.800x003","H83.800x004","R59.000x004","C10.900","A51.201","K14.805","Q34.801","C78.300x010","K09.900x001","D17.700x032","H83.200x002","C02.101","K10.100x001","C11.201","K09.200","K13.000x007","K14.800x012","C13.901","K03.000","T70.100","J34.805","Q75.400","C08.900","J31.204","C32.100x004","D14.002","C44.400x004","Q17.803","B37.800x088","J32.902","H61.100x007","K05.101","K10.100x003","K14.800x013","D00.009","H83.000","T17.002","J35.807","Q27.300x007","K11.203","K04.001","Q75.805","C41.000x021","B26.900x001","D17.001","H70.002","S03.501","C02.200x002","K06.809","K08.802","Z42.000x019","K07.110","H81.000","R07.000","Q16.103","H65.901","J10.101","C44.304","H68.000","K14.300x004","K09.100x006","H72.900","C41.010","C79.800x843","K07.107","S02.600x041","H61.804","K11.200","Q30.805","K08.203","Q17.300x005","Q31.800x004","K07.109","K11.807","H73.000","C10.800","K12.106","D18.000x501","H80.000x001","J34.104","K04.902","M31.301","D14.006","D14.101","Q17.802","K07.901","A59.800x001","J38.714","K06.803","D48.518","K12.210","K13.008","Q27.800x021","S02.810","C41.002","K08.103","J39.300","Q38.500x007","H71.x03","J11.802+H67.1*","S09.900x006","J34.801","S02.600x011","C06.102","S13.500x008","T85.800x811","D22.401","K07.302","D22.302","J35.801","C30.003","I89.000x014","Q75.804","J32.800x004","C09.800","J95.005","D37.013","K07.100x011","J34.107","H61.100x009","J03.902","C78.302","D10.302","D37.012","C76.006","K10.001","C13.000","K14.808","D18.000x511","J39.208","D10.100","C76.002","J38.711","Q30.001","D37.000x014","K11.900x004","C10.101","H93.201","Q16.200","H66.102","J10.100x004","C08.800","H90.700","C00.101","C03.901","C79.500x028","Q17.000x005","D38.508","H65.900","C47.000x006","J39.216","H71.x00","J38.400x003","K13.700x022","J03.900x006","S02.600x051","K14.000","K13.400x004","K12.305","J31.000","D23.200x008","Q18.805","H61.901","K14.400","Q27.800x027","J32.900x007","J38.704","K00.602","D14.000x007","H68.100x003","J32.100x005","J95.500","H73.001","J35.808","K11.802","K13.202","K00.204","J37.002","K10.000x003","K06.100x003","J38.000x022","K06.000","K07.006","K12.107","K11.000","C43.400x002","J95.800x010","C11.001","H70.201","J38.718","H91.900","J34.804","C05.900","K14.300","H60.000","J04.100","K02.000","S15.900x001","S01.302","C78.300x006","D18.000x506","S01.700","K07.000x011","D02.002","K07.300x003","K07.301","S13.601","Z42.002","C00.800","K14.200","S00.302","C79.800x812","J31.001","K03.101","H65.400x001","S02.200","K09.202","S10.900","J33.002","S08.000","M95.006","C41.000x027","S01.500x001","K12.218","D16.403","K12.112","J31.200","C71.900x009","J01.800","J38.700x009","D00.004","K14.004","K14.302","Q36.003","E85.400x006","D18.000x808","H81.902","H60.000x004","D16.400x025","D37.001","T85.800x804","C06.000","J33.000","J11.100x004","C14.800x001","C11.000","D37.015","K13.200x007","J04.200","Q30.800x006","J39.223","C77.002","J95.803","K12.202","Z42.008","J02.900","L04.003","S01.300x081","K00.601","J31.005","Q18.804","Q17.000","D03.200x002","C41.007","J38.300x013","K13.012","J35.000","H83.000x002","E34.800x005","K07.103","J32.102","C11.100","C11.300x006","C30.100","S02.812","K05.400","K12.200x019","D11.900x001","D14.004","K06.806","H60.002","J32.900","K13.208","S10.700","J38.402","C31.800","K09.203","C13.100x001","C03.000","J31.202","D18.102","Q35.901","J33.003","J39.809","K10.805","C00.500x003","E85.409","K09.808","K08.808","C79.800x825","H81.301","J09.x05+H67.1*","S10.003","D14.001","D18.004","H91.001","S09.905","B87.300x002+J99.8*","J38.702","Q17.000x003","S01.503","J34.800x006","Q18.800x004","S00.700","H65.400","H81.101","Q36.904","K11.800x010","H61.803","H74.801","S13.500x009","J38.710","S03.400","C02.300","D00.000x005","C32.900","K00.400x004","M95.100","H95.101","K04.802","C79.800x826","K05.400x002","Q38.600x001","D00.011","K11.303","H92.100","S02.600x061","K04.100","C32.200","J38.700x003","K10.101","D10.305","Q38.300","K00.300x002","B08.500","S15.300","D37.000x010","K06.800x009","Q89.800x905","K00.400x002","B44.200x001+J99.8*","J11.100x002","J34.005","K10.800x011","K13.209","H92.000","A52.700x003+J99.8*","J33.800x002","Z42.009","S00.004","J39.101","Q38.400","Q32.101","K14.003","D03.401","J38.200x002","S17.000x002","H73.100","C13.101","C01.x01","K09.100x003","K07.200x002","H60.500x006","K07.100x016","H60.503","B02.801+H62.1*","K07.102","S02.500","Q38.500x006","C09.100x003","K00.700","D23.301","K11.600x008","K11.902","E11.600x031","K11.200x009","K06.802","H60.400","J39.202","Q18.300","K07.201","J32.900x008","Q18.200x004","A18.804+K93.8*","Q38.502","B05.801","T90.800","K03.200x002","Q30.800x008","K06.000x004","R49.202","D10.000","C00.300","R59.900","D00.000x008","K00.301","J39.219","J33.801","C41.100","C49.004","J02.900x005","K04.702","H66.900x002","J10.803+H67.1*","C31.200","A50.500","C01.x00","S01.301","J31.003","J35.802","K13.000x012","S02.400x003","J32.002","H80.900","C02.000","E85.401","J39.222","K12.109","S01.804","D14.000x010","A48.801","D10.300x005","Q87.004","K07.602","H70.800","J32.200","K05.600","D38.509","K07.200x012","Q27.302","Q17.501","J34.802","D10.603","K13.205","Q38.002","D23.300x003","C10.000","K00.502","K13.602","Q35.301","C00.404","C02.300x003","J38.000x002","A36.201","K05.100x010","N80.800x007","Q18.800x001","J34.106","D86.802","K09.000","C49.002","M95.001","S15.004","K09.100x001","S17.000x001","H66.001","H90.100","D10.700","K02.100","K10.301","Q31.806","J38.000x005","K10.804","H66.400","K13.206","H73.102","S00.803","J95.501","J39.200x020","D37.006","K11.800x007","K07.200x011","Q36.100","K13.201","A93.801","K00.200x005","K02.901","C49.005","J39.205","H60.100x001","C09.100x001","K00.200x003","C00.402","D10.000x005","D16.401","D37.000x015","C30.001","K02.300","D10.307","Q16.400","T85.800x810","Q67.403","E14.600x031","K00.101","K08.302","S15.801","Q85.900x038","K12.303","Q38.300x007","K09.809","K03.500","Q30.800x003","H60.001","A18.800x025+K93.8*","K11.202","S02.211","D18.000x505","J04.000","S02.803","J32.001","D37.000x011","K00.205","I88.102","Q31.800x005","A50.500x001","K13.003","S19.800x004","K02.800x008","Q17.500","D37.008","K08.204","Q17.300x006","K04.000x007","D16.500x002","C09.900","K13.700x019","Q37.300","H80.100x001","Q38.301","C47.000x010","C43.000","J35.901","Q30.801","J00.x00x004","D48.200x009","S02.411","D14.008","K13.600x001","Q18.500","C00.900","C11.302","D16.400x013","H95.800","Q36.900x003","C79.503","H91.200x001","J38.700x013","K13.200x005","A42.801","J39.204","D10.000x004","D18.000x809","C79.202","H81.900","D37.000x005","K13.401","D37.002","C00.304","S13.500x003","J39.218","K06.804","D18.000x845","J02.902","K09.100x004","Q38.200","K01.000","K07.100x017","C41.000x019","T17.200x001","S03.100","K03.102","S12.815","H81.400","K08.809","K07.903","B37.001","A18.600","C79.505","C41.008","D09.701","D16.404","K07.600","S01.200x011","J35.803","K14.900x004","K13.711","H72.101","S03.400x001","S01.200x092","Q37.800","K00.207","K06.100x001","K12.200x012","K09.002","S15.000x002","K03.300","K14.900x002","K07.902","J38.201","D37.004","Q18.400x004","C79.500x004","J38.700x007","K03.603","H61.100x005","H90.801","K14.400x001","C06.100x002","K03.401","D16.400x018","D00.005","D10.501","J38.310","Q35.900","H73.900","S02.612","J37.001","Q17.001","C47.000x004","D11.000","K03.300x002","K07.000x004","Q36.901","D36.700x007","D37.007","K13.200x009","D02.301","C06.902","K13.004","D14.000x009","K07.203","K03.103","Q18.100x006","D48.200x002","Q17.200","K07.108","Q17.100","J38.304","C79.800x824","D17.700x020","J10.805+G05.1*","K02.800x002","A18.200x002","K12.111","Q16.301","K10.214","J34.200","M95.003","K00.600x002","K04.501","Q31.802","D00.010","C49.000x004","L04.001","J32.906","K07.300x006","S12.910","K05.202","Q89.800x903","R49.201","H83.100","J34.800x004","K10.211","S01.500x042","D21.007","K12.200x018","A69.100x001","Q37.400","J34.810","J00.x00","A18.200x005","K12.200x003","K03.601","H93.300","K13.700x024","J34.800x020","H83.800x002","K09.204","H71.x05","J30.400","J32.800x011","Q32.000","J33.802","Q67.400x906","K00.503","K03.800x003","K07.200x005","R59.901","K07.000x002","D14.102","L02.000","C41.011","D18.100x010","D38.500x004","K11.800x002","A69.000x002","H83.200x001","C76.000x002","J37.100","J38.401","Q38.500x005","H81.303","K11.500x003","C10.200","K10.300x003","K00.203","Q38.000x005","K11.209","J30.000","S02.600x091","Q18.903","Q17.800x004","Q30.900","Q67.406","Q31.803","Q18.003","A18.601+H67.0*","K00.000x003","K10.000","S17.001","Q35.100","K08.000","S11.800x081","D16.400x019","K11.700x001","K13.700","K14.809","K04.201","C03.001","K11.101","Z42.006","Q18.400","J95.809","I88.900x007","J38.300x016","D02.000x004","Q31.500","H81.800","S01.400x011","C79.500x007","J35.806","J34.800x034","D37.016","Q38.802","T18.001","C02.300x002","B49.x09","D23.201","H83.301","Z42.007","K10.204","J10.800","K07.100x015","K14.300x003","H80.000x002","K13.710","K07.600x001","Q38.600x004","C09.100x002","S02.600x081","H83.000x001","C32.103","B37.003","E14.600x032","A18.202","Z42.010","D17.700x003","H60.100x002","Q35.302","Q30.800x005","S13.500x011","C41.009","C78.301","K14.401","K03.201","J02.903","J38.000x032","D18.100x013","K14.807","Q18.104","H80.200","K12.102","D11.701","S10.901","D00.012","D21.002","J01.900x003","D10.101","J38.300x008","J38.200","J00.x00x007","J95.800x001","K10.803","K14.002","C44.300x006","K13.715","K11.600","D04.400x001","K12.212","Q35.902","C41.005","K03.600x001","S00.500x052","D38.502","D10.200x002","B49.x05","K12.302","H74.201","Q16.102","S17.900","J34.809","H65.101","D37.011","D10.502","D48.700x007","K11.701","D48.200x003","K11.200x014","Q30.804","D16.402","H71.x02","D36.701","S03.000","K12.200x017","Q36.902","K06.807","A36.000x004","K11.803","C05.100","C10.400","C11.200x002","K03.604","D48.702","B08.000x003","K06.805","C10.102","C30.000","J00.x00x008","Q38.300x005","K05.000","B37.002","M85.000x083","D17.000x003","H81.200","J38.300x018","K10.808","J38.700x017","C77.004","C00.403","S00.804","K00.400","H91.300x001","H65.102","Q38.300x003","D23.200x003","D10.500x002","H61.105","K13.010","K10.212","K10.800x008","S11.201","K00.900","K14.000x007","Q31.301","D37.009","H69.900","D37.010","A36.200x002","D02.000x003","H60.302","C44.000","H80.800x001","K14.802","J35.100","K12.200x011","H93.301","J38.706","H81.400x003","C09.100","K13.011","K13.207","D38.501","K05.300x002","H70.003","D00.002","J33.805","S19.802","S01.200x091","C76.004","C41.012","D22.400x002","C32.300","K09.004","Q18.900x002","S11.700","D04.300x001","J10.100","K14.801","D18.000x844","H74.300","D22.000","E85.410","K07.005","K11.207","K12.117","D44.700x004","J35.800x009","C77.005","K10.000x002","J02.000","D21.005","Q37.200","K06.100x002","Q18.002","Q16.900","B49.x06","S01.300x002","J35.809","J04.000x004","K05.100x013","J39.200x008","D14.000x005","K10.802","H60.500x007","Z42.000x002","Q35.500","Q36.903","K07.002","C01.x00x003","D00.013","Q67.400x202","K05.301","S11.004","H91.000","H93.101","C10.800x002","K12.001","J38.700x001","B48.300x002+K93.8*","K13.000x014","T81.800x013","K14.804","D02.303","C00.500","C02.100","C31.300","J38.303","K11.100x002","S13.402","D37.000x008","C41.006","K05.200x002","K13.200x010","B00.202","C78.305","S09.907","S19.800x002","K13.700x010","Q37.900","D37.000x002","D21.006","K11.402","C41.000x020","S01.505","B00.203","D10.303","D14.100","Q16.501","S13.500x004","K13.006","K09.201","K13.700x018","Q31.801","K11.600x005","T86.802","J38.301","T16.x00x001","Q38.100","K06.900","K13.400","K13.001","K02.001","J70.900","E11.600x032","B00.200x001","M95.209","J39.200x004","J34.002","J38.102","S01.300x061","J30.300x001","K12.301","A18.805+K93.8*","H60.301","D18.000x807","J04.005","K03.104","S09.903","J35.200","Q38.601","J32.101","K12.207","C77.001","J35.300","C30.102","J38.700x021","S02.600","K00.001","K05.105","K06.810","K13.200x006","D48.200x004","K02.800x003","K02.800x006","K13.706","C79.502","B36.902+H62.2*","A18.802+K93.8*","S03.301","S00.003","S00.000x053","K09.800x005","Q89.800x907","D38.500x003","C04.900","Q18.700","C79.201","Q31.100","S09.800x003","H93.001","K02.400x003","J32.800x009","C06.101","K03.106","S15.800x002","S00.500x051","C05.900x002","H61.100x002","K14.300x001","J32.800x006","J01.901","K00.402","H74.300x004","H74.400","S11.800x082","D44.700x003","Q27.800x040","C03.900x001","K13.000x023","S11.100x001","D38.500x005","S00.400","C14.000","C30.002","K11.805","K14.901","H72.100","C47.000x011","S15.800x003","S10.801","S00.500","S00.801","D36.700x005","S00.400x052","D38.503","S01.300x012","J39.900","K12.214","C00.500x005","S01.900","D48.700x025","K10.200","J04.003","K04.600","J33.900","J11.100x003","J32.200x005","T18.002","K07.500x002","K14.000x006","K11.800x006","H69.800","K11.606","C43.302","D02.001","J38.709","K06.100","D10.701","C02.201","K14.800x003","Q67.405","J38.712","S01.300x051","Q32.100","C11.300x005","D10.503","S01.200x031","C03.900","K06.200","J32.302","K07.304","S13.502","M95.207","E10.600x032","S09.801","H65.000x002","J39.003","D38.500x001","R49.001","K00.200x002","B44.801","K05.100x011","J38.500","C05.200","J95.000x007","K07.300x008","S01.300x011","J95.400","K00.801","C71.900x010","H90.400","D18.100x011","J34.007","K00.600x007","B87.400x001+H94.8*","K13.702","A54.500","K04.700","H60.901","Q35.502","K03.400","C46.200","D18.000x858","D38.000x001","K05.203","Q38.500x003","S02.611","C13.800","Q18.100x008","S10.102","A52.700x004+J99.8*","C77.008","K11.603","C30.103","K07.303","K12.110","K11.800","J32.800x002","J33.803","S00.402","C11.901","C78.303","S00.800x053","J30.200","C08.800x001","K05.100x012","K08.805","I88.104","K00.605","K00.202","Q18.801","C79.800x844","D37.017","J32.901","S00.001","H70.004","K14.102","K04.300","H90.600","J38.302","Q36.004","S17.801","K12.215","S09.901","K00.500x002","J33.100","K09.807","K13.000x018","H60.501","J39.002","K04.000","S08.100","Q37.000","K04.800","Q16.401","K11.210","C31.100","D17.700x006","H60.200","K07.101","I88.101","C00.000","H81.901","S02.800x003","Q30.201","A36.000x002","A36.200","C06.900","D18.000x504","C43.401","S11.002","J06.800x001","Q35.907","K03.800x005","Q18.600","K11.200x012","K12.217","M95.205","Q36.900","T17.000","J34.803","C06.901","K11.200x011","J37.000","J95.001","K03.602","K10.800x012","Q35.700","H66.900x003","H73.101","J10.804+G05.1*","H66.200","K13.700x021","J38.715","C06.100","D02.302","J95.004","J32.000","K08.900","K00.600x008","S09.904","J32.200x004","K13.700x001","Q36.906","J31.100","A52.703+J99.8*","K02.500","A66.501+J99.8*","Q38.003","J39.200x009","J05.100","K05.104","H61.806","K07.100x009","C05.800","C02.900","C79.801","K09.801","H83.200x003","K03.900","C76.001","Q38.400x001","D10.306","J10.100x003","H81.302","K07.205","J30.300x002","K06.808","K07.007","K07.106","C11.900","D10.401","D17.700x007","D21.000x002","K07.000x007","Q38.400x002","C32.000","K03.700","K05.500x002","D00.008","C00.600","Z45.301","K12.204","C30.005","D48.200x006","J10.100x002","J34.006","J38.000x031","K12.000x001","K02.800x001","D23.303","H70.800x001","K11.503","Q27.800x028","D14.005","C78.300x004","A18.800x034+K93.8*","K11.208","S13.401","K13.000x016","Q37.100","J34.003","J95.800x012","D38.001","D10.900","H91.801","H83.300x001","K02.400x001","K12.108","M95.202","K10.900x002","C32.102","K06.800x013","J38.708","K12.211","K13.700x004","Q38.801","Q16.101","D04.401","C79.800x845","H95.900x002","C77.007","Q36.005","K11.300","C09.902","B00.204","J39.201","B87.300","Q17.302","K04.007","J38.400x002","K05.500x001","Q38.701","S01.400x021","J34.800x001","D03.400x002","K10.901","K10.800x005","C02.000x002","C44.307","Q17.300x002","C32.101","C43.200x001","K11.400x003","K13.704","S02.400x001","Q38.500x002","Q38.000x003","S13.500x010","K13.700x003","J95.806","K11.404","Z45.302","D37.000x003","B37.200x005+H62.2*","K08.804","K09.200x001","D37.000x012","C09.901","C14.001","C02.100x001","K13.703","Q30.000"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCD入组条件，匹配规则：主诊断匹配");
        String result;

        result=DA1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DB2.group(record);
        if (result.length()>0){
            return result;
        }

        result=DC1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DC2.group(record);
        if (result.length()>0){
            return result;
        }

        result=DD1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DD2.group(record);
        if (result.length()>0){
            return result;
        }

        result=DE1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DE2.group(record);
        if (result.length()>0){
            return result;
        }

        result=DG1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DG2.group(record);
        if (result.length()>0){
            return result;
        }

        result=DG3.group(record);
        if (result.length()>0){
            return result;
        }

        result=DJ1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DK1.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合DQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "DQY";
        }

        result=DR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DS1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DT1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DT2.group(record);
        if (result.length()>0){
            return result;
        }

        result=DU1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DV1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DW1.group(record);
        if (result.length()>0){
            return result;
        }

        result=DZ1.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCD的ADRG入组条件");
        return "";
    }
}
