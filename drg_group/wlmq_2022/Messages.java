package drg_group.wlmq_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Messages {
    private ConcurrentHashMap<String,List<String>> messages=new ConcurrentHashMap<String,List<String>>();
    public void initMessage(String index){
        messages.put(index, new ArrayList<String>());
    }
    public void putMessage(String index,String message){
        messages.get(index).add(message);
    }
    public boolean existMessage(String index,String message){
        return messages.get(index).contains(message);
    }
    public List<String> returnMessages(String index){
        // List<String> record_messages=Messages.get(index);
        // List<String> result;
        // if (record_messages.contains("不符合MDCA的ADRG入组条件")){
        //     result= new ArrayList<>(record_messages.subList(record_messages.indexOf("不符合MDCA的ADRG入组条件")+1, record_messages.size()));
        // }
        // else{
        //     result= new ArrayList<>(record_messages);
        // }
        // record_messages.clear();
        // return result;
        List<String> result=messages.get(index);
        if (result.contains("不符合MDCA的ADRG入组条件")){
            return result.subList(result.indexOf("不符合MDCA的ADRG入组条件")+1, result.size());
        }
        else{
            return result;
        }
    }
}
