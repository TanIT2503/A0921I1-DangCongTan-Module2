// 1.Xây dựng abstract class Facility (cơ sở vật chất) bao gồm các thông tin chung của tất cả dịch vụ cho thuê Villa, House, Room.
// Các loại dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.), têu chuẩn phòng, Số tầng.

package models;

public abstract class Facility {
    private String serviceName;
    private double areaUsed;
    private double rentalCosts;
    private int maxNumberOfPeople;
    private String typeRent;
    private String standardRoom;
    private int numberOfFloors;
    
    public Facility() {
    }

    public Facility(String serviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent) {
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeRent = typeRent;
    }

    public Facility(String serviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent,
            String standardRoom, int numberOfFloors) {
        this.serviceName = serviceName;
        this.areaUsed = areaUsed;
        this.rentalCosts = rentalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.typeRent = typeRent;
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    
}
