public class StudentDetail  implements Cloneable{

    public StudentDetail(String name, int age, String address, String fatherName) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.fatherName = fatherName;

    }

    public StudentDetail clone() throws CloneNotSupportedException
    {
        StudentDetail studentDetail= (StudentDetail)super.clone();
        studentDetail.setParentsDetails((ParentsDetails) parentsDetails.clone());
        return  studentDetail;
    }

    private String name;
    private int age;
    private String address;
    private String fatherName;
    private ParentsDetails parentsDetails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public ParentsDetails getParentsDetails() {
        return parentsDetails;
    }

    public void setParentsDetails(ParentsDetails parentsDetails) {
        this.parentsDetails = parentsDetails;
    }
}
