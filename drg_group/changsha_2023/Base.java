package drg_group.changsha_2023;

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
    public static Map<String,String> DRG=getLines("DRG")
        .collect(Collectors.toMap(x->x.substring(0,x.indexOf(" ")), x->x.substring(x.indexOf(" ")+1)));
    public static String[] SS_VALID=getLines("SS_VALID").map(x->x.substring(0,x.indexOf(" "))).toArray(String[]::new);
    public static Map<String,String> MCC=getLines("MCC")
        .collect(Collectors.toMap(x->x.substring(0,x.indexOf(" ")), x->x.substring(x.indexOf(" ")+1)));
    public static Map<String,String> CC=getLines("CC")
        .collect(Collectors.toMap(x->x.substring(0,x.indexOf(" ")), x->x.substring(x.indexOf(" ")+1)));
    public static Map<String,String> CCE=getLines("CCE")
        .collect(Collectors.toMap(x->x.substring(0,x.indexOf(" ")), x->x.substring(x.indexOf(" ")+1)));
        
    private static Stream<String> getLines(String dataFile){
        InputStream inputStream =Base.class.getResourceAsStream(
            "/"+Base.class.getPackage().getName().replace(".", "/")+"/DATA/"+dataFile+".dat");
        BufferedReader br= new BufferedReader(new InputStreamReader(inputStream,StandardCharsets.UTF_8));
        return br.lines();
    }
    public static boolean has_cc(String index,String mainZd,String[] otherZd){
        String cce="";
        if (Base.CCE.containsKey(mainZd)){
            cce=Base.CCE.get(mainZd);
            Base.groupMessages.putMessage(index,String.format("主诊断%s排除表%s",mainZd,cce));
        }
        for (String zd:otherZd){
            if (Base.CC.containsKey(zd)){
                String cc=Base.CC.get(zd);
                Base.groupMessages.putMessage(index,String.format("诊断%s属于CC，排除表%s",zd,cc));
                if (!cce.isEmpty() && cce.equals(cc)){
                    continue;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean has_mcc(String index,String mainZd,String[] otherZd){
        String cce="";
        if (Base.CCE.containsKey(mainZd)){
            cce=Base.CCE.get(mainZd);
            Base.groupMessages.putMessage(index,String.format("主诊断%s排除表%s",mainZd,cce));
        }
        for (String zd:otherZd){
            if (Base.MCC.containsKey(zd)){
                String mcc=Base.MCC.get(zd);
                Base.groupMessages.putMessage(index,String.format("诊断%s属于CC，排除表%s",zd,mcc));
                if (!cce.isEmpty() && cce.equals(mcc)){
                    continue;
                }else{
                    return true;
                }
            }
        }
        return false;
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
