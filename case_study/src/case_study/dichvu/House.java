package case_study.dichvu;

public class House extends Facility {
    private String tieuChuan;
    private int soTang;

    public House(String dichVu, double dienTichsuDung, double chiPhi, int soLuong, String kieuThue, String tieuChuan, int soTang) {
        super(dichVu, dienTichsuDung, chiPhi, soLuong, kieuThue);
        this.tieuChuan = tieuChuan;
        this.soTang = soTang;
    }
    public String getTieuChuan() {
        return tieuChuan;
    }
    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }
    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
