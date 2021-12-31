package controllers;

import java.util.Scanner;

public class CustomerController {
    public static void customerManagement() {
                System.out.println("1: Display list customers");
        System.out.println("2: Add new customer");
        System.out.println("3: Edit customer");
        System.out.println("4: Return main menu");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1: Display list customers");
                break;
            case 2:
                System.out.println("2: Add new customer");
                break;
            case 3:
                System.out.println("3:Edit customer");
                break;
            case 4:
                System.out.println("4: Return main menu");
                break;
        }
    }
}

