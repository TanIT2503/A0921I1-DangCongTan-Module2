package ss10_stack_and_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

// Kiểm tra dấu ngoặc trong biểu thức sử dụng Stack
// Tạo một bStack rỗng (Stack chứa dấu ngoặc).

public class BracketCheckUsingStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biểu thức cần kiểm tra: ");
        String str = scanner.nextLine();
        if (check(str)){
            System.out.println("Well!");
        }else {
            System.out.println("Bad!");
        }
    }
        // Với mỗi ký hiệu sym trong đoạn (từ trái sang phải):
        // Nếu sym là dấu ngoặc trái:
        // Đưa sym vào bStack.
        // Nếu sym là dấu ngoặc phải:
        // Nếu bStack rỗng, return false.
        // Lấy dấu ngoặc ở bStack, đưa vào biến left.
        //Nếu left và sym không khớp được với nhau, return false.
        // Dừng giải thuật, trả về True nếu bStack rỗng, hoặc False với các trường hợp khác.

    public static boolean check(String str) {
        Stack<Character> bStack = new Stack<Character>();
        for (char sym : str.toCharArray()) {
            if (sym == '(') {
                bStack.push(sym);
            } else if (sym == ')') {
                if (bStack.isEmpty()) {
                    return false;
                }
                char left = bStack.pop();
                if (left != '(') {
                    return false;
                }
            }
        }
        return bStack.isEmpty();
    }
}