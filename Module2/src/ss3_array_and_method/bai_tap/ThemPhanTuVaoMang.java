// một chương trình cho phép người dùng khai báo mảng mảng số nguyên gồm N phần tử. Nhập một giá trị bất kỳ từ bàn phím và vị trí cần chèn, giá trị này được chèn vào vị trí đó trong mảng.
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int size = scanner.nextInt();
        array = new int[size];
        nhapMang(array, size);

        System.out.print("\nNhap gia tri can chen: ");
        int x = scanner.nextInt();
        int pos;
        do {
            System.out.print("Nhap vi tri can chen:  ");
            pos = scanner.nextInt();
            if (pos < 1 || pos > array.length + 1)
                System.out.print("Vi tri khong phu hop.");
        } while (pos < 1 || pos > array.length + 1);

        System.out.println("Mảng trước khi thêm phần tử: ");
        xuatMang(array);

        themPhanTu(array, x, pos - 1);
    }
    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void themPhanTu(int[] arr, int x, int index) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = x;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        newArr[index] = x;
        System.out.println("\nMang sau khi them phan tu: ");
        xuatMang(newArr);
    }
}