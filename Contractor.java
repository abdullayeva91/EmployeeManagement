package EmployeeManagementSystem;

public class Contractor extends Employee implements IDisplayable{
    private double contractDuration;

    public Contractor(String name, String surname, int age, String position, double salary, String type, double contractDuration) {
        super(name, surname, age, position, salary, type);
        this.contractDuration = contractDuration;
    }

    public double getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(double contractDuration) {
        this.contractDuration = contractDuration;
    }

    @Override
    public void printEmployeeInfo() {
        super.printEmployeeInfo();
        System.out.println("Contract Duration"+contractDuration);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }
}

