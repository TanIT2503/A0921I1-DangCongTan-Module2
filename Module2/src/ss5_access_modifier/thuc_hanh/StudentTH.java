package ss5_access_modifier.thuc_hanh;

public class StudentTH {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    StudentTH(int r, String n) {
        rollno = r;
        name = n;
    }

    public StudentTH() {
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
