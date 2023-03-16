package drg_group.chs_drg_11.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.chs_drg_11.Base;
import drg_group.chs_drg_11.MedicalRecord;
import drg_group.chs_drg_11.DRG.MDCD_DRG;

public class DA1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={"C00.000","C00.001","C00.002","C00.100","C00.101","C00.102","C00.200","C00.200x002","C00.300","C00.301","C00.302","C00.303","C00.304","C00.400","C00.401","C00.402","C00.403","C00.404","C00.500","C00.500x002","C00.500x003","C00.500x004","C00.500x005","C00.600","C00.800","C00.900","C01.x00","C01.x00x003","C01.x01","C02.000","C02.000x002","C02.100","C02.100x001","C02.101","C02.200","C02.200x002","C02.201","C02.300","C02.300x002","C02.300x003","C02.400","C02.800","C02.900","C02.900x002","C03.000","C03.000x002","C03.001","C03.100","C03.100x002","C03.101","C03.900","C03.900x001","C03.901","C04.000","C04.100","C04.800","C04.900","C05.000","C05.100","C05.200","C05.800","C05.900","C05.900","C05.900x002","C06.000","C06.001","C06.100","C06.100x002","C06.100x003","C06.100x004","C06.100x005","C06.101","C06.102","C06.200","C06.800","C06.900","C06.901","C06.902","C07.x00","C07.x00x003","C08.000","C08.100","C08.800","C08.800x001","C08.900","C08.900x001","C09.000","C09.100","C09.100x001","C09.100x002","C09.100x003","C09.800","C09.900","C09.901","C09.902","C10.000","C10.100","C10.101","C10.102","C10.200","C10.300","C10.400","C10.800","C10.800x002","C10.900","C11.000","C11.001","C11.100","C11.101","C11.102","C11.200","C11.200x002","C11.201","C11.202","C11.300","C11.300x001","C11.300x004","C11.300x005","C11.300x006","C11.301","C11.302","C11.800","C11.801","C11.900","C11.901","C12.x00x002","C13.000","C13.100x001","C13.100x002","C13.101","C13.200","C13.800","C13.900","C13.901","C14.000","C14.001","C14.002","C14.003","C14.200","C14.800","C14.800x001","C14.800x002","C14.800x003","C14.800x004","C14.800x005","C14.800x006","C14.800x007","C30.000","C30.001","C30.002","C30.003","C30.004","C30.005","C30.100","C30.101","C30.102","C30.103","C31.000","C31.100","C31.200","C31.300","C31.800","C31.801","C31.900x001","C32.000","C32.001","C32.100","C32.100x004","C32.101","C32.102","C32.103","C32.104","C32.200","C32.300","C32.800","C32.900","C39.000","C39.801","C41.000x018","C41.000x020","C41.000x021","C41.000x023","C41.000x025","C41.000x027","C41.001","C41.002","C41.003","C41.004","C41.005","C41.006","C41.007","C41.008","C41.009","C41.010","C41.011","C41.100","C43.000","C43.200x001","C43.200x003","C43.201","C43.300","C43.302","C43.400x002","C43.401","C44.000","C44.200x001","C44.201","C44.300","C44.300x005","C44.300x006","C44.302","C44.304","C44.305","C44.306","C44.307","C44.400x004","C44.401","C46.200","C47.000x004","C47.000x005","C47.000x006","C47.000x007","C47.000x008","C47.000x009","C47.000x010","C47.000x011","C49.000x004","C49.000x005","C49.001","C49.002","C49.004","C49.005","C71.900x009","C71.900x010","C76.000x002","C76.000x007","C76.001","C76.002","C76.003","C76.004","C76.005","C76.006","C77.000x005","C77.001","C77.002","C77.003","C77.004","C77.005","C77.006","C77.007","C77.008","C78.300x004","C78.300x005","C78.300x006","C78.300x008","C78.300x010","C78.301","C78.302","C78.303","C78.305","C79.200x008","C79.201","C79.202","C79.203","C79.500x016","C79.500x028","C79.502","C79.503","C79.504","C79.505","C79.800x806","C79.800x812","C79.800x824","C79.800x825","C79.800x826","C79.800x828","C79.800x833","C79.800x840","C79.800x843","C79.800x844","C79.800x845","C79.801","C79.802","C79.803","C79.804","C79.830","C79.831","C79.834","C79.835","D00.000x005","D00.000x007","D00.000x008","D00.001","D00.002","D00.003","D00.004","D00.005","D00.006","D00.007","D00.008","D00.009","D00.010","D00.011","D00.012","D00.013","D02.000","D02.000x003","D02.000x004","D02.001","D02.002","D02.300","D02.301","D02.302","D02.303","D03.000","D03.200x002","D03.201","D03.301","D03.400x002","D03.401","D04.000","D04.200x001","D04.201","D04.300x001","D04.300x002","D04.400x001","D04.401","D09.701","D37.000x001","D37.000x002","D37.000x003","D37.000x004","D37.000x005","D37.000x006","D37.000x007","D37.000x008","D37.000x009","D37.000x010","D37.000x011","D37.000x012","D37.000x013","D37.000x014","D37.000x015","D38.000x001","D38.000x002","D38.500x001","D38.500x003","D38.500x004","D38.500x005","D44.600x002"};
        String[] adrg_zd1={};
        String[] adrg_ss={"01.2502","18.2101","18.2900x003","18.2900x009","18.2901","18.3100","18.3900x003","20.4900x004","20.4900x008","20.4900x009","20.4901","20.4902","20.5100","20.5901","22.2x00x009","22.3100x002","22.4201","22.4202","22.6001","22.6002","22.6100","22.6200x004","22.6201","22.6300","22.6300x011","22.6300x012","22.6301","22.6302","22.6303","22.6400","22.6401","22.6402","22.6403","24.3100x003","24.4x05","24.5x03","25.1x01","25.1x02","25.1x03","25.1x04","25.2x01","25.3x00","25.4x00x001","26.2901","26.2902","26.2903","26.2904","26.2906","26.3000","26.3100x008","26.3100x009","26.3101","26.3102","26.3103","26.3104","26.3105","26.3201","26.3202","26.3203","27.3101","27.3103","27.3104","27.3200x001","27.3201","27.3202","27.3203","27.4200","27.4301","27.4302","27.4900x007","27.4900x009","27.4900x014","27.4900x018","27.4900x019","27.4902","27.4903","27.4904","27.4905","27.4906","27.4907","27.4908","27.4909","27.4910","27.7200","27.7201","27.7202","27.7901","28.2x00x002","28.2x00x003","28.2x01","28.2x02","28.2x03","28.2x04","28.3x01","28.3x02","28.3x03","28.4x00","28.5x01","28.5x02","28.5x03","28.6x00x001","28.6x00x002","28.6x00x004","28.6x00x005","28.6x01","28.6x02","28.6x03","28.7x02","29.3300x001","29.3300x002","29.3900x001","29.3900x007","29.3900x010","29.3900x012","29.3900x019","29.3901","29.3902","29.3903","29.3905","29.3906","29.3907","29.3908","29.3909","30.0900x016","30.0900x021","30.0900x024","30.0900x038","30.0900x039","30.0900x040","30.0901","30.0902","30.0903","30.0904","30.0905","30.0906","30.0907","30.0908","30.0909","30.0911","30.1x00","30.1x00x002","30.2100","30.2100x002","30.2100x003","30.2101","30.2200","30.2201","30.2202","30.2203","30.2204","30.2900x002","30.2900x003","30.2900x009","30.2900x011","30.2900x012","30.2900x013","30.2900x014","30.2901","30.2902","30.2903","30.2904","30.2905","30.2906","30.2907","30.2908","30.2909","30.2910","30.2911","30.2912","30.3x00","30.3x01","30.3x02","30.3x03","30.3x04","30.4x00x002","31.5x00x003","31.5x00x012","31.5x00x013","31.5x00x014","31.5x01","31.5x02","31.5x03","31.5x04","40.3x00x005","40.4000","40.4000x003","40.4100","40.4200","40.5900x011","86.4x01"};
        String[] adrg_ss1={};
        
        if (true && Base.contains(adrg_zd,record.zdList[0]) && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合DA1入组条件，匹配规则：主诊断匹配、主手术匹配");
                
            if (MDCD_DRG.DA19_group(record)){
                return "DA19";
            }

            return "DA1";
        }else{
            return "";
        }
    }
}

