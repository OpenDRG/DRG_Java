package drg_group.chs_drg_11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
    public String remark;
    public MedicalRecord(String index, String gender, int age, int ageDay, int weight, String dept, int inHospitalTime,
            String leavingType, String[] zdList, String[] ssList,String remark) {
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
        this.remark=remark;
    }
    @Override
    public String toString() {
        return "MedicalRecord [Index=" + Index + ", gender=" + gender + ", age=" + age + ", ageDay=" + ageDay
                + ", weight=" + weight + ", dept=" + dept + ", inHospitalTime=" + inHospitalTime + ", leavingType="
                + leavingType + ", zdList=" + Arrays.toString(zdList) + ", ssList=" + Arrays.toString(ssList) + ", remark=" + remark + "]";
        // return "new MedicalRecord (\"" + Index + "\", \"" + gender + "\", " + age + ", " + ageDay
        //         + ", " + weight + ", \"" + dept + "\", " + inHospitalTime + ", \""
        //         + leavingType + "\", Arrays.asList(\"" + zdList + "\".replaceAll(\"\\\\[|\\\\]| \", \"\").split(\",\",-1)),Arrays.asList(\"" 
        //         + ssList + "\".replaceAll(\"\\\\[|\\\\]| \", \"\").split(\",\",-1)),\"" + remark + "\");";
    }
    @SuppressWarnings("unchecked")
    public MedicalRecord(Object obj) {
        this((Stream<Object>) obj);
    }
    // public MedicalRecord(List<Object> objs) {
    //     this.Index = (String) objs.get(0);
    //     this.gender = (String) objs.get(1);
    //     this.age = ((String)objs.get(2)).isEmpty()?0:Double.valueOf((String) objs.get(2)).intValue();
    //     this.ageDay = ((String)objs.get(3)).isEmpty()?0:Double.valueOf((String) objs.get(3)).intValue();
    //     this.weight = objs.get(4)==null||((String)objs.get(4)).isEmpty()?0:Double.valueOf((String) objs.get(4)).intValue();
    //     this.dept = (String) objs.get(5);
    //     this.inHospitalTime = ((String)objs.get(6)).isEmpty()?0:Double.valueOf((String) objs.get(6)).intValue();
    //     this.leavingType = (String) objs.get(7);
    //     this.zdList = Arrays.asList(((String)objs.get(8)).split(",|\\|",-1));
    //     this.ssList = ((String)objs.get(9)).isEmpty()?new ArrayList<String>():Arrays.asList(((String)objs.get(9)).split(",|\\|",-1));
    //     this.remark = objs.size()>10?(String) objs.get(10):"";
    // }
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
        this.remark = iter.hasNext()?(String) iter.next():"";
    }
}
