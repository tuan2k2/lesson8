package lesson8.Sentence1;

import java.util.Scanner;

public  class Officer extends Employee {
    private String department;
    private double level;

    public Officer(String name, String gender, String dateOfBirth, String address, int id, String department, double level) {
        super(name, gender, dateOfBirth, address, id);
        this.department = department;
        this.level = level;
    }

    public Officer() {
    }
    @Override
    public double calculateSalary() {
        return level*3.5*10e6;
    }

    public Officer(String department, double level) {
        this.department = department;
        this.level = level;
    }

    @Override
    public void inputEmployee() {
        super.inputEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department:");
        department = sc.nextLine();
        System.out.println("Enter Level:");
        level = sc.nextInt();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getLevel() {

        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }
    @Override
    public String toString() {
        return "Officer: \n" + "Name:" + getName() + "   "  +  " gender: " +isGender()  + "   " +  " dateOfBirth:" +getDateOfBirth() + "  " + "address: " + getAddress() + "  " + " id: " +getId() +"    "+ "department:" + getDepartment() + "  " + " level =" + getLevel() +  "  " + " calculateSalary =" + calculateSalary();
    }
    public void showInfo(){
        System.out.println(toString());
    }
}

