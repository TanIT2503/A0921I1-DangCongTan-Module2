// Viết một chương trình cho phép người dùng thêm, hiển thị, tìm kiếm thông tin sản phẩm vào file.
// Thông tin sản phẩm gồm:
// - Mã sản phẩm
// - Tên sản phẩm
// - Hãng sản xuất
// - Giá
// - Các mô tả khác

package ss16_binary_file_serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductTest {
    public static void main(String[] args) throws ClassNotFoundException {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Oreo", "Nabisco", 10000, "Con"));
        products.add(new Product(2, "Milkita", "UnitedFarmFood", 2000, "Het"));
        writeToFile("src/ss16_binary_file_serialization/bai_tap/product.txt", products);
        List<Product> productDataFromFile = readFile("src/ss16_binary_file_serialization/bai_tap/product.txt");
        for (Product product : productDataFromFile) {
            System.out.println(product);
        }
    }
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFile(String path) throws ClassNotFoundException{
        List<Product> products=new ArrayList<>();
        try {
            FileInputStream fis=new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    
}