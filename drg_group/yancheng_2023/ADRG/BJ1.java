package drg_group.yancheng_2023.ADRG;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import drg_group.yancheng_2023.Base;
import drg_group.yancheng_2023.MedicalRecord;
import drg_group.yancheng_2023.DRG.MDCB_DRG;

public class BJ1 {
    public static String group(MedicalRecord record){
        String[] adrg_zd={};
        String[] adrg_zd1={};
        String[] adrg_ss={"00.1000","01.0100","01.0100x002","01.0200x001","01.0900x002","01.0900x003","01.0900x004","01.0900x005","01.0900x006","01.0900x007","01.0900x008","01.0900x009","01.0901","01.1100x001","01.1300x001","01.1300x002","01.1301","01.1600x001","01.1700x001","01.2500x003","01.2501","01.2502","01.2503","01.2504","01.2505","01.2506","01.2507","04.0200x006","04.0200x007","04.0200x007","04.0200x007","04.0200x008","04.0200x008","04.0300x002","04.0300x013","04.0300x014","04.0300x015","04.0300x016","04.0300x017","04.0300x018","04.0300x019","04.0300x020","04.0300x021","04.0304","04.0305","04.0306","04.0307","04.0308","04.0309","04.0310","04.0400x025","04.0400x029","04.0400x030","04.0400x031","04.0405","04.0407","04.0408","04.0409","04.0410","04.0411","04.0412","04.0413","04.0414","04.0415","04.0416","04.0417","04.0418","04.0419","04.0420","04.0421","04.0422","04.0423","04.0424","04.0425","04.0426","04.0500","04.0600x001","04.0600x002","04.0700x030","04.0700x031","04.0700x032","04.0700x033","04.0700x034","04.0700x035","04.0700x036","04.0700x037","04.0700x038","04.0700x039","04.0700x040","04.0700x041","04.0700x042","04.0700x043","04.0700x044","04.0700x045","04.0700x046","04.0700x047","04.0700x048","04.0700x049","04.0700x050","04.0700x051","04.0700x052","04.0700x053","04.0700x054","04.0703","04.0704","04.0705","04.0706","04.0712","04.0713","04.0714","04.0715","04.0716","04.0717","04.0718","04.0719","04.0720","04.0721","04.0727","04.0728","04.0730","04.0731","04.0732","04.1101","04.1201","04.1202","04.1203","04.2x00x001","04.2x00x017","04.2x01","04.2x02","04.2x03","04.2x11","04.3x00x012","04.3x00x017","04.3x00x018","04.3x00x019","04.3x00x020","04.3x00x021","04.3x00x023","04.3x00x024","04.3x00x025","04.3x00x026","04.3x00x028","04.3x00x029","04.3x00x030","04.3x00x031","04.3x00x032","04.3x00x033","04.3x01","04.3x02","04.3x03","04.3x04","04.3x05","04.3x07","04.3x08","04.3x09","04.3x10","04.3x11","04.3x12","04.3x13","04.3x14","04.3x17","04.3x18","04.4200x007","04.4200x017","04.4300","04.4301","04.4400","04.4900x033","04.4900x034","04.4900x035","04.4900x037","04.4900x042","04.4900x046","04.4900x047","04.4900x048","04.4900x049","04.4900x050","04.4901","04.4902","04.4903","04.4904","04.4905","04.4906","04.4907","04.4908","04.4909","04.4910","04.4911","04.4912","04.4913","04.4914","04.4915","04.4916","04.4917","04.4918","04.4919","04.5x00x009","04.5x00x016","04.5x00x017","04.5x00x018","04.5x00x019","04.5x00x020","04.5x00x021","04.5x00x022","04.5x00x023","04.5x01","04.5x02","04.5x04","04.5x05","04.5x07","04.5x08","04.5x09","04.5x10","04.5x11","04.6x00x010","04.6x00x012","04.6x00x013","04.6x00x014","04.6x00x015","04.6x00x017","04.6x00x018","04.6x00x019","04.6x00x020","04.6x01","04.6x04","04.6x05","04.6x06","04.6x07","04.6x08","04.6x10","04.6x11","04.6x12","04.7100","04.7200","04.7300","04.7400x032","04.7400x033","04.7401","04.7402","04.7403","04.7404","04.7405","04.7406","04.7407","04.7408","04.7409","04.7410","04.7411","04.7412","04.7413","04.7414","04.7415","04.7416","04.7417","04.7418","04.7500x001","04.7500x002","04.7500x003","04.7500x004","04.7500x005","04.7501","04.7502","04.7503","04.7600x005","04.7600x006","04.7600x007","04.7600x008","04.7600x009","04.7600x010","04.7600x011","04.7600x012","04.7600x013","04.7600x014","04.7600x015","04.7600x016","04.7600x017","04.7600x018","04.7601","04.7602","04.7603","04.7900","04.8000","04.8100x003","04.8101","04.8102","04.8103","04.8104","04.8105","04.8106","04.8900","04.9100","04.9900","05.0x00x001","05.0x01","05.1101","05.1102","05.2100","05.2100x002","05.2200","05.2200x002","05.2300","05.2300x003","05.2300x004","05.2300x005","05.2300x006","05.2300x007","05.2301","05.2400x003","05.2401","05.2402","05.2500","05.2901","05.2902","05.2903","05.2904","05.3100","05.3100x006","05.3100x007","05.3100x008","05.3100x009","05.3100x010","05.3101","05.3200x001","05.3900","05.8101","05.8102","05.8900x001","29.9200x001","29.9200x002","31.9100x001","31.9100x002","44.0100","86.5902","92.3101"};
        String[] adrg_ss1={};
        
        if (true && record.ssList!=null && record.ssList.length>0 && Base.contains(adrg_ss,record.ssList[0])){
            Base.groupMessages.putMessage(record.Index,"符合BJ1入组条件，匹配规则：主手术匹配");
                
            if (MDCB_DRG.BJ13_group(record)){
                return "BJ13";
            }
    
            if (MDCB_DRG.BJ15_group(record)){
                return "BJ15";
            }

            return "BJ1";
        }else{
            return "";
        }
    }
}
