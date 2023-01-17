package drg_group.wuxi_2022;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class GroupTest {
    public static void main(String[] args) {
        GroupProxy grouper=new GroupProxy();
        // group_yancheng(grouper);
        // group_suzhou(grouper);
        // grouper.group_txt();
        System.out.println(grouper.group_record(
            "22058878,2,88,32460,,13040503,94,1,K80.302|K80.305|K83.109|K72.905|Z90.408|E14.900x001,51.8803|51.8701|54.5100x005|45.1301"));
        System.exit(0);

        if (args==null||args.length==0){
            String path=System.getProperty("user.dir");
            if (!new File(path, "input.txt").exists()){
                System.out.println(String.format("文件不存在:%s", new File(path, "input.txt")));
                System.exit(1);
            }
            new GroupProxy().group_txt();
        }else if (args.length==1){
            GroupResult result=grouper.group_record(args[0]);
            System.out.println(result);
        }else{
            if (!new File(args[0]).exists()){
                System.out.println(String.format("文件不存在:%s", args[0]));
                System.exit(1);
            }
            grouper.group_csv(Paths.get(args[0]),Arrays.asList(args[1].split(",",-1)));
        }
    }
    // public static void group_yancheng(GroupProxy grouper){
    //     String yearMonth="202209";
    //     Path filename=Paths.get("/mnt/c/yb/yc",String.format("ba_group_info_%s.csv", yearMonth));
    //     List<String> cols=Arrays.asList("BAHM","BRXB","NL","NLT","XSECSTZ","CYKS","ZYTS","LYFS","ICD10_DRGS","ICD9_DRGS");
    //     grouper.group_csv(x->Grouper_yancheng_2022.group(x),filename,cols);
    // }
    // public static void group_suzhou(GroupProxy grouper){
    //     String yearMonth="202201-202206";
    //     Path filename=Paths.get("/mnt/c/yb/sz",String.format("hqms_group_%s.csv", yearMonth));
    //     List<String> cols=Arrays.asList("病案号","性别","年龄","年龄天","出生体重","出院科别","实际住院（天）","离院方式","诊断编码","手术操作编码");
    //     grouper.group_csv(filename,cols);
    // }
}
