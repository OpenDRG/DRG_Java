package drg_group.changzhou_2022;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class GroupTest {
    public static void main(String[] args) {
        GroupProxy grouper=new GroupProxy();
        String[] args1={"/mnt/c/yb/cz/ba_group_202212.csv","病案号,性别,年龄,新生儿年龄天,新生儿出生体重,科室,住院天数,离院方式,诊断编码,手术操作编码,医保DRG分组"};
        grouper.group_csv(Paths.get(args1[0]),Arrays.asList(args1[1].split(",",-1)));
        // System.out.println(grouper.group_record("22139456,1.0,51.0,18987.0,,13110006.0,10.0,2.0,\"K75.000,J98.414,R68.800x001,N19.x03,J96.900x001,K76.800x006,E14.900x001,I10.x00x002\",\"96.7201,96.0400,38.9301,38.9303,99.0800\",AH11"));
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
