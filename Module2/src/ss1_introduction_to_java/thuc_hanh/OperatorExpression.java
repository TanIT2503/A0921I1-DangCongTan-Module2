import java.util.Scanner;
public class OperatorExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        float width = scanner.nextInt();
        System.out.println("Nhap chieu cao: ");
        float height = scanner.nextInt();
        float area = width * height;
        System.out.println("Dien tich hinh chu nhat la: " + area);
    }
}
