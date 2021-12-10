import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = { "Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory",
                "Zoe", "Emily" };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vi tri cua sinh vien trong danh sach" + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Khong co sinh vien " + input_name + " trong danh sach.");
        }

    }
}
