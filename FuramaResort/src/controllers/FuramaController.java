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
                FacilityController.facilityManagement();
                break;
            case 4:
                System.out.println("Booking Management");
                BookingController.bookingManagement();
                break;
            case 5:
                System.out.println("Promotion Management");
                PromotionController.promotionManagement();
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
