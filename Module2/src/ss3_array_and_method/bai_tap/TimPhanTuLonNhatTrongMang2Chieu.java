// Viết một ứng dụng cho phép người dùng nhập vào một ma trận số thực, sau đó tìm ra tọa độ cũng như giá trị của phần tử lớn nhất.

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int m, n;
         
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhap vao so dong cua ma tran: ");
        m = scanner.nextInt();
        System.out.println("Nhap vao so cot cua ma tran: ");
        n = scanner.nextInt();
         
        int A[][] = new int[m][n];
         
        System.out.println("Nhap cac phan tu: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];
        int x = 0, y = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Phan tu lon nhat trong ma tran la: " + max);
        System.out.println("Toa do cua phan tu lon nhat la: " + x + "," + y);
    }
}
