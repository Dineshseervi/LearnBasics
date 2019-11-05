package node;

public class NodeParent {

    private int age;
    private String name;
    private Address address;

    public NodeParent() {
    }

    public NodeParent(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address=address;
    }

    public NodeParent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method is called for NodeParent");
    }
}