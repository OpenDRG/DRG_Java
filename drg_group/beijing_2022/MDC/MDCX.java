package drg_group.beijing_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.beijing_2022.Base;
import drg_group.beijing_2022.MedicalRecord;
import drg_group.beijing_2022.ADRG.*;

public class MDCX{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"R63.200","R76.800x001","T92.900","T92.600","Z00.300x001","Z47.800x003","T95.201","T85.806","Z51.400x001","E89.900","Z09.804","Z30.101","R25.200x004","Z42.900","T93.300x001","R52.200","B90.803","Q92.200","Z47.800x029","Z43.101","Z50.101","R84.901","Q95.000","R99.x00x002","T95.800x008","B90.200x002","Z43.603","Z63.900","Z25.000","Q92.900","T92.201","Z03.300","R19.001","Z11.902","Z43.400x003","Z13.500","Z13.800x021","Z31.800","Z28.201","T93.200x011","Z11.802","Z47.800x010","R63.400","Z71.500","Z55.100","T96.x00x001","Z29.200x001","Z50.200","T91.803","T93.300x002","Z54.000x019","Z30.400x003","R18.x00x003","T92.100x010","Z30.900","Z52.001","Z22.700","Z58.500","Z39.100x002","Q93.300","Z54.800x009","Z65.500x003","Z72.400","T93.300x008","R52.901","M23.202","Z22.801","Q95.800","Q97.200","Z22.800","B94.800x003","Z57.507","Z65.800","R52.000","Q92.700","Z57.505","Z70.200","T91.000x004","Z61.300x001","T92.500x015","Z65.500x002","Z71.000","Z63.800x002","Z73.900","Q96.900","R18.x00x001","Z01.800x004","Z57.501","Z62.600x001","R25.200x008","Z63.700x093","Z64.300","R64.x00x002","T92.204","Z09.300","T92.400x005","Z11.200","T93.800x001","T92.501","Z71.700","Z65.300x002","Z76.900","R76.100x001","Z51.901","Z13.800x051","T93.300x009","Z22.301","Z47.800x018","R19.000x009","T92.401","Z04.500","Z12.400","T95.200x004","T95.100x002","Z58.200","Z65.200","R77.901","Z64.100x001","R71.x00","Z31.402","Z63.800x001","Z59.400","Z12.200","R62.000x003","Z61.000x001","T95.300x002","T94.002","T92.505","R96.100x001","Q90.100","R47.000x006","Z54.000x012","T98.300x007","Z56.400","Z50.900x001","Z01.600x001","Z41.300","Z73.800","T95.000x004","Q98.200","Z75.000","T91.800x010","Z12.500","T85.902","Z03.600x001","Z22.402","T95.800x006","Z47.800x005","T92.300","R46.700","R89.600","Z10.200","Z47.800x033","Z59.500","Z62.800","R11.x03","T91.202","Z72.000","Q98.600","Z56.600","Z52.000","Z58.300","R23.200x002","B90.802","Z43.600x002","T94.000","Z13.800x022","Z23.600","Z25.800x001","Z55.400","Z63.400x002","Z63.600","R93.800x003","T88.901","R77.200x001","Z47.800x031","Z61.900x001","Z73.500","R69.x00","I69.800x002","T91.200","Z63.000","Z75.500","T95.300x003","Z56.300","Z54.800x005","Z71.600","R53.x00x006","T92.300x002","Z62.300x001","Z63.400x001","T93.400x004","Z04.002","T96.x00x003","Z55.300","Z54.000x022","Z47.800x024","Z71.300","R89.400","Z30.202","T95.002","Z02.800","R47.000x005","R79.805","T93.205","T91.000x003","R11.x01","R47.100x002","Z22.102","T95.000x011","R70.101","T92.801","T92.300x005","Q99.000","T91.500x003","Z43.200","Z47.800x008","Z71.800","Z10.100","Z11.000","Z72.900","R70.100","R76.200x002","T73.200","Z57.800","T84.901","Z04.900","T92.100x008","Z01.800x001","R79.000","Q87.800x907","Z23.700","T90.201","R47.000x001","Z50.801","Z62.000x001","Z42.000","R77.801","T92.500x011","Q95.300","Z01.200","R89.200","T93.000","Z20.300","R46.500","Z09.400","Z13.300x003","R79.000x001","R79.800x003","Z01.300","T90.401","Z43.400x004","Q98.100","T92.102","Q95.200","T90.206","R74.800x003","T93.300x005","R87.900x003","T95.000x008","T92.503","Z47.800x016","Z30.102","T96.x00x002","Z70.000","Z13.600","Z75.800x001","T90.400x003","T95.800x001","B94.101","Z63.100x001","Z01.102","Z63.500x001","Z12.600","R61.001","B90.200","R44.801","Q95.400","Z20.600","R79.800x005","Z28.101","Z44.200x002","T85.801","T94.001","Z54.000x009","Z65.500x001","B91.x00","R68.300","R54.x00","R19.000x008","T92.500x013","Z63.500x003","Z74.200","Z26.900","Z58.800","Z22.400","T92.307","Q97.800","Z47.800x023","Z61.200x001","T92.500x009","M24.806","Z02.900","T92.300x006","Z65.000","T95.000x005","T95.200x003","T92.602","Q98.900","Z57.502","M23.203","T91.900x003","R47.004","Q97.100","T93.204","T92.506","R53.x00x003","T93.501","Z46.602","R52.100","B92.x00","R77.900","R53.x00x004","R77.802","R76.900","T70.400","T92.300x011","T93.200","Z43.201","B90.902","Z51.800","Q91.100","R89.700","Z01.800x002","Q99.801","Z01.600x002","R93.202","T93.801","R61.000","Z22.103","B94.000","Z54.000x010","Z62.200x001","Z00.001","T82.812","R61.901","T93.400x003","T95.000x009","T95.001","Z01.700","Z13.400x001","Z47.800x032","R76.200","Z12.000","T95.000x002","Z54.800x004","T93.500x001","R25.200x006","Q95.500","Q96.400","R99.x01","Z60.900","Z54.400","Z62.500x001","R47.001","R93.501","Z54.800x010","R77.200","Z43.401","Z20.500","R10.200x001","Z65.300x001","Z58.000","T91.502","Z72.100","T90.901","T95.000x006","T93.200x013","Z70.100","R76.802","Z43.400x002","T91.802","Z65.300x003","T78.900","Z48.000x002","R18.x01","R77.101","R79.803","B90.002","R63.100x002","Z47.800x007","Z76.300","Q96.800","Z45.803","R19.002","Z48.900x001","T92.000","Z22.600","M24.807","T93.200x008","Z43.900x001","Z02.400","T80.800","Z04.200","M24.100x091","R41.000","T92.400x003","R23.100x002","T84.400","T98.200","T98.200x031","Z46.603","Z54.000x014","Z75.300","T92.300x016","T95.202","T95.800x004","Z47.800x025","Z75.900x001","Z50.600","Z28.900","Z64.200","Z54.700","Z10.800","Z54.800x003","Z64.400x003","Q98.700","B90.800x004","Z27.100","M24.810","Q97.000","T90.200x008","M23.204","Z11.801","Z50.100x001","Z01.900","T97.x00x003","Z43.700","Z45.900","M23.201","R46.801","Z31.400x004","B90.201","Z59.100","Q92.500","Z56.500","Z54.100","R17.001","T90.208","R53.x00x005","Z03.800","Z20.200","R62.803","R74.900x001","Q93.600","Q91.200","Q98.400","Z30.800x005","Z52.300x002","Z54.000","Q99.102","T92.100","M23.501","Q87.800x905","Z56.000","T91.204","Z63.400x003","B90.901","R53.x00x001","T95.102","Z65.300x005","Z47.800x006","Z51.400x002","T92.800x001","Z71.100","Q92.800","T69.900","T95.101","Z03.900","Z65.300x004","Z43.602","R53.x00x008","T90.102","Q92.400","R25.200x005","Z03.102","B90.800x005","Z12.300","Z31.203","Z47.800x014","Z56.200","Z73.100x001","Z55.000","T91.002","Z13.800x041","Z30.000x003","Z30.503","Q98.500","Z03.101","R74.801","R93.301","Z65.400x002","R71.x00x005","Z29.100","T97.x02","T94.102","R19.003","R41.100","T91.200x002","R49.800x003","T73.300","Z09.803","R58.x00x007","R89.900x002","R41.800x002","Z72.600","Z74.100x001","T91.000x001","Z04.601","Z57.504","Z61.500x001","Z50.500","R53.x00x011","Z11.800x001","R74.800x007","B90.100","R62.802","T90.200x012","T93.200x012","B94.100","T95.800x007","Z01.001","Z25.100","Z52.900","Z45.201","R77.800x003","M24.102","R82.100","Z50.400x001","T92.500x017","Z09.900x001","T73.100","Z24.200","Z20.900","Z32.000x001","Z63.200x001","Q92.000","T90.207","Z01.600","T92.500x002","Z54.000x013","Z59.600","N81.800x006","Z09.000x001","Z61.600x001","Z01.503","Z23.300","T90.400x002","Z31.500","Z04.800","R41.001","R84.900x004","T92.500x008","Z03.800x721","Z13.800x061","Z30.500x011","T80.202","T98.200x032","Z23.500","Z47.800x020","T93.203","Z13.500x001","R93.800x002","T95.200x002","T92.100x009","R63.200x002","R63.601","R74.000x001","Z22.302","Z65.400x001","Z60.200x001","Z12.900x001","T91.800x008","Z03.802","R63.300x003","T93.800x002","Z26.000","Z43.301","Z63.800x004","Z20.702","T92.300x015","T86.900","T95.000x001","T92.500x010","T93.600","T91.401","Z43.802","T92.500x004","T93.300x003","T92.303","Z54.000x007","B94.900","Q91.700","R46.000","Z75.100","Z62.100x001","Z57.600","T90.900","T95.000x003","Z47.800x019","Q89.900","T95.200x006","Z39.100x003","T93.900","Z43.601","Z54.000x006","R60.100","T93.600x002","Z40.900x001","Z43.302","M24.805","Z47.800x022","T93.400x005","R47.802","Z46.800x001","T70.900","Q93.100","Z11.803","Z58.700","Z10.000","Q99.900","R77.800x002","Q91.400","Q93.700","R79.000x003","T98.000","Z55.800","Z70.800","Z44.300","M24.808","T90.100","Q96.000","R62.801","Z27.200","Z43.300","Z73.400","R49.801","T92.400x004","Z63.800x003","Z30.501","Z11.901","Z75.200","T92.500x007","Z70.900","Z59.300","Q99.800","R23.000","Q91.600","Z23.000","M23.215","Z45.200","Z11.600","Z43.403","Z60.400","T92.500x001","Z59.700","Z72.200","R89.500","T84.700","Z54.000x021","R47.002","Q97.300","R89.000","T90.204","R47.000x008","Z46.501","Z31.202","Z45.807","R25.200x002","T92.103","Z47.800x030","Z04.001","R68.200","Z55.900","T85.800","T84.700x001","T92.203","B90.800x006","R41.300x001","T80.203","Z51.300","Z00.600","Z57.900","T92.100x005","Z00.200","T92.100x004","Z24.001","Z55.200","R47.100x001","Z41.900","T90.500x003","Q90.200","R61.100","B94.801","Z73.200","R87.900x001","R85.902","Q99.802","T91.501","T91.800x001","T93.800x003","T93.200x001","T95.900","T73.800","Q87.801","T90.400x001","Z12.901","R47.003","Z43.500","T92.305","T81.601","Z30.800x003","T92.106","T92.400x002","T95.000x010","Z22.300","T91.400","Z13.300x002","T90.200","Z57.201","T95.100x001","T92.200","Z31.400x003","Z54.800x001","Z65.400x003","R46.300","R84.902","Z32.100","Q97.900","Z47.800x034","Z76.500","Z09.700","Z46.502","Z02.600","Z57.300","Z30.103","T92.001","T93.001","Z47.800x009","T95.800x003","Z20.802","Z72.500","R68.100x001","R77.800x004","Z22.200","Z23.100","Z43.801","Z54.800x008","R47.101","Z54.000x015","Z30.201","Z31.600x001","T91.206","T73.900","Q95.900","Q98.000","R61.900","B94.800x001","T95.800x002","Z28.100","T90.203","Z30.400x001","Z51.401","Z74.800","T93.500x002","Z40.000x001","Z12.800","R58.x00x005","T93.301","Z70.300","R13.x00","B94.802","T92.500x003","T92.502","Z03.103","Z43.402","Z73.300","Z10.300","R74.802","Z39.200x001","M23.212","Z02.000","T95.103","Z47.800x026","T93.400x006","T92.400x008","T98.301","Z58.400","R18.x00x005","R63.500","R74.800x005","T91.201","Z22.401","T92.600x003","Z01.101","Z31.900","Z54.800x006","B90.000","Z54.000x008","T91.000x002","T91.900","T92.101","R52.900","Z47.800x035","T92.603","T90.205","Z54.300","Z74.900","Z28.800","R41.200","R68.800x002","R62.000x002","M23.208","Q99.101","T91.900x002","R19.000x012","Q89.700","T92.500x012","T93.600x001","T97.x01","Z01.002","Z13.900","T91.001","Z43.604","Z47.800x021","Z60.000x001","T92.304","Z02.100","T92.400x007","R26.100x001","Z12.100","T84.900","Z24.100","Z09.802","Z29.900","Z75.400","T95.801","Z30.800x001","T92.500x006","Z64.400x002","Z46.800x002","Z58.900","Z59.800","Q91.000","Z46.700","Z71.200","T91.800x004","Z11.400","Z30.505","Z50.000","Z62.400x001","Z50.501","R18.x00","Z65.100x001","Z03.900x001","T85.802","R79.000x004","Z57.700","T93.200x010","Z60.300x002","Z11.300","Z24.400","Z54.200x001","Q93.000","R54.x00x002","Z61.700x001","Z54.000x004","Z76.800x001","Z02.700","Z54.000x002","Q93.200","T92.402","R10.201","R68.101","R79.900","Z54.000x017","Z62.900","Z63.700x001","Z64.400x001","R74.800x008","R74.804","Z61.100x001","R19.004","Z01.501","T93.200x014","Z09.801","Z24.500","Z45.804","Z00.401","Z48.000x001","Z60.500","B90.101","Z63.700x011","Z47.800x012","Z24.300","Z57.000","Q96.100","B90.804","Z56.700","Q89.400","Z59.200","Z24.601","R98.x00x002","T90.202","Z45.802","Z22.000","Z30.000x002","Z39.100x001","T92.300x013","Z46.701","R53.x00x010","Z54.000x003","T93.400x002","Q99.100","R25.200x009","Z13.001","Z43.100","R74.001","T91.800x005","T93.207","Z26.800","Z50.300","Z54.000x018","T87.200","T93.400","Z20.400","Z50.700x001","Z00.300","R77.803","T93.600x003","T95.803","Z41.801","T92.500x018","R59.901","T91.205","Z00.100","Z71.400","R53.x00x002","Z30.504","Z54.800x002","Z13.801","R85.901","Z20.001","Z13.800x011","Z57.506","T90.500x002","Z72.300","Z04.400","R19.000x003","R23.101","R68.300x002","Z54.800x007","Z76.100","Z47.800x011","R76.100","T95.300x001","Z45.805","T91.500x001","R89.300","Z22.303","Z27.400x001","R63.100","Z27.900","R79.000x002","Z31.401","Q85.914","B90.001","T95.200x001","Z47.900","Z71.900","Z29.101","Q93.800","Z45.806","Z47.800x027","R58.x00x006","I69.801","R60.000","R46.100","T93.206","Q99.100x003","B90.801","B90.200x003","T95.000x007","Z13.300","R74.803","Z51.400x003","T92.400","Z23.200","Z24.600","Z11.100","Q96.200","T95.100x003","Z54.900x001","R76.000x001","Z03.803","Z11.500","Z02.500","Z20.100","Z63.700x021","Z02.200","T93.800","R54.x01","R71.x00x004","Z30.000x001","T95.800x005","Q91.500","Q89.901","Z54.000x016","R54.x00x003","Z00.800","Z40.800","I69.802","Z73.600","R74.800x006","Z04.100","Z60.100x001","T91.800x007","Z54.000x005","T93.201","Z63.700x091","Z13.000x001","Z27.300","Z76.000","Z22.900x001","R23.100","T92.300x007","Z59.000x001","Z13.200","T91.200x005","R76.801","Z20.000","Z61.400x001","T95.802","Q92.600","R60.001","T92.301","R19.000x016","Z47.800x004","Z57.100","Z30.800x002","Z43.400x005","Z22.101","Z28.000","Z60.800","T95.200x005","Z30.800x004","Z51.600","Z72.800","Z74.000","T95.400","T90.400x004","Z13.800x031","M24.803","Z23.400","B90.903","Z30.302","Z57.503","T91.800x003","T92.202","R89.800","Q98.300","R77.800x006","M23.211","Z20.701","R89.900x003","T92.300x001","Z09.001","Z45.101","T92.100x011","Z46.600","Q96.300","R25.200x007","R11.x02","T90.000","R68.800x003","T92.800x002","Z30.301","K07.601","Z01.502","Q99.200","T75.200","Z63.300x001","Z47.800x028","R53.x00x012","Z46.500x001","T90.800x002","Z54.000x020","R68.000","T92.300x017","B94.200","R77.100","T92.601","Z47.800x036","T95.301","T93.200x007","R70.000","Z29.800","R46.800x001","R82.500x001","T93.200x002","B90.904","Z27.800","Z57.400","R46.600","Z03.100","R60.901","T93.202","Z47.800x015","R79.000x006","R26.100","R79.804","Z00.500x001","R68.800x001","Q92.100","T92.504","R53.x00x009","R89.900x001","Z13.501","R47.801","R68.100x002","Z29.201","Z63.500x002","Z74.300","Z45.202","Z46.900","T92.105","R17.000","T91.800x006","Z03.800x731","Z04.300","Z30.203","Q95.100","Z43.102","Z02.300","R58.x00x004","Z13.700","R63.000","Z56.100","T92.104","Z13.800x032","R19.000x013","T94.100","Z59.900","R60.900","T91.800x009","Z58.600","Z20.801","Q98.800","Z65.900","Z57.508","M23.214","R72.x00x002","T92.300x008","Z76.201","Z03.800x701","R62.900","B94.201","R77.800x001","T92.300x012","Z29.000","R77.000","Z27.000","Z47.800x013","Z22.100","B90.202","I69.400","Z46.503","T92.600x002","Z47.800x017","Q92.300","R63.300x002","Q87.806","R58.x00x002","T80.801","Z46.601","T92.302","R89.100","T93.208","M23.209","T92.500x014","Z13.100","Z76.400","Z61.800","T92.306","T92.400x006","Z30.400x004","Z63.700x092","T95.000x012","Z23.800x001","Z73.000","R87.900x002","T91.800x002","Z41.800x002","Z03.800x711","Z50.800x002","Z46.600x001","Z58.100"};
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

        result=XR3.group(record);
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

