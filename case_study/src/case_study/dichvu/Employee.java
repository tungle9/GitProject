package case_study.dichvu;

public class Employee extends Person {
    public static final String TRUNGCAP = "TRUNG CẤP";
    public static final String CAODANG = "CAO ĐẲNG";
    public static final String DAIHOC = "ĐẠI HỌC";
    private int mnv;
    private String trinhDo;
    private double salary;

    public Employee(String name, int born, String gender, int cmnd, int sdt, String email, int mnv, String trinhDo, double salary) {
        super(name, born, gender, cmnd, sdt, email);
        this.mnv = mnv;
        this.trinhDo = trinhDo;
        this.salary = salary;
    }
    public Employee(){

    }
    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getMnv() {
        return mnv;
    }

    public void setMnv(int mnv) {
        this.mnv = mnv;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "mnv=" + mnv +
                ", trinhDo='" + trinhDo + '\'' +
                ", salary=" + salary +
                '}';
    }
}
