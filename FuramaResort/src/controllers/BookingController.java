package controllers;

import java.util.Scanner;

public class BookingController {
    public static void bookingManagement() {
        System.out.println("1: Add new booking");
        System.out.println("2: Display list booking");
        System.out.println("3: Create new constracts");
        System.out.println("4: Display list contracts");
        System.out.println("5: Edit contracts");
        System.out.println("6: Return main menu");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1: Add new booking");
                break;
            case 2:
                System.out.println("2: Display list booking");
                break;
            case 3:
                System.out.println("3: Create new constracts");
                break;
            case 4:
                System.out.println("4: Display list contracts");
                break;
            case 5:
                System.out.println("5: Edit contracts");
                break;
            case 6:
                System.out.println("6: Return main menu");
                break;
        }
    }
}
