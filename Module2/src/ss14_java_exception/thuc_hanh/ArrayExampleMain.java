package ss14_java_exception.thuc_hanh;

import java.util.Scanner;

public class ArrayExampleMain {
    public static void main(String[] args) {
        ArrayExample arrExample = new ArrayExample();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter the index of any element: ");
        int x = scanner.nextInt();
        try {
            System.out.println("The value of the element has a 5 index" + x + " is " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index exceeds the limit of the array.");
        }
    }
}