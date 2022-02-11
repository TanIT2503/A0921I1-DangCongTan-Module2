package ss17_string_and_regex.bai_tap;

public class ClassValidTest {
    private static ClassValid classValid;
    public static final String[] validClass = new String[] { "C0318G", "A0318I", "C0318H" };
    public static final String[] invalidClass = new String[] { "P9257C", "M0318G.", "P0323A" };

    public static void main(String[] args) {
        classValid = new ClassValid();
        for (String className : validClass) {
            boolean isvalid = classValid.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }
        for (String className : invalidClass) {
            boolean isvalid = classValid.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }
    }
    
}
