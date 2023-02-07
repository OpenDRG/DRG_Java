package drg_group.taizhou_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.taizhou_2022.Base;
import drg_group.taizhou_2022.MedicalRecord;
import drg_group.taizhou_2022.ADRG.*;

public class MDCL{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"N15.101","N32.202","E14.200x013+N08.3*","N01.500x001","N00.900x002","N28.839","N03.800x004","N05.803","Q63.203","D30.300","N28.831","N99.800x011","N26.x01","T83.003","Z46.601","C67.900","Q87.808","N30.901","N14.102","C79.102","R39.801","N03.400","T86.100x006","N32.801","N02.701","T83.100x002","S37.000x016","T19.900","Q62.601","E14.200x024+N08.3*","N30.802","N32.804","R94.400","N99.808","N27.900","N39.300x002","N05.900","E14.200x016+N08.3*","N39.900","N28.827","R39.000","N25.805","E10.200x215+N08.3*","Q62.100","E10.200x031+N29.8*","E10.200x012+N08.3*","N13.500x010","N11.100","Q63.001","Q64.704","R80.x02","Q63.801","C67.300","N13.600","N00.900x006","T83.800","T83.500x003","N28.102","N17.002","N30.100","N28.819","N17.900x003","N05.802","E85.411+N29.8*","E10.200x016+N08.3*","N04.501","Q62.100x902","Q64.700x601","Q85.900x029","T83.500x002","N28.826","Q62.300x903","N13.600x004","S37.000x012","R82.900x003","I12.900x005","R32.x00","N39.300","E85.403","Q62.700x101","N99.803","N00.902","N06.400","N28.825","Q64.700x902","S37.002","E11.200x215+N08.3*","Q64.402","S37.300","Q62.202","Q61.403","Q62.103","Q63.101","N28.809","N14.201","N13.901","C65.x00","N03.200x001","E11.400x381+N33.8*","B65.002+N22.0*","R94.402","N99.000","E14.200x026+N08.3*","N36.100","I12.900x001","E11.200x028+N08.3*","N06.500","R82.600x001","N19.x01","N32.800x003","N17.000","R39.200","S37.200","Q62.301","S37.000x022","N13.302","D41.001","N32.104","E14.200x015+N08.3*","R93.402","Q61.300","N36.802","N17.901","Q64.700x701","A02.205+N16.0*","E10.200x027+N08.3*","D41.101","N25.900","E11.200x015+N08.3*","M10.001+N16.8*","Q85.900x013","Q60.400","N30.201","Q62.700x001","N28.801","N14.301","T83.200","N00.000","T86.100x005","N01.400x001","N28.817","C68.000","N34.202","D41.200x001","N28.900x013","S37.300x081","N30.808","Q64.200x001","Q62.300x101","N25.004","E10.200x214+N08.3*","E14.200x213+N08.3*","N02.600","Z49.201","Q64.700x901","N36.005","N36.807","N03.901","N17.200x003","N06.300","N11.901","N28.835","D41.401","E85.002","N28.813","N28.832","N28.900x017","N07.600","N34.000x005","E10.200x025+N08.3*","Q64.302","R30.000","E11.201+N08.3*","C68.100","Q63.200","E11.200x013+N08.3*","M31.003+N08.5*","C66.x00x003","N31.200x006","N32.204","N99.100x005","N30.809","Q62.700","C67.900x002","N13.503","N13.701","N02.801","N39.401","C64.x00x001","Q62.200","R82.000","T86.100x002","N01.800","S37.201","T86.100x008","R82.700","N32.808","N05.501","E11.400x380+G99.0*","E14.200x091+N08.3*","R82.901","N15.000","N28.003","N18.501","R93.400x003","S37.303","N01.200x001","N04.902","Q64.304","E14.200x014+N08.3*","E11.200x214+N08.3*","N13.506","N36.004","N27.100","C67.200","N00.900","N19.x00","E14.200x028+N08.3*","D30.900","R94.802","Q62.300x301","T86.100x003","N11.900x003","C79.103","N32.809","I12.900x006","N36.201","N04.502","N04.901","N05.000x003","N18.300","R82.300","N06.100","Q62.602","R34.x02","N03.800x003","N17.800","N39.404","R80.x01","N00.301","N25.806","N04.400x001","N17.900","N18.904","Z46.603","E10.200x015+N08.3*","D69.005+N08.2*","D41.700","N01.000","N39.000","S37.300x011","S37.200x011","N05.900x006","Q63.800x902","Q64.708","N35.100x001","R79.802","N34.002","N02.802","N17.900x004","T83.100","Z49.101","N34.000","N31.201","E10.200x013+N08.3*","R39.101","N36.804","N13.301","N00.800x001","M31.002+N08.5*","M10.005+N22.8*","N04.903","Q61.402","N28.800x001","N05.400","D30.301","N03.500x003","C76.303","N13.204","N28.822","S37.011","E10.200x211+N08.3*","N32.000","E11.200x017+N08.3*","E14.200x012+N08.3*","N03.900x005","N04.001","N39.400","D41.400x004","N28.824","E11.200x027+N08.3*","Q60.600","Q61.801","N28.808","N32.805","N00.801","N11.000x001","N05.301","N00.700","N32.802","Q64.100x091","S37.300x004","Q62.500","E14.200x011+N08.3*","E11.200x023+N08.3*","N17.100","N32.001","C67.700","S37.000x023","N07.900x001","R80.x00x003","N25.800x006","E10.200x028+N08.3*","N11.800x002","E11.200x211+N08.3*","N28.830","Q62.400x002","N28.821","C67.400","E11.200x030+N08.3*","Q64.303","D89.101+N08.2*","Q61.000","N03.700","T79.500x002","N02.900","S37.200x024","N21.000","S37.814","N32.200","N20.900x001","N03.501","N13.504","N13.202","N26.x02","N15.102","N03.502","T83.101","S37.000x032","R82.500x004","N28.902","N30.300","N34.200x004","R35.x00x003","Q61.404","S37.300x082","N30.803","C68.800x003","N13.400","R35.x00","N04.800x002","Q64.702","E10.200x023+N08.3*","A41.902+N08.0*","N18.901","N32.811","N06.001","N13.603","N18.100","C67.600","Q60.100","N28.834","N39.100","N35.901","S37.300x021","C79.000x001","N32.900x002","Q62.104","N15.801","N34.001","N28.900x004","N34.201","Q85.903","S37.111","N02.800x003","S37.310","R30.100","C68.801","E83.100x008+N16.3*","N32.901","Q64.401","N00.600","R30.000x002","D41.400x001","Q61.900","N26.x00","C79.100x002","Q61.401","E11.200x031+N29.8*","N01.900","E11.200x014+N08.3*","N02.900x002","N03.601","I12.900x008","N25.804","R93.405","T19.801","D30.200","N01.900x003","T83.501","T86.102","N03.800x001","E14.400x381+N33.8*","N36.803","N11.900","T83.001","S37.300x031","C76.301","M32.101+N08.5*","N36.809","E14.200x021+N08.3*","N20.000x002","N07.500","Q87.800x903","S37.001","T83.804","N39.403","D18.000x811","D09.102","N04.200x001","N28.810","N36.003","N28.815","N32.813","D30.100","N02.201","N17.001","N00.100x001","Q62.300x902","Q62.000","Q64.301","N20.100","T86.100x007","N07.800","N03.503","N05.900x003","I12.900x002","N30.810","N32.800x012","N01.900x002","Q62.300x904","E10.200x024+N08.3*","T81.800x014","D41.100x001","N28.806","Q60.500","T28.300","C64.x00x004","N30.801","R93.401","Q61.400","D41.301","E72.007","N31.200x002","N23.x00","N15.900x004","N20.900","Z49.000","N34.203","T86.107","C66.x00","Q64.706","D09.101","N18.900x011","R94.803","N34.205","E11.200x012+N08.3*","N32.203","Q64.800x001","T19.800x001","N35.000x001","N28.807","R30.900x001","N28.838","N31.202","S37.000x031","R82.500x003","C64.x00x003","C95.900x017+N16.1*","N03.300x001","N05.000x001","N31.200x001","D17.700x016","E11.200x091+N08.3*","N15.900x003","N21.100","N02.101","N04.300x003","N07.000","N99.500","Q64.400x902","M31.305+N08.5*","T83.100x003","N01.900x001","N02.002","N07.400","N20.200x001","C68.804","N13.600x001","N32.002","N99.806","Q64.100","N30.800x004","N11.801","R36.x01","T83.800x001","D30.701","N13.604","N17.900x002","T86.103","R82.500x005","R93.400x001","N07.300","N04.700","T83.004","N03.900x002","R93.400x002","S37.101","T81.800x011","E10.200x213+N08.3*","N36.301","N21.001","S37.300x083","R39.100x002","C68.800","N31.203","N06.800","N13.501","C67.000","Q64.701","D21.506","N11.900x001","N34.102","Q63.302","N20.000","N00.400","N06.600","Z49.000x002","N13.203","C48.001","Q64.403","N36.000","E11.200x212+N08.3*","N28.828","Q62.101","E10.200x030+N08.3*","D18.000x806","N04.601","N28.100","N30.805","I13.100x001","S37.200x023","N31.200x003","S37.004","N01.100x002","R39.200x001","E10.200x029+N08.3*","N03.900","N32.100","E13.201+N08.3*","N28.829","Q51.701","N20.000x001","N36.000x007","N31.200x007","S37.302","E10.200x091+N08.3*","N06.700","N17.200","C68.802","E14.200x023+N08.3*","N28.804","T83.500","N03.000","N13.602","N30.807","N36.200","Q64.000","T83.100x004","N31.901","E10.201+N08.3*","N17.200x002","N32.800x019","R34.x01","D41.900x001","I12.000x001","D41.201","A40.901+N08.0*","N01.300x001","T19.100","N02.001","N36.300","Q62.800","T83.002","E14.200x031+N29.8*","Q64.200","S37.200x081","E14.200x092+N08.3*","N32.103","N18.500","N01.700x001","N00.900x008","R33.x00","N04.300x001","N39.405","N25.100","N28.816","N28.818","N28.900x010","T19.000","N14.400","R82.500x006","T86.811","Q60.000","N28.820","Q64.400x301","N03.100","N35.900","N07.700","N00.900x009","E11.200x092+N08.3*","N28.002","R82.900x002","Q62.300x905","N12.x03","C79.101","Q63.000","I12.900x003","N13.000","M31.701+N08.5*","Q61.100","R39.100x001","E14.200x214+N08.3*","S37.010","N25.802","S37.301","Q64.600","N28.803","Q62.201","N28.004","Z46.800x001","I86.201","N36.806","Q63.900","Q64.700x904","N19.x02","N30.806","N03.900x007","Z46.800x002","Q60.200","T86.106","N02.302","N05.101","N36.001","N32.806","N30.902","E11.200x213+N08.3*","N05.900x009","N10.x02","R80.x00","N36.901","N20.000x003","C67.100","C68.900","N00.802","N07.100","N28.805","I12.900x009","N28.901","N36.002","N30.400","T83.802","N28.001","T86.100x001","D09.100x001","D09.000","N02.702","Q62.400","C68.805","N05.600","N25.001","N32.800x009","E11.200x011+N08.3*","N32.814","Q60.501","N04.801","S37.003","Z46.602","N03.900x006","N04.900","D30.000","N28.836","S37.000x015","N30.900","N02.502","D30.400","D41.000x001","N20.001","N99.101","C68.803","C95.900x007+N16.1*","N12.x00","N28.101","T83.103","Q63.800x101","N02.900x001","E12.200","N02.102","N11.800x003","I12.904","R30.100x001","N35.000","N39.200","N99.100x003","E10.200x017+N08.3*","E14.200x025+N08.3*","N28.802","T83.102","Q64.707","N05.201","Z45.800x007","N28.005","S37.000x013","Q64.501","N32.102","S37.000","Z49.000x004","N36.808","N32.810","N34.101","N99.100","E11.200x025+N08.3*","N20.901","C90.004+N16.1*","Q64.200x021","R93.404","C65.x01","E10.200x092+N08.3*","N32.803","D30.302","N10.x00","N13.300x005","E14.200x027+N08.3*","E14.200x212+N08.3*","Q63.002","N04.101","N18.902","N21.800","M32.102+N16.4*","Q64.900","N34.200x003","N02.401","R94.401","Q62.100x802","N31.000x001","Q27.305","N13.801","N06.900","N03.900x004","T83.000x001","N17.101","N30.804","E11.200x016+N08.3*","T86.104","N19.x03","S37.300x005","N03.900x003","Q62.600","N15.901","R31.x00","N30.000","N05.900x007","N20.002","Q64.700x801","N34.200x006","N13.502","N06.200","N99.800x006","E11.200x024+N08.3*","N28.900x026","N39.402","N99.805","N32.201","E14.200x029+N08.3*","E13.200x521+N08.3*","N12.x02","N28.823","Q62.300x901","N07.200","T28.800","E14.200x211+N08.3*","C90.005+N08.1*","N02.301","R32.x01","N13.600x002","N14.000","Q62.400x001","Q62.700x201","N39.001","N05.000x004","N00.500","M31.703+N08.5*","Q61.800","R82.902","C67.500","E10.200x026+N08.3*","N00.200","N32.800x014","Q63.301","S37.100","N27.000","N39.800x001","Q64.700x201","N28.811","M31.102+N08.5*","N12.x01","R82.800","R82.500x007","C67.501","N34.100","N11.802","N03.801","N34.204","E11.200x029+N08.3*","Q61.901","E10.200x011+N08.3*","D41.901","Q61.200","C67.800","E14.200x215+N08.3*","E66.902+N08.4*","M31.100","N01.600x001","N31.100x001","R82.200","S37.211","Z46.600x001","N28.814","N32.301","E72.006+N29.8*","R93.403","S37.200x022","T28.800x001","N28.812","N04.102","T79.500","C65.x02","N05.801","Q64.502","N18.400","T83.801","N32.300","N13.201","N18.200","R35.x00x001","N15.900x002","T86.105","Z52.400","N28.837","N00.901","N21.900","M35.006+N16.4*","Q63.201","N31.800","N10.x01","N02.203","N13.100x001","N28.833","N32.815","N25.803","S37.813","E11.200x026+N08.3*","N14.101","N32.812","N13.605","N32.400","N05.701","C66.x00x002","C79.001","Q64.703","N32.800x008","N05.900x002","Q64.705","D18.000x819","D09.104","E14.200x030+N08.3*","Q42.200x201","D41.300x001","E14.200x017+N08.3*","N32.807","N36.805","N36.302","D09.103","M35.007+N16.4*","N99.001","Q60.300","Q61.500","N35.800","N13.601","N32.101","Q63.102","E10.200x014+N08.3*","Q60.400x001","N34.300","N39.800","E10.200x212+N08.3*","E14.400x380+G99.0*","T83.100x001","Q63.103"};
        String[] dept_list={};
        if (!(true && Base.contains(mdc_zd,record.zdList[0]))){
            return "";
        }
        
        Base.groupMessages.putMessage(record.Index,"符合MDCL入组条件，匹配规则：主诊断匹配");
        String result;

        result=LA1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LA2.group(record);
        if (result.length()>0){
            return result;
        }

        result=LB1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LB2.group(record);
        if (result.length()>0){
            return result;
        }

        result=LC1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LD1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LE1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LF1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LJ1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LL1.group(record);
        if (result.length()>0){
            return result;
        }

        if (false && record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
            Base.groupMessages.putMessage(record.Index,"符合LQY入组条件，存在有效手术操作："+String.join(",",Base.Intersect(record.ssList,Base.SS_VALID)));
            return "LQY";
        }

        result=LR1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LS1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LT1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LU1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LV1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LW1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LX1.group(record);
        if (result.length()>0){
            return result;
        }

        result=LZ1.group(record);
        if (result.length()>0){
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合MDCL的ADRG入组条件");
        return "";
    }
}
