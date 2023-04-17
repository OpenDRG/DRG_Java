package drg_group.lanzhou_2023;

public class Grouper_lanzhou_2023 {
    public static GroupResult group(MedicalRecord record){
        String drgCode=Grouper.group(record);
        GroupResult result=new GroupResult(record,drgCode);
        result.messages=Base.groupMessages.returnMessages(record.Index);
        return result;
    }
}