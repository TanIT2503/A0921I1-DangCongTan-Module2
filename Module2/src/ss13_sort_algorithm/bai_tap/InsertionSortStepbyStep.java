// Viết một chương trình cho phép quan sát các bước thực hiện của thuật toán sắp xếp chèn
// Chương trình cho phép định nghĩa một mảng các số nguyên, hiển thị lần lượt các bước của thuật toán sắp xếp chèn

package ss13_sort_algorithm.bai_tap;

import java.util.Scanner;

public class InsertionSortStepbyStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortStepbyStep(list);

    }

    public static void insertionSortStepbyStep(int[] list) {
        for (int k = 1; k < list.length; k++) {
            int key = list[k];
            int j = k;
            while (j > 0 && list[j - 1] > key) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = key;
            System.out.print("List after the  " + k + "' sort: ");
            for (int j1 = 0; j1 < list.length; j1++) {
                System.out.print(list[j1] + "\t");
            }
            System.out.println();
        }
    }
}
