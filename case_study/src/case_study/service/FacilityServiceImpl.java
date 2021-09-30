package case_study.service;

import case_study.dichvu.Facility;
import case_study.dichvu.House;
import case_study.dichvu.Room;
import case_study.dichvu.Villa;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements FacilityService {
    protected static LinkedHashMap<Facility, Integer> list = new LinkedHashMap<Facility, Integer>();
    private static Scanner scanner = new Scanner(System.in);

    public static Facility getFacility(String serviceName) {
        for (Map.Entry<Facility, Integer> map : list.entrySet()) { // lấy theo tên dịch vụ house,room....
            if (map.getKey().getDichVu().contains(serviceName)) {
                map.setValue(map.getValue() + 1);
                return map.getKey();
            }
        }
        return null;
    }

    static {
        list.put(new House("House", 500, 50000, 4, "hours", "VIP", 5), 0);
        list.put(new Room("Room", 500, 700000, 4, "hours", "drinking"), 0);
        list.put(new Villa("Villa", 500, 800000, 4, "hours", "VIP", 5, 100), 0);
    }

    public static void show() {
        for (Facility facility : list.keySet()) {
            Integer value = list.get(facility);
            System.out.println(facility + "có key là : " + value);
        }
    }

    public static void addService() {
        int login = 1;
        do {
            System.out.println("Service");
            System.out.println("1.\tAdd New Villa");
            System.out.println("2.\tAdd New House");
            System.out.println("3.\tAdd New Room");
            System.out.println("4.\tBack to menu");
            login = scanner.nextInt();
            scanner.nextLine();
            switch (login) {
                case 1: // Villa
                    System.out.println("Dịch vụ");
                    String dv = scanner.nextLine();
                    System.out.println("diện tích sử dụng");
                    double dienTich = Integer.parseInt(scanner.nextLine());
                    System.out.println("chi phí");
                    double chiPhi = Integer.parseInt(scanner.nextLine());
                    System.out.println("số lượng");
                    int soLuong = Integer.parseInt(scanner.nextLine());
                    System.out.println("kiểu thuê");
                    String kieuThue = scanner.nextLine();
                    System.out.println("Tiêu chuẩn");
                    String tieuChuan = scanner.nextLine();
                    System.out.println("Số tầng");
                    int soTang = Integer.parseInt(scanner.nextLine());
                    System.out.println("diên tích hồ bơi");
                    double hoBoi = Integer.parseInt(scanner.nextLine());
                    Villa villa = new Villa(dv, dienTich, chiPhi, soLuong, kieuThue, tieuChuan, soTang, hoBoi);
                    list.put(villa, 0);
                    break;
                case 2: // house
                    System.out.println("Dịch vụ");
                    String dv1 = scanner.nextLine();
                    System.out.println("diện tích sử dụng");
                    double dienTich1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("chi phí");
                    double chiPhi1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("số lượng");
                    int soLuong1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("kiểu thuê");
                    String kieuThue1 = scanner.nextLine();
                    System.out.println("Tiêu chuẩn");
                    String tieuChuan1 = scanner.nextLine();
                    System.out.println("Số tầng");
                    int soTang1 = Integer.parseInt(scanner.nextLine());
                    House house = new House(dv1, dienTich1, chiPhi1, soLuong1, kieuThue1, tieuChuan1, soTang1);
                    list.put(house, 0);
                    break;
                case 3: //room
                    System.out.println("Dịch vụ");
                    String dv2 = scanner.nextLine();
                    System.out.println("diện tích sử dụng");
                    double dienTich2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("chi phí");
                    double chiPhi2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("số lượng");
                    int soLuong2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("kiểu thuê");
                    String kieuThue2 = scanner.nextLine();
                    System.out.println("dịch vụ free");
                    String dVfree = scanner.nextLine();
                    Room room = new Room(dv2, dienTich2, chiPhi2, soLuong2, kieuThue2, dVfree);
                    list.put(room, 0);
                    break;
            }
        } while (login != 4);
    }
    public static void maintenance(){
        for (Map.Entry<Facility, Integer> map : list.entrySet()) {
            if(map.getValue() >= 5){
                System.out.println(map.getKey());
            }
            else {
                System.out.println("Không có dịch vụ nào cần bảo trì");
            }
        }
    }
}
