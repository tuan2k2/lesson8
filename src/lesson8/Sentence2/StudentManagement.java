package lesson8.Sentence2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private ArrayList<Student> accountList = new ArrayList<>();

    public ArrayList<Student> getList() {
        return accountList;
    }
    public void addAccount(Student account) {
        for (Student ac : accountList){
            if (ac.getStudentCode() == account.getStudentCode()){
                System.out.println("Mã sinh viên đã tồn tại");
                return;
            }
        }
        accountList.add(account);
    }

    public void removeAccount(Student account) {
        accountList.remove(account);
    }

    public Student searchByID(int code) {
        for (Student account: accountList) {
            if( account.getStudentCode() == code) {
                return account;
            }
        }
        System.out.println("Mã sinh viên không hợp lệ");
        return null;
    }
    public void fix(int n , Student account){
        accountList.set(n,account);
    }
}
