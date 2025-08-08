package EmployeeManagementSystem;

public class FullTimeEmployee extends Employee implements IDisplayable{
    private double bonus;

    public FullTimeEmployee(String name, String surname, int age, String position, double salary, String type, double bonus) {
        super(name, surname, age, position, salary, type);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printEmployeeInfo() {
        super.printEmployeeInfo();
        System.out.println("Bonus : "+bonus);
    }

    @Override
    public void displayInfo() {
        printEmployeeInfo();

    }
}
