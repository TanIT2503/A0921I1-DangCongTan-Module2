package ss17_string_and_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhoneValidate {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^[0-9]{2}(-)(0)[0-9]{9}$";

    public NumberPhoneValidate() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
