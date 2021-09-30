package case_study.service;

import case_study.dichvu.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    static {
        list.add(new Employee("Thao", 1998, "nữ", 123, 0712121, "thao@98",
                123123, Employee.DAIHOC, 123123123));
        list.add(new Employee("Ngan", 1997, "nữ", 321, 07661221, "thao@97",
                4445577, Employee.CAODANG, 64654654));
    }
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Họ và tên");
        String name = scanner.nextLine();
        System.out.println("Trình độ");
        String trinhDo = scanner.nextLine();
        System.out.println("lương");
        double luong = Integer.parseInt(scanner.nextLine());
        System.out.println("mã nhân viên ");
        int mnv = Integer.parseInt(scanner.nextLine());
        System.out.println("năm sinh ");
        int namSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("GIỚI TÍNH");
        String gender = scanner.nextLine();
        System.out.println("số điện thoại");
        int cm = Integer.parseInt(scanner.nextLine());
        System.out.println("cmnd");
        int sdt = Integer.parseInt(scanner.nextLine());
        System.out.println("email");
        String email = scanner.nextLine();
        Employee employee = new Employee(name, namSinh, gender, cm, sdt, email, mnv, trinhDo, luong);
        list.add(employee);
    }
    public static void show() {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
    public void edit(String name) {  // sửa theo tên
        for (Employee employee : list) {
            if (employee.getName().equals(name)) {
                System.out.println("họ và tên");
                String ten = scanner.nextLine();
                System.out.println("Trình độ");
                String trinhDo = scanner.nextLine();
                System.out.println("lương");
                double luong = scanner.nextDouble();
                System.out.println("mã nhân viên ");
                int mnv = scanner.nextInt();
                System.out.println("năm sinh ");
                int namSinh = scanner.nextInt();
                System.out.println("GIỚI TÍNH");
                String gioiTinh = scanner.nextLine();
                System.out.println("cmnd");
                int cmnd = scanner.nextInt();
                System.out.println("số điện thoại");
                int sdt = scanner.nextInt();
                System.out.println("email");
                String email = scanner.nextLine();
                employee.setName(ten);
                employee.setTrinhDo(trinhDo);
                employee.setSalary(luong);
                employee.setMnv(mnv);
                employee.setBorn(namSinh);
                employee.setGender(gioiTinh);
                employee.setCmnd(cmnd);
                employee.setSdt(sdt);
                employee.setEmail(email);
            }
            else {
                System.out.println("Tên bạn tìm không có");
            }
        }
    }

//    public static void main(String[] args) {
//        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
//        employeeService.show();
//    }
}
