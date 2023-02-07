package drg_group.wuhan_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.ADRG.*;

public class MDCX{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"R74.000x001","R76.200x002","Z25.800x001","R53.x00x003","Z23.100","Z39.100x003","Z09.400","R53.x00x004","Z02.300","Z50.501","Z39.100x001","Z27.800","R79.805","R74.801","Z11.100","R17.001","M24.810","Z30.302","T91.200x002","Z30.800x003","Z20.000","T91.800x006","T84.700x001","R46.500","Z62.400x001","Z03.101","Z74.100x001","Z31.600x001","T91.900","Z43.600x002","Z48.900x001","T91.103","Z41.800x002","Z52.900","Z00.401","Z29.101","Z51.600","R10.201","I69.801","Z51.400x003","R47.802","Z61.900x001","T92.500x009","M23.206","R46.800x001","T94.002","Z63.700x001","Z01.300","T92.400","T92.505","T93.600x001","Z47.800x011","Z43.403","Z65.400x001","Z09.900x001","Z63.700x093","Z47.800x015","T93.200x010","Q99.802","Q99.100x003","R18.x00x003","R54.x00","T92.504","Z30.000x003","Z09.001","T93.000","Z65.300x002","Z31.400x004","R26.100","T85.902","T98.000","Z12.900x001","Z43.602","Z65.400x002","Z75.900x001","M24.102","Z43.102","Z47.900","Z28.101","Z30.101","Z54.700","T93.200x012","Z47.800x029","Q91.100","R93.800x003","Z31.401","Z13.800x051","Z65.500x003","B94.801","T78.900","Q97.000","Z43.604","Z20.900","Z24.200","M23.209","T92.400x003","R60.001","T93.204","Z48.000x001","T90.200x008","T91.803","T91.500x001","Z30.000x002","Z03.800x721","Z43.302","Z61.600x001","M23.800x095","R70.101","Z30.203","T98.200","Z60.000x001","Z42.000","Z54.800x001","Z54.000x010","R19.000x008","Z47.800x035","Z28.100","Z47.800x013","R47.101","Z54.000","T73.100","Z20.001","Z47.800x036","R96.100x001","Z23.000","Z43.100","Z43.402","Z54.900x001","R58.x00x002","R89.200","T85.806","R23.100","R84.900x004","Z02.400","Z43.301","Z62.300x001","T92.500x007","Z13.600","Z45.803","Z57.502","T91.800x003","Z27.200","Z03.103","Z47.800x025","R47.003","T90.900","Z54.800x008","R68.300","M23.800x021","Z50.300","T92.201","T90.400x004","Z13.800x022","Z54.000x009","Q98.100","Z27.000","Z51.901","R47.001","Z11.801","Z46.700","Q98.800","Z13.700","R63.300x003","Z41.300","Z54.800x010","Z63.700x092","Z63.400x001","R74.900x001","T92.300","M23.204","R74.001","T91.800x002","Z01.800x002","R18.x00x005","T92.502","Q98.200","T81.601","Z03.300","Z57.507","Z57.900","Q98.900","R19.000x009","R19.003","R79.000x004","R76.900","B91.x00","Z12.400","Q92.300","T93.400x004","Z50.200","M23.203","T92.500x015","T91.100","Z03.802","Z23.200","R63.000","M23.800x031","Z01.600x002","Z27.100","Z11.803","R60.901","Q92.900","Z46.501","R62.802","Z01.002","R62.803","T92.102","Z11.400","R19.000x016","R53.x00x009","T92.100x004","Q93.700","Z30.900","B90.901","R77.200","T90.205","M23.800x011","Z27.300","Z47.800x022","Z11.901","Z31.202","T87.200","Z43.200","Z47.800x008","T91.900x002","Z65.500x002","Z12.200","T92.302","R25.200x007","Z11.600","Q93.000","R76.800x001","T92.600x003","T91.800x005","T92.100x005","T98.200x031","R89.900x002","Z30.400x004","T93.208","Z02.000","T92.105","Z47.800x030","R74.802","Z57.000","Q92.500","Q97.900","R89.000","Z63.400x003","Z54.800x006","Z61.400x001","Z47.800x009","T92.400x004","Z54.000x018","Q91.000","B90.800x004","T92.500x004","B90.100","Z45.201","Z47.800x020","Q92.700","Z29.200x001","Z65.400x003","Z47.800x016","R93.301","R89.100","T80.800","T84.700","T93.300x001","R25.200x001","R63.100x002","T93.800x001","Z28.800","R19.000x013","Z63.800x004","Z43.401","Q91.200","T91.900x003","R70.000","R76.000x001","R77.800x004","T92.000","T92.300x013","T94.100","Z13.200","Z30.400x003","R23.000","Z54.000x022","Z64.400x003","Z50.400x001","R87.900x003","Q96.100","T94.102","Q95.000","Z31.500","R84.904","T92.500x010","Z43.400x004","T92.400x005","Z43.700","Z64.400x001","Z54.800x003","R53.x00x005","T91.500x003","B90.804","Z54.000x006","Z12.800","R53.x00x008","R47.100x002","T90.000","Z27.400x001","R77.800x002","T92.301","R61.001","T92.300x006","Z57.508","R68.200","Z25.100","R89.400","R98.x00x002","T80.203","R79.800x003","T92.500x001","Z12.100","T93.001","Z57.201","T97.x00x003","Z65.500x001","B94.000","B90.800x005","T92.001","Z13.000x001","R74.800x007","Z54.800x007","R89.300","R41.000","Z01.900","Z01.502","R74.803","Z46.502","T93.200x001","T92.500x014","Z47.800x021","Z57.800","Q95.900","R18.x00","Z28.900","M23.800x094","R79.800x005","Z47.800x007","Z30.202","Z62.500x001","K07.601","M23.207","Z11.300","Z11.902","B94.200","T92.500x002","Z57.503","T92.203","R13.x00","Q92.400","T92.600","Z43.400x005","Z28.201","Z30.301","Z30.501","R68.100x002","B90.101","B90.200x002","Q85.914","T93.600x002","Z30.000x001","T92.202","Z63.800x001","R53.x00x001","Z23.700","Z04.601","Q93.100","Z54.000x015","R89.800","Q93.800","Z62.000x001","Q98.000","Z13.001","R68.101","B90.200x003","R74.800x008","Z09.802","T93.400x002","Q95.300","T90.400x003","Z24.001","T92.801","B90.201","Z20.802","Z58.000","Z65.300x001","Z44.300","T86.900","Z63.500x002","B94.100","T92.300x005","T92.307","Z48.000x002","Z57.400","Q95.800","Z43.000","Q96.000","T91.202","Z20.300","Z61.100x001","R18.x00x001","Z00.300x001","Z12.500","R87.900x001","T92.300x002","R79.000x001","Z63.200x001","Z63.700x091","T92.400x006","R18.x01","R47.002","T90.204","Z09.700","Z31.203","T93.103","Z31.900","R77.101","Z50.801","Z09.000x001","T93.300x008","T85.801","T93.300x002","T92.304","T91.205","Z23.500","Z02.500","R77.200x001","T93.300x009","Z13.500","Z58.400","Z50.000","T69.900","T92.800x001","T92.303","T91.204","T93.100","Z47.800x006","Z09.801","Z54.000x013","T92.300x015","Z47.800x014","Q91.400","R63.500","Z13.300","T92.900","T92.300x012","T70.900","Z12.600","T93.501","Z52.000","Z30.201","Q99.800","R77.802","T93.101","R26.100x001","R77.803","Z29.201","Z57.501","Z65.300x003","Z43.400x003","Z54.000x017","R47.000x006","Z51.300","T92.103","R82.100","T91.206","Z29.900","R41.200","T73.800","R62.801","T90.206","R77.900","T98.200x032","Z09.804","Z13.800x032","Z45.806","Z54.000x012","T93.400x003","T91.400","M23.215","R61.100","M23.200x092","Q98.700","R76.100x001","Z47.800x033","Z50.600","I69.400","R19.002","R89.600","Q98.600","Z57.505","T91.800x008","R62.000x003","T93.102","Q96.400","Z41.801","Z54.100","Z47.800x026","I69.802","R41.100","Z23.300","Z13.800x031","Z40.900x001","R84.901","Z61.000x001","R41.001","M23.201","B90.903","Z30.800x005","R11.x01","T91.800x007","Z50.100x001","Z13.800x041","R47.100x001","R58.x00x006","R77.801","Z03.102","Z57.300","Z50.500","T93.801","Z26.900","Z45.802","Q87.800x905","Z01.503","T97.x01","M23.213","R76.100","T91.201","B90.802","T91.002","T91.800x009","T93.300x005","T93.500x002","Z23.600","B90.002","Z24.100","Z47.800x010","Z54.800x005","Z29.100","Q97.100","T94.001","M24.807","Z54.000x020","Z59.000x001","R52.901","T91.502","M23.205","R17.000","T91.104","R11.x03","Z00.600","Q91.500","B90.902","R87.900x002","Z54.000x016","T92.603","Z12.901","Z61.200x001","Z63.700x011","B90.200","T90.901","T92.305","R77.800x001","Z03.800x701","R54.x00x003","Z64.400x002","R68.800x002","T80.801","Z13.400x001","T92.600x002","Z12.300","T93.800","Z60.300x002","Z30.800x002","Q97.200","R53.x00x006","R62.000x002","Z47.800x018","Q96.200","Z43.001","R49.801","Z24.300","T80.202","Z61.300x001","R52.900","Z01.101","Z30.800x004","T92.500x016","Z23.800x001","Q92.600","T93.500x001","Z46.500x001","T92.100x008","Q96.900","R68.100x001","Z63.400x002","T75.200","T90.202","Q99.102","T96.x00x002","R60.000","Z43.900x001","Z54.800x004","Z58.300","T96.x00x001","M23.214","Z13.800x061","R60.100","T92.400x007","T92.402","Z54.800x009","Z20.801","Q98.400","Z45.202","T92.300x011","Z45.805","R79.000x002","Z04.900","T92.106","M24.805","Z24.400","E89.900","Z47.800x028","R79.000x006","Z01.800x001","T92.300x017","Z43.000x002","Z03.900x001","M23.212","Z50.900x001","Z52.001","T82.812","Z57.506","T94.000","T90.207","T91.200x005","Z01.102","Z65.300x004","T91.000x001","Z45.101","Z47.800x027","R53.x00x002","Z54.000x005","R63.200x002","Z58.500","R53.x00x011","T84.900","T93.800x003","T92.101","Z20.500","Z30.505","R53.x00x012","Z01.001","Z50.700x001","R53.x00x010","T92.800x002","T90.500x002","Q92.100","Z64.100x001","T93.200x011","Z60.200x001","Z20.400","R23.200x002","Z11.800x001","Z13.300x003","Z03.803","Z26.000","Z30.103","R25.200x008","R70.100","M24.100x071","Z47.800x034","T92.500x011","Z57.700","B94.201","Z11.000","T93.600","Z00.500x001","Q99.101","Z24.500","Q99.900","Z58.600","T92.401","Z30.102","T92.500x006","R25.200x006","Z46.503","M23.202","T90.400x001","T92.300x008","B94.802","R54.x01","Z54.000x003","Z51.400x002","Z10.000","Z54.000x007","Z57.504","R61.900","M24.806","Z20.600","Q95.500","R47.004","Z13.800x011","R68.800x003","R19.000x003","T93.200x007","Z43.603","T90.208","Z54.300","M23.210","T92.300x007","Z61.700x001","Z32.000x001","T91.800x004","Q95.400","T92.500x013","Q90.100","B90.803","Z01.501","Z62.100x001","T93.200x014","R74.800x006","Z43.601","M24.808","Z13.801","T90.203","B90.202","R47.801","Z02.600","T85.802","R52.200","R54.x00x002","Z03.800x711","Z23.400","Z54.200x001","Q95.100","T90.200","T92.300x001","Z20.701","Z24.600","T93.206","T92.104","Z43.101","T93.207","Z47.800x003","T90.500x003","Z54.000x008","M23.800x041","T92.300x016","Z65.100x001","Z45.807","Z58.100","R60.900x003","T93.203","Z28.000","Z47.800x024","B94.101","Z31.400x003","R93.800x002","Z75.800x001","R79.000x003","Z13.100","T90.401","B90.904","T91.200","T92.500x018","Z54.800x002","T90.100","R47.000x001","Z63.700x021","Z47.800x023","M24.202","Q97.800","T91.001","R11.x02","Z30.800x001","T92.500x012","T92.602","Z00.300","Z30.500x011","Z43.801","R52.100","T91.802","Z60.100x001","T93.800x002","T93.200","I69.800x002","R46.300","T93.600x003","Z27.900","J95.900","Z39.100x002","Z62.200x001","T90.400x002","T73.300","Z45.200","Z54.400","R52.000","Z52.300x002","Q98.500","T98.300x007","Z43.400x002","Z47.800x004","T93.205","Z11.802","Z32.100","R89.900x003","Q99.801","Z02.100","T91.000x003","B94.900","Z24.601","R25.200x004","R77.901","R46.801","R93.202","R64.x00x002","T92.100","Z25.000","T97.x02","T93.202","Q98.300","T93.200x008","Z43.500","B90.801","T92.306","Q96.800","R10.200x001","T70.400","Z20.702","Q91.700","Q95.200","T92.204","Z30.503","Z39.200x001","T92.500x017","Q99.100","T92.400x002","Z11.200","Z62.600x001","Z20.200","B94.800x001","Z13.900","Z58.700","R41.800x002","T73.200","Z63.300x001","Z54.000x014","Z01.200","Z57.100","Z63.800x002","T91.101","Q89.901","R77.000","R79.000","B90.001","Z03.800x731","T92.200","T93.201","Z41.900","R77.100","R25.200x005","Z13.800x021","R77.800x003","T91.800x010","R93.501","T92.100x009","M23.208","Z29.000","T93.400x005","Z63.500x003","Z00.001","M24.100x091","Z42.900","Z76.800x001","Q92.000","R41.300x001","T91.501","Z58.200","Q90.200","Z50.101","T96.x00x003","Z63.100x001","Z31.402","R74.804","T93.200x013","T92.400x008","T90.201","R76.802","Z46.701","Z47.800x032","B90.800x006","T91.102","T92.601","Q99.000","T92.503","Z03.600x001","T85.800","Z30.504","T90.102","T93.400","T92.100x011","T93.104","Q99.200","R79.804","T84.400","T90.200x012","Z30.400x001","T93.100x007","Z01.800x004","Z43.201","Z65.300x005","R23.100x002","B90.000","R85.901","T91.401","T91.800x001","R99.x00x002","R63.300x002","T91.000x004","T98.301","R61.901","R84.903","T92.500x008","Z09.300","Z54.000x004","R60.900","R63.400","T93.400x006","Z03.900","R23.101","Z13.501","Z61.500x001","M24.803","Z47.800x031","Q93.600","T93.200x002","Z12.000","R82.500x001","Z01.700","R85.902","Z50.800x002","T92.500x003","R89.500","T93.300x003","M24.100x072","Z20.100","Z29.800","R84.902","M23.501","Q92.200","R19.001","R19.004","Z03.100","Z54.000x021","Z73.100x001","R76.200","Z04.800","T91.000x002","T90.800x002","T92.506","R63.100","Z09.803","R25.200x009","Z13.500x001","Z47.800x017","Z54.000x019","R74.800x003","T92.100x010","R49.800x003","Q93.200","T88.901","Z47.800x019","R47.000x005","R89.900x001","Z13.300x002","Z54.000x002","B92.x00","Z11.500","T93.900","B94.800x003","Q91.600","Q92.800","Z63.800x003","R99.x01","R74.800x005","Z45.900","R63.200","N81.800x006","M23.211","R68.300x002","Z45.804","R25.200x002","R61.000","T92.501","Z57.600","Z43.802","Z63.500x001","R47.000x008","T84.901","R77.800x006","R79.803","Z40.000x001","T93.301","Z47.800x012","Q97.300","T73.900","M24.801","R19.000x012","Z43.300","Z26.800","R89.700","Z01.600x001","Z47.800x005"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCX入组条件，匹配规则：主诊断匹配");
        String result;

        result=XJ1.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合XQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "XQY";
        }

        result=XR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=XR2.group(record);
        if (result.length()>0){
            return result;
        }

        result=XS1.group(record);
        if (result.length()>0){
            return result;
        }

        result=XS2.group(record);
        if (result.length()>0){
            return result;
        }

        result=XT1.group(record);
        if (result.length()>0){
            return result;
        }

        result=XT2.group(record);
        if (result.length()>0){
            return result;
        }

        result=XT3.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCX的ADRG入组条件");
        return "";
    }
}
