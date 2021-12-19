package ss6_inheritance_in_java.bai_tap;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint movable=new MovablePoint(5,10,10,15);
        System.out.println(movable);
        movable.move();
        System.out.println(movable);
    }
}
