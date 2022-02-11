// Viết phương thức để kiểm tra tính hợp lệ của tên một lớp học.

// Tên một lớp học hợp lệ cần đạt các yêu cầu sau:

// Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P

// Không chứa các ký tự đặc biệt

// Theo sau ký tự bắt đầu là 4 ký tự số 

// Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

package ss17_string_and_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassValid {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX = "^[CAP]{1}[0-9]{4}[GHIKLM]{1}$";

    public ClassValid() {
        pattern = Pattern.compile(CLASS_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
