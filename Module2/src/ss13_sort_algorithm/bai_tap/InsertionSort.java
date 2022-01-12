package ss13_sort_algorithm.bai_tap;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {1, 4, 6, 3, 8, 5, 7, -3, 13, -2};
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void insertionSort(int[] list) {
        for (int k = 1; k < list.length; k++) {
            int key = list[k];
            int j = k;
            while (j > 0 && list[j - 1] > key) {
                list[j] = list[j - 1];
                j--;
            }
            list[j] = key;
        }
    }
}
