import java.util.Scanner;

public class tinh_chi_so_can_nang_cua_co_the {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu cao cua ban (m): ");
        double chieuCao = scanner.nextDouble();
        System.out.println("Nhap can nang cua ban (kg): ");
        double canNang = scanner.nextDouble();
        double chieuCaoM = chieuCao / 100;
        double bmi = canNang / (chieuCaoM * chieuCaoM);
        System.out.println("Chi so khoi co the (Body mass index-BMI) cua ban la: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Ban bi thieu can.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Bạn có thể tiếp tục cười");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Bạn bị thừa cân");
        } else if (bmi >= 30) {
            System.out.println("Bạn bị béo phì");
        }
    }
}