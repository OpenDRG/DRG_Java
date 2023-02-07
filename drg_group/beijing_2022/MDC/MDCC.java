package drg_group.beijing_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.ADRG.*;

public class MDCC{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"A50.300x003+H32.0*","T26.002","H15.100","T26.500x003","S05.206","Q10.300x012","Q12.002","R94.105","E10.300x031+H36.0*","B00.509+H03.1*","A18.506+H19.2*","E11.300x053+H36.0*","H35.501","Q18.803","B00.501+H19.1*","D23.100x003","H21.507","H04.801","S04.000x003","H11.403","H18.807","B26.801+H13.1*","Q15.000","E11.300x043+H36.0*","E10.300x014+H36.0*","H43.804","H47.304","E11.300x011+H36.0*","H05.800x003","H34.204","S05.301","E14.300x042+H36.0*","E10.300x046+H36.0*","H01.101","S05.800x009","H02.805","R94.106","H40.103","H26.202","H16.100x005","H02.800x016","H59.003","H31.100","Q14.200x001","H50.102","H15.803","H34.801","T86.800x816","H18.802","H11.100x001","H31.000x001","H52.500x001","Q14.102","H02.002","T86.810","H05.004","C79.407","T20.300x010","T85.308","H27.102","Q10.302","H35.801","D09.200","H53.500x003","H04.002","H43.801","H18.405","T85.312","T26.901","T26.301","S01.100","H53.100x001","H35.300x009","H50.806","T85.800x808","H50.105","H05.900","H10.103","H40.002","S05.805","S05.208","H53.500x005","Q14.203","H02.806","T85.310","H18.002","E11.300x044+H36.0*","D31.601","B00.500x009+H22.0*","H16.100","A71.100x003","S00.100x001","D09.201","H26.301","H01.100","H35.300x010","H31.402","H31.800x003","E11.300x033+H36.0*","H53.001","H35.500x005","S05.802","H21.100","H21.200x009","H40.200x012","H50.301","H33.200x002","H54.400x002","H33.100x004","T26.602","H18.001","H01.100x007","H10.800x001","H21.000","H51.800","H15.804","S05.603","H35.013","D31.100","T26.102","T26.001","A18.504+H22.0*","Q13.803","D48.705","H18.000x006","T20.100x012","H02.500","S05.205","H18.702","H44.600x006","T26.100x001","S00.200","H54.400","T85.800x806","A18.500x010+H32.0*","H30.800x002","H50.600x003","H54.100","H35.100","H10.500x001","Q12.200","Q14.103","Z44.201","H31.000x002","A18.507+H19.0*","Q14.101","H11.106","H50.006","H50.401","H53.104","H35.805","T85.903","E11.300x035+H36.0*","S05.102","H16.005","H47.000x009","H15.800x008","H50.402","B00.508+H22.0*","H40.200x007","H02.901","T26.605","E14.400x180+G59.0*","Q14.801","H16.203","T85.300x004","T26.600x003","H26.000x001","H40.500x001","H04.302","R94.101","B02.303+H03.1*","Q11.203","Q10.100","H16.804","H44.700x008","H20.102","Q10.300x008","H04.509","H30.000x004","Q11.100","H21.500x003","S02.311","E10.300x045+H36.0*","Q15.900","S05.103","E85.418","H49.808","S05.808","H33.200","C69.800","H21.300x009","E20.902+H28.1*","H50.600","D22.100","T20.500x011","A52.702+H32.0*","H04.102","T86.800x802","H05.100x008","D31.600x001","H11.105","Q14.001","H59.900","E50.000x001+H13.8*","H44.001","D18.000x804","H31.200x003","S05.602","E11.300x032+H36.0*","T20.200x012","H20.900x006","H47.004","S02.811","H21.300x013","H04.300x005","E10.300x013+H36.0*","H31.800x004","A74.000+H13.1*","H11.802","H18.100","Q14.002","H21.103","H21.800x001","H35.800x005","Q85.900x046","A52.700x015+H58.8*","Q10.000","T15.801","C79.200x002","A51.400x005+H22.0*","H02.900x003","E11.300x036+H36.0*","H04.601","H04.800x003","A54.300x002+H19.2*","D04.100x001","H15.802","C69.401","S05.605","H00.001","H18.400x004","H16.402","T15.101","E14.300x025+H36.0*","H02.705","H16.801","T26.604","E12.300","H54.200","H40.900","H35.304","H49.809","H53.400x006","H44.000x005","H02.101","H59.802","E10.300x032+H36.0*","H21.201","S05.801","H35.000x004","H55.x00x001","B00.504+H03.1*","H50.600x005","H51.801","H26.200","H27.800x001","H50.202","H59.809","C44.100x002","E11.300x042+H36.0*","E10.300x011+H36.0*","H30.100x003","T86.800x812","H25.002","H44.600x007","Q10.500x004","H33.501","H50.403","E13.300x271+H36.0*","H57.800x003","H11.104","H21.302","H21.104","H50.201","H02.502","H53.200","H16.100x006","H40.000x004","H16.800x006","H53.000x001","H35.303","H50.008","H31.401","H26.300","B02.302+H19.2*","T15.100x001","H44.700x003","B00.500x005+H19.1*","H43.300","E10.300x044+H36.0*","H44.502","H18.403","H16.000x006","H02.504","S05.600x002","H49.300","H02.800x011","H21.502","T26.603","H40.500x008","H00.003","E14.300x036+H36.0*","H53.800x002","C69.400","H26.002","H02.800x018","D86.800x003+H22.1*","H53.501","H33.100","H05.100x005","H15.800x010","H50.300","H16.300x004","H02.500x008","Q10.303","H47.005","Q13.201","S05.200x003","H04.600x003","S05.306","H02.900","E11.300x014+H36.0*","B05.800x001+H19.2*","B60.100x004+H19.2*","H02.700","C43.101","H35.400x007","Q12.801","I70.800x007","H05.103","H10.100","H50.801","H05.202","D23.302","H21.802","D31.600","B87.200x001+H58.8*","H04.305","H18.400x003","H40.401","A36.801+H13.1*","Z46.000","H05.205","A18.500x008+H13.1*","B30.000+H19.2*","H11.803","H47.200x004","Q10.307","E10.300x047+H36.0*","H54.500","H40.800x004","D48.200x010","H35.002","H34.201","H11.402","S05.200x005","H11.107","S05.800x001","H02.700x001","H40.500x009","H51.900","H50.807","E14.300x054+H22.1*","H02.000","H18.800x005","H50.000","H33.100x005","B25.802+H32.0*","H35.703","H52.300x002","H18.800x014","C79.400x014","A18.500x005+H32.0*","H59.800x004","S05.804","H21.403","H25.800","H40.504","H02.004","Q10.404","H53.500x009","H04.001","H53.401","H44.600x003","H16.100x008","H53.100","H31.901","H50.302","H16.300x005","H40.400","B60.100x002+H13.1*","H47.100","H16.100x009","H04.303","H35.400x003","H49.800x002","Q10.600x002","H44.901","T20.400x010","H21.202","H02.810","S05.400x002","S05.401","H53.300x001","Q11.200","H05.500x002","S05.803","Q15.000x001","T26.401","H59.813","H53.801","H33.300x006","E10.300x035+H36.0*","H47.003","T20.200x010","H35.502","S05.900x003","E50.400x001+H19.8*","H18.000","E11.300x021+H36.0*","E10.302+H28.0*","H35.007","H26.400","H11.806","Q12.001","H44.800","H31.301","D31.400","H35.200","T15.800x001","A39.801+H13.1*","B00.503+H58.8*","H20.800","L65.905","H02.804","H30.000","E14.300x046+H36.0*","Q10.401","Q87.800x910","S05.100x004","H35.602","H20.900","H16.102","H26.001","H15.805","H05.200","H25.000x006","H02.811","H30.200","H33.500x008","E14.300x021+H36.0*","H44.801","H11.103","H44.200x001","T86.800x811","H47.500x003","S05.812","Q13.400x006","H35.500x007","S05.304","H11.800x006","E11.300x052+H22.1*","H33.000x007","H35.300x012","H52.100","D48.704","H35.010","H30.900","H31.000","H01.100x003","H35.300x011","S05.806","Q13.301","H53.500x007","D23.100x002","H50.500","H31.200","T79.800x006","H49.801","H18.800x009","H44.102","T85.800x805","E14.300x032+H36.0*","S00.100x003","T20.400x011","T85.304","H35.000x017","H47.006","H31.400","H31.900","H35.000x019","T85.300x001","H16.100x004","H44.600","S05.901","H53.400x007","H18.805","H47.500","H35.804","H04.506","E11.300x091+H28.0*","A71.100","H21.500x015","H02.800x014","H10.102","H33.503","C69.400x005","H40.200x010","H52.500x004","A50.000x001+H32.0*","E11.302+H28.0*","H44.600x005","E10.300x015+H36.0*","H44.300x002","H18.506","H57.100x002","B02.304+H13.1*","H05.802","H16.204","S05.207","H20.900x004","H11.108","H44.301","E14.300x053+H36.0*","A18.500x002","H02.301","T20.400x012","H18.003","Q11.300","H16.101","H11.804","H30.900x001","S05.302","C69.600","H54.000","H16.205","H46.x01","H57.003","S05.303","H04.104","H15.001","H21.200x008","H31.200x006","S05.001","A71.000","H11.801","Q14.200x004","B07.x02","H18.600","H02.501","Q13.400x004","H34.200","B30.001+H19.2*","C44.101","H11.901","H53.300x004","Z41.101","H16.302","H40.500x002","H49.201","E10.300x036+H36.0*","H31.101","H34.800x001","S05.400x001","T85.200x002","H31.800x001","C69.501","H53.500x004","H35.300","T85.311","D22.100x004","C69.100","H47.200x003","C79.406","H11.405","D03.100x003","H33.002","T20.700x010","D23.100x001","H18.700x005","E11.300x015+H36.0*","H53.900","H04.901","E10.300x034+H36.0*","H54.900","H16.200","H53.000x005","E50.500x001+H58.1*","C43.100x001","C69.600x001","H35.601","H49.807","B02.307+H19.2*","E10.300x043+H36.0*","D18.000x002","E14.300x043+H36.0*","H11.807","H11.404","A54.302+H13.1*","E10.300x052+H22.1*","S05.209","Q87.005","H16.800x003","H44.000","S05.200x004","H16.800x014","Q82.800x017","T85.300x003","T26.500x002","H44.700x007","H21.400","H33.300","D18.000x821","H50.004","A51.405+H58.8*","B30.300+H13.1*","H20.901","H47.002","H26.000x005","H43.800x003","E14.300x031+H36.0*","Q10.600","H30.903","H35.300x008","D31.900","H18.803","H04.602","H18.700","H35.807","H16.000x010","S04.000x002","H35.015","H05.301","S01.102","H21.500x004","S05.811","H40.801","E50.600x001+H19.8*","H40.001","E11.300x051+H42.0*","S04.100","H35.500x003","H59.800x003","H04.500x001","T26.500","H02.803","H15.806","H35.400x006","H17.000","H17.801","H05.300x003","H16.802","H18.808","H33.100x006","H31.403","H05.800x002","C44.102","H49.805","Q14.200x002","E14.300x047+H36.0*","H49.400","T20.700x012","T20.500x012","H40.100x004","B02.301+H58.8*","H18.502","H30.900x002","B37.807+H48.8*","H11.401","H18.404","H02.702","D31.502","H05.800x006","Q14.003","H33.303","H52.500","H53.803","H40.500","H44.302","E14.300x034+H36.0*","H05.800x005","H44.803","H52.501","H05.400","H17.803","H21.200","A51.404+H58.8*","H20.002","T20.600x012","H05.204","H40.506","H35.305","H18.200","H21.300x007","H47.200","H47.300","Q10.402","H35.806","H11.200","C79.408","H26.400x003","H49.806","A50.300x002+H19.2*","H43.200","Q14.200","D31.000x001","H50.602","H53.102","H25.900","H18.401","S05.307","H57.002","H50.601","H33.304","T85.300x006","H53.402","H59.002","B60.100x003+H19.2*","H05.500","H34.200x004","H34.100","H50.103","H59.805","H27.800","H16.800x010","H40.600","H21.101","H57.800x007","H51.100","E10.300x053+H36.0*","H02.802","H44.000x002","H02.703","H49.800","H21.203","Q14.301","H00.000x001","H59.801","E05.902+H58.8*","H05.900x003","H10.000","D31.200","H02.700x008","H35.800x011","C69.901","H35.500","H20.001","H10.300","H53.000","H59.800x009","A71.100x002","M35.005+H19.3*","H33.502","H18.500x005","E14.300x041+H36.0*","H04.504","H20.803","D18.000x805","D31.605","H57.800x004","H20.101","H26.801","E50.701+H19.8*","Q13.900","H47.400","H40.505","E11.300x031+H36.0*","T85.303","E10.300x025+H36.0*","H05.900x002","H55.x01","S05.300x004","H01.802","H44.600x002","H18.300","H05.102","H18.501","H59.803","D48.900x014+H36.8*","H52.101","H01.100x005","S05.104","T85.300x007","H21.801","H59.800x011","H44.900","H18.000x004","H31.200x004","H33.101","Q14.000x006","H44.402","H50.803","S05.101","H21.500x011","A52.100x012+H48.1*","H21.506","D86.801","H26.900","Q10.301","H05.300","H40.200x011","H31.300","H33.401","Q13.802","S05.200x007","H26.201","H53.600","H21.301","S04.000x004","Q12.800","H50.104","H34.900x001","S05.000x002","D09.202","C69.500x003","H21.002","B30.800+H13.1*","E10.300x023+H36.0*","S05.002","Z48.801","S00.101","H57.000x003","H05.800","H31.300x004","S05.903","T20.200x011","B30.200+H13.1*","H16.006","C69.604","H04.507","T20.700x011","A18.501+H32.0*","H16.201","H20.004","H34.203","E14.300x051+H42.0*","H11.900","H50.500x004","E10.303+H22.1*","C69.502","H53.400","Q10.700","Q11.201","B00.502+H13.1*","H11.101","H51.000x001","H10.200x001","D04.101","E14.300x033+H36.0*","H52.500x003","H15.000","Q10.400","H11.301","H05.104","H30.100x002","H44.700x002","T20.000x011","S00.202","H25.000x003","H35.011","H21.300x006","H04.105","D21.000","E11.300x046+H36.0*","H04.900","H04.101","H27.100","H31.801","H04.400","E70.302","H49.900","H10.900","Q12.900","H11.000","H21.200x005","H46.x00","H04.200","H16.001","H10.200","H05.000x002","H25.200","H21.508","E11.301+H36.0*","H40.403","H35.014","H20.100x002","Q85.804","H04.600","H01.801","H21.900","H20.200x001","S05.601","H25.100","H04.500x004","H02.400","H53.500x002","H21.401","I77.004","H50.200x006","H35.700x005","H16.004","H34.800","Q10.602","A30.900x006+H19.2*","B00.505+H22.0*","H17.902","H57.000","H25.000","Q10.200","Q13.500x002","H18.300x001","H34.803","H40.200x009","I72.803","T15.800x002","H05.101","H47.500x002","H02.506","S05.202","Q15.802","Q14.300x001","A52.102+H58.0*","T26.600x002","H15.900","H49.800x007","H21.200x006","A50.301+H19.2*","H33.500x006","Q13.401","H53.400x004","H59.808","H27.900","E10.300x042+H36.0*","Q11.202","E14.300x015+H36.0*","D31.000x002","H01.000","H04.300x004","D31.402","H04.100","H35.012","A50.001+H58.8*","H35.300x007","T26.800x001","H21.003","H04.508","H20.000x004","H43.001","H02.200","A30.900x007+H32.0*","B58.000","H26.400x002","I70.801","T26.902","H52.400","B30.100+H13.1*","H35.808","H50.800x010","H21.901","H50.805","H44.100x003","S05.201","E14.300x044+H36.0*","H43.900","T85.800x809","H10.901","Z03.801","H11.100x007","H02.801","H53.101","T85.200","S02.801","H59.804","I70.800x003","H10.500","H44.500","H40.000x002","Q15.803","H04.604","H33.504","H05.901","C69.603","H50.000x009","H50.101","E11.300x045+H36.0*","E10.301+H36.0*","S01.103","H18.804","H31.000x005","H40.800x005","Q15.801","E14.300x013+H36.0*","H11.300","H49.901","E65.x00x006","H05.801","H35.701","H40.102","H02.103","H44.400","T26.400","H33.000x005","E11.300x024+H36.0*","T26.100x003","H35.800x008","H50.800x002","E10.300x033+H36.0*","H35.200x001","H35.301","H18.402","C69.300","H20.100","H50.107","H33.200x004","H44.700","H47.301","T20.600x011","H50.900","H50.100x004","H50.802","H35.500x006","A52.701+H22.0*","A71.101","H11.102","H57.100","C44.100x004","H40.501","H16.400","H53.103","H52.701","C69.200","E14.300x071+H36.0*","H40.800x002","E11.300x034+H36.0*","S05.204","B30.900","Q10.403","S05.210","A06.801","H40.200x006","H47.300x005","T85.800x807","Q15.005","Q10.300x011","H47.302","H50.007","H50.100","C69.900x001","A18.502+H32.0*","H52.301","H53.800x001","H35.000","H26.100","S05.900","T26.700x001","Q12.400","H16.301","E11.300x012+H36.0*","E14.300x014+H36.0*","H04.401","Q14.104","T20.000x012","T85.300x005","H52.200","C69.503","D31.901","H10.801","H27.101","H02.300x004","H02.812","H53.105","H34.200x005","T26.101","S05.902","H05.002","H02.102","H59.811","T86.800x804","H04.304","D17.700x005","H11.201","H04.000","H43.800x004","H50.800x007","H35.008","H26.000x002","H59.800x007","B02.308+H19.0*","H50.001","T86.809","H33.500","B02.306+H22.0*","H34.000","E11.300x025+H36.0*","H33.001","H44.700x004","H50.404","H31.200x002","H54.300","T85.202","H34.802","S01.000x002","H50.405","H18.806","H35.503","H04.501","Q14.201","S04.000x001","S05.500x001","B00.507+H19.1*","H40.000x001","Q10.304","Q11.200x001","H35.307","R93.800x008","H11.100","H17.901","H33.400","H35.500x009","D16.408","E11.300x013+H36.0*","H18.800x007","S05.500x002","E10.300x012+H36.0*","H49.400x001","Q13.101+H42.8*","H01.100x004","T26.601","T20.500x010","E83.500x006+H28.1*","E11.300x022+H36.0*","Q13.405","T85.300x009","H53.300x002","D31.500x003","Q10.306","H18.800x012","H25.000x007","H50.002","C49.003","H59.001","E10.300x024+H36.0*","H30.001","S05.800x007","H20.801","H35.900","H50.100x007","H50.603","S01.101","H05.100","H05.000x006","E14.300x012+H36.0*","H44.103","H43.100","Q11.000","H26.802","T90.101","H35.400x004","H33.301","H54.001","E10.300x041+H36.0*","E14.300x091+H28.0*","H25.800x001","B89.x02+H06.1*","H44.000x007","H35.800x010","Q12.300","H40.502","H49.001","H20.804","H50.600x004","Q13.203","H11.805","Q14.202","H27.000","Z42.004","S05.300x010","H26.100x002","H16.000","H35.302","S05.604","H44.802","H40.300","H53.400x003","Q15.004","H05.900x004","A51.403+H32.0*","H31.802","H57.900","H47.101","A18.500x013+H22.0*","H53.002","H26.200x005","H53.500","H44.700x009","T15.000","H16.003","E14.300x035+H36.0*","H05.500x001","H44.104","E10.300x051+H42.0*","H16.900","H21.510","E14.300x023+H36.0*","H47.000","H05.005","H51.200","H59.807","S05.300x005","H04.300","E10.300x022+H36.0*","H16.200x006","S00.100x006","H02.100","H02.808","H01.100x006","N18.504+H32.8*","C44.100x003","T15.900","H16.200x001","H16.100x007","H21.300x012","H02.003","H02.000x004","D31.604","H34.804","B30.301+H13.1*","H50.400","H59.800x014","T26.900x001","H51.000","H01.901","H30.901","H52.700","Q10.701","H21.503","H00.100","E13.300x571+H36.0*","H25.001","H30.100","H55.x00x005","H43.100x003","H59.000","T20.100x010","D31.501","A50.300+H58.8*","Q15.003","T85.200x001","E11.303+H22.1*","T20.600x010","H31.800x002","T26.600x001","H40.202","H11.800x005","H44.300x001","A36.800x006+H22.8*","H44.300x003","H34.202","H52.000","H31.102","H04.502","H30.801","E10.300x091+H28.0*","H33.506","H53.400x005","H04.505","H26.901","H40.200","H04.800x002","T85.301","H46.x02","T20.100x011","H20.900x002","H18.500","Q10.500x003","Q13.000","H04.000x004","H44.503","Q13.202","H18.000x005","H59.800x010","H35.400x001","T20.300x011","H35.000x014","T26.200x001","E11.300x047+H36.0*","H18.801","T20.000x010","H05.203","A54.303+H22.0*","H25.004","Q10.601","H59.800x008","H35.000x020","H44.600x004","H16.000x001","H50.000x002","D31.300","H31.000x004","H43.000","H25.800x002","H18.900","E50.300x001+H19.8*","H20.802","S05.700","H04.103","H02.807","A52.708+H58.8*","D21.003","H21.300x008","H44.101","Q10.300","H00.002","H47.500x004","H49.803","H35.500x008","H43.805","B25.800x002+H19.2*","H35.001","H02.600","H21.300x010","H40.101","H52.600","H16.103","H05.001","H05.201","H05.100x003","H35.600","R44.100","S05.809","B00.500x002+H58.8*","H10.400","H53.802","H21.501","H40.503","H20.200","I86.803","H10.401","C69.000x001","H47.600x001","H31.200x005","H21.504","E14.300x045+H36.0*","H44.200","H30.000x002","C79.409","H53.300x003","Q13.300","H50.106","T26.900","H26.401","H11.808","H21.500x013","H50.500x003","H33.102","Q13.400x001","H35.006","T85.300x008","D23.101","H04.503","E50.100x002+H13.8*","H16.803","D31.602","H18.701","H35.809","C79.405","B30.201+H13.1*","Q12.100","B58.001+H32.0*","H57.001","S05.300","Q14.900","H59.800x013","Z52.500","Q75.500","A71.900","H05.000","H53.000x004","E14.300x061+H28.0*","H49.810","H21.303","H21.102","H20.000x003","B49.x04+H19.2*","H16.805","T85.309","T26.400x001","T20.300x012","E11.300x041+H36.0*","H50.804","S05.500x003","H50.500x002","H50.100x002","H44.002","H16.800x005","H25.000x002","S05.810","H53.500x008","H04.402","H26.003","H35.500x004","H44.700x005","H33.302","H40.100x001","H34.900","H02.704","H35.802","C69.900","S05.800x008","H30.201","H01.900","H35.400","H43.802","H35.800x009","Q14.100x003","H30.902","H55.x00x002","H33.500x002","Q13.100","H40.600x002","Q14.100","H30.000x005","H35.004","H35.005","Q13.500","H17.802","H16.303","H40.203","H40.100","H35.700","Q15.002","H40.000","H21.500","H59.806","E14.300x024+H36.0*","T86.801","A18.503+H48.8*","H50.005","T85.201","H44.401","H20.003","H50.003","H55.x00","S00.201","H50.300x004","B49.x03+H19.2*","C69.601","H16.007","H44.501","H43.200x001","H21.800","H35.702","D31.603","H04.003","H33.000","H43.806","B00.506+H22.0*","H44.003","T26.000","E10.300x021+H36.0*","H35.400x005","Q10.500","E88.906+H28.1*","H59.800x015","A51.402+H22.0*","H21.505","H02.300","H02.813","H21.402","S05.200x006","I80.801","Q13.801","H25.000x005","H02.809","H44.100","S05.203","H04.603","H02.503","H54.601","H10.101","H18.901","Q14.000","H21.204","T85.302","B00.500x007+H22.0*","H26.300x004","H43.800x005","H18.500x007","D48.703","D03.100x002","H16.401","H44.300","H04.900x001","H50.300x002","H31.404","H15.801","H50.800x006","H59.810","H31.302","H35.009","H18.300x002","E05.002+H06.2*","H11.400","H50.200","H43.803","E14.300x011+H36.0*","B02.305+H22.0*","H21.300x005","H47.001","H53.100x004","H15.000x002","N18.508+H32.8*","C69.602","H21.300x011","Z42.003","D48.706","E14.300x052+H22.1*","H15.800x009","E11.300x023+H36.0*","H53.300","H53.500x006","H31.400x003","H21.200x007","S05.807","H18.504","H26.300x001","H17.100","H49.804","H16.002","H50.800x003","D48.700x021","H18.400","H50.200x004","E50.200x001+H19.8*","H47.303","T66.x02+H47.5*","D31.500x001","H54.600","H02.001","H35.000x021","E14.300x022+H36.0*","H35.306","S05.305","H33.000x006","H34.200x002","Q12.000","H50.000x004","H35.803","H59.812"};
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

