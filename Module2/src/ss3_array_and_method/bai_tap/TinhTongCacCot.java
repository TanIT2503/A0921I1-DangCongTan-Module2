// Viết một ứng dụng cho phép người dùng nhập vào một mảng hai chiều của các số thực, sau đó cho phép người dùng nhập vào thứ tự của một cột (tính từ 0) và tính ra tổng các phần tử của cột đó.
import java.util.Scanner;

public class TinhTongCacCot {
    public static void nhap(int[][] arr, int m, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap mang arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public static void xuat(int[][] arr) {
        System.out.println("Ma tran vua nhap: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void tongCacCot(int[][] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so cong can tinh tong: ");
        int column = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < arr.length; i++)
            total += arr[i][column - 1];

        System.out.print("Tong cac phan tu cua cot thu " + column + " la: " + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dong cua ma tran: ");
        int m = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int n = scanner.nextInt();

        int[][] array = new int[m][n];
        nhap(array, m, n);
        xuat(array);
        tongCacCot(array);
    } 
}
