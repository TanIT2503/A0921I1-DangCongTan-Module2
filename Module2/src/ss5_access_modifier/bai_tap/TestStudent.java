package ss5_access_modifier.bai_tap;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Cong Tan");
        student.setClasses("B00");
        System.out.println(student.toString());
    }
}
