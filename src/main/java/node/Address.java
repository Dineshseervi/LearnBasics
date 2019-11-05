package node;

import java.io.Serializable;

public class Address implements Serializable {
    private String hno;
    private String landMark;
    private String phone;


    public Address() {
    }

    public Address(String hno, String landMark, String phone) {
        this.hno = hno;
        this.landMark = landMark;
        this.phone = phone;
    }

    public String getHno() {
        return hno;
    }

    public String getLandMark() {
        return landMark;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method for address is called");
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
