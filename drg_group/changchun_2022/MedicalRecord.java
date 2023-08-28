package drg_group.changchun_2022;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class MedicalRecord {
    public String Index;
    public String gender;
    public int age;
    public int ageDay;
    public int weight;
    public String dept;
    public int inHospitalTime;
    public String leavingType;
    public String[] zdList;
    public String[] ssList;
    public float amount;
    public String remark;
    public String cce;
    public String[] mccList;
    public String[] ccList;
    public String[] ssValidList;
    public MedicalRecord(String index, String gender, int age, int ageDay, int weight, String dept, int inHospitalTime,
            String leavingType, String[] zdList, String[] ssList,float amount,String remark) {
        this.Index = index;
        this.gender = gender;
        this.age = age;
        this.ageDay = ageDay;
        this.weight = weight;
        this.dept = dept;
        this.inHospitalTime = inHospitalTime;
        this.leavingType = leavingType;
        this.zdList = zdList;
        this.ssList = ssList!=null && ssList.length>0 && !ssList[0].isEmpty()?ssList:new String[0];
        this.amount=amount;
        this.remark=remark;
    }
    @Override
    public String toString() {
        return "MedicalRecord [Index=" + Index + ", gender=" + gender + ", age=" + age + ", ageDay=" + ageDay + ", weight=" + weight
                + ", dept=" + dept + ", inHospitalTime=" + inHospitalTime + ", leavingType=" + leavingType
                + ", zdList=" + Arrays.toString(zdList) + ", ssList=" + Arrays.toString(ssList) + ", amount=" + String.valueOf(amount) + ", remark=" + remark
                + ", cce=" + cce + ", mccList=" + Arrays.toString(mccList) + ", ccList=" + Arrays.toString(ccList) + ", ssValueList=" + Arrays.toString(ssValidList) + "]";
    }
    @SuppressWarnings("unchecked")
    public MedicalRecord(Object obj) {
        this((Stream<Object>) obj);
    }
    public MedicalRecord(Stream<Object> objs) {
        Iterator<Object> iter=objs.iterator();
        String temp;
        this.Index = (String) iter.next();
        this.gender = (String) iter.next();
        this.age = (temp=(String)iter.next()).isEmpty()?0:Double.valueOf(temp).intValue();
        this.ageDay = (temp=(String)iter.next()).isEmpty()?0:Double.valueOf(temp).intValue();
        this.weight = (temp=(String)iter.next()).isEmpty()?0:Double.valueOf(temp).intValue();
        this.dept = (String) iter.next();
        this.inHospitalTime = (temp=(String)iter.next()).isEmpty()?0:Double.valueOf(temp).intValue();
        this.leavingType = (String) iter.next();
        this.zdList = ((String)iter.next()).split(",|\\|",-1);
        this.ssList = !iter.hasNext()||(temp=(String)iter.next()).isEmpty()?new String[0]:temp.split(",|\\|",-1);
        this.amount = !iter.hasNext()||(temp=(String)iter.next()).isEmpty()?0:Float.parseFloat(temp);
        this.remark = !iter.hasNext()||(temp=(String)iter.next()).isEmpty()?"":temp;
    }
}
