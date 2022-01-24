package ss17_string_and_regex.bai_tap;

public class NumberPhoneValidateTest {
    private static NumberPhoneValidate numberPhoneValidate;
    public static final String[] validNumberPhones = new String[] { "84-0986263596", "64-0882332543", "79-0820323561" };
    public static final String[] invalidNumberPhones = new String[] { "a8-98902835", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        numberPhoneValidate = new NumberPhoneValidate();
        for (String numberPhone : validNumberPhones) {
            boolean isvalid = numberPhoneValidate.validate(numberPhone);
            System.out.println("Number phone is " + numberPhone +" is valid: "+ isvalid);
        }
        for (String numberPhone : invalidNumberPhones) {
            boolean isvalid = numberPhoneValidate.validate(numberPhone);
            System.out.println("Number phone is " + numberPhone +" is valid: "+ isvalid);
        }
    }
}
