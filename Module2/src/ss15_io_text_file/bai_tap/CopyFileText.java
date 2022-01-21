// Luyện tập đọc/ghi file text phân với các lớp được dẫn xuất từ Reader/Writer

// Viết một chương trình cho phép người dùng sao chép các tập tin. Người sử dụng cần phải cung cấp một tập tin nguồn (source file) và một tập tin đích (target file).

// Chương trình sao chép tệp nguồn vào tệp tin đích và hiển thị số ký tự trong tệp. Chương trình nên cảnh báo người dùng nếu tệp nguồn không tồn tại hoặc nếu tập tin đích đã tồn tại.

// Để sao chép nội dung từ tệp tin nguồn đến tệp tin đích, bạn nên sử dụng luồng đầu vào để đọc ký tự từ tệp nguồn và luồng đầu ra để gửi byte đến tệp tin đích, bất kể nội dung của tệp.

package ss15_io_text_file.bai_tap;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static int count(String str) {
        int count =0;
        for (char c:str.toCharArray()){
            if (c!=' ' && c!='\n')
                count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Nhập đường dẫn file nguồn: ");
        Scanner scanner = new Scanner(System.in);
        String sourcePath = scanner.nextLine();
        File file = new File(sourcePath);
        try {
            if (file.createNewFile()) {
                System.out.println("File created..");
            } else {
                System.out.println("File already exists..");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Nhập đường dẫn file đích: ");
        String targetFile = scanner.nextLine();
        FileReader fileReader;
        BufferedReader bufferedReader;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(sourcePath);
            bufferedReader = new BufferedReader(fileReader);
            StringBuffer result = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line);
                result.append("\n");
            }
            try {
                fileWriter = new FileWriter(targetFile);
                fileWriter.write(String.valueOf(result));
                fileWriter.write("\nSố ký tự: " + count(String.valueOf(result)));
                bufferedReader.close();
                ;
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fileWriter != null) {
                    try {
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}