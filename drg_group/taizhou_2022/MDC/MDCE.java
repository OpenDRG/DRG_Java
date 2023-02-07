package drg_group.taizhou_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.ADRG.*;

public class MDCE{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"B48.502+J17.2*","D18.100x015","A19.000x014","T27.700","J18.200","A16.500x008","J68.002","J84.101","R09.200","R06.803","A19.802","J47.x03","R91.x04","J86.004","A15.505","C33.x00","A15.406","A15.007","J63.800x016","J21.100","I26.900x017","J69.000x004","J81.x00","J81.x00x002","B40.000","J13.x00","A15.000x016","J18.100","J68.101","E32.000x003","D14.400","A15.000x002","A16.029","A19.803","C34.300x003","J20.000","A19.000x019","A15.500x004","J95.808","Q79.101","J63.800x009","J98.901","S28.000","I26.900x002","A54.806+J17.0*","J20.200","A16.303","A15.803","C49.302","I89.804","J63.800","J92.901","J95.100","A15.000x028","J98.008","Q89.209","B38.000x001+J17.2*","B49.x14+J99.8*","Q79.000","J12.800","J84.109","S27.110","I97.800x018","C78.000x003","T17.802","T27.500x001","E83.104+J99.8*","J09.x00","C34.801","R09.800x093","C45.000","I26.901","A16.031","J39.808","J42.x00x005","A16.017","A16.900x002","J15.600x006","J63.800x021","A15.813","J98.001","A15.509","J44.801","J39.801","J84.802","J98.101","U07.100x001","B39.200","D17.400x005","J15.601","J63.300x001","C38.400x003","B48.500+J17.2*","J82.x00x002","A36.201","J45.100","J62.000x001","A16.012","J62.800x005","J65.x00","E32.001","A16.013","A16.301","D15.701","A15.305","D38.105","J60.x00x002","D38.401","J60.x00x004","A15.000x014","J93.900","J94.805","U07.100x002","A15.100x003","J86.012","B48.501+J17.2*","A37.800x001","J39.804","J61.x00x001","J44.900x002","T17.900","A06.501+J99.8*","A15.300x001","I28.800x010","C77.100","J98.501","R93.804","C38.300","A16.018","S27.812","J43.900","B41.000","D17.400x001","A16.004","J18.000","J18.000x002","Q34.000","A15.806","A16.006","J46.x00x009","A16.019","J96.000","S27.313","J63.800x015","A16.205","B66.401+J99.8*","J45.007","A15.506","A16.014","A19.000x008","C45.702","J98.507","J98.411","J85.001","A16.024","E32.002","J60.x00x005","J98.400x019","Q33.200","J90.x00x002","R06.800x005","J98.601","A02.201+J17.0*","J12.300","A16.203","T85.700x804","J86.000x013","S27.910","C79.807","J43.900x001","A15.508","D21.302","E85.407","J21.801","J67.200x002","T86.803","T17.804","J63.800x017","A15.901","A15.500x023","J63.800x019","A15.500x019","A15.502","J69.001","R04.200","J66.200","J95.800x004","C77.102","D02.400","J45.900x023","T17.400","J45.000x003","J82.x01","A19.000x006","R94.204","A15.500x010","J20.700","C34.301","A15.501","J67.800x004","J84.100x008","J86.007","J62.000x002","J67.400","A16.305","J45.900x002","R06.301","J86.002","J90.x00","A19.000x007","D38.300x001","J98.506","R91.x00x005","R06.100","D38.101","S24.200","J94.200","J15.903","C38.400","J70.200","J11.100x005","J20.900","A43.000x001+J99.8*","J62.803","J63.803","J84.805","J86.005","M32.103+J99.1*","J90.x00x005","U07.100x003","J98.400x016","J22.x00","J63.000x002","J42.x01","B38.100","J84.804","S27.800x013","J90.x00x003","B33.400x001+J17.1*","J67.800x003","J47.x00","T17.501","M35.002+J99.1*","J40.x00","A15.602","A15.804","B44.101+J99.8*","J98.800x004","J94.807","A15.100x006","J95.800x012","J21.900x002","A16.400x010","D38.300x003","E32.800x005","A06.500x002+J99.8*","J98.005","R91.x03","S27.312","J86.008","S27.100","R93.805","B67.100x001+J99.8*","J45.000","Q32.400x005","J44.900","R06.000","S27.400","A37.000","A15.004","U07.000","J98.400x013","J45.902","A15.500x022","J95.300","A15.500x029","J98.800x007","J12.100","J84.105","J94.800x004","J67.600","D17.400x003","J43.902","R84.000","I26.900x013","R09.101","J61.x01","A16.504","A16.402","J70.800","A15.402","E32.800x001","J98.404","J69.000","J68.900","A19.000x018","J96.900x002","A15.100x011","J15.600x005","A06.500+J99.8*","R09.800x092","R09.800x094","C79.800x809","J98.416","J68.000x002","A16.025","A37.100","J69.800x001","J98.002","A15.105","J98.503","J62.001","A15.301","A16.002","R05.x00","J43.000","J63.200","J67.800x001","B39.100","Q32.402","A16.900x023","J15.200","A16.010","J14.x00","J86.015","Q34.100","M05.102+J99.0*","J86.020","R09.000","J82.x00x004","R91.x00x001","B49.x00x011","B01.200+J17.1*","B25.000+J17.1*","S25.401","C77.103","J16.800x001","T27.600x001","S29.800","J95.401","A16.304","A16.806","D36.700x008","J15.100","J09.x01","B06.800","D86.000","T81.400x009","A16.038","S27.811","C34.000","J67.800x002","J85.300","J93.003","A15.604","A16.204","J86.000","S27.803","E32.000","J44.805","I26.900x005","J98.000x012","J70.001","J86.011","C34.102","I26.900x009","B06.801+J17.1*","A15.500x018","J63.800x018","D14.302","C34.900x005","C39.800","J62.801","J68.301","A16.026","J95.800x009","A15.000x020","J98.408","A15.306","J98.800x018","T17.500","M31.302+J99.1*","A16.300x007","A15.500x027","A16.200x002","J09.x02","J10.001","A16.405","J15.000","J68.201","J84.100x007","I26.900x016","A15.304","J90.x01","J98.402","A15.800x001","J84.001","J21.900","A16.200x013","J98.007","R06.200","C38.800","J45.003","I89.800x018","Q32.300","A16.021","M33.901+J99.1*","Q33.400","J98.415","J43.200","A15.303","J93.800x001","A16.700x002","A16.900x003","J98.417","I26.900x010","Q33.000","S28.100","J43.001","B39.000","R09.201","A01.000x005+J17.0*","I89.800x017","J98.800x006","Q33.002","C78.002","J84.800x007","A21.201+J17.0*","C39.900x001","J45.900x021","D38.200x001","J85.002","R06.600","A16.210","J18.801","J20.902","I26.900x003","J82.x00x005","D36.700x013","M31.300x002","A15.000x026","A16.011","J96.900x001","A16.015","R84.600","J98.700","C34.900x001","B44.000x001+J99.8*","J98.400x008","R06.300","A15.106","J44.100","J18.802","T84.200x004","Q79.102","R09.100x002","Q85.901","J63.800x011","A15.104","A16.102","A15.812","A16.801","B38.200x001+J17.2*","J10.000","J43.904","J63.201","C34.800x001","A16.037","I26.900x006","J62.000x003","J86.902","J15.402","J94.800x003","A16.109","C34.100x003","C77.100x004","I89.000x029","D86.200","J61.x00x002","J98.403","A16.106","I26.900x008","J98.409","A16.501","J39.803","A16.000x002","J44.000","J44.807","M05.103+J99.0*","R84.500","S27.510","J98.400x012","J45.900x013","A16.807","J84.900","A15.405","A15.702","C78.200","D14.300x001","J95.810","I26.902","J98.500x007","J98.801","R05.x02","A16.802","A16.035","A16.003","J86.000x006","A15.504","J39.802","R09.300","A19.000x009","J45.903","A16.201","Z03.800x001","A16.200x015","C34.802","C79.800x829","B45.000x002+J99.8*","J18.000x001","J63.800x012","Q89.800x910","I89.800x023","J45.900x012","J60.x01","A15.500x001","S27.210","J98.412","A15.100x009","J86.018","J98.009","B42.000+J99.8*","A19.000x002","R04.800x002","J63.000","J84.800x004","B37.803","D38.201","J94.804","J62.800x006","J18.800x006","J98.004","A16.032","A15.601","Q85.904","J98.602","S27.410","A16.503","A19.000x004","D15.200","B45.000","J86.006","R04.800x004","J45.901","B38.000","A16.105","J15.602","J18.800x001","A16.100x001","C34.001","A15.100x008","A19.000x001","A16.500x001","A15.006","J41.100","J15.902","S27.600","A15.500x026","R59.009","J63.800x023","S27.801","J84.103","A15.207","D15.000","I00.x00x007+J17.8*","J63.800x005","Q33.900","R84.100","C78.306","G47.300x034","A15.500x011","A16.300x002","J98.000x011","A16.200x014","R09.800x091","J21.000","A16.034","A16.009","J16.000","R94.201","J94.806","J70.200x002","J15.901","S29.700","I88.106","J86.013","R84.903","Q32.400x002","A15.302","I89.800x007","J39.807","J45.100x002","J69.101","D48.700x019","A16.000x001","A37.900","J86.017","D02.200x002","J69.100x001","A15.805","J18.901","J47.x01","S27.804","A15.811","J94.802","J10.100x005","J45.900x031","C34.101","J12.000","A15.500x016","I89.800x002","J45.006","S29.900","D15.200x001","J45.100x003","J46.x02","B58.300+J17.3*","J62.800x003","M33.103+J99.1*","C34.800","S27.802","J45.900x041","E32.100","J12.900","C76.100x003","T27.200x001","J42.x00x004","J60.x00x003","C77.104","B44.102+J17.2*","C34.803","J70.400","J84.110","A19.000x003","J15.900","J18.903","T86.800x011","A15.001","C38.200","D36.706","D38.104","J15.000x002","J63.801","J45.900","J63.301","J67.400x002","R04.900","B05.200+J17.1*","A06.502+J17.3*","A15.403","A15.503","J94.801","J98.418","S27.302","D15.900","A37.900x003","J63.100","J95.800x010","J98.010","M31.304+J99.1*","A16.804","A16.500x010","D48.710","J41.800","J62.800x002","M05.100+J99.0*","C34.900x006","J94.201","J63.800x001","J15.700","A15.000x001","T17.801","D17.400x002","J67.700x001","R09.801","C79.810","C37.x00","C34.100x004","A16.803","I89.000x028","S27.310","J98.100","J70.101","A15.605","I89.003","J63.500","A15.000x022","J66.800","J84.000x003","S27.501","J46.x00x008","J63.800x026","S27.806","J70.900","J98.800x001","R84.904","J95.800x021","A15.500x017","J86.016","A15.500x015","R84.700","J45.900x011","J96.900x003","J63.802","J44.806","A15.500x012","J62.800x007","J98.003","A15.100x010","C77.101","A15.808","D15.700","J80.x00","J66.100","A15.202","C34.300x004","J98.505","A16.206","B37.100","J63.800x003","S27.900","A16.202","D17.400x004","J98.802","J94.800x010","S27.805","A15.810","Q32.102","J45.000x001","S27.401","A16.800x003","A16.107","J63.800x010","A15.500x002","A15.500x028","A15.900","J20.800","D48.709","E32.900","B49.x13","C34.000x002","J63.800x022","R94.200","C45.700","J64.x00","A19.801","J95.804","J92.000","A15.500x021","C78.003","J67.900","A15.107","A19.000x017","J12.200","J86.901","M33.201+J99.1*","B39.000x001+J17.2*","J67.100","R04.802","R84.300","C34.901","J86.010","A16.023","R09.800x095","A15.500x025","A15.100x001","Q32.400x004","J44.800x001","J46.x00x010","I89.807","A15.609","J95.200","J20.600","J68.000x001","M34.800x001+J99.1*","J43.000x003","J90.x00x004","S27.200","C34.800x003","S27.301","J43.901","A16.700x001","T17.803","A15.200x002","J41.000","A15.802","C78.100","J90.x02","A15.005","A16.800x002","A19.000x012","J15.800x001","J11.000x001","J63.800x024","J20.500","I88.107","R05.x01","A15.703","D14.301","S27.807","J20.400","C76.100","J85.200","B65.902+J99.8*","J44.802","J80.x01","J86.009","J98.800x003","J63.400","D18.100x026","J46.x01","J98.500x008","R06.400","A15.000x003","A15.100x005","J98.401","J84.800x005","R06.805","J98.414","E85.400x005","A15.200x001","B39.100x001+J17.2*","T85.608","J40.x00x002","J98.410","A19.001","J68.800","C49.300x003","J46.x00x003","R06.806","A15.607","A15.801","A15.500x020","Q32.401","A16.200x007","A16.505","A15.400x001","A15.401","J20.300","R06.802","I88.900x008","J44.900x005","J44.900x004","Q32.200","J98.502","A19.000","J67.500","D38.100x001","J67.800x005","T27.300","A16.207","J42.x00x003","A15.206","R84.200","J86.019","S27.808","J67.200","A16.300x003","A16.400x011","J96.100","J18.800x004","A15.101","A16.900x001","R93.801","D38.601","J84.108","J95.802","A15.100x007","D38.102","J84.104","J98.500x001","E84.001","A15.500x014","D38.301","E85.404","J21.901","J62.800x004","J84.100x006","C34.000x003","J86.903","C34.900x008","J98.201","J15.500","Q33.003","J66.000","A15.606","A15.002","J43.800x001","E32.800x004","J18.803","J92.900x002","J98.800x009","I89.800x016","A15.307","B38.200","I89.000x027","A16.101","B46.000x001+J99.8*","C46.701","J39.810","J68.001","A15.000x012","A16.007","J84.002","A15.603","J98.102","M35.904+J99.1*","Q34.900","U04.900","J98.400x005","I26.900x018","I26.900x007","A16.500x004","R84.400","C78.201","J44.900x003","R94.202","A19.000x015","A15.003","J98.800x014","S27.303","J67.000","J84.803","A15.205","A22.102+J17.0*","J46.x00x006","J93.100x002","A19.000x013","R84.800","J40.x01","A16.104","J63.800x020","A16.008","S27.610","J44.803","A15.100x004","J18.002","B77.801+J17.3*","J45.002","J93.100x001","J47.x02","J67.600x001","J45.004","A19.000x005","J95.811","J98.300","A16.406","J10.000x001","A16.027","J20.100","J63.800x025","B38.100x001+J17.2*","J98.600x001","E85.412+J99.8*","J62.800x008","J98.200","A16.022","C45.701","J63.001","C49.300x001","J94.900x001","R06.000x002","A37.900x004","E89.802","D38.100x002","J62.802","M34.801+J99.1*","Q33.800x002","J43.100","C77.105","M33.001+J99.1*","S27.500","A15.500x024","A15.809","C34.900x004","A16.200x012","J15.400","A16.020","D17.700x023","J86.000x012","J60.x00","D02.100","J18.902","S27.710","B40.200","A37.901+J17.0*","J84.800x006","E32.802","A15.100x002","A15.701","J68.400","J18.001","J84.102","S27.000","D18.000x800","J15.600x003","T17.901","A16.500x009","J85.000x002","J98.407","A15.404","A16.103","D36.717","J46.x00x002","J94.101","Q33.600","B39.200x001+J17.2*","A16.005","C78.304","C38.401","R91.x01","A52.704+J99.8*","A15.507","D38.100x003","A16.028","J95.801","J70.300","J98.006","B65.907+I52.1*","R06.000x003","B37.800x083","D18.000x857","I26.900x001","J42.x00x006","J98.800x016","E32.801","S27.010","A15.000x024","D18.000x814","Q33.301","D02.201","I26.900x011","J15.600x002","J86.014","C34.201","R09.100","A16.805","A16.403","T79.800x007","A15.103","A15.203","J98.400x001","A15.407","A16.001","I89.800x021","J98.000x009","A15.201","A16.016","A16.036","J39.806","J43.903","A15.807","J98.000x013","J62.804","A15.000x010","Q85.908","J98.504","J67.300","A15.500x003","A15.500x013","J63.300x002","A19.000x011","D15.200x002","A16.401","D18.011","J82.x00x001","J84.800x008","J15.101","C34.902","J18.800x002","A16.030","J20.901","J95.900","A15.608","B37.101+J17.2*","C79.800x838","C78.001","D38.400x001","A19.000x016","A15.102","I26.900x012","J63.300x003","I26.900x015","D14.200","J18.800x012","M05.101+J99.0*","J15.300","J18.900","A15.814","A15.204","J67.200x003","J43.101","J98.508","D38.103","J84.800x003","J63.000x003","A15.408","J39.805","S27.311","I89.000x016","J15.800x002","J45.900x001","S27.700","J98.413","J63.800x014","J61.x00x003","J94.901","S27.810","A15.409","J85.100","D19.000","Q33.800x001","Q79.103","D38.300x002","D38.600x001","J98.011","A16.302","J42.x00x001","R06.801","S27.300x012","C34.800x002","J95.800x016","J63.000x001","J42.x00","J45.005","A15.000x018","J84.801","C78.000","A16.108","A19.000x020","D18.100x025","D17.700x019","J69.000x002","Q33.100","A16.033","D48.115","J86.003","Q33.500","B40.100","J63.800x013","C38.100","Q85.900x015","R06.804","J86.001","J98.405","A16.400x005","A19.000x010","J67.700x002","J45.800"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCE入组条件，匹配规则：主诊断匹配");
        String result;

