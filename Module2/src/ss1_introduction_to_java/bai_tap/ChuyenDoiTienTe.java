import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;
        System.out.println("Nhap gia tri tien te USD: ");
        double usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println("Gia tri tien VND la: " + vnd);
    }
}
