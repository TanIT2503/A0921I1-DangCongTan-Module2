package models;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {
        
    }
    
    public Customer(int id,
                    String name,
                    String birthday,
                    String sex,
                    String cccd,
                    String numberPhone,
                    String email,
            String customerType, String address) {
        super(id, name, birthday, sex, cccd, numberPhone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer ID: " + getId() 
                + "\nCustomer Name: " + getName()
                + "\nCustomer Birthday: " + getBirthday()
                + "\nCustomer Sex: " + getSex()
                + "\nCustomer CCCD: " + getCccd()
                + "\nCustomer Numbe phone: " + getNumberPhone()
                + "\nCustomer Email: " + getEmail()
                + "\nCustomer Type: " + getCustomerType()
                + "\nCustomer Address: " + getAddress();
    }
    public String getInfoToCVS() {
        return getInfoPersonToCVS() + "," + this.customerType + "," + this.address;
    }
}
