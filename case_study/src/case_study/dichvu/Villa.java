package case_study.dichvu;

public class Villa extends House{
    private double dienTichhoBoi;

    public Villa(String dichVu, double dienTichsuDung, double chiPhi, int soLuong, String kieuThue, String tieuChuan, int soTang, double dienTichhoBoi) {
        super(dichVu, dienTichsuDung, chiPhi, soLuong, kieuThue, tieuChuan, soTang);
        this.dienTichhoBoi = dienTichhoBoi;
    }
    public double getDienTichhoBoi() {
        return dienTichhoBoi;
    }
    public void setDienTichhoBoi(double dienTichhoBoi) {
        this.dienTichhoBoi = dienTichhoBoi;
    }
}
