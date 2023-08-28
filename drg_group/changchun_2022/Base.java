package drg_group.changchun_2022;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Base {
    public static Messages groupMessages=new Messages();
    public static Set<String> readSet(String folder,String dataFile){
        return readDataFile(folder,dataFile).map(x->x.split(" ")[0]).collect(Collectors.toSet());
    }
    public static Map<String,String> readDict(String folder,String dataFile,int kIndex,int vIndex){
        return readDataFile(folder,dataFile).collect(Collectors.toMap(x->x.split(" ")[kIndex], x->x.split(" ")[vIndex]));
    }
    private static Stream<String> readDataFile(String folder,String dataFile){
        InputStream inputStream =Base.class.getResourceAsStream(
            "/"+Base.class.getPackage().getName().replace(".", "/")+"/"+folder+"/"+dataFile+".dat");
        return new BufferedReader(new InputStreamReader(inputStream,StandardCharsets.UTF_8)).lines();
    }
    public static boolean intersect(String[] a,String[] b){
        if (a!=null && a.length>0 && b!=null && b.length>0){
            for (String x : a){
                for(String y : b){
                    if (x.equals(y)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static Set<String> Intersect(String[] a,String[] b){
        Set<String> s=new HashSet<String>();
        if (a!=null && a.length>0 && b!=null && b.length>0){
            for (String x : a){
                for(String y : b){
                    if (x.equals(y)){
                        s.add(x);
                    }
                }
            }
        }
        return s;
    }
    public static boolean contains(String[] arr, String targetValue){
        if (arr!=null && arr.length>0){
            for(String s: arr){
                if(s.equals(targetValue)){
                    return true;
                }
            }  
        }
        return false;
    }
}
