// Các loại dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.

package models;

public class Facility {
    private String idFacility;
    private String serviceName;
    private float area;
    private float price;
    private int maxNumberOfPeople;
    private String typeOfRent;
    public Facility() {
    }

    public Facility(String idFacility, String serviceName, float area, float price, int maxNumberOfPeople,
            String typeOfRent) {
        this.idFacility = idFacility;
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeOfRent = typeOfRent;
    }
    

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }
    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }
    public String getTypeOfRent() {
        return typeOfRent;
    }
    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }
    @Override
    public String toString() {
        return "ID Facility: " + getIdFacility() +
                "Service Name: " + getServiceName()  
                + "Area: " + getArea() +
                "Price: " + getPrice() +
                "Max Number Of People: " + getMaxNumberOfPeople() +
                "Type Of Rent: " + getTypeOfRent() +
                '}';
    }

    public String getInfoFacilityToCVS() {
        return this.idFacility + "," + this.serviceName + "," + this.area + "," + this.price + "," + this.maxNumberOfPeople + "," + this.typeOfRent;
    }
}
