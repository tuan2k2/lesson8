package lesson8.Sentence1;

import java.util.Scanner;

public  abstract class Employee {
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;
    private int id;

    public  Employee(String name, String gender, String dateOfBirth, String address, int id) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee() {
    }
    public void inputEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name :");
        name = sc.nextLine();
        System.out.println("Enter gender:");
        gender = sc.nextLine();
        System.out.println("Enter dateOfBirth:");
        dateOfBirth = sc.nextLine();
        System.out.println("Enter address:");
        address = sc.nextLine();
        System.out.println("Enter id:");
        id = sc.nextInt();
    }
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }
    public void showInfo(){
        System.out.println(toString());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}