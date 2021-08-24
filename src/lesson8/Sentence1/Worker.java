package lesson8.Sentence1;

import java.util.Scanner;

public class Worker extends Employee {
    private String factory;

    public Worker(String name, String gender, String dateOfBirth, String address, int id, String factory) {
        super(name, gender, dateOfBirth, address, id);
        this.factory = factory;
    }

    public Worker() {
    }

    @Override
    public double calculateSalary() {
        return 3*10e6;
    }

    @Override
    public void inputEmployee() {
        super.inputEmployee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter factory:");
        factory =sc.nextLine();
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    @Override
    public String toString() {
        return "Worker: \n"+"Name:" + getName() + "   "  +  " gender: " +isGender()  + "   " +  " dateOfBirth:" +getDateOfBirth() + "  " + "address: " + getAddress() + "  " + " id: " +getId() + "  " + " factory:" +getFactory();
    }
    public  void showInfo(){
        System.out.println(toString());
    }
}

