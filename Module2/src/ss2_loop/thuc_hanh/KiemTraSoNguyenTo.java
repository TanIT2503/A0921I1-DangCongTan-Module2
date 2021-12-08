// kiểm tra một số xem có phải là số nguyên tố hay không.
// Số nguyên tố là một số nguyên dương chỉ chia hết cho 1 và chính nó.
// Ứng dụng cho phép người dùng nhập vào một số và hiển thị kết quả là số đó là số nguyên tố hoặc không phải là số nguyên tố.
import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen: ");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number + " khong phai so nguyen to");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " la so nguyen to");
            else
                System.out.println(number + " khong phai so nguyen to");
        }
    }
}
