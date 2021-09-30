package case_study.dichvu;

public class Room extends Facility {
    private String dichVufree;

    public void Room() {
    }

    public String getDichVufree() {
        return dichVufree;
    }

    public void setDichVufree(String dichVufree) {
        this.dichVufree = dichVufree;
    }

    public Room(String dichVu, double dienTichsuDung, double chiPhi, int soLuong, String kieuThue, String dichVufree) {
        super(dichVu, dienTichsuDung, chiPhi, soLuong, kieuThue);
        this.dichVufree = dichVufree;

    }
}

