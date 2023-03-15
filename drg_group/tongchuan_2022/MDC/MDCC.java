package drg_group.tongchuan_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.tongchuan_2022.Base;
import drg_group.tongchuan_2022.MedicalRecord;
import drg_group.tongchuan_2022.ADRG.*;

public class MDCC{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"A06.801","A18.500x002","A18.500x005+H32.0*","A18.500x008+H13.1*","A18.500x010+H32.0*","A18.500x013+H22.0*","A18.501+H32.0*","A18.502+H32.0*","A18.503+H48.8*","A18.504+H22.0*","A18.506+H19.2*","A18.507+H19.0*","A30.900x006+H19.2*","A30.900x007+H32.0*","A36.800x006+H22.8*","A36.801+H13.1*","A39.801+H13.1*","A50.000x001+H32.0*","A50.001+H58.8*","A50.300+H58.8*","A50.300x002+H19.2*","A50.300x003+H32.0*","A50.301+H19.2*","A51.400x005+H22.0*","A51.402+H22.0*","A51.403+H32.0*","A51.404+H58.8*","A51.405+H58.8*","A52.100x012+H48.1*","A52.102+H58.0*","A52.700x015+H58.8*","A52.701+H22.0*","A52.702+H32.0*","A52.708+H58.8*","A54.300x002+H19.2*","A54.302+H13.1*","A54.303+H22.0*","A71.000","A71.100","A71.100x002","A71.100x003","A71.101","A71.900","A74.000+H13.1*","B00.500x002+H58.8*","B00.500x005+H19.1*","B00.500x007+H22.0*","B00.500x009+H22.0*","B00.501+H19.1*","B00.502+H13.1*","B00.503+H58.8*","B00.504+H03.1*","B00.504+H03.1*","B00.505+H22.0*","B00.506+H22.0*","B00.506+H22.0*","B00.507+H19.1*","B00.507+H19.1*","B00.508+H22.0*","B00.509+H03.1*","B02.301+H58.8*","B02.302+H19.2*","B02.303+H03.1*","B02.304+H13.1*","B02.305+H22.0*","B02.306+H22.0*","B02.307+H19.2*","B02.308+H19.0*","B05.800x001+H19.2*","B07.x02","B25.800x002+H19.2*","B25.802+H32.0*","B26.801+H13.1*","B30.000+H19.2*","B30.001+H19.2*","B30.100+H13.1*","B30.200+H13.1*","B30.201+H13.1*","B30.300+H13.1*","B30.301+H13.1*","B30.800+H13.1*","B30.900","B37.807+H48.8*","B49.x03+H19.2*","B49.x04+H19.2*","B58.000","B58.001+H32.0*","B60.100x002+H13.1*","B60.100x003+H19.2*","B60.100x004+H19.2*","B87.200x001+H58.8*","B89.x02+H06.1*","C43.100x001","C43.101","C44.100x002","C44.100x003","C44.100x004","C44.101","C44.102","C49.003","C69.000x001","C69.100","C69.200","C69.300","C69.400","C69.400x005","C69.401","C69.500x003","C69.501","C69.502","C69.503","C69.600","C69.600x001","C69.601","C69.602","C69.603","C69.604","C69.800","C69.900","C69.900x001","C69.901","C79.200x002","C79.400x014","C79.405","C79.406","C79.407","C79.408","C79.409","D03.100x002","D03.100x003","D04.100x001","D04.101","D09.200","D09.201","D09.202","D16.408","D17.700x005","D18.000x002","D18.000x804","D18.000x805","D18.000x821","D21.000","D21.003","D22.100","D22.100x004","D23.100x001","D23.100x002","D23.100x003","D23.101","D23.302","D31.000x001","D31.000x002","D31.100","D31.200","D31.300","D31.400","D31.402","D31.500x001","D31.500x003","D31.501","D31.502","D31.600","D31.600x001","D31.601","D31.602","D31.603","D31.604","D31.605","D31.900","D31.901","D48.200x010","D48.700x021","D48.703","D48.704","D48.705","D48.706","D48.900x014+H36.8*","D86.800x003+H22.1*","D86.801","E05.002+H06.2*","E05.902+H58.8*","E10.300x011+H36.0*","E10.300x012+H36.0*","E10.300x013+H36.0*","E10.300x014+H36.0*","E10.300x015+H36.0*","E10.300x021+H36.0*","E10.300x022+H36.0*","E10.300x023+H36.0*","E10.300x024+H36.0*","E10.300x025+H36.0*","E10.300x031+H36.0*","E10.300x032+H36.0*","E10.300x033+H36.0*","E10.300x034+H36.0*","E10.300x035+H36.0*","E10.300x036+H36.0*","E10.300x041+H36.0*","E10.300x042+H36.0*","E10.300x043+H36.0*","E10.300x044+H36.0*","E10.300x045+H36.0*","E10.300x046+H36.0*","E10.300x047+H36.0*","E10.300x051+H42.0*","E10.300x052+H22.1*","E10.300x053+H36.0*","E10.300x091+H28.0*","E10.301+H36.0*","E10.302+H28.0*","E10.303+H22.1*","E11.300x011+H36.0*","E11.300x012+H36.0*","E11.300x013+H36.0*","E11.300x014+H36.0*","E11.300x015+H36.0*","E11.300x021+H36.0*","E11.300x022+H36.0*","E11.300x023+H36.0*","E11.300x024+H36.0*","E11.300x025+H36.0*","E11.300x031+H36.0*","E11.300x032+H36.0*","E11.300x033+H36.0*","E11.300x034+H36.0*","E11.300x035+H36.0*","E11.300x036+H36.0*","E11.300x041+H36.0*","E11.300x042+H36.0*","E11.300x043+H36.0*","E11.300x044+H36.0*","E11.300x045+H36.0*","E11.300x046+H36.0*","E11.300x047+H36.0*","E11.300x051+H42.0*","E11.300x052+H22.1*","E11.300x053+H36.0*","E11.300x091+H28.0*","E11.301+H36.0*","E11.302+H28.0*","E11.303+H22.1*","E12.300","E13.300x271+H36.0*","E13.300x571+H36.0*","E14.300x011+H36.0*","E14.300x012+H36.0*","E14.300x013+H36.0*","E14.300x014+H36.0*","E14.300x015+H36.0*","E14.300x021+H36.0*","E14.300x022+H36.0*","E14.300x023+H36.0*","E14.300x024+H36.0*","E14.300x025+H36.0*","E14.300x031+H36.0*","E14.300x032+H36.0*","E14.300x033+H36.0*","E14.300x034+H36.0*","E14.300x035+H36.0*","E14.300x036+H36.0*","E14.300x041+H36.0*","E14.300x042+H36.0*","E14.300x043+H36.0*","E14.300x044+H36.0*","E14.300x045+H36.0*","E14.300x046+H36.0*","E14.300x047+H36.0*","E14.300x051+H42.0*","E14.300x052+H22.1*","E14.300x053+H36.0*","E14.300x054+H22.1*","E14.300x061+H28.0*","E14.300x071+H36.0*","E14.300x091+H28.0*","E14.400x180+G59.0*","E20.902+H28.1*","E50.000x001+H13.8*","E50.100x002+H13.8*","E50.200x001+H19.8*","E50.300x001+H19.8*","E50.400x001+H19.8*","E50.500x001+H58.1*","E50.600x001+H19.8*","E50.701+H19.8*","E65.x00x006","E70.302","E83.500x006+H28.1*","E85.418","E88.906+H28.1*","H00.000x001","H00.001","H00.002","H00.003","H00.100","H01.000","H01.100","H01.100x003","H01.100x004","H01.100x005","H01.100x006","H01.100x007","H01.101","H01.801","H01.802","H01.900","H01.901","H02.000","H02.000x004","H02.001","H02.002","H02.003","H02.004","H02.100","H02.101","H02.102","H02.103","H02.200","H02.300","H02.300x004","H02.301","H02.400","H02.500","H02.500x008","H02.501","H02.502","H02.503","H02.504","H02.506","H02.600","H02.700","H02.700x001","H02.700x008","H02.702","H02.703","H02.704","H02.705","H02.800x011","H02.800x014","H02.800x016","H02.800x018","H02.801","H02.802","H02.803","H02.804","H02.805","H02.806","H02.807","H02.808","H02.809","H02.810","H02.811","H02.812","H02.813","H02.900","H02.900x003","H02.901","H04.000","H04.000x004","H04.001","H04.002","H04.003","H04.100","H04.101","H04.102","H04.103","H04.104","H04.105","H04.200","H04.300","H04.300x004","H04.300x005","H04.302","H04.303","H04.304","H04.305","H04.400","H04.401","H04.402","H04.500x001","H04.500x004","H04.501","H04.502","H04.503","H04.504","H04.505","H04.506","H04.507","H04.508","H04.509","H04.600","H04.600x003","H04.601","H04.602","H04.603","H04.604","H04.800x002","H04.800x003","H04.801","H04.900","H04.900x001","H04.901","H05.000","H05.000x002","H05.000x006","H05.001","H05.002","H05.004","H05.005","H05.100","H05.100x003","H05.100x005","H05.100x008","H05.101","H05.102","H05.103","H05.104","H05.200","H05.201","H05.202","H05.203","H05.204","H05.205","H05.300","H05.300x003","H05.301","H05.400","H05.500","H05.500x001","H05.500x002","H05.800","H05.800x002","H05.800x003","H05.800x005","H05.800x006","H05.801","H05.802","H05.900","H05.900x002","H05.900x003","H05.900x004","H05.901","H10.000","H10.100","H10.101","H10.102","H10.103","H10.200","H10.200x001","H10.300","H10.400","H10.401","H10.500","H10.500x001","H10.800x001","H10.801","H10.900","H10.901","H11.000","H11.100","H11.100x001","H11.100x007","H11.101","H11.102","H11.103","H11.104","H11.105","H11.106","H11.107","H11.108","H11.200","H11.201","H11.300","H11.301","H11.400","H11.401","H11.402","H11.403","H11.404","H11.405","H11.800x005","H11.800x006","H11.801","H11.802","H11.803","H11.804","H11.805","H11.806","H11.807","H11.808","H11.900","H11.901","H15.000","H15.000x002","H15.001","H15.100","H15.800x008","H15.800x009","H15.800x010","H15.801","H15.802","H15.803","H15.804","H15.805","H15.806","H15.900","H16.000","H16.000x001","H16.000x006","H16.000x010","H16.001","H16.002","H16.003","H16.004","H16.005","H16.006","H16.007","H16.100","H16.100x004","H16.100x005","H16.100x006","H16.100x007","H16.100x008","H16.100x009","H16.101","H16.102","H16.103","H16.200","H16.200x001","H16.200x006","H16.201","H16.203","H16.204","H16.205","H16.300x004","H16.300x005","H16.301","H16.302","H16.303","H16.400","H16.401","H16.402","H16.800x003","H16.800x005","H16.800x006","H16.800x010","H16.800x014","H16.801","H16.802","H16.803","H16.804","H16.805","H16.900","H17.000","H17.100","H17.801","H17.802","H17.803","H17.901","H17.902","H18.000","H18.000x004","H18.000x005","H18.000x006","H18.001","H18.002","H18.003","H18.100","H18.200","H18.300","H18.300x001","H18.300x002","H18.400","H18.400x003","H18.400x004","H18.401","H18.402","H18.403","H18.404","H18.405","H18.500","H18.500x005","H18.500x007","H18.501","H18.502","H18.504","H18.506","H18.600","H18.700","H18.700x005","H18.701","H18.702","H18.800x005","H18.800x007","H18.800x009","H18.800x012","H18.800x014","H18.801","H18.802","H18.803","H18.804","H18.805","H18.806","H18.807","H18.808","H18.900","H18.901","H20.000x003","H20.000x004","H20.001","H20.002","H20.003","H20.004","H20.100","H20.100x002","H20.101","H20.101","H20.102","H20.200","H20.200x001","H20.800","H20.801","H20.802","H20.803","H20.804","H20.900","H20.900x002","H20.900x004","H20.900x006","H20.901","H21.000","H21.002","H21.003","H21.100","H21.101","H21.102","H21.103","H21.104","H21.200","H21.200x005","H21.200x006","H21.200x007","H21.200x008","H21.200x009","H21.201","H21.202","H21.203","H21.204","H21.300x005","H21.300x006","H21.300x007","H21.300x008","H21.300x009","H21.300x010","H21.300x011","H21.300x012","H21.300x013","H21.301","H21.302","H21.303","H21.400","H21.401","H21.402","H21.403","H21.500","H21.500x003","H21.500x004","H21.500x011","H21.500x013","H21.500x015","H21.501","H21.502","H21.503","H21.504","H21.505","H21.506","H21.507","H21.508","H21.510","H21.800","H21.800x001","H21.801","H21.802","H21.900","H21.901","H25.000","H25.000x002","H25.000x003","H25.000x005","H25.000x006","H25.000x007","H25.001","H25.002","H25.004","H25.100","H25.200","H25.800","H25.800x001","H25.800x002","H25.900","H26.000x001","H26.000x002","H26.000x005","H26.001","H26.002","H26.003","H26.100","H26.100x002","H26.200","H26.200x005","H26.201","H26.202","H26.300","H26.300x001","H26.300x004","H26.301","H26.400","H26.400x002","H26.400x003","H26.401","H26.801","H26.802","H26.900","H26.901","H27.000","H27.100","H27.101","H27.102","H27.800","H27.800x001","H27.900","H30.000","H30.000x002","H30.000x004","H30.000x005","H30.001","H30.100","H30.100x002","H30.100x003","H30.200","H30.201","H30.800x002","H30.801","H30.900","H30.900x001","H30.900x002","H30.901","H30.902","H30.903","H31.000","H31.000x001","H31.000x002","H31.000x004","H31.000x005","H31.100","H31.101","H31.102","H31.200","H31.200x002","H31.200x003","H31.200x004","H31.200x005","H31.200x006","H31.300","H31.300x004","H31.301","H31.302","H31.400","H31.400x003","H31.401","H31.402","H31.403","H31.404","H31.800x001","H31.800x002","H31.800x003","H31.800x004","H31.801","H31.802","H31.900","H31.901","H33.000","H33.000x005","H33.000x006","H33.000x007","H33.001","H33.002","H33.100","H33.100x004","H33.100x005","H33.100x006","H33.101","H33.102","H33.200","H33.200x002","H33.200x004","H33.300","H33.300x006","H33.301","H33.302","H33.303","H33.304","H33.400","H33.401","H33.500","H33.500x002","H33.500x006","H33.500x008","H33.501","H33.502","H33.503","H33.504","H33.506","H34.000","H34.100","H34.200","H34.200x002","H34.200x004","H34.200x005","H34.201","H34.202","H34.203","H34.204","H34.800","H34.800x001","H34.801","H34.802","H34.803","H34.804","H34.900","H34.900x001","H35.000","H35.000x004","H35.000x014","H35.000x017","H35.000x019","H35.000x020","H35.000x021","H35.001","H35.002","H35.004","H35.005","H35.006","H35.007","H35.008","H35.009","H35.010","H35.011","H35.012","H35.012","H35.013","H35.014","H35.015","H35.100","H35.200","H35.200x001","H35.300","H35.300x007","H35.300x008","H35.300x009","H35.300x010","H35.300x011","H35.300x012","H35.301","H35.302","H35.303","H35.304","H35.305","H35.306","H35.307","H35.400","H35.400x001","H35.400x003","H35.400x004","H35.400x005","H35.400x006","H35.400x007","H35.500","H35.500x003","H35.500x004","H35.500x005","H35.500x006","H35.500x007","H35.500x008","H35.500x009","H35.501","H35.502","H35.503","H35.600","H35.601","H35.602","H35.700","H35.700x005","H35.701","H35.702","H35.703","H35.800x005","H35.800x008","H35.800x009","H35.800x010","H35.800x011","H35.801","H35.802","H35.803","H35.804","H35.805","H35.806","H35.807","H35.808","H35.809","H35.900","H40.000","H40.000x001","H40.000x002","H40.000x004","H40.001","H40.002","H40.100","H40.100x001","H40.100x004","H40.101","H40.102","H40.103","H40.200","H40.200x006","H40.200x007","H40.200x009","H40.200x010","H40.200x011","H40.200x012","H40.202","H40.203","H40.300","H40.300","H40.400","H40.401","H40.403","H40.500","H40.500x001","H40.500x002","H40.500x008","H40.500x009","H40.501","H40.502","H40.503","H40.504","H40.505","H40.506","H40.600","H40.600x002","H40.800x002","H40.800x004","H40.800x005","H40.801","H40.900","H43.000","H43.001","H43.100","H43.100x003","H43.200","H43.200x001","H43.300","H43.800x003","H43.800x004","H43.800x005","H43.801","H43.802","H43.803","H43.804","H43.805","H43.806","H43.900","H44.000","H44.000x002","H44.000x005","H44.000x007","H44.001","H44.002","H44.003","H44.100","H44.100x003","H44.101","H44.102","H44.103","H44.104","H44.200","H44.200x001","H44.300","H44.300x001","H44.300x002","H44.300x003","H44.301","H44.302","H44.400","H44.401","H44.402","H44.500","H44.501","H44.502","H44.503","H44.600","H44.600","H44.600x002","H44.600x003","H44.600x004","H44.600x005","H44.600x006","H44.600x007","H44.700","H44.700","H44.700x002","H44.700x003","H44.700x004","H44.700x005","H44.700x007","H44.700x008","H44.700x009","H44.800","H44.801","H44.802","H44.803","H44.900","H44.901","H46.x00","H46.x01","H46.x02","H47.000","H47.000x009","H47.001","H47.002","H47.003","H47.004","H47.005","H47.006","H47.100","H47.101","H47.200","H47.200x003","H47.200x004","H47.300","H47.300x005","H47.301","H47.302","H47.303","H47.304","H47.400","H47.500","H47.500x002","H47.500x003","H47.500x004","H47.600x001","H49.001","H49.201","H49.300","H49.400","H49.400x001","H49.800","H49.800x002","H49.800x007","H49.801","H49.803","H49.804","H49.805","H49.806","H49.807","H49.808","H49.809","H49.810","H49.900","H49.901","H50.000","H50.000x002","H50.000x004","H50.000x009","H50.001","H50.002","H50.003","H50.004","H50.005","H50.006","H50.007","H50.008","H50.100","H50.100x002","H50.100x004","H50.100x007","H50.101","H50.102","H50.103","H50.104","H50.105","H50.106","H50.107","H50.200","H50.200x004","H50.200x006","H50.201","H50.202","H50.300","H50.300x002","H50.300x004","H50.301","H50.302","H50.400","H50.401","H50.402","H50.403","H50.404","H50.405","H50.500","H50.500x002","H50.500x003","H50.500x004","H50.600","H50.600x003","H50.600x004","H50.600x005","H50.601","H50.602","H50.603","H50.800x002","H50.800x003","H50.800x006","H50.800x007","H50.800x010","H50.801","H50.802","H50.803","H50.804","H50.805","H50.806","H50.807","H50.900","H51.000","H51.000x001","H51.100","H51.200","H51.800","H51.801","H51.900","H52.000","H52.100","H52.101","H52.200","H52.300x002","H52.301","H52.400","H52.500","H52.500x001","H52.500x003","H52.500x004","H52.501","H52.600","H52.700","H52.701","H53.000","H53.000x001","H53.000x004","H53.000x005","H53.001","H53.002","H53.100","H53.100x001","H53.100x004","H53.101","H53.102","H53.103","H53.104","H53.105","H53.200","H53.300","H53.300x001","H53.300x002","H53.300x003","H53.300x004","H53.400","H53.400x003","H53.400x004","H53.400x005","H53.400x006","H53.400x007","H53.401","H53.402","H53.500","H53.500x002","H53.500x003","H53.500x004","H53.500x005","H53.500x006","H53.500x007","H53.500x008","H53.500x009","H53.501","H53.600","H53.800x001","H53.800x002","H53.801","H53.802","H53.803","H53.900","H54.000","H54.001","H54.100","H54.200","H54.300","H54.400","H54.400x002","H54.500","H54.600","H54.601","H54.900","H55.x00","H55.x00x001","H55.x00x002","H55.x00x005","H55.x01","H57.000","H57.000x003","H57.001","H57.002","H57.003","H57.100","H57.100x002","H57.800x003","H57.800x004","H57.800x007","H57.900","H59.000","H59.001","H59.002","H59.003","H59.800x003","H59.800x004","H59.800x007","H59.800x008","H59.800x009","H59.800x010","H59.800x011","H59.800x013","H59.800x014","H59.800x015","H59.801","H59.802","H59.803","H59.804","H59.805","H59.806","H59.807","H59.808","H59.809","H59.810","H59.811","H59.812","H59.813","H59.900","I70.800x003","I70.800x007","I70.801","I72.803","I77.004","I80.801","I86.803","L65.905","M35.005+H19.3*","N18.504+H32.8*","N18.508+H32.8*","Q10.000","Q10.100","Q10.200","Q10.300","Q10.300x008","Q10.300x011","Q10.300x012","Q10.301","Q10.302","Q10.303","Q10.304","Q10.306","Q10.307","Q10.400","Q10.401","Q10.402","Q10.403","Q10.404","Q10.500","Q10.500x003","Q10.500x004","Q10.600","Q10.600x002","Q10.601","Q10.602","Q10.700","Q10.701","Q11.000","Q11.100","Q11.200","Q11.200x001","Q11.201","Q11.202","Q11.203","Q11.300","Q12.000","Q12.001","Q12.002","Q12.100","Q12.200","Q12.300","Q12.400","Q12.800","Q12.801","Q12.900","Q13.000","Q13.100","Q13.101+H42.8*","Q13.201","Q13.202","Q13.203","Q13.300","Q13.301","Q13.400x001","Q13.400x004","Q13.400x006","Q13.401","Q13.405","Q13.500","Q13.500x002","Q13.801","Q13.802","Q13.803","Q13.900","Q14.000","Q14.000x006","Q14.001","Q14.002","Q14.003","Q14.100","Q14.100x003","Q14.101","Q14.102","Q14.103","Q14.104","Q14.200","Q14.200x001","Q14.200x002","Q14.200x004","Q14.201","Q14.202","Q14.203","Q14.300x001","Q14.301","Q14.801","Q14.900","Q15.000","Q15.000x001","Q15.002","Q15.003","Q15.004","Q15.005","Q15.801","Q15.802","Q15.803","Q15.900","Q18.803","Q75.500","Q82.800x017","Q85.804","Q85.900x046","Q87.005","Q87.800x910","R44.100","R93.800x008","R94.101","R94.105","R94.106","S00.100x001","S00.100x003","S00.100x006","S00.101","S00.200","S00.201","S00.202","S01.000x002","S01.100","S01.101","S01.102","S01.103","S02.311","S02.801","S02.811","S04.000x001","S04.000x002","S04.000x003","S04.000x004","S04.100","S05.000x002","S05.001","S05.002","S05.100x004","S05.101","S05.102","S05.103","S05.104","S05.200x003","S05.200x004","S05.200x005","S05.200x006","S05.200x007","S05.201","S05.202","S05.203","S05.204","S05.205","S05.206","S05.207","S05.208","S05.209","S05.210","S05.300","S05.300x004","S05.300x005","S05.300x010","S05.301","S05.302","S05.303","S05.304","S05.305","S05.306","S05.307","S05.400x001","S05.400x002","S05.401","S05.500x001","S05.500x002","S05.500x003","S05.600x002","S05.601","S05.602","S05.603","S05.604","S05.605","S05.700","S05.800x001","S05.800x007","S05.800x008","S05.800x009","S05.801","S05.802","S05.803","S05.804","S05.805","S05.806","S05.807","S05.808","S05.809","S05.810","S05.811","S05.812","S05.900","S05.900x003","S05.901","S05.902","S05.903","T15.000","T15.100x001","T15.101","T15.800x001","T15.800x002","T15.801","T15.900","T20.000x010","T20.000x011","T20.000x012","T20.100x010","T20.100x011","T20.100x012","T20.200x010","T20.200x011","T20.200x012","T20.300x010","T20.300x011","T20.300x012","T20.400x010","T20.400x011","T20.400x012","T20.500x010","T20.500x011","T20.500x012","T20.600x010","T20.600x011","T20.600x012","T20.700x010","T20.700x011","T20.700x012","T26.000","T26.001","T26.002","T26.100x001","T26.100x003","T26.101","T26.102","T26.200x001","T26.301","T26.400","T26.400x001","T26.401","T26.500","T26.500x002","T26.500x003","T26.600x001","T26.600x002","T26.600x003","T26.601","T26.602","T26.603","T26.604","T26.605","T26.700x001","T26.800x001","T26.900","T26.900x001","T26.901","T26.902","T66.x02+H47.5*","T79.800x006","T85.200","T85.200x001","T85.200x002","T85.201","T85.202","T85.300x001","T85.300x003","T85.300x004","T85.300x005","T85.300x006","T85.300x007","T85.300x008","T85.300x009","T85.301","T85.302","T85.303","T85.304","T85.308","T85.309","T85.310","T85.311","T85.312","T85.800x805","T85.800x806","T85.800x807","T85.800x808","T85.800x809","T85.903","T86.800x802","T86.800x804","T86.800x811","T86.800x812","T86.800x816","T86.801","T86.809","T86.810","T90.101","Z03.801","Z41.101","Z42.003","Z42.004","Z44.201","Z46.000","Z48.801","Z52.500"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCC入组条件，匹配规则：主诊断匹配");
        String result;

        result=CB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=CB2.group(record);
        if (result.length()>0){
            return result;
        }

        result=CB3.group(record);
        if (result.length()>0){
            return result;
        }

        result=CB4.group(record);
        if (result.length()>0){
            return result;
        }

        result=CC1.group(record);
        if (result.length()>0){
            return result;
        }

        result=CD1.group(record);
        if (result.length()>0){
            return result;
        }

        result=CD2.group(record);
        if (result.length()>0){
            return result;
        }

        result=CJ1.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合CQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "CQY";
        }

        result=CR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=CS1.group(record);
        if (result.length()>0){
            return result;
        }

        result=CT1.group(record);
        if (result.length()>0){
            return result;
        }

        result=CU1.group(record);
        if (result.length()>0){
            return result;
        }

        result=CV1.group(record);
        if (result.length()>0){
            return result;
        }

        result=CW1.group(record);
        if (result.length()>0){
            return result;
        }

        result=CX1.group(record);
        if (result.length()>0){
            return result;
        }

        result=CZ1.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCC的ADRG入组条件");
        return "";
    }
}

