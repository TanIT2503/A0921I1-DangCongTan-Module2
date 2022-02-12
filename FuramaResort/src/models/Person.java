package models;

public class Person {
    private int id;
    private String name;
    private String birthday;
    private String sex;
    private String cccd;
    private String numberPhone;
    private String email;
    
    public Person() {
    }
    
    public Person(int id, String name, String birthday, String sex, String cccd, String numberPhone, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.cccd = cccd;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id: " + getId()
                + "Name: " + getName()
                + "Birthday: " + getBirthday()
                + "Sex: " + getSex()
                + "CCCD: " + getCccd()
                + "Number Phone: " + getNumberPhone()
                + "Email: " + getEmail();
    }

    public String getInfoPersonToCVS() {
        return this.id + "," + this.name + "," + this.birthday + "," + this.sex + "," + this.cccd + ","
                + this.numberPhone + "," + this.email;
    }
}
