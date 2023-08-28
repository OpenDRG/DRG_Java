package drg_group.changchun_2022;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;

public class GroupTest {
    public static void main(String[] args) {
        GroupProxy grouper=new GroupProxy();
        System.out.println(grouper.group_record("22089232,1,63,23267,,13120001,28,1,\"Z51.100x004,C80.900,C79.811,C78.500x004,C77.900x001\",99.2503,,"));
        // args=new String[]{"c:\\yb\\cz\\ba_group_2023.csv","病案号,性别,年龄,新生儿年龄天,新生儿出生体重,科室,住院天数,离院方式,诊断编码,手术操作编码,住院天数,医保DRG分组"};
        // grouper.group_csv(Paths.get(args[0]),Arrays.asList(args[1].split(",",-1)));
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
}
