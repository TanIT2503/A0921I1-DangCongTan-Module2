package controllers;

import services.ICustomerService;
import services.IEmployeeService;
import services.IFacilityService;
import services.impl.CustomerServiceImpl;
import services.impl.EmployeeServiceImpl;
import services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class ControllerFurama {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int choice;
        do {
            System.out.println("=========== Menu ===========");
            System.out.println("1: Employee Management");
            System.out.println("2: Customer Management");
            System.out.println("3: Facility Management");
            System.out.println("4: Booking Management");
            System.out.println("5: Promotion Management");
            System.out.println("6: Exit");
            System.out.println("============================");
            System.out.println("Please enter your options: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("==== Employee Management ====");
                    employeeManagement();
                    break;
                case 2:
                    System.out.println("==== Customer Management ====");
                    customerManagement();
                    break;
                case 3:
                    System.out.println("==== Facility Management ====");
                    facilityManagement();
                    break;
                case 4:
                    System.out.println("==== Booking Management ====");
                    // BookingController.bookingManagement();
                    // break;
                case 5:
                    System.out.println("==== Promotion Management ====");
                    // PromotionController.promotionManagement();
                    // break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    flag = false;
                    break;
            }
        }while (flag);

    }

    //=============================================
    public static void employeeManagement() {
            IEmployeeService employeeService = new EmployeeServiceImpl();
            int choice;
            Scanner scanner = new Scanner(System.in);
            boolean flag = true;
            do {
                System.out.println("============================");
                System.out.println("1: Display list employees");
                System.out.println("2: Add new employee");
                System.out.println("3: Edit employee");
                System.out.println("4: Return main menu");
                System.out.println("============================");
                System.out.println("Please enter your options: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("==== Display list employees ====");
                        employeeService.display();
                        break;
                    case 2:
                        System.out.println("==== Add new employee ====");
                        employeeService.add();
                        break;
                    case 3:
                        System.out.println("==== Edit employee ====");
                        break;
                    case 4:
                        System.out.println("==== Return main menu ====");
                        displayMainMenu();
                        break;
                    default:
                        System.out.println("Invalid choice");
                        flag = false;
                        break;
                }
            }while (flag);

        }

    //===================================================
    public static void customerManagement() {
        ICustomerService customerService = new CustomerServiceImpl();
        int choice;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {System.out.println("============================");
            System.out.println("1: Display list customers");
            System.out.println("2: Add new customer");
            System.out.println("3: Edit customer");
            System.out.println("4: Return main menu");
            System.out.println("============================");
            System.out.println("Please enter your options: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("==== Display list customers ====");
                    customerService.display();
                    break;
                case 2:
                    System.out.println("==== Add new customer ====");
                    customerService.add();
                    break;
                case 3:
                    System.out.println("==== Edit customer ====");
                    break;
                case 4:
                    System.out.println("==== Return main menu ====");
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    flag = false;
                    break;
            }
        } while (flag);
    }

    public static void facilityManagement() {
        IFacilityService facilityService = new FacilityServiceImpl();
        int choice;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("============================");
            System.out.println("1: Display list facility");
            System.out.println("2: Add new facility");
            System.out.println("3: Display list facility");
            System.out.println("4: Return main menu");
            System.out.println("============================");
            System.out.println("Please enter your options: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("==== Display list facility ====");
                    displayFacilityMenu();
                    break;
                case 2:
                    System.out.println("==== Add new facility ====");
                    addNewFacilityMenu();
                    break;
                case 3:
                    System.out.println("==== Display list facility ====");
                    break;
                case 4:
                    System.out.println("==== Return main menu ====");
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    flag = false;
                    break;
            }
        } while (flag);
    }

    public static void addNewFacilityMenu() {
        IFacilityService facilityService = new FacilityServiceImpl();
        int choice;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("============================");
            System.out.println("1: Add new Villa");
            System.out.println("2: Add new House");
            System.out.println("3: Add new Room");
            System.out.println("4: Return main menu");
            System.out.println("============================");
            System.out.println("Please enter your options: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("==== Add new Villa ====");
                    facilityService.addVilla();
                    break;
                case 2:
                    System.out.println("==== Add new House ====");
                    facilityService.addHouse();
                    break;
                case 3:
                    System.out.println("==== Add new Room ====");
                    facilityService.addRoom();
                    break;
                case 4:
                    System.out.println("==== Return main menu ====");
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    flag = false;
                    break;
            }
        } while (flag);
    }

    
    public static void displayFacilityMenu() {
        IFacilityService facilityService = new FacilityServiceImpl();
        int choice;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("============================");
            System.out.println("1: Display list Villa");
            System.out.println("2: Display list House");
            System.out.println("3: Display list Room");
            System.out.println("4: Return main menu");
            System.out.println("============================");
            System.out.println("Please enter your options: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("==== Display list Villa ====");
                    facilityService.displayVilla();
                    break;
                case 2:
                    System.out.println("==== Display list House ====");
                    facilityService.displayHouse();
                    break;
                case 3:
                    System.out.println("==== Display list Room ====");
                    facilityService.displayRoom();
                    break;
                case 4:
                    System.out.println("==== Return main menu ====");
                    facilityManagement();
                    break;
                default:
                    System.out.println("Invalid choice");
                    flag = false;
                    break;
            }
        } while (flag);
    }
    
}
