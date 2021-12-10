// Nhập vào 3 giá trị cho a, b, c và hiển thị kết quả dựa trên việc tính delta. Nếu delta >= 0, hiển thị 2 nghiệm. Nếu delta bằng 0, hiển thị một nghiệm (do 2 nghiệm bằng nhau). Còn lại hiển thị chuỗi “The equation has no roots”
import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao a, b, c: ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if(quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if(quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + (-b / (2 * a)));
        } else {
            System.out.println("The equation has two roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }
    }
}
