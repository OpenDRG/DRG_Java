package drg_group.changsha_2023;

public class Grouper_changsha_2023 {
    public static GroupResult group(MedicalRecord record){
        String drgCode=Grouper.group(record);
        GroupResult result=new GroupResult(record,drgCode);
        result.messages=Base.groupMessages.returnMessages(record.Index);
        return result;
    }
}