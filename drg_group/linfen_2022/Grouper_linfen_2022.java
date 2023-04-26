package drg_group.linfen_2022;

public class Grouper_linfen_2022 {
    public static GroupResult group(MedicalRecord record){
        String drgCode=Grouper.group(record);
        GroupResult result=new GroupResult(record,drgCode);
        result.messages=Base.groupMessages.returnMessages(record.Index);
        return result;
    }
}