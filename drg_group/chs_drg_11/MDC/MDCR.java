package drg_group.chs_drg_11.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.ADRG.*;

public class MDCR{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"C83.900","C85.900x016","C92.201","C96.400x004","C92.001","C77.502","C83.100","Z09.100","C81.703","D19.900x001","C94.201","C88.700x013","C92.100x011","C95.000x003","D09.700x001","C97.x01","C77.401","C82.400","Q85.909","C76.200x002","C90.300","C76.801","C88.700x003","C88.000x012","C86.602","C88.403","Z51.809","C79.800x816","D46.700x006","C84.800","D47.002","C77.900","C84.405","C90.000x021","D36.700x021","C95.000","Z51.001","C95.000x102","C85.100x017","Z51.102","Z08.000","C85.900x027","C88.900","C90.000x032","C91.001","C86.600","C96.602","C84.000x002","Z51.807","C92.901","C85.704","C77.200","C82.701","Z51.811","C97.x00","C92.101","C83.500","C92.009","C90.200x008","C82.900","C95.000x018","C82.702","C91.100","C94.600","C93.101","C86.000","C46.300","C94.000x011","C91.100x011","C90.300x004","C80.900","C90.100x011","C85.900x020","C85.900x013","C82.703","C83.703","C84.500x004","C85.900x039","C95.000x117","C77.202","D47.700x005","C95.700x003","C90.300x003","C93.100x011","Z51.500x001","C91.800","C90.000x027","C88.301","C94.300x011","C91.000x014","C85.705","C90.000x038","C80.001","C90.001","C91.901","C96.400x001","D48.902","Z08.800x001","C79.800x804","C77.205","C91.008","C96.400x003","C79.800x811","D46.200","Z51.104","C76.700x002","Z51.500x003","C96.200x005","C81.700","C85.700x016","Z51.804","C46.800","C94.400x001","C88.700x012","C79.800x818","C81.100","C85.200","C92.000x016","Z54.001","D48.700x023","C85.900x015","C96.900","C83.305","C93.003","C95.700x001","C96.704","D45.x00","C81.300","C88.200","D47.100x004","C84.407","C95.901","Z51.103","Z51.810","C84.000x003","C95.000x115","C95.900x013+M36.1*","C79.900","C82.000","C86.300","C90.000x035","D48.722","C88.701","C96.700","C76.800","C91.000x017","D47.100x009","C88.401","C77.206","C81.400","C88.302","C76.302","C95.100x011","C90.000x008+M90.6*","C85.901","C91.000","C82.500","C82.704","C90.302","C83.802","C92.401","C91.400x004","C91.000x013","C95.000x116","D09.700","C92.004","C96.004","C80.000","C81.900x005","C84.500","C90.000x026","C91.007","D46.100","C92.300x013","Z51.003","C85.900x028","C92.102","C90.000","D48.723","C91.701","C92.700x013","C95.005","D36.700x023","D36.700x028","C96.402","C45.100x005","D09.900","C95.000x016","C94.703","C85.900x026","C76.101","Z51.800x094","C90.100","C96.200x013","C77.107","D48.715","C83.001","C84.700","C90.000x012","C90.000x014","Z51.800x092","Z08.800x002","C85.900x019","D47.400","C88.200x012","C88.402","C91.900","D47.900x001","D47.101","C77.900x001","C90.000x039","C92.002","C92.501","C76.700","C80.901","C85.701","D47.004","D46.203","D48.707","C45.103","D47.701","C83.101","C88.200x011","C85.900x022","D46.201x001","C83.702","D48.708","D47.700","C92.500x011","C86.100","C83.300","C85.900x004","C85.900x011","C83.300x006","C83.300x007","C96.502","C92.706","C82.100","C81.900","D47.100","C93.700","C91.006","C94.700","C92.000x003","C90.000x036","C92.900","D46.900x006","C90.000x037","C79.829","D47.703","C88.203","C81.702","Z51.000x003","C91.600","C92.000x011","Q85.802","C90.002","C92.100x014","C85.900x041","C95.900x012","C82.300","C91.000x015","C77.303","Z51.800x953","Z51.806","C83.300x009","C91.400","D48.716","D48.901","C80.902","C83.503","C91.004","C83.801","C93.100x012","C92.502","Z51.800x096","C90.000x023","C91.500","C94.200x011","C95.002","C92.005","C93.100","D47.404","C85.900","C88.201","C96.800","D48.900","D47.200x005+G63.1*","D36.700x025","C95.004","C92.100","C83.700","C48.102","D47.200","C96.202","C85.900x002","D36.700x016","C92.200x001","D46.100x012","C83.304","C91.000x016","C77.301","C90.303","C46.900x004","D46.100x002","C85.900x003","C91.101","Z08.800x003","C83.504","C85.900x034","C92.100x017","C82.200","C95.700x011","C83.505","Z51.800x924","C83.502","C95.000x002","C45.706","C80.904","Z51.002","Z51.802","C84.901","C85.900x009","D47.100x007","D46.900x004","C77.400x001","C92.300","C86.400","C85.100x021","C84.400","C91.000x006","C92.006","D36.705","C90.000x033","C83.800x009","C85.900x006","Z51.800x921","C79.811","C90.000x024","Z51.800x097","C77.503","C90.200","D36.704","D47.900","C90.000x040","D47.200x004+G63.1*","D18.109","C88.202","C92.000x014","C83.800x008","C86.603","C77.800","C91.401","C94.300","C93.300x001","C77.501","C85.900x010","D46.700x008","C96.400","C91.002","C94.202","C96.403","C95.000x017","Z08.200","C85.900x030","C93.103","C88.700","C96.400x002","C84.502","C96.002","C90.301","C85.900x017","C90.100x002","D36.709","C88.000","C95.000x118","C91.700","C85.700x004","C77.300x001","C80.903","C90.300x002","C92.100x018","D47.100x018","D47.702","D36.700x011","C96.600","C95.000x101","D47.200x003","D18.105","D48.725","C84.601","C90.200x009","C92.200x011","C85.900x023","C92.300x003","C79.826","C85.900x042","C46.900x002","C85.900x024","C83.102","C88.900x001","C88.700x002","Z51.101","C92.103","D47.300","C84.401","D46.900","C84.600","C96.501","Z51.808","C84.100","Z51.500x002","C92.300x011","C91.100x012","C92.100x001","C93.000x016","Z51.000x013","C93.102","C90.000x025","C85.900x031","D46.700x007","C85.900x037","C90.000x031","Z51.800x095","C83.302","D36.710","C85.900x005","Z51.800x951","D46.600","C91.300","C90.000x028","D36.700x012","Z51.200x008","C93.000x011","C78.604","C94.700x014","C83.002","C85.900x038","C85.900x040","C96.401","C96.603","C77.500","C83.501","C91.102","D47.402","C81.200","C96.705","C93.901","C95.100","C96.000","C90.000x029","C96.500","C93.002","C84.900","C85.900x025","D46.900x002","C92.100x004","C92.701","C85.900x008","C86.500","C92.700","C83.300x008","C85.900x012","C94.700x004","C80.000x001","C92.200","C92.703","D47.100x008","C92.400x011","C85.100","C96.201","C84.500x016","C88.400","D47.100x017","C76.305","D47.100x019","C92.100x016","C81.000","D47.000","C92.800","C85.900x001","C77.300","C88.000x002","C95.000x015","C83.303","C83.301","C93.701","C85.900x036","Z51.100x004","C46.900x003","Z09.200","C96.601","C83.000","C82.903","C90.000x009","C79.900x001","Z08.900","C94.000x001","C93.100x013","C93.001","D47.500","C95.003","C90.000x030","C46.900","C90.000x005","C92.402","C93.104","C85.100x010","C77.302","C95.900","C84.500x012","C92.007","C83.003","C90.000x022","C92.000x018","Z51.800x927","C90.000x041","C84.402","D46.901","C82.700","Z51.000x012","C83.306","C85.709","C92.403","C94.200","C92.000x006","C90.200x013","C94.702","C83.307","C95.006","C91.000x007","C95.900x003+M36.1*","C93.300","D19.700","C94.400","C92.700x012","C95.900x015","C92.100x019","Z51.800x981","C88.000x011","C95.100x012","Z08.700","C83.800","C90.000x004","C83.004","Z08.800x004","C78.605","D46.700x001","Z51.800x922","C84.000","Z51.805","C92.100x012","C80.905","C92.000x017","C90.000x011","C76.306","C81.701","D46.700","C46.700","C91.704","C92.000x015","C85.707","C92.003","D18.106","C96.200","C84.400x001","D47.700x006","C85.715","C85.900x043","C88.300","C95.700x002","D46.400","C94.004","C86.601","Z51.801","C92.700x006","D89.801","C79.800x862","C93.900","C82.600","C96.801","D47.403","D47.003","Z51.000x008","Z08.100","Z51.800x952","C92.600","C91.500x011","D48.700x001","Z51.800x983","C84.404","D47.001","C83.803","C45.900","D46.500","D47.401","C90.000x034","C83.800x006","C82.901","C92.000x012","C84.403","C85.900x029","D47.700x007","Z51.800x925","D48.700x015","C92.601","C85.900x014","C92.000x013","C49.901","C92.900x011","D46.700x002","C92.000","C91.003","C90.300x001","D46.001","C92.100x002","C77.300x003","C85.700","C94.001","C84.406","C91.400x013","C95.900x005","C92.900x001","C91.000x009","D47.900x002","C92.008","C92.300x001","D46.700x003","C76.300","C91.000x012","C79.800x837","C86.200","C48.101","D36.711","C96.604"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCR入组条件，匹配规则：主诊断匹配");
        String result;

