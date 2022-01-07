package ss10_stack_and_queue.bai_tap;

import java.util.*;


// Kiểm tra chuỗi Palindrome sử dụng Queue
// Để tránh ảnh hưởng tới chuỗi ban đầu, đọc chuỗi nói trên vào stack và queue.

// So sánh từng phần tử của stack và queue, nếu giống nhau từng cặp thì đó là chuỗi Palindrome, ngược lại thì chuỗi trên không phải là chuỗi Palindrome. 

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String inputString = scanner.nextLine();

        Queue<Character> queue = new LinkedList<Character>();
        Stack<Character> stack = new Stack<Character>();

        for (char c : inputString.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                System.out.println("Không phải là chuỗi Palindrome");
                return;
            }
        }

        System.out.println("Là chuỗi Palindrome");
    }
}
