package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        String systemPassword= "1234";
        String enterPassword;
        System.out.println(" ============================================================");
        System.out.println("||_______ Welcome to the Employee Information System________||");
        System.out.println("||                Manage Your Workface Like                 ||");
        System.out.println("||                 a True Professional                      ||");
        System.out.println(" ============================================================");
        do {
            System.out.println("<<<<<Enter your system password to proceed:>>>>> ");
            enterPassword=inputReader.nextLine();
            if (!enterPassword.equals(systemPassword)){
                System.out.println("<<< Wrong password! Please try once more: >>>");
            }
        }while (!enterPassword.equals(systemPassword));
        System.out.println("Welcome! Login successful. Ready to manage your team? ");
        Employee[] employees = new Employee[10];
        int currentEmployeeCount = 0;


        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Leyla", "Musayeva", 34, "Backend Developer",
                1500, "Full-Time", 200);
        Contractor contractor = new Contractor("Nigar", "Abdullazadə", 25, "Graphic Designer",
                1000, "Contractor", 3);
        employees[currentEmployeeCount]= fullTimeEmployee;
         currentEmployeeCount++;
        employees[currentEmployeeCount]= contractor;
        currentEmployeeCount++;

//        System.out.println("Full Time Employee Information");
//        fullTimeEmployee.displayInfo();
//        System.out.println("Part Time Employee information");
//        contractor.displayInfo();





        int menuChoice;
        do {
            System.out.println("______Employee Operations______");
            System.out.println("1. Add New Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Delete Employee");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            menuChoice = inputReader.nextInt();
            inputReader.nextLine();
            switch (menuChoice){
                case 1:
                    if (currentEmployeeCount<employees.length){
                        System.out.println("____Employee Entry Form____");
                        System.out.print("Enter name");
                        String name = inputReader.nextLine();
                        System.out.print("Enter surname");
                        String surname = inputReader.nextLine();
                        System.out.println("enter age");
                        int age = inputReader.nextInt();
                        inputReader.nextLine();
                        if (age<18){
                            System.out.println("Access Denied - Come Back Stronger at 18: ");
                            break;
                        }
                        System.out.println("Enter Position");
                        String position = inputReader.nextLine();
                        System.out.println("enter salary");
                        double salary = inputReader.nextDouble();
                        inputReader.nextLine();
                        System.out.println("Choose an Employee Type");
                        System.out.println("1. Full-Time: ");
                        System.out.println("2. Contractor: ");
                        int typeChoice = inputReader.nextInt();
                        Employee newEmployee=null;
                        if (typeChoice == 1){
                            System.out.println("Bonus: ");
                            double bonus = inputReader.nextDouble();
                            inputReader.nextLine();
                            newEmployee =new FullTimeEmployee(name, surname, age, position, salary, "Full-Time",bonus);
                            employees[currentEmployeeCount]=newEmployee;
                            currentEmployeeCount++;
                            System.out.println("New Employee added successfully");
                        } else if (typeChoice==2) {
                            System.out.println("Contract term (month)");
                            int duration = inputReader.nextInt();
                            inputReader.nextLine();
                            newEmployee = new Contractor(name, surname, age, position, salary,"Contractor",duration);
                            employees[currentEmployeeCount] = newEmployee;
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
                            System.out.println("Employee " + (i + 1 + " "));
                            if (employees[i]!=null){
                                employees[i].displayInfo();
                                System.out.println(" ");
                                System.out.println("________________");
                            }

                        }
                    }

                    break;
                case 3:
                    if (currentEmployeeCount==0){
                        System.out.println("No employee to delete: ");
                    }else {
                        System.out.println("Enter name of the employee to delete");
                        String deleteName= inputReader.nextLine();
                        System.out.println("Enter surname of the employee to delete");
                        String deleteSurname= inputReader.nextLine();
                        boolean found=false;
                        for (int i=0;i<currentEmployeeCount; i++){
                            if (employees[i]!=null &&employees[i].getName().equalsIgnoreCase(deleteName)&&
                            employees[i].getSurname().equalsIgnoreCase(deleteSurname)){
                                for (int j=i; j<currentEmployeeCount-1;j++){
                                    employees[j]=employees[j+1];
                                }
                                employees[currentEmployeeCount-1]=null;
                                currentEmployeeCount--;

                                found= true;
                                System.out.println("Employee deleted successfully: ");
                                break;
                            }
                        }
                        if (!found){
                            System.out.println("Employee nof found");
                        }

                    }
                    break;

                case 0:
                    System.out.println(" -----------------------------------------");
                    System.out.println("|   EXITING EMPLOYEE INFORMATION SYSTEM   |");
                    System.out.println("|     THANK YOU FOR USING OUR SYSTEM      |");
                    System.out.println("|             GOOD LUCK!                  |");
                    System.out.println(" -----------------------------------------");

                    break;
                default:
                    System.out.println("Invalid choice. Please enter 0, 1 or 2.");
                    break;

            }


        }while (menuChoice != 0);
        inputReader.close();


        }
}