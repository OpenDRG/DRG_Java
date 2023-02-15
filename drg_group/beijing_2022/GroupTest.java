package drg_group.beijing_2022;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class GroupTest {
    public static void main(String[] args) {
        GroupProxy grouper=new GroupProxy();
        // System.out.println(grouper.group_record("22139456,1.0,51.0,18987.0,,13110006.0,10.0,2.0,\"K75.000,J98.414,R68.800x001,N19.x03,J96.900x001,K76.800x006,E14.900x001,I10.x00x002\",\"96.7201,96.0400,38.9301,38.9303,99.0800\",AH11"));
        // grouper.group_txt();
        // group(grouper);
        // System.exit(0);

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
    // public static void group(GroupProxy grouper){
    //     String yearMonth="202212";
    //     Path filename=Paths.get("/mnt/c/yb/yc",String.format("ba_group_info_%s.csv", yearMonth));
    //     List<String> cols=Arrays.asList("BAHM","BRXB","NL","NLT","XSECSTZ","CYKS","ZYTS","LYFS","ICD10_DRGS","ICD9_DRGS");
    //     grouper.group_csv(filename,cols);
    // }
}
