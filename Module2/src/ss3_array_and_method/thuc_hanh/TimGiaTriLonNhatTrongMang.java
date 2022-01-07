package ss3_array_and_method.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu cua mang:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Khong lon hon 20");
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        int vitri = 1;
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
            max = array[j];
            vitri = j + 1;
            }
        }
        System.out.println("\nGia tri lon nhat " + max + "\n" + "vi tri " + vitri);
    }

}
