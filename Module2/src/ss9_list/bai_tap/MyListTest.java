package ss9_list.bai_tap;

import java.util.*;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        System.out.println("List: ");
        listInteger.add(0, 2);
        listInteger.add(1, 3);
        listInteger.add(2, 4);
        listInteger.add(3, 5);
        listInteger.add(4, 6);
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println("Element " + (i + 1) + ": " + listInteger.get(i));
        }

        listInteger.add(5, 8);
        listInteger.add(6, 9);
        System.out.println("List after add 8 at index = 5 and 9 at index = 6: ");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println("Element " + (i + 1) + ": " + listInteger.get(i));
        }

        boolean checkContains = listInteger.contains(5);
        if (checkContains)
            System.out.println("List contains 5.");
        else
            System.out.println("List doesn't contain 5.");

        int indexOfValue = listInteger.indexOf(4);
        System.out.println("4 has index: " + indexOfValue);

        listInteger.remove(3);
        System.out.println("List after remove value index = 3");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println("Element " + (i + 1) + ": " + listInteger.get(i));
        }

        listInteger.clone();
        System.out.println("List clone");
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println("Element " + (i + 1) + ": " + listInteger.get(i));
        }

        listInteger.clear();
    }
}