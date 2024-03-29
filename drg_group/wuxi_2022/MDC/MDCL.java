package drg_group.wuxi_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.wuxi_2022.Base;
import drg_group.wuxi_2022.MedicalRecord;
import drg_group.wuxi_2022.ADRG.*;

public class MDCL{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"N13.603","N34.100","N07.000","Q42.200x201","E14.200x014+N08.3*","N03.900x002","N20.001","N00.900x008","N30.902","T83.100x004","N01.700x001","N10.x01","E10.200x014+N08.3*","N28.004","R35.x00","N05.301","C68.800","Q62.200","C67.600","Z46.800x002","Z46.603","Q64.403","R31.x00","N05.501","N06.700","E11.200x031+N29.8*","N32.801","N06.300","N01.500x001","N07.100","S37.303","N05.000x004","N18.500","N32.103","Q62.100x802","N11.800x002","Q64.702","Z49.000","E14.200x213+N08.3*","R39.200","N02.502","Q62.300x904","N03.000","N27.100","N99.100","R80.x00x003","N18.501","N17.000","R82.500x007","T83.100","N11.900x003","N32.800x009","Q64.000","R30.100","N04.902","N32.901","Q61.500","Q27.305","C66.x00x003","Z49.201","R82.902","Q51.701","T83.100x002","N18.902","N32.800x014","N02.801","Q64.700x701","Q64.704","N17.200x003","N25.001","N31.200x007","S37.211","E14.200x091+N08.3*","N03.900x003","E10.200x029+N08.3*","Q63.800x101","D41.401","N18.200","N10.x00","E10.200x025+N08.3*","M31.701+N08.5*","E11.200x013+N08.3*","D09.103","N26.x00","D41.700","N32.900x002","N04.801","N02.600","N28.900x026","Q64.706","T86.100x006","N04.501","Q63.200","N02.802","Q62.300x902","Q63.001","N01.900x002","E11.200x017+N08.3*","N04.400x001","N00.600","N06.001","N13.506","N27.900","T19.800x001","Z52.400","T19.100","N99.808","N02.800x003","E10.200x027+N08.3*","N02.900","R80.x00","D89.101+N08.2*","Q64.700x201","C67.300","D09.102","S37.201","S37.300x081","N05.000x003","E11.200x016+N08.3*","C68.804","N32.803","N11.801","N00.500","E83.100x008+N16.3*","T79.500x002","Q64.800x001","C67.200","Q64.501","Q62.300x901","Q62.300x301","N25.802","S37.011","E13.200x521+N08.3*","Q64.703","N34.002","N23.x00","C68.900","N28.102","N30.901","D18.000x806","N28.901","T86.100x008","Q60.100","R33.x00","N13.202","E66.902+N08.4*","Q64.700x601","N28.828","S37.200x022","N03.900","Q62.400x002","N11.900","E14.200x027+N08.3*","N28.813","T86.102","N02.302","Q85.903","E14.200x026+N08.3*","N04.903","N34.000x005","Q63.301","S37.302","C76.301","E11.200x025+N08.3*","T83.102","T83.500","N04.901","N13.503","N32.810","S37.300x021","C66.x00","N03.800x001","N30.800x004","N36.002","N36.802","N28.902","Q62.000","N28.900x010","N03.200x001","E85.403","S37.300","Q64.304","N28.821","N39.300","N05.900x002","N07.400","Q62.300x905","Z49.000x002","Q62.800","Q64.700x902","N11.100","Q62.700","M31.002+N08.5*","E11.200x213+N08.3*","N15.801","N28.827","N31.100x001","T86.100x002","E72.007","N31.203","N01.900x001","N31.901","T28.800","T79.500","T83.801","N31.200x001","Q63.000","N20.002","T86.100x005","N31.200x006","N19.x00","Q61.403","C65.x02","N31.201","N13.600x004","Q64.402","D09.104","Q64.700x801","R30.000","D09.100x001","M32.101+N08.5*","N34.202","N04.800x002","E11.201+N08.3*","N12.x03","N04.200x001","R82.901","N28.807","N32.203","N32.814","N07.200","N13.000","I12.900x008","N36.000x007","Q62.601","N36.302","E11.200x215+N08.3*","Q64.502","Z46.600x001","E11.400x380+G99.0*","I12.900x002","S37.200x024","M31.003+N08.5*","N13.500x010","N15.101","Q62.201","N13.502","M31.703+N08.5*","N36.803","N20.200x001","N36.003","Z46.602","D30.701","C68.000","E12.200","N28.822","N32.002","T81.800x011","N17.901","M10.001+N16.8*","M35.006+N16.4*","N34.102","S37.100","R93.401","N32.100","N28.806","C67.700","D30.100","N30.400","N28.839","R39.801","N03.900x006","N99.100x003","N14.301","E10.200x015+N08.3*","R35.x00x003","N00.801","S37.111","N28.005","N36.000","E14.200x023+N08.3*","N05.600","N28.820","S37.001","E14.200x013+N08.3*","E11.200x026+N08.3*","N13.504","N01.200x001","Q63.203","N21.900","N28.836","N05.201","N30.000","N03.601","S37.300x083","N39.001","Q63.302","D69.005+N08.2*","N13.301","N32.805","N32.000","D30.200","T86.100x001","N01.800","N32.812","N11.000x001","E11.200x212+N08.3*","Q63.900","N30.801","N03.100","R39.100x002","N34.000","N07.600","R94.402","E10.200x017+N08.3*","T81.800x014","N03.700","N28.816","N39.800x001","N28.002","A02.205+N16.0*","N39.900","N30.100","D41.301","N03.900x007","N28.805","Q62.101","E14.200x092+N08.3*","M35.007+N16.4*","N32.001","N32.204","T83.101","N03.500x003","S37.000x012","T86.106","R30.100x001","N30.808","T83.800x001","E14.200x028+N08.3*","N17.900","N39.402","N99.803","N17.900x002","N34.200x004","T86.100x007","T83.500x003","N32.813","N32.802","M31.100","Q64.200x001","N36.901","N02.203","N32.800x019","N01.900x003","C68.802","C64.x00x004","N01.900","E14.200x215+N08.3*","N28.825","N99.001","N11.901","R36.x01","N00.100x001","N04.700","R82.900x003","S37.813","S37.000x032","S37.814","N06.200","N34.203","E10.200x215+N08.3*","Q60.600","Q64.700x901","T86.811","Z49.000x004","E85.002","N32.800x008","R94.401","N99.800x011","E11.200x028+N08.3*","N27.000","N15.102","N32.800x012","C79.102","R82.500x004","R94.802","D41.201","N00.900","Q60.200","N28.837","N13.400","N39.000","S37.000x013","E10.200x012+N08.3*","N32.806","Q62.700x201","N15.900x004","N02.301","N00.900x006","N25.004","I12.904","N13.600x002","N20.000x001","N28.829","N39.200","N00.400","E14.200x030+N08.3*","N06.600","C64.x00x001","Q64.701","Q87.808","S37.010","T28.800x001","T83.002","N00.900x002","Q62.400","D17.700x016","Q62.202","I86.201","N32.301","Q61.404","N28.834","N17.001","C67.900x002","Q62.301","C64.x00x003","R82.300","D30.301","N13.701","N36.807","N39.401","N19.x01","N07.900x001","R82.600x001","N13.204","C90.004+N16.1*","E14.200x012+N08.3*","C79.000x001","D41.300x001","N00.000","N28.001","N99.100x005","C65.x01","D09.101","N28.804","N99.806","T86.100x003","N26.x02","T19.000","N04.001","N00.301","N28.819","Z45.800x007","R94.803","E10.200x028+N08.3*","T86.105","E14.200x211+N08.3*","T86.104","Q64.707","N03.300x001","S37.000x031","N17.101","N05.900","C67.500","C68.801","T86.103","N18.901","Q64.303","N30.802","D41.001","N36.808","N34.200x003","I12.900x001","E14.200x015+N08.3*","R93.403","N28.831","N35.100x001","N13.300x005","Q61.901","T83.000x001","N07.800","N28.802","R93.400x001","S37.200x011","E11.200x024+N08.3*","S37.301","C95.900x007+N16.1*","N20.000","N17.900x003","N25.100","N17.900x004","N34.201","Q64.100","N03.900x005","N06.800","M10.005+N22.8*","N28.900x017","T28.300","N03.502","D41.100x001","N15.901","Q62.602","N32.101","Q63.002","N03.801","E85.411+N29.8*","A41.902+N08.0*","N20.000x003","N36.805","N39.800","N01.100x002","T83.501","Q85.900x029","E14.200x214+N08.3*","N15.900x002","D09.000","N28.832","C65.x00","N25.900","N04.101","N30.201","Q62.400x001","E11.200x023+N08.3*","N05.000x001","N99.500","E14.200x024+N08.3*","N36.301","N13.600x001","N32.808","N14.102","N02.101","C68.803","C79.101","I12.900x003","N35.901","N00.800x001","N28.817","N34.205","E11.200x211+N08.3*","S37.300x031","R82.500x005","N20.900x001","N34.204","Q63.101","N02.701","N15.000","N04.102","Q62.700x001","N07.300","N10.x02","N13.201","R30.900x001","C95.900x017+N16.1*","T19.900","C67.800","E11.400x381+N33.8*","Q61.200","E14.200x025+N08.3*","N32.815","N13.801","R93.400x002","D30.000","Q64.600","N17.800","Q63.800x902","S37.002","Q60.501","N28.803","N39.403","N28.003","N30.807","N00.901","N11.900x001","N17.200","N30.804","C67.100","Q61.801","N30.810","N20.901","E11.200x015+N08.3*","C67.900","N18.100","N32.809","R80.x01","E10.200x024+N08.3*","N02.900x001","N36.201","S37.200x081","T83.100x001","S37.101","R82.500x003","N03.900x004","N26.x01","N31.000x001","R79.802","N28.838","N32.102","E13.201+N08.3*","N05.801","N18.300","E10.200x212+N08.3*","N21.800","N39.405","N14.000","N34.200x006","R82.900x002","E10.200x091+N08.3*","R39.200x001","N00.902","Q64.400x301","N02.702","Z49.101","N13.605","N36.001","C66.x00x002","M32.102+N16.4*","Q62.600","T83.500x002","D30.900","Q64.700x904","N17.002","N21.100","N02.401","Q64.302","D18.000x811","E10.200x213+N08.3*","N00.900x009","N28.815","N05.701","N39.400","N32.201","R82.500x006","C48.001","E10.200x092+N08.3*","Q61.401","N04.300x001","E11.200x029+N08.3*","N05.900x009","S37.310","N35.800","N01.000","R32.x01","N18.900x011","N30.809","S37.000x022","D41.200x001","D41.901","E11.200x092+N08.3*","N03.501","R30.000x002","N28.100","D41.400x004","N01.600x001","N28.814","N35.000","N36.100","N32.804","R35.x00x001","N28.823","Q64.708","N06.100","N31.200x002","E14.200x212+N08.3*","Q61.400","N04.900","N34.101","E14.200x017+N08.3*","N13.302","Q62.700x101","N20.100","N04.300x003","N28.824","N31.800","N32.200","I13.100x001","N34.001","N13.501","R32.x00","T83.100x003","I12.900x009","T83.802","N14.101","N31.202","N15.900x003","E10.200x023+N08.3*","Q87.800x903","T83.001","N39.404","N02.102","I12.900x006","N32.811","N07.500","E14.200x029+N08.3*","N36.804","Q64.200x021","E14.200x031+N29.8*","Q63.102","T83.003","S37.000x023","N20.000x002","N36.004","N05.900x006","Q60.500","N00.700","N20.900","Q63.103","E10.200x031+N29.8*","N30.805","C67.501","N11.802","N13.203","N21.001","E14.400x381+N33.8*","E14.400x380+G99.0*","N28.801","N36.200","N25.800x006","N32.800x003","N14.400","Q62.103","S37.000","N05.900x003","N13.100x001","E14.200x011+N08.3*","C68.800x003","E72.006+N29.8*","C79.001","N00.200","S37.000x015","N28.826","N18.904","Q60.400","T83.004","Z46.601","N11.800x003","N03.800x003","N06.500","N18.400","N03.800x004","E10.200x026+N08.3*","N06.900","Z46.800x001","N28.808","N13.600","R94.400","N06.400","Q64.705","N17.200x002","D41.400x001","S37.004","S37.300x005","S37.300x082","N02.201","Q64.401","R39.100x001","D41.101","E14.200x021+N08.3*","Q64.400x902","D18.000x819","E10.200x214+N08.3*","N02.002","N07.700","N25.806","Q64.900","N30.300","R93.404","N28.811","E10.200x211+N08.3*","D21.506","Q60.300","Q61.300","N32.104","R39.101","Q61.800","E11.200x091+N08.3*","N13.601","N32.807","R93.405","N99.805","N32.300","N05.803","B65.002+N22.0*","N03.901","R82.000","N30.803","T83.800","S37.300x011","C79.100x002","S37.300x004","R82.800","T19.801","N30.806","N99.000","S37.003","T86.107","T83.200","N99.101","N28.809","N19.x02","N31.200x003","N28.830","E11.200x014+N08.3*","N01.400x001","N25.804","S37.000x016","N03.503","E11.200x011+N08.3*","C68.805","N28.800x001","N04.502","M31.305+N08.5*","E11.200x012+N08.3*","C67.000","E11.200x214+N08.3*","E14.200x016+N08.3*","N28.835","Q61.900","N30.900","Q62.100x902","Q85.900x013","A40.901+N08.0*","R82.200","N28.101","N28.900x013","N32.400","N99.800x006","N36.300","E11.200x027+N08.3*","N03.400","T83.804","Q62.104","N32.202","N01.300x001","E11.200x030+N08.3*","C90.005+N08.1*","N13.901","Q64.100x091","N12.x00","C67.400","R39.000","N28.818","N36.809","Q60.400x001","R93.402","E10.201+N08.3*","Q63.801","N21.000","N05.101","N13.604","Q61.100","N39.100","S37.200x023","C76.303","D41.000x001","E10.200x013+N08.3*","N05.400","I12.900x005","Q61.402","Q62.300x101","N05.802","E10.200x016+N08.3*","N04.601","R80.x02","S37.200","D30.300","N00.802","N12.x02","E10.200x011+N08.3*","N12.x01","N39.300x002","Q62.300x903","Q63.201","N34.300","R34.x02","M31.102+N08.5*","N02.900x002","N28.812","R93.400x003","C68.100","R82.700","D30.400","N35.900","Q62.100","Q60.000","N36.806","N28.810","Q61.000","Q64.200","C79.103","N19.x03","D30.302","D41.900x001","N02.001","I12.000x001","N05.900x007","N28.833","N25.803","R34.x01","N35.000x001","N17.100","N14.201","T83.103","E10.200x030+N08.3*","N25.805","N36.005","N28.900x004","Q62.500","Q64.301","N13.602"};
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

        if (record.ssList!=null && record.ssList.length>0  && Base.intersect(Base.SS_VALID,record.ssList)){
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

