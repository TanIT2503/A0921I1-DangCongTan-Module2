package controllers;

import java.util.Scanner;

public class EmployeeController {
    public static void employeeManagement() {
        System.out.println("1: Display list employees");
        System.out.println("2: Add new employee");
        System.out.println("3: Edit employee");
        System.out.println("4: Return main menu");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1: Display list employees");
                break;
            case 2:
                System.out.println("2: Add new employee");
                break;
            case 3:
                System.out.println("3:Edit employee");
                break;
            case 4:
                System.out.println("4: Return main menu");
                break;
        }
    }
}
