package ss7_abstract_and_interface.bai_tap;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.6, 5.5);
        System.out.println(rectangle);

        rectangle = new Rectangle(3.4, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
