package case_study.dichvu;


public abstract class Facility {
    private String dichVu;
    private double dienTichsuDung;
    private double chiPhi;
    private int soLuong;
    private String kieuThue;

    public Facility(String dichVu, double dienTichsuDung, double chiPhi, int soLuong, String kieuThue) {
        this.dichVu = dichVu;
        this.dienTichsuDung = dienTichsuDung;
        this.chiPhi = chiPhi;
        this.soLuong = soLuong;
        this.kieuThue = kieuThue;
    }

    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public double getDienTichsuDung() {
        return dienTichsuDung;
    }

    public void setDienTichsuDung(double dienTichsuDung) {
        this.dienTichsuDung = dienTichsuDung;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "dichVu='" + dichVu + '\'' +
                ", dienTichsuDung=" + dienTichsuDung +
                ", chiPhi=" + chiPhi +
                ", soLuong=" + soLuong +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
    //    }
//    public void nhap(){
//        System.out.println("dịch vụ");
//        dichVu = scanner.nextLine();
//        System.out.println("diện tích sử dụng ");
//        dienTichsuDung = scanner.nextInt();
//        System.out.println("chi phí ");
//        chiPhi = scanner.nextInt();
//        System.out.println("số lượng");
//        soLuong =scanner.nextInt();
//        System.out.println("kiểu thuê");
//        kieuThue = scanner.nextLine();
//    }
}
