package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void nhapMang(int[] arr, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void gopMang(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int pos = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[pos] = arr1[i];
            pos++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[pos] = arr2[i];
            pos++;
        }
        System.out.print("Mang sau khi gop: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang 1: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Nhap mang 1: ");
        nhapMang(arr1, size1);
        System.out.print("Nhap so luong phan tu mang 2: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Nhap mang 2: ");
        nhapMang(arr2, size2);
        gopMang(arr1, arr2);
    }
    
}