        result=RA1.group(record);
        if (result.length()>0){
            return result;
        }

        result=RA2.group(record);
        if (result.length()>0){
            return result;
        }

        result=RA3.group(record);
        if (result.length()>0){
            return result;
        }

        result=RA4.group(record);
        if (result.length()>0){
            return result;
        }

        result=RB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=RB2.group(record);
        if (result.length()>0){
            return result;
        }

        result=RC1.group(record);
        if (result.length()>0){
            return result;
        }

        result=RD1.group(record);
        if (result.length()>0){
            return result;
        }

        result=RE1.group(record);
        if (result.length()>0){
            return result;
        }

        result=RG1.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合RQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "RQY";
        }

        result=RR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=RS1.group(record);
        if (result.length()>0){
            return result;
        }

        result=RS2.group(record);
        if (result.length()>0){
            return result;
        }

        result=RT1.group(record);
        if (result.length()>0){
            return result;
        }

        result=RT2.group(record);
        if (result.length()>0){
            return result;
        }

        result=RU1.group(record);
        if (result.length()>0){
            return result;
        }

        result=RV1.group(record);
        if (result.length()>0){
            return result;
        }

        result=RW1.group(record);
        if (result.length()>0){
            return result;
        }

        result=RW2.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCR的ADRG入组条件");
        return "";
    }
}

