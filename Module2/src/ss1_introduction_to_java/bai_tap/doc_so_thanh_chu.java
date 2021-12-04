

import java.util.Scanner;
public class doc_so_thanh_chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int a = n / 100;
        int b = (n % 100) / 10;
        int c = n % 10;
        String s = "";
        switch (a) {
            case 1:
                s = "one hundred";
                break;
            case 2:
                s = "two hundred";
                break;
            case 3:
                s = "three hundred";
                break;
            case 4:
                s = "four hundred";
                break;
            case 5:
                s = "five hundred";
                break;
            case 6:
                s = "six hundred";
                break;
            case 7:
                s = "seven hundred";
                break;
            case 8:
                s = "eight hundred";
                break;
            case 9:
                s = "nine hundred";
                break;
        }
        switch (b) {
            case 1:
                if (c == 0) {
                    s += " and ten";
                } else if (c == 1) {
                    s += " and eleven";
                } else if (c == 2) {
                    s += " and twelve";
                } else if (c == 3) {
                    s += " and thirteen";
                } else if (c == 4) {
                    s += " and fourteen";
                } else if (c == 5) {
                    s += " and fifteen";
                } else if (c == 6) {
                    s += " and sixteen";
                } else if (c == 7) {
                    s += " and seventeen";
                } else if (c == 8) {
                    s += " and eighteen";
                } else if (c == 9) {
                    s += " and nineteen";
                }
                break;
            case 2:
                s += " and twenty";
                break;
            case 3:
                s += " and thirty";
                break;
            case 4:
                s += " and fourty";
                break;
            case 5:
                s += " and fifty";
                break;
            case 6:
                s += " and sixty";
                break;
            case 7:
                s += " and seventy";
                break;
            case 8:
                s += " and eighty";
                break;
            case 9:
                s += " and ninety";
                break;
        }
        switch (c) {
            case 1:
                s += " one";
                break;
            case 2:
                s += " two";
                break;
            case 3:
                s += " three";
                break;
            case 4:
                s += " four";
                break;
            case 5:
                s += " five";
                break;
            case 6:
                s += " six";
                break;
            case 7:
                s += " seven";
                break;
            case 8:
                s += " eight";
                break;
            case 9:
                s += " nine";
                break;
        }
        System.out.println(s);
    }
}
