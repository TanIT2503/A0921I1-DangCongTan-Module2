import java.util.Arrays;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 11, 9, 4, 7, 1, 12, 10 };
        System.out.println("Mang truoc khi xoa phan tu là: " + Arrays.toString(arr));
        int x = 11;
        int[] arr1 = new int[arr.length - 1];
        int dem = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != x) {
                arr1[dem] = arr[i];
                dem++;
            }
        }
        System.out.println("Mang sau khi xoa phan tu " + x + " là: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}

