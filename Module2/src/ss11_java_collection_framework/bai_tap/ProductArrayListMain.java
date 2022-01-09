package ss11_java_collection_framework.bai_tap;

import java.util.Scanner;

public class ProductArrayListMain {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1. Add product");
            System.out.println("2. Edit product by id"); 
            System.out.println("3. Delete product by id");
            System.out.println("4. Show product");
            System.out.println("5. Search product by name");
            System.out.println("6. Sort product by price");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    productManager.addProduct(new Product());
                    break;
                case 2:
                    System.out.print("Nhập Id sản phẩm muốn sửa: ");
                    int id = scanner.nextInt();
                    productManager.editProduct(id);
                    break;
                case 3:
                    System.out.print("Nhập Id sản phẩm muốn xóa: ");
                    id = scanner.nextInt();
                    productManager.deleteProduct(id);
                    break;
                case 4:
                    productManager.showProduct();
                    break;
                case 5:
                    productManager.searchProduct();
                    break;
                case 6:
                    productManager.sortProduct();
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choose != 9);

    }
}
