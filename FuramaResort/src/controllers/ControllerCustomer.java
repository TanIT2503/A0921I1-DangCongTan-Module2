//package controllers;
//
//import java.util.Scanner;
//
//import services.ICustomerService;
//import services.impl.CustomerServiceImpl;
//
//public class ControllerCustomer {
//    private static ICustomerService customerService = new CustomerServiceImpl();
//    public static void customerManagement() {
//        int choice;
//        Scanner scanner = new Scanner(System.in);
//        boolean flag = true;
//        do {
//            System.out.println("1: Display list customers");
//            System.out.println("2: Add new customer");
//            System.out.println("3: Edit customer");
//            System.out.println("4: Return main menu");
//
//            choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    System.out.println("1: Display list customers");
//                    customerService.display();
//                    break;
//                case 2:
//                    System.out.println("2: Add new customer");
//                    customerService.add();
//                    break;
//                case 3:
//                    System.out.println("3:Edit customer");
//                    break;
//                case 4:
//                    System.out.println("4: Return main menu");
//                    break;
//                default:
//                    System.out.println("Invalid choice");
//                    flag = false;
//                    break;
//            }
//        }while (flag);
//    }
//}
