package ss6_inheritance_in_java.bai_tap;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D=new Point3D(2,4,5);
        System.out.println(point3D);

        Point3D point3D1=new Point3D();
        System.out.println(point3D1);
        point3D1.setXYZ(1,2,7);
        System.out.println(point3D1);

    }
}