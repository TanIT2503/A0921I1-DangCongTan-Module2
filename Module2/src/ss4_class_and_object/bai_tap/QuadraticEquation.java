package ss4_class_and_object.bai_tap;

// Thiết kế một lớp tên là QuadraticEquation cho một phương trình bậc hai (quadratic equation) ax2 + bx + x = 0. Lớp này gồm các thành phần:

// Trường dữ liệu a, b, và c thuộc kiểu private double đại diện cho 3 hệ số. 

// Phương thức khởi tạo với 3 tham số để khởi tạo các giá trị cho a, b và c. 

// Phương thức gettter cho a, b và c. 

// Phương thức getDiscriminant() trả về delta theo công thức delta = b2 - 4ac. 

// Phương thức getRoot1() và getRoot2() trả về 2 nghiệm của phương trình là: 

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
