package drg_group.chs_drg_11;

public class Grouper_chs_drg_11 {
    public static GroupResult group(MedicalRecord record){
        String drgCode=Grouper.group(record);
        GroupResult result=new GroupResult(record,drgCode);
        result.messages=Base.groupMessages.returnMessages(record.Index);
        return result;
    }
}