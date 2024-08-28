package model;

public class Customer {

    private String id ;

    private String name ;

    private  String address;

    private double salary;

    private String contact;

    public Customer() {
    }
    public Customer(String id, String name, String address, double salary, String contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", contact='" + contact + '\'' +
                '}';
    }
}
