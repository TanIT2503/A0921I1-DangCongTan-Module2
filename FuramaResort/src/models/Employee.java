package models;

public class Employee extends Person {
    private String level;
    private String position;
    private float salary;
    
    public Employee(String level, String position, float salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }
    public Employee(int id, String name, String birthday, String sex, String cccd, String numberPhone, String email,
            String level, String position, float salary) {
        super(id, name, birthday, sex, cccd, numberPhone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    
    
}
