package case_study.models;

import case_study.dichvu.Customer;
import case_study.dichvu.Facility;

public class Contract extends Booking {
    private int soHopdong;
    private double soTiencoc;
    private double soTienthanhToan;

    public Contract(int soHopdong, double soTiencoc, double soTienthanhToan) {
        this.soHopdong = soHopdong;
        this.soTiencoc = soTiencoc;
        this.soTienthanhToan = soTienthanhToan;
    }

    public Contract(int maBooking, double batDau, double ketThuc, Customer customer, Facility facility, int soHopdong, double soTiencoc, double soTienthanhToan) {
        super(maBooking, batDau, ketThuc, customer, facility);
        this.soHopdong = soHopdong;
        this.soTiencoc = soTiencoc;
        this.soTienthanhToan = soTienthanhToan;
    }
//    public int getSoHopdong() {
//        return soHopdong;
//    }
//
//    public void setSoHopdong(int soHopdong) {
//        this.soHopdong = soHopdong;
//    }
//
//    public double getSoTiencoc() {
//        return soTiencoc;
//    }
//
//    public void setSoTiencoc(double soTiencoc) {
//        this.soTiencoc = soTiencoc;
//    }
//
//    public double getSoTienthanhToan() {
//        return soTienthanhToan;
//    }
//
//    public void setSoTienthanhToan(double soTienthanhToan) {
//        this.soTienthanhToan = soTienthanhToan;
//    }
}
