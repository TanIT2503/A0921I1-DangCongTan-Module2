package ss6_inheritance_in_java.bai_tap;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(2, 4);
        System.out.println(point);
        Point point1 = new Point();
        System.out.println(point1);
        point1.setXY(3, 6);
        System.out.println(point1);
    }
}