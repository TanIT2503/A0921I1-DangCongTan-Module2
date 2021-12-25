package ss7_abstract_and_interface.bai_tap;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2);
        System.out.println(circle);

        circle = new Circle(4.5, "Red", false);
        System.out.println(circle);
    }
}
