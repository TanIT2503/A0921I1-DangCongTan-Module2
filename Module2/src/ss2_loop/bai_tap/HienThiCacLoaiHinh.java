package ss2_loop.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Ve hinh chu nhat");
            System.out.println("2. Ve  hinh tam giac");
            System.out.println("3. Ve hinh tam giac nguoc");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Ve hinh chu nhat");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("2. Ve  hinh tam giac");
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Ve hinh tam giac nguoc");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Khong chon!");
            }
        }
    }
}
