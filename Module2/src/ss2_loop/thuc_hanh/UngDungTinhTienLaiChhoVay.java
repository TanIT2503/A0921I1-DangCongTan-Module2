// xây dựng một ứng dụng cho phép tính tiền cho vay lãi của một ngân hàng.

// Ứng dụng cho phép nhập vào 3 tham số: số lượng tiền cho vay, tỉ lệ lãi suất theo tháng, số tháng cho vay. Ứng dụng sẽ hiển thị tổng số tiền có được khi hết thời hạn cho vay.
// Cách tính tiền lãi:
// Tiền gửi có kỳ hạn là loại tiền gửi tiết kiệm chỉ có thể rút ra sau một khoảng thời gian nhất định người gửi tiền đã cam kết với ngân hàng. Bên ngân hàng sẽ đưa ra nhiều mức kỳ hạn khác nhau để khách hàng có thể chọn lựa theo tuần, tháng, quý, năm.
// Công thức:
// Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
import java.util.Scanner;

public class UngDungTinhTienLaiChhoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nap so tien cho vay: ");
        int soTienChoVay = scanner.nextInt();
        System.out.println("Nhap ti le lai suat: ");
        double tiLeLaiSuat = scanner.nextDouble();
        System.out.println("Nhap so thang vay: ");
        int soThangChoVay = scanner.nextInt();
        double soTienLai = soTienChoVay * tiLeLaiSuat / 100 / 12 * soThangChoVay;
        System.out.println("So tien lai: " + soTienLai);
    }
}
