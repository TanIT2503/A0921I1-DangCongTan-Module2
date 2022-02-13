package services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Customer;
import services.ICustomerService;
import util.ReadAndWriteToCSV;

public class CustomerServiceImpl implements ICustomerService {
    private final String CUSTOMER_PATH_FILE = "src/data/Customer.csv";
    Scanner scanner = new Scanner(System.in);

    @Override
    // this.id + "," + this.name + "," + this.birthday + "," + this.sex + "," + this.cccd + "," + this.numberPhone + "," + this.email;
    public void add() {
        System.out.println("Enter customer ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter customer birthday: ");
        String birthday = scanner.nextLine();
        System.out.println("Enter customer sex: ");
        String sex = scanner.nextLine();
        System.out.println("Enter customer CMND: ");
        String cccd = scanner.nextLine();
        System.out.println("Enter customer Number phone: ");
        String numberPhone = scanner.nextLine();
        System.out.println("Enter customer Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter customer type: ");
        String customerType = scanner.nextLine();
        System.out.println("Enter customer address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, birthday, sex, cccd, numberPhone, email, customerType, address);
        List <Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        //Lưu file CSV with
        ReadAndWriteToCSV.writeCustomerListToCSV(CUSTOMER_PATH_FILE,customerList,true);
    }

    @Override
    public void searchByName() {
        List<Customer> customerList = ReadAndWriteToCSV.readCustomerListFormCSV(CUSTOMER_PATH_FILE);
        System.out.println("Nhập tền cần tim kiếm");
        String searchName = scanner.nextLine();
        for (Customer customer: customerList) {
            if (customer.getName().contains(searchName)){
                System.out.println(customer);
            }
        }

    }

    @Override
    public void delete() {
        List<Customer> customerList = ReadAndWriteToCSV.readCustomerListFormCSV(CUSTOMER_PATH_FILE);
        display();
        System.out.println("Chọn customer cần xóa");
        int chooseDelete = Integer.parseInt(scanner.nextLine());
        customerList.remove(chooseDelete-1);
        ReadAndWriteToCSV.writeCustomerListToCSV(CUSTOMER_PATH_FILE,customerList,false);

    }

    public void display() {
      List<Customer> customerList = ReadAndWriteToCSV.readCustomerListFormCSV(CUSTOMER_PATH_FILE);
        for (int i = 0; i <customerList.size() ; i++) {
            System.out.println((i+1)+"." + customerList.get(i));
        }
    }

    @Override
    public void edit() {
        List<Customer> customerList = ReadAndWriteToCSV.readCustomerListFormCSV(CUSTOMER_PATH_FILE);
        display();
        System.out.println("Chọn customer cần sửa");
        int chooseEdit = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên mới");
        String newName = scanner.nextLine();
        System.out.println("Nhập birthday mới");
        String newBirthday = scanner.nextLine();
        for (Customer customer : customerList) {
            if (customer.getId() == chooseEdit) {
                customer.setName(newName);
                customer.setBirthday(newBirthday);
            }
        }
        ReadAndWriteToCSV.writeCustomerListToCSV(CUSTOMER_PATH_FILE, customerList, false);
        
    }
}

