package case_study.service;

import case_study.dichvu.Customer;
import case_study.dichvu.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    // sử dụng linked list, static protery,static blcok khởi tạo
    protected static List<Customer> list = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        list.add(new Customer("Phuc", 1997, "Nam", 201785, 89798798, "Phuc@gmail.com", Customer.DIAMOND, "Gia Lai"));
        list.add(new Customer("VinhRau", 1998, "Nam", 45645, 54654621, "Vinh@gmail.com", Customer.PLATINIUM, "Gia Lai"));
    }

    public static void add() {
        System.out.println("họ và tên");
        String name = scanner.nextLine();
        System.out.println("năm sinh ");
        int namSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("GIỚI TÍNH");
        String gender = scanner.nextLine();
        System.out.println("cmnd");
        int cmnd = Integer.parseInt(scanner.nextLine());
        System.out.println("số điện thoại");
        int sdt = Integer.parseInt(scanner.nextLine());
        System.out.println("email");
        String email = scanner.nextLine();
        System.out.println("địa chỉ ");
        String diaChi = scanner.nextLine();
        System.out.println("Loại member");
        // chưa làm xong customer
        Customer customer = new Customer(name, namSinh, gender, cmnd, sdt, email, Customer.MEMBER, diaChi);
        list.add(customer);
    }

    public static void show() {
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }

    public static void edit(String name) {
        for (Customer customer : list) {
            if (customer.getName().equals(name)) {
                System.out.println("họ và tên");
                String name1 = scanner.nextLine();
                System.out.println("năm sinh ");
                int namSinh = Integer.parseInt(scanner.nextLine());
                System.out.println("GIỚI TÍNH");
                String gender = scanner.nextLine();
                System.out.println("cmnd");
                int cmnd = Integer.parseInt(scanner.nextLine());
                System.out.println("số điện thoại");
                int sdt = Integer.parseInt(scanner.nextLine());
                System.out.println("email");
                String email = scanner.nextLine();
                System.out.println("địa chỉ ");
                String diaChi = scanner.nextLine();
                System.out.println("Loại member");
                customer.setName(name1);
                customer.setBorn(namSinh);
                customer.setGender(gender);
                customer.setCmnd(cmnd);
                customer.setSdt(sdt);
                customer.setEmail(email);
                customer.setAddress(diaChi);
                customer.setTypeOfcustomer(Customer.GOLD);
            }
           else {
                System.out.println("Tên bạn tìm không tồn tại");
            }
        }
    }
}