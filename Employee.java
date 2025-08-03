package EmployeeManagementSystem;

public class Employee implements IDisplayable{
    private String name;
    private String surname;
    private int age;
    private String position;
    private double salary;
    private String type;

    public Employee(String name, String surname, int age, String position, double salary, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printEmployeeInfo(){
        System.out.println("Name"+name);
        System.out.println("Surname"+surname);
        System.out.println("Age"+age);
        System.out.println("Position"+position);
        System.out.println("Salary"+salary);
        System.out.println("Type"+type);
    }

    @Override
    public void displayInfo() {
        printEmployeeInfo();

    }
}
