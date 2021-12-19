package ss6_inheritance_in_java.bai_tap;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5, 3);
        System.out.println(point2D);

        Point2D point2D1 = new Point2D();
        System.out.println(point2D1);
        point2D1.setXY(4, 4);
        System.out.println(point2D1);
    }
}
