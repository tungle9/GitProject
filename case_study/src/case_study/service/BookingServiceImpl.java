package case_study.service;

import case_study.models.Booking;


import java.util.*;

public class BookingServiceImpl implements BookingService {
    private static TreeSet<Booking> treeSet = new TreeSet<>(new Booking());
//    protected static Queue<Booking> queue = new ArrayDeque<>();

    public static Queue<Booking> setToqueue() {
        Queue<Booking> queue1 = new ArrayDeque<>();
        for (Booking booking : treeSet) {
            queue1.add(booking);
            System.out.println(booking);
        }
        return queue1;
    }

    private static Scanner scanner = new Scanner(System.in);

    static {
        Booking booking = new Booking(123, 15, 16, CustomerServiceImpl.list.get(0), FacilityServiceImpl.getFacility("House"));
        Booking booking1 = new Booking(321, 15, 13, CustomerServiceImpl.list.get(1), FacilityServiceImpl.getFacility("Room"));
        treeSet.add(booking);
        treeSet.add(booking1);
    }

    public static void addBooking() {
        System.out.println("nhập mã booking");
        String idBooking = scanner.nextLine();
        System.out.println("ngày bắt đầu");
        double batDau = Integer.parseInt(scanner.nextLine());
        System.out.println("ngày kết thúc");
        double ketThuc = Integer.parseInt(scanner.nextLine());
        System.out.println("Khách hàng");
        CustomerServiceImpl.add();
        System.out.println("");
    }

    public static void show() {
        for (Booking booking : treeSet) {
            System.out.println(booking);
        }
    }

    public static void main(String[] args) {

    }
}