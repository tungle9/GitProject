package case_study.models;

import case_study.dichvu.Customer;
import case_study.dichvu.Facility;

import java.util.Comparator;


public class Booking implements Comparator<Booking> {
    private int maBooking;
    private double batDau;
    private double ketThuc;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(int maBooking, double batDau, double ketThuc, Customer customer, Facility facility) {
        this.maBooking = maBooking;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        this.customer = customer;
        this.facility = facility;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public double getBatDau() {
        return batDau;
    }

    public void setBatDau(double batDau) {
        this.batDau = batDau;
    }

    public double getKetThuc() {
        return ketThuc;
    }

    public void setKetThuc(double ketThuc) {
        this.ketThuc = ketThuc;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking=" + maBooking +
                ", batDau=" + batDau +
                ", ketThuc=" + ketThuc +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.batDau - o2.batDau == 0) {
            return (int) (o1.ketThuc - o2.ketThuc);
        } else {
            return (int) (o1.batDau - o2.batDau);
        }
    }
}
