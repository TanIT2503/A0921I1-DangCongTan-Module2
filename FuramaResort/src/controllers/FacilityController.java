package controllers;

import java.util.Scanner;

public class FacilityController {
    public static void facilityManagement() {
        System.out.println("1: Display list facility");
        System.out.println("2: Add new facility");
        System.out.println("3: Display list facility maintenance");
        System.out.println("4: Return main menu");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1: Display list facility");
                break;
            case 2:
                System.out.println("2: Add new facility");
                break;
            case 3:
                System.out.println("3: Display list facility maintenance");
                break;
            case 4:
                System.out.println("4: Return main menu");
                break;
        }
    }
}
