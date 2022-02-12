package models;

public class Employee extends Person{
    private String level;
    private String position;
    private float salary;

    public Employee() {
    }

    public Employee(int id, String name, String birthday, String sex, String cccd, String numberPhone, String email,
            String level, String position, float salary) {
        super(id, name, birthday, sex, cccd, numberPhone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Customer ID: " + getId() 
                + "\nEmployee Name: " + getName()
                + "\nEmployee Birthday: " + getBirthday()
                + "\nEmployee Sex: " + getSex()
                + "\nEmployee CCCD: " + getCccd()
                + "\nEmployee Numbe phone: " + getNumberPhone()
                + "\nEmployee Email: " + getEmail()
                + "\nEmployee level: " + getLevel()
                + "\nEmployee position: " + getPosition()
                + "\nEmployee salary: " + getSalary();
    }
    public String getInfoToCVS() {
        return getInfoPersonToCVS() + "," + this.level + "," + this.position + "," + this.salary;
    }

    
}
