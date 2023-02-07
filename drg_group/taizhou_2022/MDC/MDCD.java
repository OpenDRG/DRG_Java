package drg_group.taizhou_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.ADRG.*;

public class MDCD{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"K06.809","J95.005","K13.700x026","K10.800x006","D17.700x021","B08.000x003","Q18.802","K10.800x005","K06.800x012","S02.200","J10.101","D37.004","K03.104","E85.410","K12.303","C03.900x001","B08.500","H83.000x001","K13.700x013","Q18.001","J39.218","K00.200x005","D00.004","K02.400x003","K13.200x005","C32.102","C44.302","J95.400","Q85.900x012","C04.000","Q35.907","C76.006","D10.301","H90.300","J04.002","K00.200x009","K11.209","J39.217","C47.000x007","H80.000x002","S01.200x011","K10.212","K07.200x011","Q36.006","K13.009","H91.001","H90.502","K07.305","C49.000x004","D03.000","K09.809","D38.509","H83.301","D38.506","J32.800x003","C02.900","T18.001","K13.008","H71.x03","C32.104","J33.100","D36.700x007","K10.203","K10.211","C47.000x005","S00.402","K12.100x013","K10.206","K00.503","H61.800x005","B44.200x001+J99.8*","D02.001","D10.100","K07.103","S12.815","J39.204","D16.400x019","B37.002","S02.711","K04.000","J39.900","D16.403","Q27.300x007","C71.900x009","Q30.101","K14.800x012","K13.208","M95.202","J10.100x004","K05.000","S08.801","D37.000x014","H60.002","C03.000x002","C77.004","K10.000","D00.006","M95.007","D37.003","S01.001","D16.405","K04.500","K12.111","Q38.300x003","K13.700x022","K07.303","E85.402","K11.600x005","M95.207","K09.100x003","J01.800","C31.900x001","D18.000x506","H69.000","K14.800x003","C08.800x001","K03.700","Z42.000x019","D18.000x501","B37.800x084","K02.000","Q30.800x003","S11.002","C02.000x002","J35.807","K03.103","R04.000","S01.505","C41.002","K14.300","H81.800","D21.001","K13.710","H73.101","C05.100","H61.001","H60.000x005","S13.500x009","H70.800","J38.300x018","Q32.000","J32.300x004","J32.400x001","S15.004","S01.300x012","K14.004","D11.000","Q36.005","J02.000","S09.101","H65.101","J32.900","H61.901","H91.801","C06.900","K10.000x003","K12.102","J39.202","K11.302","D23.303","A69.100x002","K03.300x003","K05.100x013","H65.300x001","D37.012","Q30.001","D48.701","C47.000x006","C79.200x008","S09.905","K05.300","Q38.001","K10.301","J33.802","J38.716","Q17.000x003","Q27.800x030","M31.300","E34.800x005","D10.504","K11.804","K10.808","K12.105","J38.200x002","J38.000x022","D18.000x808","K12.110","S00.801","C00.500x004","H93.900x001","S02.802","J06.900x001","S00.900","K00.402","J32.002","C77.003","Q38.500x003","K14.102","K08.802","C03.000","J04.000x004","J37.003","S02.600x061","J95.000x007","H68.101","C44.304","S01.500x022","E14.600x032","D10.401","K13.704","D10.300x007","C00.303","D17.700x006","J34.105","K07.200x013","J32.200x005","Q30.800x007","Z45.304","C76.004","D10.600","Q36.100","K13.000x023","D37.001","Q67.404","J38.400x003","J32.800x011","Q37.400","J34.006","H60.901","S08.800","K10.000x002","J32.800x007","H81.100","D11.701","D23.300x003","K09.900x001","S02.500","S02.812","K03.603","D37.000x009","K12.117","K13.000x017","K12.112","J39.201","K11.600","J38.717","D02.000","K04.701","Q36.004","C10.800x002","K14.900x004","D17.700x020","K07.106","D10.601","K11.601","K07.205","S01.400x011","J34.004","H83.101","H60.300x005","C00.400","K13.600","S17.000x002","C14.800x001","S11.900","H81.400","D22.400x002","K10.100x001","K10.201","Q75.805","J05.100","C78.300x008","J01.000","K14.200","K00.001","Q18.903","Q31.800x003","S09.901","J38.601","J39.205","K13.709","K00.801","T81.800x013","Q38.502","S10.000x003","D48.200x008","K08.103","K09.201","D02.302","R06.700","H83.000x002","K02.800x001","J35.901","K07.300x009","C01.x00","B08.501","K07.000x008","C08.900","Q38.400x001","H90.000","D37.005","C05.800","K08.204","Q18.104","C44.300","C32.200","K10.102","K00.900","K10.100","D38.002","D00.000x008","H95.102","S01.400x021","Q38.300x007","H61.902","J32.800x002","D00.013","D36.700x004","C44.200x001","K03.401","Q36.000","J34.800x033","C14.800x006","E11.600x032","B37.003","H60.300x006","C05.200","K07.200x012","Q18.500","J38.703","J32.800x006","J95.501","J34.801","D18.100x007","D36.701","J39.200x015","C03.101","C30.001","S02.600","Q89.800x904","J35.000","K13.011","D37.010","K08.102","Q67.400x202","K05.203","K13.101","H60.301","K07.007","S09.904","D38.504","H70.101","K00.604","K09.100x006","C06.800","Q18.003","J01.900","K04.101","K12.215","C77.008","D00.012","Q17.803","T81.800x008","K05.101","C41.001","Q17.400x002","D37.013","S15.100","D16.411","Q16.102","Q31.805","J10.800","J38.700x017","K03.801","C00.401","K11.200x014","J39.208","J95.002","J33.803","S03.000x001","J34.000x004","H91.200x001","H69.900","J31.003","S01.506","J30.101","S00.400","K11.211","C09.100","S02.600x051","J30.300x002","Q16.401","B49.x10","C02.101","D02.303","S01.802","K03.300","K07.500x002","S01.200x091","C14.800x005","K14.805","K03.604","C06.200","H60.200","J33.001","D18.000x504","D00.007","Q38.100","H66.900","Q75.804","K13.000x014","D16.404","S03.400x001","H65.400x001","C00.301","J32.000","J11.100x004","J38.710","J95.806","J34.101","C11.300x001","J38.302","J39.223","K06.000x002","Q36.905","D14.000x010","T85.607","J38.706","H93.800x001","D21.007","C32.000","S13.501","T86.802","H71.x05","J34.805","D38.500x004","J33.002","S00.300","D10.502","K05.600","C78.305","H83.302","Q75.900x005","K13.714","C10.000","C31.000","H93.200x002","K13.500","S01.500x052","C41.000x018","K00.601","C11.300","C79.800x840","J31.204","J34.104","S17.900","K06.100x001","C79.800x812","T90.800","Z45.801","S15.900x001","K07.105","K05.102","D09.701","I89.000x014","J36.x00x003","S01.501","B00.201","D10.000","C32.100","D18.000x510","C44.300x006","S13.403","K09.000x007","K07.300x003","H90.501","K05.201","A36.000x002","K12.305","C39.000","S02.901","K04.002","J34.803","K13.711","Q17.000","C79.502","J38.700x013","J38.701","K07.200x005","Q35.301","H60.900","J30.100","D16.500","J32.200x004","C09.902","Z42.000x002","K03.201","K10.214","C79.800x825","J39.200x020","R49.000","H81.400x003","C79.835","D00.009","J31.200","J38.000x002","K03.300x002","K08.809","K12.001","A69.000","E14.600x031","T28.501","J32.004","K09.102","D14.000x009","D38.502","K07.102","C31.800","R59.900","K02.900x001","T28.000x003","C79.203","K07.902","C06.100","H80.800x001","K05.500x001","K00.101","K12.200x018","C78.300x004","K04.500x001","C08.000","C79.500x028","C02.000","K07.300x008","J39.219","T28.502","K12.116","D00.003","Q27.800x028","K12.100x011","Q37.900","H93.200x005","K07.200x002","K00.500x002","Q89.800x907","K11.900x004","J35.803","C05.900x002","D10.309","Q35.300","D38.501","J03.900x006","K13.700x001","H95.800","H71.x00","Q36.001","A36.200x002","J38.200","C79.800x844","Z42.009","H61.100x009","Q16.501","D21.002","G47.300x033","Q30.805","D03.400x002","J34.812","K12.211","K03.601","K07.300x005","C41.000x021","Q36.903","H70.102","K08.300x002","D38.500x005","M95.003","Z42.007","C09.100x001","K13.002","H90.100","K09.103","K06.800x013","C00.500","K10.803","Q30.900","Q89.800x905","D21.000x008","K11.300","K13.015","R04.801","D48.519","J02.802","J37.100","C14.800","K04.401","Q18.103","Q38.600x002","C79.834","K13.012","S10.001","Q27.802","A69.100x003","I88.900x007","C76.003","C49.001","Q38.500x006","J35.801","K01.100","K07.604","K09.200x001","C06.101","K07.201","T81.804","K13.700x011","D10.000x002","T27.000x003","J32.300","K08.104","K07.100x012","K13.400x001","Q35.902","I88.900x004","C02.900x002","K04.200x003","K06.800x014","Z45.302","K10.100x003","K10.204","B00.200x001","Q35.903","C30.103","K13.700x021","K05.106","K12.302","M95.006","H70.001","Q87.004","Q18.804","Q27.800x026","J38.711","K03.203","K05.100x008","C79.800x826","Q38.301","D37.009","D37.000x011","K11.807","S00.800x056","D38.001","K00.000","K07.204","K04.900","K00.301","K11.600x008","S17.001","C49.002","J39.221","S11.004","J34.103","D18.000x845","Q27.800x036","Q38.500x007","M95.210","Z46.100","D37.000x015","K13.601","K11.902","S09.907","H60.400","Q35.500","J32.903","Q38.500x009","K09.202","J31.000","K03.202","J11.102","K07.107","D48.700x025","Q30.804","C41.010","S01.000","K14.002","Q16.200","E11.600x031","K10.205","K05.400","K03.200x002","C14.800x007","C32.101","Q36.900","C78.300x010","H66.900x002","D18.000x823","K05.104","K04.000x008","Q18.700","A18.203","K10.001","Q18.800x001","K13.005","J38.715","J33.900","K02.800x005","J38.712","D18.000x858","C00.001","D22.000","K14.000","K00.501","Q38.304","C79.202","J34.811","C31.100","H74.101","J37.005","H93.001","K14.900x003","K12.200x017","S01.504","J00.x00x006","K12.301","Q38.600x006","K11.800x010","K04.200","K13.700x019","Q36.901","H81.302","K10.209","B49.x05","D18.004","R49.201","J39.210","K13.700x024","M95.201","S00.403","K06.810","J38.709","K08.000","J00.x00x008","C77.005","H74.400","J38.402","Q67.405","C43.302","J33.805","D18.100x021","K12.203","K00.600x007","Q38.200","J10.100x002","K04.001","K10.210","Q30.200x001","S10.700","Z42.002","J95.004","Q17.300x006","K12.201","J38.700x001","H80.000x001","D10.306","H61.804","K05.103","H70.201","K09.000x005","S01.302","K07.600x001","C03.100","H60.302","J38.300x011","Q38.305","S02.400x005","K11.303","K10.800x010","K12.304","K03.000x002","H60.100","K00.602","D37.000x007","C00.100","K13.201","K09.005","S03.100","H65.200","K11.400x003","Q36.904","H61.100x002","C08.100","C79.500x007","K04.006","C79.802","J32.803","D37.019","K05.500x003","J39.216","K11.100x004","H90.700","D37.000x001","J38.400x004","K09.004","H91.901","K11.202","K10.202","C43.401","D18.000x507","D04.200x001","H74.801","Q31.200","H83.100","K06.800x009","Q87.006","M95.205","K10.300x003","K05.500x005","B49.x08","K07.301","B44.800x007","D10.500x002","A69.000x002","D48.200x005","J38.301","K13.400x002","J35.808","Q17.301","B87.300x002+J99.8*","K07.005","C09.000","H60.503","D10.503","J35.100","H70.000x009","D38.500x003","D37.017","I88.103","S12.814","B37.200x005+H62.2*","K13.000x001","J39.213","K13.016","J34.800x020","K14.400","D10.307","K11.803","K13.700x025","K07.100x008","D17.001","K08.900","B49.x09","H60.300x002","K00.400","S02.813","Q67.402","S02.912","C11.200x002","D37.000x008","S00.800x055","D10.000x003","K11.401","K11.500x005","J38.708","J11.100x001","K07.000x002","Q18.400","H66.102","C41.007","K07.300x006","D11.900x001","J95.800x013","D37.002","B00.203","K07.903","H66.400","K05.000x002","Q16.300","Q35.101","H61.105","D02.002","J04.000x008","M85.000x083","J34.001","J34.002","K07.200x014","D16.500x002","K09.806","C47.000x004","K14.901","C14.001","J32.905","C11.300x005","Z42.008","B49.x06","K09.808","S01.401","K05.500x002","C02.800","C11.901","K02.400x002","J38.714","D16.400x025","C41.009","C10.200","H74.802","J38.305","Q38.002","C11.100","K08.302","K07.002","J38.719","K12.213","C79.500x016","J02.900","C30.100","S01.900","C09.800","C43.000","S11.800x082","K05.300x002","C30.003","J34.802","C41.000x025","J38.721","K00.002","B02.800","A52.700x003+J99.8*","S15.800x003","H61.102","K05.100x011","K04.501","Q31.803","K14.809","H70.800x001","B37.000","J02.801","K10.800x012","S01.503","D04.000","K07.100x010","H90.400","M95.204","R49.001","Q16.500","C79.801","J33.000x002","H72.000","D14.005","A66.501+J99.8*","K04.802","J32.800x004","K11.602","Q18.100x003","Q38.500x005","K04.100","T17.002","D86.802","C41.008","D38.505","S00.400x052","H80.100x001","C41.003","A18.200x002","H90.500","C06.100x002","D18.100x013","K08.806","S12.813","D00.000x005","K02.101","T85.606","Q18.800x002","D38.508","H83.800x004","M95.203","C30.101","D48.200x002","S01.300x071","Z46.300x001","H73.102","K12.200x019","K07.100x017","B49.x07","Q31.100","D38.500x001","K13.207","J34.102","S13.400","Q30.800x006","Q18.100x008","D18.101","S00.003","H92.200","S02.500x002","T27.402","S02.600x041","D00.010","C44.307","Q17.100","K12.107","J34.008","K13.200x004","J38.000x021","K06.100x002","J02.905","C07.x00x003","S01.502","J38.718","K11.802","Q67.403","K13.702","S02.600x011","K12.000x001","C43.201","C79.505","E85.405","Q89.800x903","S01.500x001","Q18.101","C11.300x006","D10.602","D10.900","Q67.400x906","Q36.003","J38.700x007","K14.800x013","K11.400","K00.600x008","K08.201","K07.800x001","Q38.300x005","C79.800x806","H73.001","K07.100x016","T16.x00x002","K06.803","C11.102","J01.100","Z43.000","C76.001","H60.400x004","J33.801","J38.500","K12.205","J34.300","H68.000","J35.802","M35.900x011","C77.006","K06.000x004","Q31.301","D36.702","J95.800x001","D18.100x027","H81.901","J31.201","J32.900x010","K11.210","K11.805","E10.600x032","H72.101","C41.000x019","C44.400x004","K09.804","H73.000","Q17.303","H83.200","K12.200x012","K00.700","S00.800x054","S01.400x031","S19.802","K02.901","K10.801","C79.832","C01.x00x003","C14.800x002","S02.611","S00.004","H61.100x006","K03.102","Q31.800x005","D37.000x002","M95.002","K14.001","Q75.200x001","H66.000","Q18.800x003","T17.000","Q89.800x909","H60.001","J39.225","D02.301","K04.007","H60.100x002","K11.500x003","D18.102","T18.000","J10.100x003","K06.100","K14.800x005","C49.005","J31.203","S15.200","K11.301","S02.800x003","D37.000x004","H65.901","J38.401","H74.300x003","S02.600x081","D18.100x011","J39.300","K13.402","J37.001","S11.100x001","A18.803+M63.0*","K12.100x012","J39.212","C31.801","K07.603","K08.804","K00.100x001","Q30.000","C09.901","R07.000","K03.602","H60.300","K07.602","Q32.100","H83.200x002","C09.100x002","S10.004","J02.901","J38.700x022","J32.900x009","K07.304","Q85.900x035","D16.409","Q18.100x009","D00.005","D14.007","J38.300x016","H83.200x003","J34.800x034","Q17.003","D17.002","J34.100x008","K13.705","D48.700x007","C02.200","J34.005","Q32.101","Q16.103","H95.900x002","C13.901","D36.700x006","H61.100x007","K11.402","C04.800","H81.900","C44.401","D00.000x007","S01.804","Q37.500","Q18.200x003","Z42.005","H60.000x002","S01.200x092","D37.011","C78.300x005","H70.004","C30.002","S01.300x061","H70.800x002","S10.902","H71.x02","H93.201","K07.600","C47.000x011","D36.703","D18.000x508","K03.800x002","J04.200","R59.000x004","H61.000","K14.300x004","Q17.802","D04.401","K13.200x007","K07.000x011","M95.001","K11.605","C06.902","Z43.001","K12.202","K03.204","C77.000x005","S00.700","J04.004","S00.803","Q18.002","L02.000","S19.900","C79.800x824","Q17.501","G47.300x036","K11.208","K13.700x004","J39.215","C00.402","Q35.901","Q37.800","T16.x00","D18.000x809","C06.000","J34.003","J04.001","K02.100","K12.103","Q37.000","C07.x00","K11.800x007","H61.100x005","J38.309","K12.200x003","J01.901","C02.300","K11.503","J33.800x002","H93.301","J31.005","S15.003","C00.200","C76.000x002","S13.500x010","S10.003","D10.308","C41.100","D17.000x003","S13.500x011","C02.400","H61.101","D04.400x001","H73.802","D04.300x001","K07.000x007","D14.004","A36.000x004","J36.x00","Q38.600x001","D16.407","C00.101","J39.001","S10.901","K11.100x002","H61.802","J32.800x008","J34.800x004","J39.203","J39.209","K03.101","S13.601","J38.001","K13.200x011","K13.700x007","S13.400x003","J95.000x001","C02.100x001","K11.903","J95.001","D37.000x003","J03.900","J11.802+H67.1*","D10.400","H92.000","C11.301","C03.901","J30.000","Q38.000x007","Q31.000","J95.500","Q16.301","D14.100","Q18.805","Q36.906","D03.200x002","D18.000x844","K00.204","C32.100x004","J06.000x002","R06.501","S00.302","S00.500x052","H91.200","Q38.000x003","H61.103","K03.000","J31.202","C78.302","S13.401","H93.300","K07.008","B44.800x006","J32.900x007","D44.600x002","H91.000","J04.005","H90.200","K07.101","C11.801","S11.800x081","C00.500x002","D37.016","J01.300","Q31.800x004","Q37.100","K08.202","K02.001","J30.400","S13.500x004","J38.200x001","C11.200","S03.200","K09.100x001","K13.100","K07.010","A18.202","Q35.502","D48.518","Q38.003","S13.500x006","C41.012","H83.800x002","K14.801","Q17.300x004","S02.400x001","A18.400x019","D16.401","K00.201","K05.202","C13.000","K11.000","S02.400x003","H93.102","J34.800x019","C06.100x005","H92.100x001","Q17.800x004","H91.900x004","S13.502","J02.903","J38.000x031","J39.101","K05.100","D23.300x004","K07.004","C41.006","K11.200","S02.612","C79.831","J32.906","H95.101","E85.400x006","Q31.801","S17.801","S17.000x001","K00.200x001","Q38.400","J32.102","C77.007","K05.200","K13.700x009","J00.x00x007","H73.900","K00.600x006","K13.200x009","C44.201","R04.100","H66.900x003","B48.300x002+K93.8*","H83.200x001","Q18.806","S19.800x002","Z42.006","H81.303","S12.803","Q27.302","C14.800x003","C41.000x023","S11.001","D18.100x004","K12.106","H60.303","D02.300","B87.400x001+H94.8*","D10.300x005","K14.803","S09.903","K09.800x005","D14.002","C71.900x010","K02.200","S01.200x031","K13.209","S11.003","K11.404","K09.100x004","J35.804","H71.x04","K10.213","C14.000","K11.204","C05.000","S09.902","J35.806","K11.800x002","D37.008","H60.500x006","K14.500x001","K13.000x012","J32.001","J04.003","D37.018","H70.002","Q30.800x005","K13.003","D37.000x010","Q30.100x001","S08.100","K09.205","J32.902","K00.202","K11.606","C30.004","I88.101","Q38.700","C32.300","Q67.200","H66.101","K08.807","S01.300x051","K07.200x003","Q85.900x031","S02.501","D48.200x006","J37.000","C03.900","S01.500x042","Q67.406","D37.000x005","J95.809","R43.800x002","J32.000x005","K04.600","C03.100x002","S02.803","K03.800x003","D10.500x001","K13.204","H66.301","K06.806","C30.102","K13.010","D48.702","S15.001","G47.302","J31.100","K00.206","C10.102","J39.200x008","K04.702","K10.302","H69.800","K04.300","T70.000","S02.411","D14.000x007","D48.200x007","J38.313","K13.014","S00.800x053","D38.507","S00.500x051","J38.201","K14.300x003","G47.304","D21.004","A18.800x034+K93.8*","Q38.802","S11.201","Q36.900x003","K07.000x013","C10.300","T17.001","H91.900","H83.800x003","J38.400","K00.205","J32.800x001","K00.502","Q17.400","J35.809","S09.800x003","K12.101","S10.002","C01.x01","H74.000","K09.203","K13.700x003","J10.100x001","T28.000x002","S03.400","K10.800x008","K07.202","D04.201","J06.800x001","K00.000x004","K06.901","Q18.200","D23.000","J34.106","J38.700x021","K13.600x001","Q17.500","K14.401","K09.002","K10.900x002","T27.401","S13.500x005","A18.805+K93.8*","K10.208","C79.504","K13.006","K04.801","H73.801","K07.302","S13.500x003","K04.703","J34.809","B02.801+H62.1*","H73.800x005","K07.009","Q38.004","T27.000x002","K13.203","J39.200x016","S02.600x031","C13.100x002","H65.900x001","K09.805","Q16.000","S01.300x002","H73.804","K10.809","D10.200x002","Z45.303","Q89.800x908","C46.200","D14.100x002","S17.800","K13.700x023","K02.800x006","S19.801","K06.800x015","D23.301","H81.000","D10.000x004","H60.501","Q18.400x004","C49.004","Q89.202","J34.800x002","Q35.700","H74.201","S10.801","H95.000x001","H65.102","R49.202","J95.803","H90.801","Q30.802","K13.210","Q34.801","Z43.000x002","K06.802","H81.902","H60.000x004","K00.600x002","K14.600x001","J34.000x010","Q38.500x002","K11.603","D03.401","K07.012","J05.000","K12.204","K10.101","S09.906","M95.209","C11.202","D14.000x006","K10.804","S01.300x011","K12.003","K13.200x010","J03.901","H60.500x007","D18.003","B48.100","K11.604","D10.402","J32.006","T18.002","A18.802+K93.8*","D23.200x003","H70.103","H80.200","J35.300","C79.503","A18.400x018","C44.300x005","Q17.300x002","D38.000x001","S00.404","C47.000x010","D17.700x003","Q27.300x010","Q67.300","D10.101","G47.300x037","B05.300+H67.1*","S00.000x053","K12.002","K03.105","Z41.102","J38.000x032","K11.700x001","J32.000x009","K06.804","K14.100x001","C13.200","D14.001","Q38.400x002","J04.000","J38.700x009","K13.200x006","K13.403","H61.805","C11.300x004","D10.000x005","C79.800x843","D14.103","K12.210","J32.005","T17.200","H60.000","Q37.300","J34.804","D37.015","K13.715","J39.811","C76.002","C79.800x845","K11.201","G47.301","D22.200x002","C14.002","Q16.400","S10.900","J34.107","H91.100","J38.600","S02.810","C13.800","C44.305","C09.100x003","D14.000x005","J06.900","J38.700x003","Q18.300","K13.013","K14.302","D21.000x002","J35.200","K08.801","C00.500x003","H73.100","C43.400x002","K09.200","Q16.101","J37.002","K10.207","J33.003","E85.401","C14.800x004","J32.101","I88.104","K14.400x001","J32.302","S15.800x002","H60.300x003","K12.200x011","C14.003","S01.500x051","K00.000x003","H65.300","K09.000","Q31.500","K03.600x001","J39.220","K13.603","J04.000x006","C32.103","J34.200","K06.808","Q35.302","S15.301","H80.100x002","H81.200","J38.311","D00.002","M85.000x081","D37.000x012","J32.900x011","C02.200x002","Q30.801","D11.900","K11.800x006","B36.902+H62.2*","B36.903+H62.2*","J37.004","H61.300","K03.300x001","K07.901","R49.100","S13.402","S13.500","S09.200","J36.x00x004","H66.200","T70.100","J95.000","C79.804","K02.300","J31.001","C00.300","K04.400","D18.000x021","I77.001","Q18.100x006","K07.100x009","K13.004","G47.300x031","Q17.302","K00.603","K04.201","C04.100","Q38.501","C47.000x008","K14.807","K10.901","C39.801","K13.206","K04.700","K11.207","S02.211","A36.200","C44.306","D37.014","K13.700x018","J10.803+H67.1*","D10.603","H73.803","K00.203","Q31.806","Q17.002","J03.000","C44.000","C00.900","J35.800x008","K00.200x010","S02.201","J33.804","K10.802","H60.100x001","C11.800","C02.300x003","J32.800x009","Q36.002","H72.001","D36.700x005","B44.800x001","D14.102","Q38.701","H65.400","Q17.900","Q38.000x005","D18.100x010","Q27.800x027","D22.302","D23.200x002","C41.005","K00.608","C08.800","J06.000","D10.200","J03.800","J34.810","C79.800x833","Q38.601","B44.800x004+H62.2*","J38.312","C00.500x005","C32.001","K10.000x004","D37.000x006","C10.400","C76.005","D11.702","K14.000x006","D16.400x013","J34.007","K11.700x003","H70.000","D48.200x003","K12.207","I86.000","J95.000x002","C02.100","C43.300","D00.011","S01.200x021","K13.700","K14.802","H68.100","H61.803","K05.400x002","D02.000x004","C11.302","D10.305","E10.600x031","K05.100x012","Z42.000x015","J38.000x012","K13.400x004","K07.100x014","J11.100x003","S02.412","K12.217","D23.200x008","I88.102","K07.003","T85.800x804","J38.101","K13.000x007","Q35.100","J38.304","K13.202","K07.104","S03.501","S09.900","S09.800x002","H93.901","T85.800x810","K09.204","H91.900x002","K08.203","Q37.200","K13.700x010","H70.003","J03.902","Q27.800x021","Q38.000x006","S15.801","H70.100","K11.200x012","S11.700","Q38.600x004","K03.500","K08.808","K11.205","K06.200","S19.800x004","K10.200","C76.000x007","S09.801","K07.011","C10.101","D16.410","D48.200x004","A18.600","H81.101","J38.400x002","J03.900x001","K02.400x001","K07.109","T17.300","C00.102","S01.300x031","A36.100","J32.904","K13.700x006","S00.300x051","D18.001","J38.307","K14.804","Q31.802","Q38.303","K03.900","K13.300","K14.808","S15.300","Q67.407","K05.200x002","C00.600","D10.501","K11.203","K10.002","J32.100","Q75.801","C08.900x001","C10.800","J31.004","K13.401","C00.200x002","K13.707","A18.804+K93.8*","D48.200x009","K07.108","C00.002","C00.800","K00.401","B08.802","J32.801","Q30.800x004","C13.101","K11.200x009","S03.400x002","D16.402","C06.102","D22.201","C00.302","D16.400x018","J32.003","K00.300x002","J31.002","Q18.200x004","K07.000x004","S02.600x091","R44.201","Q30.800x008","C11.000","D10.700","J38.707","L04.001","K11.101","K14.003","T85.800x811","Q31.804","D38.000x002","J01.200","K10.800x011","Q17.001","H93.103","Q35.501","H95.900","H74.900","H93.101","C06.100x004","K11.206","J30.300x001","S15.005","C13.900","K12.209","K11.200x011","Q35.500x004","K05.100x010","Q18.900x002","D16.406","D18.000x505","K12.208","C30.000","J34.800x001","K14.800x010","D18.000x511","Q85.905","J32.400","E85.409","S01.500x021","K05.105","K12.206","Q17.300x005","K08.805","C47.000x009","K05.100x005","S02.401","J35.800x009","J10.100","J38.300x013","C04.900","I77.003","K12.216","J38.308","K13.000x016","J38.705","H70.000x007","S00.401","H70.900","Q38.801","K07.110","J00.x00","S08.000","T16.x00x001","C11.900","C32.900","K00.400x002","J38.300x015","Q16.900","S02.600x021","K14.300x001","J35.805","K13.706","K12.114","Q35.900","C78.303","K13.000x006","K08.803","H60.801","K03.100x001","K13.500x002","D14.101","C11.101","C11.001","J32.301","H60.502","C43.200x001","Q17.801","D21.000x007","J00.x00x004","C13.100x001","Q89.800x906","H72.800","K11.701","Q31.900","Z42.010","K04.901","S02.700x004","D21.006","D22.301","M95.005","J01.400","H83.801","K04.803","K02.800x003","K07.000x009","D04.300x002","H72.900","G47.303","S03.000","S01.300x081","K08.101","H80.900","K05.301","J38.700x027","J39.224","C79.803","J39.809","K06.000","C10.900","D37.007","K03.106","Q38.300","A69.100x001","K11.801","J30.200","D14.008","C00.000","C09.900","D38.503","D10.303","J32.100x005","K07.900","J39.206","J39.222","C10.100","D22.401","K07.006","H92.100","D37.000x013","K00.605","Z46.400","D10.701","J39.207","K06.805","K07.300x007","S00.802","K06.900","C79.830","D21.005","G47.300x035","J34.813","S01.803","K14.900x002","C06.100x003","T17.200x001","A36.000","C06.001","M95.100","J38.002","K12.214","K04.800","K00.207","J39.214","C79.800x828","M31.301","K11.501","C02.300x002","G47.300","M95.206","K13.001","C41.000x020","C02.201","S03.301","K14.000x007","C32.800","K00.200x003","K10.103","H72.100","S00.500","J11.100x002","J09.x05+H67.1*","D37.006","K09.001","S15.002","D18.000x503","H74.300","K04.902","S10.101","S10.102","A18.200x005","J95.805","J32.900x008","K04.000x007","C12.x00x002","K03.001","T17.101","J01.001","J38.303","D00.008","D10.302","K03.800x005","K03.400","Q36.902","A18.601+H67.0*","J38.310","K00.200x002","C43.200x003","J34.806","K07.200x001","H65.900","J38.000x006","C41.011","K07.203","J32.201","Q87.000x301","S01.301","H81.301","C41.004","K12.108","H71.x01","H66.001","J39.002","S00.501","K12.115","K13.400","A18.800x006+K93.8*","K12.109","A36.000x003","K07.100x015","C79.500x004","K00.400x004","C06.901","J34.108","Q18.600","H72.200","J01.900x003","K10.805","J02.900x002","J38.702","A18.205","H91.300x001","J95.003","H93.100","K00.800x002","H61.200","J34.807","K11.700x002","K06.000x003","J39.200x004","C31.200","D17.700x007","Q18.807","Q17.200","K06.807","K09.801","H95.900x001","S01.700","J38.000x005","K10.800x002","Q16.901","D14.003","J34.800x009","K02.800x007","K12.212","Q18.800x004","Q18.801","C14.200","S13.500x007","J39.200x009","J38.102","C41.000x027","K00.400x001","K09.003","M95.208","C00.304","K07.100x011","J38.704","K12.218","C77.001","C79.201","H83.000","J38.000x011","C03.001","K02.500","B37.001","A18.800x025+K93.8*","K13.007","C78.301","A18.201","S09.900x006","K07.000x012","Q85.900x037","H61.806","C00.404","H74.300x004","Q27.800x040","C00.403","J32.200","J39.003","J95.807","J38.720","D00.001","K11.901","S13.500x008","Q75.400","D03.301","C11.201","K05.204","K14.500x002","Q18.102","S00.804","C31.300","K14.301","D17.700x032","Q30.201","G47.300x001","H83.900x001","K11.800","C49.000x005","C05.900","C77.002","K13.000x018","K03.800x001","J04.100","Q30.300","K02.800x002","H70.200","D18.000x807","D14.006","K06.801","J38.000x001","K12.100x002","Z41.103","K07.600x003","Q85.900x038","J02.900x005","J36.x00x001","H60.401","H90.600","J02.902","D23.201","K11.102","C30.005","A52.700x004+J99.8*","J32.802","J32.901","K11.806","S13.400x005","Q67.401","Q17.000x005","J38.300x008","D03.201","B44.804","J33.000","J39.000x001","H68.100x003","Q27.800x024","D38.003","S00.002","H65.000x002","C78.300x006","H61.801","H83.300x001","K12.000","A52.703+J99.8*","K09.807","J34.800x006","K02.800x008","K06.100x003","K13.703","S00.001","H61.104","K13.602","D02.000x003","K01.000","K13.205","Z45.301"};
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

        result=DB3.group(record);
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

