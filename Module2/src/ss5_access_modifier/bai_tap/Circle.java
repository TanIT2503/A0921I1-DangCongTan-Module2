package ss5_access_modifier.bai_tap;

public class Circle {
    // Hai thuộc tính có access modifier là private: radius (double) có giá trị khởi tạo là 1.0, color (String) có giá trị khởi tạo là "red".
    private double radius = 1.0;
    private String color = "red";
    // Hai hàm tạo: một không có tham số và một có tham số là radius.
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    // Hai phương thức có access modifier là public: getRadius và getArea.
    double getRadius() {
        return radius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
    
}
