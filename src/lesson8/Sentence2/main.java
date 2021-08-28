package lesson8.Sentence2;

import java.text.Collator;
import java.util.*;

public class main {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        ArrayList<Student> students = studentManagement.getList();
        while (true) {
            showMenu();
            System.out.println("choose:");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    Student student = input();
                    studentManagement.addAccount(student);
                    break;
                case 2:
                    System.out.println("Nhập MSV cần xóa:");
                    int d = sc.nextInt();
                    Student student2 = studentManagement.searchByID(d);
                    if (student2 == null ){
                        break;
                    } else{
                        studentManagement.removeAccount(student2);
                        System.out.println("Đã xóa thành công");
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã sinh viên:");
                    int msv = sc.nextInt();
                    Student student3 = studentManagement.searchByID(msv);
                    System.out.println(student3);
                    break;
                case 4:
                    for (Student student1 : students){
                        display(student1);
                    }
                    break;
                case 5:
                    Collections.sort(students, new Comparator<Student>() {
                        @Override
                        public int compare(Student sv1, Student sv2) {
                            if (sv1.calculateAverageScore(sv1.getTheoryScore(), sv1.getPraticeScore()) < sv2.calculateAverageScore(sv2.getTheoryScore(), sv2.getPraticeScore())) {
                                return -1;
                            } else {
                                if (sv1.calculateAverageScore(sv1.getTheoryScore(), sv1.getPraticeScore()) == sv2.calculateAverageScore(sv2.getTheoryScore(), sv2.getPraticeScore())) {
                                    return 0;
                                } else {
                                    return 1;
                                }
                            }
                        }
                    });
                    System.out.println("Danh sách sinh viên theo thứ tự tăng dần là:");
                    for (Student student5 : students){
                        System.out.println(student5);
                    }
                    break;
                case 6:
                    Student student6 = students.get(0);
                    float max = student6.calculateAverageScore(student6.getTheoryScore(),student6.getPraticeScore());
                    for (int i=0 ; i<students.size() ; i++){
                        if(students.get(i).calculateAverageScore(students.get(i).getTheoryScore(),students.get(i).getPraticeScore()) > max ){
                            max = students.get(i).calculateAverageScore(students.get(i).getTheoryScore(),students.get(i).getPraticeScore());
                        }
                    }
                    for (int i=0 ; i<students.size() ; i++) {
                        if (max == students.get(i).calculateAverageScore(students.get(i).getTheoryScore(), students.get(i).getPraticeScore())) {
                            System.out.println("Sinh viên có điểm trung bình cao nhất là:");
                            System.out.println(students.get(i));
                        }
                    }
                    break;
                case 7:
                    Student student7 = students.get(0);
                    float min = student7.calculateAverageScore(student7.getTheoryScore(),student7.getPraticeScore());
                    for (int i=0 ; i<students.size() ; i++){
                        if(students.get(i).calculateAverageScore(students.get(i).getTheoryScore(),students.get(i).getPraticeScore()) < min ){
                            min = students.get(i).calculateAverageScore(students.get(i).getTheoryScore(),students.get(i).getPraticeScore());
                        }
                    }
                    for (int i=0 ; i<students.size() ; i++ ){
                        if (min == students.get(i).calculateAverageScore(students.get(i).getTheoryScore(),students.get(i).getPraticeScore())){
                            System.out.println("Sinh viên Có điểm trung bình thấp nhất là:");
                            System.out.println(students.get(i));
                        }
                    }
                    break;
                case 8:
                    System.out.println("Nhập MSV cần sửa:");
                    int msv8 = sc.nextInt();
                    Student student8 = studentManagement.searchByID(msv8);
                    if (student8 == null){
                        System.out.println("MSV không hợp lệ");
                    } else {
                        System.out.println("Enter Student Code new:");
                        int code = sc.nextInt();
                        sc.nextLine();
                        student8.setStudentCode(code);
                        System.out.println("Enter Name new:");
                        String name = sc.nextLine();
                        student8.setName(name);
                        System.out.println("Enter Major new:");
                        String major = sc.nextLine();
                        student8.setMajor(major);
                        System.out.println("Enter TheoryScore new:");
                        float dlt = sc.nextFloat();
                        student8.setTheoryScore(dlt);
                        System.out.println("Enter praticeScore new:");
                        float dth = sc.nextFloat();
                        student8.setPraticeScore(dth);
                    }
                    System.out.println("Đã sửa thành công !!");
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }

    }
    public static void showMenu(){
        System.out.println("1. Add Student:");
        System.out.println("2. Delete Student:");
        System.out.println("3. Search Student:");
        System.out.println("4. print list:");
        System.out.println("5. sort by grade point average:");
        System.out.println("6. Student with the highest GPA:");
        System.out.println("7. Student with the lowest GPA:");
        System.out.println("8. Modify student information:");
        System.out.println("9. Exit Program:");
    }
    public static Student input(){
        System.out.println("Enter Student Code:");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Enter Major:");
        String major = sc.nextLine();
        System.out.println("Enter TheoryScore:");
        float dlt = sc.nextFloat();
        System.out.println("Enter praticeScore:");
        float dth = sc.nextFloat();
        return new Student(code,name,major,dlt,dth);
    }
    public static void display(Student student){
        System.out.println(student.toString());
    }
}