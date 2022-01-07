package controllers;

import java.util.Scanner;

public class PromotionController {
    public static void promotionManagement() {
        System.out.println("1: Display list customer use service");
        System.out.println("2: Display list customers get voucher");
        System.out.println("3: Return main menu");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("1: Display list customers use service");
                break;
            case 2:
                System.out.println("2: Display list customers get voucher");
                break;
            case 3:
                System.out.println("3: Return main menu");
                break;
        }
    }
}
