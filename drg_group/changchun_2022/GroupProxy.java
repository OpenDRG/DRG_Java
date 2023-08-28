package drg_group.changchun_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupProxy {
    private static Map<String,String> ZD_INFO=Base.readDict("ICD","ZD_INFO",0,1);
    private static Map<String,String> SS_INFO=Base.readDict("ICD","SS_INFO",0,1);
    private static Map<String,String> ZD_MAP=Base.readDict("ICD","ZD_MAP",0,1);
    private static Map<String,String> SS_MAP=Base.readDict("ICD","SS_MAP",0,1);
    private static Map<String,String> CCE=Base.readDict("DATA","CCE",0,1);
    private static Map<String,String> MCC=Base.readDict("DATA","MCC",0,1);
    private static Map<String,String> CC=Base.readDict("DATA","CC",0,1);
    private static Set<String> SS_VALID=Base.readSet("DATA","SS_VALID");
    private static Map<String,String> DRG=Base.readDict("DATA","DRG",0,1);
    private static Messages checkMessages=new Messages();
    private Function<MedicalRecord,GroupResult> groupFunc=x->Grouper_changchun_2022.group(x);
    private boolean TRANS_CODE=false;
    public GroupProxy(){
    }
    public GroupProxy(boolean TRANS_CODE){
        this.TRANS_CODE=TRANS_CODE;
    }
    public GroupProxy(Function<MedicalRecord,GroupResult> groupFunc){
        this.groupFunc=groupFunc;
    }
    public GroupProxy(boolean TRANS_CODE,Function<MedicalRecord,GroupResult> groupFunc){
        this.TRANS_CODE=TRANS_CODE;
        this.groupFunc=groupFunc;
    }
    private static DrgGroupStatus trans(MedicalRecord record){
        int i=-1;
        for (String x:record.zdList){
            i++;
            String zd=x;
            if (ZD_MAP.containsKey(x)){
                zd=ZD_MAP.get(x);
                if (!zd.equals(x)){
                    record.zdList[i]=zd;
                    checkMessages.putMessage(record.Index, String.format("%s->%s",x,zd));
                }
            }else{
                checkMessages.putMessage(record.Index, String.format("诊断%s无法转换为分组器支持的编码",zd));
                return DrgGroupStatus.ZD_NOT_MAPPING;
            }
        }
        i=-1;
        for (String x:record.ssList){
            i++;
            String ss=x;
            if (SS_MAP.containsKey(x)){
                ss=SS_MAP.get(x);
                if (!ss.equals(x)){
                    record.ssList[i]=ss;
                    checkMessages.putMessage(record.Index, String.format("%s->%s",x,ss));
                }
            }else{
                checkMessages.putMessage(record.Index, String.format("手术操作%s无法转换为分组器支持的编码",ss));
                return DrgGroupStatus.SS_NOT_MAPPING;
            }
        }
        return null;
    }
    private static DrgGroupStatus check(MedicalRecord record){
        try{
            if (record.gender.isEmpty()){
                checkMessages.putMessage(record.Index,"病人性别为空");
                return DrgGroupStatus.CHECK_FAILED;
            }
            if (record.gender.equals("1")&&record.gender.equals("2")){
                checkMessages.putMessage(record.Index,String.format("病人性别取值必须为1或2：%s", record.gender));
                return DrgGroupStatus.CHECK_FAILED;
            }
            if (record.zdList.length==0){
                checkMessages.putMessage(record.Index,"诊断信息为空");
                return DrgGroupStatus.CHECK_FAILED;
            }
        }catch (Exception e) {
            e.printStackTrace();
            checkMessages.putMessage(record.Index,"病案信息解析出错");
            return DrgGroupStatus.CHECK_FAILED;
        }
        for (String x:record.zdList){
            if (ZD_INFO.containsKey(x)){
                checkMessages.putMessage(record.Index, String.format("%s %s",x,ZD_INFO.get(x)));
            }else{
                checkMessages.putMessage(record.Index, String.format("%s 未知名称",x));
            }
        }
        for (String x:record.ssList){
            if (SS_INFO.containsKey(x)){
                checkMessages.putMessage(record.Index, String.format("%s %s",x,SS_INFO.get(x)));
            }else{
                checkMessages.putMessage(record.Index, String.format("%s 未知名称",x));
            }
        }
        return null;
    }
    private static MedicalRecord preprocess(MedicalRecord record) {
        String cce="";
        int i=-1;
        List<String> mccList=new ArrayList<>();
        List<String> ccList=new ArrayList<>();
        List<String> ssValidList=new ArrayList<>();
        for (String x:record.zdList){
            i++;
            if (i==0){
                cce=CCE.containsKey(x)?CCE.get(x):"";
            }else{
                if (MCC.containsKey(x)&&(cce.isEmpty()||(!cce.isEmpty() && !MCC.get(x).equals(cce)))){
                    mccList.add(x);
                }else if (CC.containsKey(x)&&(cce.isEmpty()||(!cce.isEmpty() && !CC.get(x).equals(cce)))){
                    ccList.add(x);
                }
            }
        }
        for (String x:record.ssList){
            if (SS_VALID.contains(x)){
                ssValidList.add(x);
            }
        }
        record.cce=cce;
        record.mccList=mccList.toArray(new String[0]);
        record.ccList=ccList.toArray(new String[0]);
        record.ssValidList=ssValidList.toArray(new String[0]);
        if (cce!=null && cce.length()>0){
            checkMessages.putMessage(record.Index, String.format("主诊断%s排除表%s",record.zdList[0],cce));
        }
        if (mccList!=null && mccList.size()>0){
            checkMessages.putMessage(record.Index, String.format("以下诊断是MCC：%s",mccList.stream().collect(Collectors.joining(" "))));
        }
        if (ccList!=null && ccList.size()>0){
            checkMessages.putMessage(record.Index, String.format("以下诊断是CC：%s",ccList.stream().collect(Collectors.joining(" "))));
        }
        if (ssValidList!=null && ssValidList.size()>0){
            checkMessages.putMessage(record.Index, String.format("以下手术操作有效：%s",ssValidList.stream().collect(Collectors.joining(" "))));
        }
        return record;
    }
    private static GroupResult postprocess(GroupResult result){
        if (result.status.equals(DrgGroupStatus.SUCCESS.getDesc())){
            if (DRG.containsKey(result.drg)){
                result.messages.add(String.format("%s %s",result.drg,DRG.get(result.drg)));
            }else{
                result.messages.add(String.format("%s %s",result.drg,"未入组"));
            }
        }
        result.messages.addAll(0, checkMessages.returnMessages(result.Index));
        return result;
    }
    public GroupResult group_record(MedicalRecord record) {
        checkMessages.initMessage(record.Index);
        DrgGroupStatus status;
        if (TRANS_CODE){
            status=trans(record);
            if (status!=null){
                return new GroupResult(status.getDesc(),checkMessages.returnMessages(record.Index),record);
            }
        }
        status=check(record);
        if (status!=null){
            return new GroupResult(status.getDesc(),checkMessages.returnMessages(record.Index),record);
        }
        record=preprocess(record);
        GroupResult result=groupFunc.apply(record);
        result=postprocess(result);
        return result;
    }
    public GroupResult group_record(String record_str) {
        return group_record(new MedicalRecord(Pattern.compile(",").splitAsStream(replace_csv(record_str))));
    }
    public void group_txt(){
        Date d1= new Date();
        // System.out.println(System.getProperty("user.dir"));
        String path= System.getProperty("user.dir");
        try {
            List<String> result =Files.lines(Paths.get(path,"input.txt")).skip(1).map(Pattern.compile(",")::splitAsStream)
                .map(x->group_record(new MedicalRecord(x)).toString()).collect(Collectors.toList());
                // .map(MedicalRecord::new).map(this::group_record).map(GroupResult::toString).collect(Collectors.toList());
            Files.write(Paths.get(path,"output.txt"),result,StandardCharsets.UTF_8,StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println("读取input.txt失败，请确保文件存在，且内容符合CSV格式，且字段顺序为：Index,gender,age,ageDay,weight,dept,inHospitalTime,leavingType,zdList,ssList,amount,remark");
            e.printStackTrace();
        }
        Date d2= new Date();
        System.out.println("group time "+(d2.getTime() - d1.getTime()));
    }
    public void group_csv(Path filename,List<String> cols){
        Date d1= new Date();
        List<String> result=read_csv(filename,cols)
            .parallel()
            .map(x->group_record(new MedicalRecord(x)).toCsv())
            // .filter(x->x.record.remark!=null&&!x.record.remark.isEmpty()&&!x.drg.equals(x.record.remark))
            .collect(Collectors.toList());
        Date d2= new Date();
        System.out.println("record count "+result.size());
        System.out.println("group time "+(d2.getTime() - d1.getTime()));
        result.add(0, "\uFEFF"+"Index,gender,age,ageDay,weight,dept,inHospitalTime,leavingType,zdList,ssList,amount,remark,status,messages,mdc,adrg,drg");
        try{
            Files.write(Paths.get(filename.toString().replace(".csv", "_java_result.csv")),result,StandardCharsets.UTF_8,StandardOpenOption.CREATE_NEW);
        }catch(IOException e) {
            System.out.println(String.format("文件写入失败%s", Paths.get(filename.toString().replace(".csv", "_java_result.csv"))));
            e.printStackTrace();
        }
    }
    public static Stream<Object> read_csv(Path filename,List<String> cols){
        try {
            List<String> headers=Arrays.asList(Files.lines(filename).findFirst().get().replace( "\uFEFF", "").split(",",-1));
            List<Integer> col_index=cols.stream().filter(headers::contains).map(headers::indexOf).collect(Collectors.toList());
            if (col_index.size()!=cols.size()){
                System.out.println("字段名称与CSV文件不匹配");
                System.exit(1);
            }
            return Files.lines(filename).skip(1).map(x->replace_csv(x)).map(x->col_index.stream().map(Arrays.asList(x.split(",",-1))::get));
        } catch (IOException e) {
            System.out.println("文件读取失败");
            e.printStackTrace();
        }
        return null;
    }
    private static String replace_csv(String csv){
        Matcher m=Pattern.compile("\"(.*?)\"").matcher(csv); 
        String s;
        while(m.find()) 
        {
            s=m.group();
            csv=csv.replace(s, s.replace(",", "|"));
        }
        return csv.replace("\"", "");
    }
}
