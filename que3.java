package org.example;

import java.util.Scanner;

class Employee {
    private static int totalEmployees = 0; 
    private static double totalSalaryExpense = 0.0;
    
    private int id; 
    private String name; 
    private double salary;
  
    {
        id = ++totalEmployees;
    }

    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        totalSalaryExpense += salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double newSalary) {
        totalSalaryExpense -= this.salary; 
        this.salary = newSalary; 
        totalSalaryExpense += newSalary; 
    }

  
    public static int getTotalEmployees() {
        return totalEmployees;
    }

   
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

   
    public static void applyRaise(Employee[] employees, double percentage) {
        for (Employee e : employees) {
            double newSalary = e.salary + (e.salary * percentage / 100);
            e.updateSalary(newSalary); 
        }
    }

    
    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }
}

public class que3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[100]; 
        int employeeCount = 0; 
        
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Salary of an Employee");
            System.out.println("3. Apply Raise to All Employees");
            System.out.println("4. Display Total Employees");
            System.out.println("5. Display Total Salary Expense");
            System.out.println("6. Display All Employee Details");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    scanner.nextLine(); 
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    employees[employeeCount++] = new Employee(name, salary);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to update salary: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    if (id > 0 && id <= employeeCount) {
                        employees[id - 1].updateSalary(newSalary);
                        System.out.println("Salary updated successfully!");
                    } else {
                        System.out.println("Invalid Employee ID!");
                    }
                    break;

                case 3:
                    System.out.print("Enter percentage raise to apply: ");
                    double percentage = scanner.nextDouble();
                    Employee.applyRaise(employees, percentage);
                    System.out.println("Salary raise applied successfully!");
                    break;

                case 4:
                    System.out.println("Total Employees: " + Employee.getTotalEmployees());
                    break;

                case 5:
                    System.out.println("Total Salary Expense: " + Employee.calculateTotalSalaryExpense());
                    break;

                case 6:
                    for (int i = 0; i < employeeCount; i++) {
                        System.out.println(employees[i]);
                    }
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}

