package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        int currentEmployeeCount = 0;
        System.out.println("________ Welcome to the Employee Information System________");

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Leyla", "Musayeva", 34, "Backend Developer",
                1500, "Full-Time", 200);
        Contractor contractor = new Contractor("Nigar", "Abdullazadə", 25, "Graphic Designer",
                1000, "Part-Time", 100);
        employees[currentEmployeeCount]= fullTimeEmployee;
        currentEmployeeCount++;
        employees[currentEmployeeCount]= contractor;
        currentEmployeeCount++;

        System.out.println("Full Time Employee Information");
        fullTimeEmployee.displayInfo();
        System.out.println("Part Time Employee information");
        contractor.displayInfo();

        int menuChoice;
        do {
            System.out.println("______Main Menu______");
            System.out.println("1. Add New Employee");
            System.out.println("2. Show All Employees");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            menuChoice = inputReader.nextInt();
            inputReader.nextLine();
            switch (menuChoice){
                case 1:
                    if (currentEmployeeCount<employees.length){
                        System.out.println("____New Employees Information____");
                        System.out.println("Enter name");
                        String name = inputReader.nextLine();
                        System.out.println("Enter surname");
                        String surname = inputReader.nextLine();
                        System.out.println("enter age");
                        int age = inputReader.nextInt();
                        System.out.println("Enter Position");
                        String position = inputReader.nextLine();
                        inputReader.nextLine();
                        System.out.println("enter salary");
                        double salary = inputReader.nextDouble();
                        inputReader.nextLine();
                        System.out.println("Choose an Employee Type");
                        System.out.println("1. Full-Time: ");
                        System.out.println("2. Part-Time: ");
                        int typeChoice = inputReader.nextInt();
                        Employee newEmployee=null;
                        if (typeChoice == 1){
                            System.out.println("Bonus: ");
                            double bonus = inputReader.nextDouble();
                            inputReader.nextLine();
                            newEmployee =new FullTimeEmployee(name, surname, age, position, salary, "Full-Time",bonus);
                            employees[currentEmployeeCount]=newEmployee;
                            currentEmployeeCount++;
                        } else if (typeChoice==2) {
                            System.out.println("Contract term (month)");
                            double duration = inputReader.nextDouble();
                            Employee addnewEmployee = new Employee(name, surname, age, position, salary,"Part Time");
                            employees[currentEmployeeCount] = addnewEmployee;
                            currentEmployeeCount++;
                            System.out.println("New Employee added successfully");
                        }else {
                            System.out.println("System is full. Cannot add new employee");

                        }
                    }
                    break;
                case 2:
                    if (currentEmployeeCount==0){
                        System.out.println("No employees registered in the system");
                    }else {
                        System.out.println("____All Employees____");
                        for (int i = 0; i < currentEmployeeCount; i++){
                            System.out.println("Employee " + (i + 1));
                            if (employees[i]!=null){
                                employees[i].printEmployeeInfo();
                                System.out.println("________________");
                            }

                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting the employee information system.......... Good luck!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 0, 1 or 2.");
                    break;



            }


        }while (menuChoice != 0);

        }
}