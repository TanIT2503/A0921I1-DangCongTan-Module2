package ss10_stack_and_queue.bai_tap;

import java.util.Stack;

// Đảo ngược phần tử trong mảng số nguyên sử dụng Stack

public class ReverseArrayUsingStack {
    //Khởi tạo hàm đão ngược mảng
    public static int[] reverse(int[] array) {
        //Khởi tạo 1 stack rỗng
        Stack<Integer> stack = new Stack<Integer>();
        //Duyệt qua mảng array
        for(int i = 0; i < array.length; i++){
            //Đẩy phần tử vào stack
            stack.push(array[i]);
        }
        //Duyệt qua stack
        for(int i = 0; i < array.length; i++){
            //Đẩy phần tử ra khỏi stack
            array[i] = stack.pop();
        }
        return array;
    }
    //khởi tạo hàm đảo ngược chuỗi
    public static String reverse(String str) {
        //Khởi tạo 1 stack rỗng
        Stack<Character> stack = new Stack<Character>();
        //Duyệt qua chuỗi str
        for(int i = 0; i < str.length(); i++){
            //Đẩy phần tử vào stack
            stack.push(str.charAt(i));
        }
        //Duyệt qua stack
        String result = "";
        for(int i = 0; i < str.length(); i++){
            //Đẩy phần tử ra khỏi stack
            result += stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        System.out.println("Mảng số nguyên trước khi đảo ngược: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        reverse(a);
        System.out.print("\nMảng số nguyên sau khi đảo ngược: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        String str = new String("Chuỗi cần đảo ngược");
        System.out.println("\nChuỗi cần đảo ngược: " + str);
        System.out.println("Chuỗi sau khi đảo ngược: " + reverse(str));
    }
}
