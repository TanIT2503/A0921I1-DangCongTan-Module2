// Xây dựng lớp ProductManager gồm các phương thức thêm, sửa, xoá, hiển thị, tìm kiếm, sắp xếp.
// Trong lớp ProductManager khai báo ArrayList để lưu danh sách sản phẩm.
// Xây dựng chương trình quản lý sản phẩm gồm các thao tác:

// Thêm sản phẩm
// Sửa thông tin sản phẩm theo id
// Xoá sản phẩm theo id
// Hiển thị danh sách sản phẩm
// Tìm kiếm sản phẩm theo tên
// Sắp xếp sản phẩm tăng dần, giảm dần theo giá

package ss11_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> listProduct = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addProduct(Product product) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Nhập thông tin sản phẩm: ");
            System.out.print("Nhập id: ");
            product.setId(scanner.nextInt());
            System.out.print("Nhập tên: ");
            product.setName(scanner.next());
            System.out.print("Nhập giá: ");
            product.setPrice(scanner.nextDouble());
            listProduct.add(product);
            System.out.println("Bạn có muốn nhập thêm sản phẩm không? (y/n)");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("n")) {
                check = false;
            }
        }
    }

    public void showProduct() {
        System.out.println("Danh sách sản phẩm: ");
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }
    public void editProduct(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sửa thông tin sản phẩm có Id = " + id + ": ");
        System.out.print("\nNhập tên sản phẩm muốn sửa: ");
        String productName = scanner.nextLine();
        System.out.print("\nNhập giá sản phẩm muốn sửa: ");
        double price = scanner.nextDouble();
        Product prod = new Product(id, productName, price);
        prod.setId(id);
        prod.setName(productName);
        prod.setPrice(price);
        int index = -1;
        for (int i = 0; i < listProduct.size(); i++) {
            Product products = listProduct.get(i);
            if (products.getId() == id) {
                listProduct.set(i, prod);
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("\nId sản phẩm không tồn tại.");
        } else {
            listProduct.set(index, prod);
            System.out.println("\nDanh sách sản phẩm sau khi sửa sản phẩm có Id = " + id + ":");
            showProduct();
        }

    }

    public void deleteProduct(int id) {
        //Xoá sản phẩm theo id, nếu sản phẩm không tồn tại thì in ra thông báo
        int index = -1;
        for (int i = 0; i < listProduct.size(); i++) {
            Product product = listProduct.get(i);
            if (product.getId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("\nId sản phẩm không tồn tại.");
        } else {
            listProduct.remove(index);
            System.out.println("\nDanh sách sản phẩm sau khi xoá sản phẩm có Id = " + id + ":");
            showProduct();
        }

    }
    
    public void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String productName = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < listProduct.size(); i++) {
            Product product = listProduct.get(i);
            if (product.getName().equalsIgnoreCase(productName)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("\nKhông tìm thấy sản phẩm có tên " + productName);
        } else {
            System.out.println("\nDanh sách sản phẩm có tên " + productName + ":");
            System.out.println(listProduct.get(index).toString());
        }
    }

    public void sortProduct() {
        //Sắp xếp sản phẩm tăng dần, giảm dần theo giá
            int choice;
            System.out.println("\n1. Sắp xếp tăng dần theo giá");
            System.out.println("2. Sắp xếp giảm dần theo giá");
            System.out.print("\nChọn: ");
            choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sắp xếp tăng dần theo giá");
                for (int i = 0; i < listProduct.size() - 1; i++) {
                    for (int j = i + 1; j < listProduct.size(); j++) {
                        Product product1 = listProduct.get(i);
                        Product product2 = listProduct.get(j);
                        if (product1.getPrice() > product2.getPrice()) {
                            Product temp = product1;
                            listProduct.set(i, product2);
                            listProduct.set(j, temp);
                        }
                    }
                }
                System.out.println("\nDanh sách sản phẩm sau khi sắp xếp tăng dần theo giá:");
                showProduct();
                break;
            case 2:
                System.out.println("Sắp xếp giảm dần theo giá");
                for (int i = 0; i < listProduct.size() - 1; i++) {
                    for (int j = i + 1; j < listProduct.size(); j++) {
                        Product product1 = listProduct.get(i);
                        Product product2 = listProduct.get(j);
                        if (product1.getPrice() < product2.getPrice()) {
                            Product temp = product1;
                            listProduct.set(i, product2);
                            listProduct.set(j, temp);
                        }
                    }

                }
                System.out.println("\nDanh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
                showProduct();
        }
    }
}
