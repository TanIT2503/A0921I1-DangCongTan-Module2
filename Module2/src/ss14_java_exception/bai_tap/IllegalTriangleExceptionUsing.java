package ss14_java_exception.bai_tap;


public class IllegalTriangleExceptionUsing {
    public static void main(String[] args) {
        Triangle triangle = null;
        try {
            triangle = new Triangle(1, 0, 3);
        } catch (IllegalTriangleException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(triangle);

    }
}
