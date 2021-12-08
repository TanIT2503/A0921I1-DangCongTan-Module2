// một chương trình cho phép người dùng khai báo mảng mảng số nguyên gồm N phần tử. Nhập một giá trị bất kỳ từ bàn phím và vị trí cần chèn, giá trị này được chèn vào vị trí đó trong mảng.
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap gia tri can them: ");
        int x = sc.nextInt();
        System.out.println("Nhap vi tri can them: ");
        int vt = sc.nextInt();
        for (int i = n - 1; i >= vt; i--) {
            arr[i + 1] = arr[i];
        }
        arr[vt] = x;
        System.out.println("Mang sau khi them: ");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
