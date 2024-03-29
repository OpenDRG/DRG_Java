package drg_group.wuhan_2022.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import drg_group.wuhan_2022.Base;
import drg_group.wuhan_2022.MedicalRecord;
import drg_group.wuhan_2022.ADRG.*;

public class MDCL{
    public static String group(MedicalRecord record){
        String[] mdc_zd={"R79.802","N04.102","M32.102+N16.4*","N05.201","E11.200x017+N08.3*","N28.826","N05.803","Q63.200","N20.900","N25.806","N34.001","B52.000","B90.102+N29.1*","C79.102","R94.803","T86.100x005","E10.200x017+N08.3*","N39.405","N13.203","N39.900","Q61.401","R35.x00","E11.200x014+N08.3*","S37.300x005","S37.300x083","A54.002","R82.500x007","A54.001","N31.200x007","N99.808","E14.200x023+N08.3*","D41.001","E14.200x011+N08.3*","N07.600","N10.x01","I12.902","N02.001","N07.400","N32.807","R34.x01","N36.000x007","N99.805","N32.812","N02.102","A06.800x001","B65.905+N08.0*","I70.102","N02.002","N13.604","N00.902","R82.900x003","N05.900x003","Q62.700","D30.701","I13.100x001","Z46.800x001","M35.007+N16.4*","N31.200x003","D41.401","Z49.101","N20.000x001","Q62.300x905","R80.x02","N21.000","N27.100","N18.901","E14.200x212+N08.3*","N11.800x003","N04.502","N01.100x002","N06.300","S37.300x082","Z52.400","C68.800x003","A18.100x025+N29.1*","N34.102","N11.900","E10.200x028+N08.3*","E10.200x213+N08.3*","E10.200x031+N29.8*","N13.400","Q62.400","S37.000x015","N13.901","Q63.203","N03.900x004","Q61.300","Q63.201","I12.900x003","I12.900x001","N28.824","Q62.101","N13.506","Q62.700x001","N13.502","N00.301","N99.000","E14.200x027+N08.3*","N19.x03","N36.807","Q62.100","N31.200x006","N28.832","N34.205","Q62.201","R39.200","S37.010","N28.808","N30.806","T83.100x003","D30.900","N28.002","N28.836","B65.001","N34.002","N11.801","N28.825","N28.805","N00.900x002","N13.301","N32.400","R30.100x001","S37.000x016","Q62.600","S37.814","T86.103","N30.900","D41.901","D18.000x855","I13.200x001","Q62.300x301","S37.000x031","Z46.601","N28.821","N10.x00","N30.804","E11.200x213+N08.3*","N32.809","D41.101","C67.900","N34.000","Q64.100","N34.100","N31.100x001","S37.301","Z49.000x004","N28.802","N34.204","R30.100","D41.400x004","N01.700x001","C76.301","E13.200x521+N08.3*","Q61.900","E12.200","N28.830","A18.100x022+N37.8*","N28.822","T86.100x007","N00.900x008","N32.104","T81.800x011","N30.902","Q61.403","S37.011","E14.200x029+N08.3*","N28.813","Q64.700x801","R93.404","Q62.100x902","B58.801+N16.0*","N36.901","N31.800","Q63.001","T19.100","S37.004","N12.x02","A59.000","S37.200","N12.x01","T83.100","N32.800x019","Q62.100x802","Q64.708","N03.900x005","N36.805","N28.900x017","S37.300x004","N32.808","N04.902","N36.100","N13.602","N17.901","N28.800x001","N25.802","A18.104+N29.1*","S37.000","N28.900x013","N02.401","N13.000","N04.700","N31.202","N01.400x001","A56.200","N17.900x004","N02.101","Q87.800x903","E10.200x025+N08.3*","N13.701","N32.203","N02.701","N01.000","N20.100","T81.800x014","A59.001+N37.0*","B87.800x001","Q64.700x904","N01.300x001","E14.200x211+N08.3*","N32.204","E11.400x380+G99.0*","N02.201","N02.802","N20.000","C95.900x007+N16.1*","E11.200x212+N08.3*","N00.801","N17.900","N30.901","Q62.300x902","N34.000x005","N11.901","C67.700","N04.900","A18.106+N29.1*","R82.700","E11.200x031+N29.8*","Q64.700x601","T86.107","C65.x00","N03.500x003","C66.x00","N03.700","N03.900x006","N07.200","T79.500","N39.100","A18.105+N29.1*","Q63.800x902","S37.200x024","N18.503+G63.8*","N28.827","N02.900","N13.302","N04.901","N21.001","N36.002","N06.100","N32.002","R94.400","S37.000x022","E11.200x029+N08.3*","N02.702","N00.900x006","Q60.600","T83.501","N32.801","N05.701","Q64.400x902","N30.201","E10.200x215+N08.3*","E11.200x215+N08.3*","E14.200x091+N08.3*","N36.300","N25.805","N17.101","R93.400x002","E11.201+N08.3*","N28.804","N32.810","Z46.800x002","N28.807","N06.700","E10.200x027+N08.3*","N20.000x002","N15.900x004","Z46.600x001","N03.900x007","D30.100","R39.200x001","D30.000","Q54.800","R39.100x002","E10.200x030+N08.3*","N21.800","N32.800x008","N01.900x001","N18.300x001+D63.8*","N32.804","N39.401","C64.x00x001","Q64.900","N03.000","N30.808","N28.839","T83.100x004","N27.000","N18.200","I72.201","E10.200x015+N08.3*","N35.100x001","N26.x02","N07.300","Q64.301","Q61.801","N32.102","C65.x01","N28.003","N04.300x001","Q64.704","N07.900x001","D09.000","N03.801","N36.804","Q61.402","B52.001+N08.0*","E11.200x015+N08.3*","N18.504+H32.8*","E85.002","N32.800x009","E10.200x026+N08.3*","N36.301","D30.400","N18.400","E11.200x013+N08.3*","N05.000x001","Q64.502","R82.901","N02.203","S37.001","C67.100","E14.200x021+N08.3*","N02.502","Q54.901","S37.302","E14.200x014+N08.3*","N28.814","I82.301","R94.802","N28.818","C67.800","N03.900x002","D30.300","N28.100","Q64.100x091","N28.812","E14.200x025+N08.3*","N32.300","Q62.602","Q85.900x013","N05.301","A36.800x005+N33.8*","N26.x00","T83.800x001","Q54.400","N05.900x009","Q64.302","Q64.700x701","N17.800","B26.800x008+N08.0*","Q62.400x002","S37.201","A52.700x012+N08.0*","Z45.800x007","E11.200x024+N08.3*","A02.205+N16.0*","N31.203","N99.500","S37.300x021","C68.800","D41.700","E10.200x212+N08.3*","I70.101","C90.004+N16.1*","S37.300x011","N32.301","S37.813","N03.800x001","N34.202","N04.300x003","N32.000","N30.810","T86.100x003","N03.901","N36.201","C48.001","R82.500x005","N18.100","N34.203","R80.x01","N05.900x002","N28.902","E14.200x015+N08.3*","N05.802","N35.000x001","N99.100","D41.201","T83.500","D89.101+N08.2*","C66.x00x002","E11.200x092+N08.3*","A43.802","M10.005+N22.8*","N15.900x003","E10.200x013+N08.3*","N26.x01","R39.000","S37.200x081","N28.102","N32.800x012","N28.900x010","Q60.400","Q64.200","I12.900x009","C68.804","A18.108+N33.0*","N28.823","N32.900x002","N34.200x003","Q60.100","B83.800x008","N35.900","N36.004","R39.101","C64.x00x003","N14.102","T83.801","D41.300x001","M31.703+N08.5*","N31.200x001","N17.200x002","I70.100x002","N17.002","N39.403","N21.900","N36.302","N00.802","E14.200x030+N08.3*","E11.200x016+N08.3*","N28.001","A60.002","N01.600x001","R82.902","N11.100","Q61.000","M35.006+N16.4*","Q61.200","S37.310","E14.200x215+N08.3*","N02.900x002","N15.000","N30.809","N28.809","N32.200","N18.501","Q60.200","N00.500","A18.101","N11.900x001","N17.100","N01.900","C67.400","N18.904","N19.x00","E14.200x013+N08.3*","C68.802","C68.000","A54.100x002","D30.302","N30.800x004","N99.101","N28.801","B18.904+N08.0*","N20.000x003","N36.200","C67.501","N05.101","N00.901","N05.900x006","N11.800x002","N13.201","N18.300","N18.400x001+D63.8*","N31.000x001","N99.100x005","N99.800x006","R31.x00","N28.900x004","N03.100","N15.900x002","Q62.800","C68.100","E11.200x091+N08.3*","N14.301","C66.x00x003","B37.401+N37.0*","D09.104","N32.201","R35.x00x003","Q51.701","Q60.500","N06.200","Z49.000","Q64.701","Q62.700x201","N28.819","R34.x02","I77.301","C68.805","N12.x00","N18.900x011","N34.101","Q62.300x903","R93.405","N13.500x010","N18.902","Q63.800x101","M31.003+N08.5*","Q64.702","Q54.300","D41.100x001","N18.506+I32.8*","C67.900x002","R35.x00x001","T86.105","R82.000","Q54.000","E14.200x024+N08.3*","C90.005+N08.1*","N02.801","N32.001","N31.201","D09.102","N05.900","Q60.000","Q64.800x001","R82.300","R82.500x003","Q63.301","Q54.200","Z46.602","N01.900x002","I12.900x005","N05.000x004","D39.903","N15.801","N31.901","N32.802","D30.200","N13.504","N13.603","Q64.400x301","B18.103+N08.0*","C79.101","R93.402","N28.837","N34.200x006","N03.503","S37.101","Z49.000x002","N39.800","Q62.103","N13.601","N23.x00","N32.901","N13.600x002","N30.805","E14.200x017+N08.3*","R80.x00x003","N17.200","I82.300x001","N15.102","R94.401","C79.000x001","R94.402","K66.201","C67.300","E85.411+N29.8*","Q52.901","N11.900x003","T83.100x001","N04.101","N28.900x026","E10.200x211+N08.3*","T83.500x002","N05.501","B01.800x002+N08.0*","N13.801","R82.800","N00.900","T19.801","N32.806","N20.200x001","N03.601","N13.600x004","N39.001","N99.100x003","T83.000x001","Q64.403","T86.100x008","C65.x02","N03.800x004","N03.800x003","N99.800x011","N25.100","E11.400x381+N33.8*","N17.200x003","Q64.706","Q85.903","R82.500x006","C68.900","S37.211","A18.107+N29.1*","N39.404","N39.200","Q61.901","N39.000","D39.902","Q64.200x021","Q62.500","C79.100x002","R93.400x001","N36.806","N13.503","N04.400x001","N30.807","N02.301","N06.400","Q63.103","Q27.305","T83.200","E66.902+N08.4*","N32.100","N32.813","S37.300x081","A56.001","N28.831","B18.205+N08.0*","C68.801","N17.000","S37.200x011","N03.400","Q64.707","Q63.900","R93.401","T19.000","C67.200","E11.200x030+N08.3*","N25.001","N32.103","N99.803","T83.100x002","Q63.002","N03.900x003","N39.300x002","Q62.300x901","T83.102","R82.500x004","N01.900x003","N27.900","N36.003","Q85.900x029","N17.900x003","M31.701+N08.5*","D41.400x001","E11.200x027+N08.3*","C64.x00x004","N39.402","N07.800","Q62.400x001","B52.000x002+N08.0*","A52.709+N08.0*","D18.000x819","N18.505+I68.8*","D41.900x001","E11.200x011+N08.3*","T86.102","Q54.900","Q64.700x901","N32.811","Q63.000","N32.202","S37.000x012","S37.303","E14.200x028+N08.3*","N00.700","C67.600","Q61.800","E14.200x214+N08.3*","Q64.402","C79.001","M31.002+N08.5*","M31.102+N08.5*","N06.600","Q62.202","D41.301","R30.000x002","N28.901","I82.302","D17.700x016","N11.802","T83.802","N13.202","N00.600","T83.001","T83.101","Q54.001","B65.000x001","Q54.100","N13.600","N36.001","T83.804","Q62.700x101","Q64.600","Q60.501","T86.100x002","T83.800","N00.800x001","E11.200x214+N08.3*","C68.803","E12.400x002+N33.8*","N14.400","R80.x00","T19.900","E10.200x016+N08.3*","Q42.200x201","R32.x00","T83.500x003","T86.106","N05.600","S37.000x013","N28.816","N28.828","Q63.302","N21.100","S37.100","N32.805","Q61.500","Z46.603","S37.000x032","R33.x00","E72.006+N29.8*","E10.200x023+N08.3*","B26.805+N08.0*","N28.833","N34.200x004","D41.200x001","B65.002+N22.0*","B37.400x001+N37.0*","N14.101","Q62.601","R82.200","C67.000","C95.900x017+N16.1*","S37.200x023","Q62.300x101","N25.803","N04.001","Q64.000","T83.004","E14.200x016+N08.3*","N32.814","A36.804+N16.0*","I12.000x001","I72.200x001","N36.802","Q63.102","E10.200x029+N08.3*","T19.800x001","N28.820","N28.829","N28.101","E85.403","R30.000","Q62.200","Q64.700x902","N06.900","N36.809","C79.103","Q63.801","N28.811","N35.000","N25.804","N04.501","I77.010","Q62.104","M32.101+N08.5*","N30.300","N36.005","R82.600x001","E11.200x012+N08.3*","Q62.000","Q60.300","I12.900x002","N03.502","S37.300x031","Q62.300x904","N15.901","N30.802","N20.901","E83.100x008+N16.3*","N06.001","S37.002","N32.815","N07.000","N02.800x003","N04.903","N07.500","Q60.400x001","N20.001","N28.838","T86.100x006","N00.000","E10.200x014+N08.3*","I12.900x006","N04.200x001","N28.817","N32.800x014","E11.200x211+N08.3*","N18.500x001+D63.8*","N30.803","Q61.404","Q64.200x001","E14.200x092+N08.3*","N17.001","Q61.100","Q61.400","N05.000x003","Q64.705","R39.100x001","N01.500x001","A27.900x005","N13.501","S37.200x022","E10.200x011+N08.3*","M10.001+N16.8*","E72.007","N13.204","N28.004","N00.200","E10.200x092+N08.3*","N32.803","N00.400","N28.803","N39.400","N35.800","E14.400x381+N33.8*","N02.302","N03.900","N28.835","N04.800x002","N35.901","D30.301","E11.200x025+N08.3*","E14.400x380+G99.0*","N25.004","N28.834","R36.x01","R39.801","D18.000x811","E14.200x031+N29.8*","E14.200x213+N08.3*","N13.605","N28.810","E14.200x026+N08.3*","N30.400","N03.300x001","S37.003","N30.100","M31.305+N08.5*","N04.601","Q63.101","N36.000","N17.900x002","C67.500","I86.811","N00.900x009","D21.506","N13.100x001","N25.900","I86.201","E10.200x214+N08.3*","D41.000x001","E11.200x026+N08.3*","I12.900x008","N20.900x001","N28.815","N05.900x007","N01.200x001","N39.800x001","E11.200x028+N08.3*","R32.x01","E10.200x091+N08.3*","N03.501","N36.808","N06.800","N04.801","N12.x03","N02.900x001","Q64.703","N11.000x001","N13.600x001","N19.x01","N32.101","N19.x02","D18.000x806","N13.300x005","S37.300","E11.200x023+N08.3*","N14.201","N28.005","N00.100x001","T83.003","B49.x18","Q64.700x201","E10.201+N08.3*","D36.700x025","Q64.501","I72.200x003","N01.800","A18.103+N29.1*","D09.100x001","T86.104","N30.801","N05.400","N31.200x002","E10.200x024+N08.3*","N14.000","N99.806","Q87.808","R82.900x002","D09.103","A56.000x003","T83.103","Z49.201","N34.201","N07.100","N30.000","Q62.301","A23.903+N16.0*","T79.500x002","T86.100x001","N36.803","N34.300","Q64.304","N03.200x001","N41.300","N05.801","N18.500","R30.900x001","R93.403","N28.806","N25.800x006","S37.000x023","N10.x02","N39.300","N32.800x003","N02.600","I12.904","N15.101","E10.200x012+N08.3*","E13.201+N08.3*","S37.111","Q64.401","T83.002","N07.700","D09.101","T86.811","B78.902+N08.0*","Q64.303","R93.400x003","E14.200x012+N08.3*","N20.002","N06.500","N99.001"};
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

        result=LB1.group(record);
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

        result=LK1.group(record);
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

        result=LY1.group(record);
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

