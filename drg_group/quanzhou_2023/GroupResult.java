package drg_group.quanzhou_2023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupResult {
    public String Index;
    public String status;
    public List<String> messages;
    public String mdc;
    public String adrg;
    public String drg;
    public MedicalRecord record;
    public GroupResult(String index, String status, List<String> messages, String mdc,
            String adrg, String drg,MedicalRecord record) {
        Index = index;
        this.status = status;
        this.messages = messages;
        this.mdc = mdc;
        this.adrg = adrg;
        this.drg = drg;
        this.record=record;
    }
    public GroupResult(String status, List<String> messages, MedicalRecord record) {
        Index = record.Index;
        this.status = status;
        this.messages = messages;
        this.mdc = "0000";
        this.adrg = "00";
        this.drg = "0000";
        this.record=record;
    }
    public GroupResult(MedicalRecord record,String drgCode){
        this.Index=record.Index;
        this.drg=drgCode;
        if (drgCode.equals("0000")){
            this.status=DrgGroupStatus.FAIL.getDesc();
            this.mdc="0000";
            this.adrg="00";
        }else if (drgCode.substring(1, 3).equals("00")){
            this.status=DrgGroupStatus.FAIL.getDesc();
            this.mdc="MDC"+drgCode.substring(0,1);
            this.adrg="00";
        }else if (drgCode.substring(1, 3).equals("QY")){
            this.status=DrgGroupStatus.QY.getDesc();
            this.mdc="MDC"+drgCode.substring(0,1);
            this.adrg="QY";
        }else{
            this.status=DrgGroupStatus.SUCCESS.getDesc();
            this.mdc="MDC"+drgCode.substring(0,1);
            this.adrg=drgCode.substring(0,3);
        }
        this.record=record;
    }
    @Override
    public String toString() {
        return record +"\nGroupResult [Index=" + Index + ", status=" + status + ", messages="
            + messages + ", mdc=" + mdc + ", adrg=" + adrg + ", drg=" + drg + "]";
    }
    public String toCsv() {
        String zdList_str=record.zdList==null||record.zdList.length==0?"":"\""+String.join(",", record.zdList)+"\"";
        String ssList_str=record.ssList==null||record.ssList.length==0?"":"\""+String.join(",", record.ssList)+"\"";
        String messages_str=messages==null||messages.size()==0?"":"\""+String.join("|", messages)+"\"";
        return Index + "," +record.gender + "," + record.age + "," + record.ageDay + "," + record.weight + "," + record.dept + "," + 
            record.inHospitalTime + "," + record.leavingType + "," + zdList_str + "," + ssList_str + "," + record.amount + "," + record.remark + "," +
            status + "," + messages_str+ "," + mdc + "," + adrg + "," + drg;
    }
}
