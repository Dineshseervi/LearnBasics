public class ParentsDetails implements Cloneable {
    private String fatherName;
    private String motherName;

    public ParentsDetails(String fatherName, String motherName) {
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public ParentsDetails clone() throws CloneNotSupportedException
    {
        return (ParentsDetails)super.clone();
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
}
