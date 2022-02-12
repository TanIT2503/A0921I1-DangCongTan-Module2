package services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Employee;
import services.IEmployeeService;
import util.ReadAndWriteToCSV;

public class EmployeeServiceImpl implements IEmployeeService{
    private final String EMPLOYEE_PATH_FILE = "src/data/Employee.csv";
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        System.out.println("Enter employee ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.println("Enter employee birthday: ");
        String birthday = scanner.nextLine();
        System.out.println("Enter employee sex: ");
        String sex = scanner.nextLine();
        System.out.println("Enter employee CMND: ");
        String cccd = scanner.nextLine();
        System.out.println("Enter employee Number phone: ");
        String numberPhone = scanner.nextLine();
        System.out.println("Enter employee Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter employee level: ");
        String level = scanner.nextLine();
        System.out.println("Enter employee position: ");
        String position = scanner.nextLine();
        System.out.println("Enter employee Salary: ");
        Float salary = Float.parseFloat(scanner.nextLine());
        Employee employee = new Employee(id, name, birthday, sex, cccd, numberPhone, email, level, position, salary);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        //Lưu file CSV with
        ReadAndWriteToCSV.writeEmployeeListToCSV(EMPLOYEE_PATH_FILE,employeeList,true);
    }

    @Override
    public void edit() {

    }

    @Override
    public void display() {
        List<Employee> employeeList = ReadAndWriteToCSV.readEmployeeListfromCSV(EMPLOYEE_PATH_FILE);
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println((i+1)+"." + employeeList.get(i));
        }
    }

    @Override
    public void delete() {
        List<Employee> employeeList = ReadAndWriteToCSV.readEmployeeListfromCSV(EMPLOYEE_PATH_FILE);
        display();
        System.out.println("Chọn employee cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        employeeList.remove(index-1);
        ReadAndWriteToCSV.writeEmployeeListToCSV(EMPLOYEE_PATH_FILE,employeeList,false);
    }

    @Override
    public void searchByName() {
        
    }
}