        result=EB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=EB2.group(record);
        if (result.length()>0){
            return result;
        }

        result=EC1.group(record);
        if (result.length()>0){
            return result;
        }

        result=EC2.group(record);
        if (result.length()>0){
            return result;
        }

        result=ED1.group(record);
        if (result.length()>0){
            return result;
        }

        result=EJ1.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合EQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "EQY";
        }

        result=ER1.group(record);
        if (result.length()>0){
            return result;
        }

        result=ER2.group(record);
        if (result.length()>0){
            return result;
        }

        result=ER3.group(record);
        if (result.length()>0){
            return result;
        }

        result=ES1.group(record);
        if (result.length()>0){
            return result;
        }

        result=ES2.group(record);
        if (result.length()>0){
            return result;
        }

        result=ES3.group(record);
        if (result.length()>0){
            return result;
        }

        result=ET1.group(record);
        if (result.length()>0){
            return result;
        }

        result=ET2.group(record);
        if (result.length()>0){
            return result;
        }

        result=EU1.group(record);
        if (result.length()>0){
            return result;
        }

        result=EV1.group(record);
        if (result.length()>0){
            return result;
        }

        result=EW1.group(record);
        if (result.length()>0){
            return result;
        }

        result=EX1.group(record);
        if (result.length()>0){
            return result;
        }

        result=EX2.group(record);
        if (result.length()>0){
            return result;
        }

        result=EZ1.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCE的ADRG入组条件");
        return "";
    }
}

