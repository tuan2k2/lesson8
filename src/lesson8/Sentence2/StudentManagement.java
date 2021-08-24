package lesson8.Sentence2;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student sv1 = new Student(20052002, "Trần Anh Tuấn", "Công nghệ thông tin", 5, 5);
        Student sv2 = new Student();
        Student sv3 = new Student();
        System.out.println("Enter studentCode 2:");
        sv2.setStudentCode(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter name:");
        sv2.setName(sc.nextLine());
        System.out.println("Enter major: ");
        sv2.setMajor(sc.nextLine());
        System.out.println("Enter theoryScore:");
        sv2.setTheoryScore(sc.nextFloat());
        sc.nextLine();
        System.out.println("Enter praticeScore:");
        sv2.setPraticeScore(sc.nextFloat());
        sc.nextLine();
        System.out.println("Enter studentCode 3:");
        sv3.setStudentCode(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter name:");
        sv3.setName(sc.nextLine());
        System.out.println("Enter major: ");
        sv3.setMajor(sc.nextLine());
        System.out.println("Enter theoryScore:");
        sv3.setTheoryScore(sc.nextFloat());
        sc.nextLine();
        System.out.println("Enter praticeScore:");
        sv3.setPraticeScore(sc.nextFloat());
        System.out.printf("%8s %2s %15s %4s %20s %6s %20s %5s %10s %5s %10s \n ","Mã sinh viên","","Họ tên","","Ngành","","Điểm lý thuyết" ,"","Điểm thực hành","","Điểm trung bình");
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
    }
}
