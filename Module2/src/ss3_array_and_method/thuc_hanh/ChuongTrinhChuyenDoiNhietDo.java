import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Do F sang do C");
            System.out.println("2. Do C sang do F");
            System.out.println("0. Exit");
            System.out.println("Nhap lua chon: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhap do F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Do F sang do C: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.println("Nhap do C: ");
                    celsius = input.nextDouble();
                    System.out.println("Do C sang do F: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}  

