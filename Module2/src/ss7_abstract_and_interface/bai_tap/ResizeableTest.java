package ss7_abstract_and_interface.bai_tap;

public class ResizeableTest {
    public static void main(String[] args) {
        double x = Math.floor((Math.random() * 100));
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "Blue", false);
        shapes[1] = new Rectangle(x, x, "Red", true);
        shapes[2] = new Square(x, "Black", true);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.print("\n");
        System.out.println("After Resize:");
        for (Shape shape : shapes) {
            shape.resize(Math.random() * 2);
            System.out.println(shape);
        }

        System.out.print("\n");
        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }
    }
}