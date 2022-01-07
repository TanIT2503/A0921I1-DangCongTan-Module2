package Ss10_stack_and_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

// Chuyển đổi từ hệ thập phân sang hệ nhị phân sử dụng stack

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        do {
            System.out.print("Nhập số nguyên dương lớn hơn 0: ");
            inputNumber=scanner.nextInt();
        } while (inputNumber < 0);

        Stack<Integer> stack=new Stack<Integer>();
        while (inputNumber > 0) {
            stack.push(inputNumber % 2);
            inputNumber = inputNumber / 2;
        }
        System.out.print("\nGiá trị nhị phân sau khi đổi: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
