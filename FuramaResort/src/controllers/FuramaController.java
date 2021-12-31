// .	Xây dựng menu chương trình với method displayMainMenu() để cho phép người dùng lựa chọn các chức năng trên menu. Gồm có:
// 1.	Employee Management
// 2.	Customer Management
// 3.	Facility Management 
// 4.	Booking Management
// 5.	Promotion Management
// 6.	Exit


package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Employee Management");
        System.out.println("2: Customer Management");
        System.out.println("3: Facility Management");
        System.out.println("4: Booking Management");
        System.out.println("5: Promotion Management");
        System.out.println("6: Exit");
        System.out.println("Please enter your options: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Employee Management");
                EmployeeController.employeeManagement();
                break;
            case 2:
                System.out.println("Customer Management");
                CustomerController.customerManagement();
                break;
            case 3:
                System.out.println("Facility Management");
                //FacilityController.displayMainMenu();
                break;
            case 4:
                System.out.println("Booking Management");
                //BookingController.displayMainMenu();
                break;
            case 5:
                System.out.println("Promotion Management");
                //PromotionController.displayMainMenu();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}
