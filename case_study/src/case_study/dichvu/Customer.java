package case_study.dichvu;

public class Customer extends Person {
    public static final String DIAMOND = "DIAMOND";
    public static final String PLATINIUM = "Platinium";
    public static final String GOLD = "Gold";
    public static final String SILVER = "Silver";
    public static final String MEMBER = "Member";
    private String typeOfcustomer;
    private String address;
    public Customer(String name, int born, String gender, int cmnd, int sdt, String email, String typeOfcustomer, String address) {
        super(name, born, gender, cmnd, sdt, email);
        this.typeOfcustomer = typeOfcustomer;
        this.address = address;
    }

    public String getTypeOfcustomer() {
        return typeOfcustomer;
    }

    public void setTypeOfcustomer(String typeOfcustomer) {
        this.typeOfcustomer = typeOfcustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "typeOfcustomer='" + typeOfcustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
