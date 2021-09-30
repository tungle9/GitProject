package case_study.dichvu;

public abstract class Person {
    private String name ;
    private int born;
    private String gender;
    private int cmnd ;
    private int sdt ;
    private String email;

    public Person(String name, int born, String gender, int cmnd, int sdt, String email) {
        this.name = name;
        this.born = born;
        this.gender = gender;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
    }
    public Person() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorn() {
        return born;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person" +
                "name='" + name + '\'' +
                ", born=" + born +
                ", gender='" + gender + '\'' +
                ", cmnd=" + cmnd +
                ", sdt=" + sdt +
                ", email='" + email + '\''
           ;
    }
}
