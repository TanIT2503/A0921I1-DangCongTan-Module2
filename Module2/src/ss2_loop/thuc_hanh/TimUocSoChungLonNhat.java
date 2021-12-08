/*
Ứng dụng cho phép nhập vào hai số nguyên và hiển thị ước số chung lớn nhất của hai số đó.
*/
import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = input.nextInt();
        System.out.println("Nhap b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Khong co uoc so chung lon nhat");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Uoc so chung lon nhat: " + a);
    }
}
