// Viết một chương trình tính số ngày trong tháng của một tháng cho trước. Trong một năm, tháng 2 có thể có 28 hoặc 29 ngày, các tháng 1, 3, 5, 7, 8, 10, 12 có 31 ngày, các tháng còn lại có 30 ngày.

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int thang = scanner.nextInt();
        System.out.println("Nhap nam: ");
        int nam = scanner.nextInt();
        int soNgay = 0;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
                break;
            default:
                System.out.println("Nhap sai");
                break;
        }   
        System.out.println("So ngay trong thang " + thang + " nam " + nam + " la: " + soNgay);
    }
}