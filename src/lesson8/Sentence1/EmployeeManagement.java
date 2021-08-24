package lesson8.Sentence1;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import javafx.concurrent.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Officer> officers = new ArrayList<>();
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            ShowMenu();
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    System.out.println(" nhap employee cần thêm:");
                    int n = sc.nextInt();
                    for (int i=0 ; i<n ; i++ ){
                        Employee employeeNew = new Employee() {
                            @Override
                            public double calculateSalary() {
                                return 0;
                            }
                        };
                        employeeNew.inputEmployee();
                        employees.add(employeeNew);
                    }
                    break;
                case 2:
                    System.out.println("xóa");
                    break;
                case 3:
                    System.out.println("tìm kiếm employee theo họ tên");
                    String name = sc.nextLine();
                    sc.nextLine();
                    for (int i=0 ; i< employees.size() ; i++){
                        if (employees.get(i).getName().equalsIgnoreCase(name)){
                            employees.get(i).showInfo();
                        }
                    }
                case 4:
                    for (Officer officer : officers){
                    officer.showInfo();
                }
                    break;
                case 5:
                    for (Employee employee : employees){
                        employee.showInfo();
                    }
                    break;
                case 6:
                    System.out.println("thoát khỏi chương trình");
                    break;
                default:
                    System.out.println("nhập sai");
            }
        } while (chon != 6);
    }
    public static void ShowMenu(){
        System.out.println("1. Thêm mới employee");
        System.out.println("2. Xóa employee");
        System.out.println("3. Tìm kiếm theo họ tên");
        System.out.println("4. Hiển thị tất cả các Officer");
        System.out.println("5. Hiển thị thông tin danh sách employee");
        System.out.println("6. Thoát khỏi chương trình");
    }
}
