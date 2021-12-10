import java.util.Scanner;

public class UngDungTinhTienLaiChhoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nap so tien cho vay: ");
        int soTienChoVay = scanner.nextInt();
        System.out.println("Nhap ti le lai suat: ");
        double tiLeLaiSuat = scanner.nextDouble();
        System.out.println("Nhap so thang vay: ");
        int soThangChoVay = scanner.nextInt();
        double soTienLai = soTienChoVay * tiLeLaiSuat / 100 / 12 * soThangChoVay;
        System.out.println("So tien lai: " + soTienLai);
    }
}
