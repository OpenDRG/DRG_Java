package drg_group.wuxi_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.ADRG.*;

public class MDCE{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"A15.805","J20.400","J98.403","J95.808","J39.803","C77.100","J15.800x002","J63.802","A16.204","J15.900","J43.900x001","Q85.901","J45.900x031","J67.800x004","J18.000x001","S27.302","J84.100x008","J41.000","Z03.800x001","J98.006","J86.018","A16.301","R94.201","C45.702","D18.011","R05.x01","D17.400x001","J84.804","J18.800x001","J98.800x016","J86.000","C79.800x838","D38.300x002","J98.415","I89.000x029","A16.807","J15.300","Q79.103","A15.808","J98.300","Q32.300","R09.800x094","J40.x00x002","M33.103+J99.1*","B65.902+J99.8*","I26.900x009","D15.200x002","S27.510","C34.800x001","J60.x01","J45.003","J45.900x013","J98.011","A16.024","J09.x01","J85.000x002","A15.608","C77.100x004","J15.800x001","J65.x00","J43.000x003","J86.007","J86.008","D36.706","B37.800x083","E32.802","J18.901","J63.800x018","S27.811","A15.500x029","A16.401","D14.400","J21.801","A19.000x019","J63.800x022","J94.802","D18.100x015","C77.104","A16.103","J12.800","A19.000x007","J86.011","J98.411","C34.001","J98.402","J86.006","A15.801","A15.500x014","A19.000x014","R84.904","J46.x00x010","R05.x02","A15.001","J43.000","B01.200+J17.1*","B44.101+J99.8*","B06.800","A15.307","A15.503","J47.x01","J68.101","A15.003","C45.700","D86.200","J45.900x023","J63.801","J81.x00","J40.x00","T85.608","R94.204","E32.000x003","J44.803","A16.800x003","J21.900","D38.104","M05.101+J99.0*","Q79.102","I00.x00x007+J17.8*","C38.200","I89.800x023","I89.000x028","J61.x00x002","J66.100","S27.501","C45.000","Q33.301","D38.300x003","M05.102+J99.0*","D15.900","B33.400x001+J17.1*","J15.902","J98.414","A15.800x001","E32.800x005","J18.000x002","R93.805","B48.502+J17.2*","A19.000","B49.x14+J99.8*","J20.600","A19.000x003","R84.800","J10.000","J15.600x006","J86.000x013","A15.107","A15.500x013","A15.207","J98.400x008","A15.000x028","J69.100x001","J15.903","J90.x01","A37.000","J95.800x004","D38.201","R09.100x002","R09.800x091","I26.900x001","A16.008","D38.601","J42.x00x003","J47.x03","J98.102","A15.500x024","J42.x00","J46.x00x009","I26.900x012","R06.802","A15.703","A16.900x001","C49.300x001","J40.x01","J68.002","J84.000x003","A16.700x001","C78.001","R93.801","A15.100x002","J62.800x004","I28.800x010","A16.015","A15.100x005","J45.100x002","J62.804","J95.300","R06.600","J10.001","A15.806","J98.400x001","Q85.908","C78.002","J98.410","I89.000x027","R04.802","A16.206","C38.800","G47.300x034","J98.602","Q32.102","J98.001","I26.900x002","A15.606","R04.200","Q33.500","J98.501","J39.801","J45.006","R04.800x002","J16.800x001","J42.x00x001","A19.000x004","A15.500x026","B40.000","J63.800x017","D02.100","J84.800x007","J62.800x005","J61.x00x003","J43.101","J84.802","J63.800x024","J62.800x006","A16.006","D38.300x001","I26.900x016","J18.802","J44.805","J64.x00","R06.801","S27.600","J18.801","I88.106","J39.805","J67.200x003","C38.400x003","J63.800x021","J86.014","A15.401","J94.201","S27.900","J96.900x002","M34.801+J99.1*","J63.000x003","A37.900x004","A15.500x022","B38.000x001+J17.2*","J66.200","J93.100x002","E32.800x001","R06.000x002","A15.500x012","A16.200x002","R09.201","D19.000","J86.903","D17.400x003","A15.002","B42.000+J99.8*","J60.x00x003","J68.800","S24.200","J45.000x003","J84.110","Q33.800x001","Q34.900","Q85.900x015","J63.800x001","C49.302","S27.805","D17.700x019","E32.000","A15.814","J98.400x005","J80.x00","T17.801","T84.200x004","A15.000x012","A16.400x011","A16.201","J86.003","J86.015","J67.600x001","T17.803","J84.800x006","J90.x00x004","R06.100","J63.800x012","J46.x01","J67.300","J42.x00x005","D02.400","J95.800x009","J98.200","J44.807","R04.800x004","A15.301","A16.402","E32.801","J42.x00x006","J84.101","A15.000x003","A16.018","J15.200","S27.401","J80.x01","Q85.904","J44.900x004","C78.200","A16.028","E83.104+J99.8*","J96.900x003","A01.000x005+J17.0*","J66.000","B44.000x001+J99.8*","A15.403","J45.800","J62.000x002","B48.501+J17.2*","A16.203","A15.006","A16.032","J39.807","J61.x00x001","D38.600x001","E89.802","Q32.400x005","A16.107","A15.405","A15.505","J82.x00x001","A15.607","A15.408","J44.801","B38.200","J15.000","J47.x02","J45.900x001","M33.901+J99.1*","A15.402","J10.000x001","C34.101","J94.805","A16.013","A19.000x020","J98.000x011","A15.407","J98.003","S27.710","S27.910","J61.x01","J98.101","J85.002","A15.601","J86.901","I26.900x018","A06.500+J99.8*","A15.200x002","A16.700x002","J98.508","J63.800x023","I26.900x008","I89.804","J70.200","I89.003","B58.300+J17.3*","J84.100x006","J98.404","J62.800x007","A52.704+J99.8*","A15.500x028","A15.603","A16.210","D18.000x800","J84.803","J95.800x016","A15.803","A15.305","J69.001","J98.601","Q32.400x004","Q34.000","S27.210","J44.900","M35.002+J99.1*","J63.800x015","U07.000","J20.901","C39.900x001","J63.200","C78.003","J85.300","A16.205","B44.102+J17.2*","A15.504","Q33.400","J15.400","A19.801","J15.600x003","J20.500","Q33.100","A16.403","A37.901+J17.0*","J20.902","Q32.401","A15.100x003","J62.001","A16.304","J94.200","J95.800x010","J62.000x003","J70.800","S27.802","J63.000x002","A16.014","J63.201","A16.501","A15.100x010","Q33.800x002","A15.100x009","J60.x00x002","J63.800x013","J98.005","B46.000x001+J99.8*","D15.200","A16.500x004","A15.201","A16.300x007","C76.100x003","J86.012","I26.900x011","I26.900x003","J94.804","A15.804","A19.000x011","J86.013","A16.002","A19.000x002","A16.007","R93.804","C34.301","R94.200","J86.017","J69.000x002","A15.100x007","J95.401","J39.806","C78.201","J92.000","J94.800x003","R05.x00","J63.000","A15.500x017","T86.803","Q32.200","D15.701","J98.502","J95.804","A15.500x011","J98.700","M33.201+J99.1*","A15.200x001","A37.800x001","J68.301","J70.001","J98.007","A15.500x020","J67.100","J46.x00x003","C77.101","A15.500x010","A19.000x016","J93.100x001","A16.035","J46.x00x008","J15.601","J12.200","J98.002","J63.800x020","J84.103","M32.103+J99.1*","B37.100","D21.302","D18.100x025","J86.010","A15.202","S27.810","A15.206","S27.808","J98.408","B38.100x001+J17.2*","J63.800x025","D15.700","J20.300","A15.005","Q33.002","J18.900","A19.000x001","C34.100x004","J18.803","A19.000x006","I26.901","J95.900","C34.902","S27.803","I26.900x010","R84.903","A15.400x001","A16.034","A16.033","I26.900x007","A16.011","D02.200x002","A16.022","C33.x00","D17.700x023","I26.900x015","J98.000x012","I97.800x018","J67.200x002","J95.100","A15.106","Q33.003","C79.800x809","A16.400x005","C76.100","D14.302","D38.301","R84.100","J18.800x002","A15.602","R59.009","J60.x00x004","A19.001","I26.900x005","B39.200","J15.000x002","J98.500x001","S29.800","A19.000x008","A15.500x019","J63.800x016","A02.201+J17.0*","J84.800x005","A15.004","J86.020","Q32.400x002","T17.900","J22.x00","A06.502+J17.3*","J90.x02","J11.000x001","J63.800x010","J43.200","A15.506","M34.800x001+J99.1*","J46.x00x006","A22.102+J17.0*","A16.016","A15.605","J86.016","J95.200","J98.004","A16.023","J98.600x001","C34.900x008","J98.409","C34.800","C34.802","I88.107","I89.800x002","B37.101+J17.2*","J43.100","J70.900","E84.001","J98.416","R84.000","R91.x00x001","J84.100x007","D38.200x001","J45.901","A19.803","J18.001","J43.904","J70.400","A06.500x002+J99.8*","J43.001","J98.504","B39.200x001+J17.2*","I89.800x007","R06.200","A15.500x018","R84.600","A16.500x009","R09.300","J84.801","J67.400x002","A16.504","Q89.800x910","J62.000x001","C77.103","J14.x00","A15.810","J85.200","Q79.000","C78.000x003","J95.800x021","R84.200","S27.807","J82.x00x004","C38.401","J45.902","A16.802","A15.000x022","J90.x00x003","J98.800x009","Q32.402","E85.412+J99.8*","D14.200","J45.100","A16.000x001","J68.900","J98.800x001","A15.105","C34.800x003","Q33.200","J15.100","J86.004","J98.407","J98.418","J63.800x014","A15.000x018","J98.800x014","J63.800x011","T17.400","I26.902","A15.203","A21.201+J17.0*","I26.900x006","J20.000","J45.000x001","D02.201","R06.804","B25.000+J17.1*","A15.303","J10.100x005","J11.100x005","J45.100x003","R84.300","A15.104","J20.200","A15.000x001","J39.802","J44.900x002","J44.800x001","B38.200x001+J17.2*","A15.507","J67.800x003","B37.803","R09.101","A15.304","D14.301","J95.802","J86.009","M31.302+J99.1*","J86.902","A16.020","A16.900x002","J63.300x001","S27.300x012","A37.900x003","C34.900x005","J67.000","J18.002","J43.900","A16.200x015","R09.000","J63.803","D38.102","J70.200x002","J18.100","J96.000","J82.x00x005","J98.000x013","J63.800x019","D38.105","A16.000x002","J66.800","A15.702","J13.x00","J98.801","B06.801+J17.1*","J82.x01","A16.100x001","D36.717","A16.105","C39.800","C34.201","J84.805","J39.808","S27.100","J98.800x006","I26.900x013","J98.405","A16.207","J67.500","M31.304+J99.1*","A16.027","A16.019","R06.805","C49.300x003","J18.800x012","C38.400","C79.810","J86.000x006","Q89.209","T81.400x009","C34.000x003","D38.101","A15.812","J69.800x001","J63.000x001","A19.000x005","A15.100x011","A19.000x010","C34.801","A16.900x023","J98.901","M31.300x002","A15.300x001","A16.305","C34.800x002","J67.400","A16.029","J94.807","J69.101","A16.037","J95.810","B48.500+J17.2*","D18.000x857","J94.800x010","T17.804","S27.700","C78.100","I89.800x021","S27.310","J90.x00","J98.000x009","J63.800x026","D15.000","A15.007","S27.806","U04.900","A15.100x004","T86.800x011","C34.900x006","J47.x00","J63.800x003","A19.000x018","J98.201","C38.100","A36.201","Q33.900","A15.406","A16.106","J20.800","J84.001","R06.000","B65.907+I52.1*","J44.000","J68.000x002","R09.200","J63.300x002","J82.x00x002","S27.800x013","D15.200x001","S27.812","J86.002","J85.001","J98.100","A16.800x002","A16.025","J09.x00","A16.805","A15.701","A15.500x021","D48.710","A15.100x006","A16.400x010","J42.x00x004","A16.004","A16.109","A16.804","C34.803","I26.900x017","J45.900","T27.300","B66.401+J99.8*","J67.800x002","A16.101","J45.903","D18.000x814","J69.000x004","D38.100x002","J98.503","R06.400","J46.x02","B49.x00x011","S27.311","C46.701","A54.806+J17.0*","A15.100x008","A15.204","I88.900x008","J98.412","J18.902","A15.103","M05.103+J99.0*","S27.200","J98.400x019","C34.000x002","J70.101","J93.003","J68.400","A15.500x023","D17.400x004","S27.500","J63.800x009","J94.901","D38.100x003","R91.x01","J45.900x041","J98.400x016","I89.800x016","J16.000","J96.900x001","J67.700x002","A15.302","A15.604","A15.901","E85.404","J15.600x002","S27.110","S27.410","J46.x00x002","J21.100","A16.104","A15.306","B67.100x001+J99.8*","R04.900","C34.300x004","A16.038","J67.800x005","J45.900x021","T79.800x007","D14.300x001","J81.x00x002","T27.200x001","C78.000","J45.900x012","D38.400x001","R91.x03","A15.000x010","J62.800x008","E85.407","T27.700","A15.101","J63.001","A15.205","B40.200","C77.105","Q34.100","A16.505","D18.100x026","C79.807","I89.000x016","J84.109","J86.005","J90.x00x005","E32.800x004","J15.402","J67.900","R91.x00x005","J96.100","A16.003","J41.800","A15.000x026","J84.102","S28.000","U07.100x003","J84.002","A16.017","A16.200x012","J44.900x003","J95.811","J62.801","A15.609","A15.000x020","J15.602","A15.404","J84.104","J86.000x012","J12.300","R06.000x003","S27.301","J98.401","R06.301","A16.102","A15.502","R06.803","J67.800x001","J84.800x008","J94.801","A15.500x027","J94.900x001","R84.700","T17.901","J45.004","A16.009","J63.400","J92.901","A16.900x003","A19.802","J63.100","J67.700x001","A16.200x014","J98.010","J63.800x005","J98.505","R06.800x005","A16.026","A16.200x007","A16.503","T17.500","J90.x00x002","J98.802","J15.101","J84.900","S27.610","A15.000x014","A16.300x003","A15.509","B39.000x001+J17.2*","C34.900x004","E85.400x005","T17.802","C34.901","C34.300x003","J98.800x003","B39.000","A15.809","J98.400x013","B40.100","I89.800x017","C34.000","J98.500x007","A37.100","J68.201","D48.115","A15.802","A16.801","A16.803","B39.100","J18.800x004","B45.000","A15.409","J39.804","J39.810","J43.903","C37.x00","J98.800x004","C77.102","A16.031","J15.500","R09.100","B05.200+J17.1*","C38.300","Q79.101","M33.001+J99.1*","D17.400x005","R09.801","R09.800x095","T27.600x001","D38.401","S27.313","A15.000x016","S27.303","J21.000","I89.800x018","S27.400","A16.200x013","T17.501","B49.x13","A16.303","B38.100","J45.900x011","S25.401","A16.500x001","A15.501","A19.000x013","J86.001","D17.400x002","J43.902","B38.000","J67.200","A16.302","A19.000x012","J62.803","A16.500x008","S27.312","J98.009","J12.900","D86.000","M05.100+J99.0*","J67.600","J18.000","A16.005","C79.800x829","J98.417","A16.030","A16.406","J43.901","R84.400","J43.800x001","J95.800x012","A06.501+J99.8*","J98.800x007","B39.100x001+J17.2*","J45.000","A15.500x003","R09.800x093","J18.200","A19.000x017","S29.900","A15.900","J21.900x002","D36.700x013","A15.811","J45.005","R06.806","J20.100","D36.700x008","D38.103","J60.x00","R84.500","J15.901","J41.100","J98.400x012","A15.508","I89.807","J70.300","S27.010","U07.100x001","J63.800","A16.010","A16.405","A15.102","J92.900x002","S27.801","A15.500x004","A19.000x009","A15.500x001","A15.500x015","J42.x01","J21.901","A15.500x002","J45.002","J45.007","J63.500","J85.100","J93.800x001","J62.800x003","J18.903","C78.306","J15.600x005","J20.900","J94.806","J63.300x003","M35.904+J99.1*","U07.100x002","A16.500x010","D48.709","J62.802","J84.800x004","A19.000x015","C45.701","J94.800x004","J60.x00x005","J09.x02","J98.413","A15.813","A16.108","A16.806","J68.001","S29.700","J62.800x002","J94.101","J69.000","T27.500x001","S27.804","J15.700","E32.001","A15.000x024","C34.900x001","J86.019","J95.801","J93.900","S28.100","E32.100","C34.100x003","A16.021","A15.807","A16.001","D48.700x019","A43.000x001+J99.8*","A37.900","A16.300x002","E32.900","J44.802","A15.100x001","J45.900x002","A15.500x025","J84.108","Q33.600","R09.800x092","J44.900x005","C78.304","J18.800x006","J63.301","S27.000","R06.300","D38.100x001","J98.507","J98.800x018","J12.000","J98.500x008","J12.100","R94.202","T85.700x804","J98.008","E32.002","B45.000x002+J99.8*","C34.102","B41.000","J44.806","R91.x04","J84.800x003","A15.000x002","Q33.000","A15.500x016","A16.012","J20.700","J44.100","J68.000x001","J84.105","J98.506","B77.801+J17.3*","A16.036","A16.202"};
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

        if (record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
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
