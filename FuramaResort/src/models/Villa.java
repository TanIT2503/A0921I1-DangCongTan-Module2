// -	Riêng loại Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng.

package models;

public class Villa extends Facility{
    private double poolArea;

    public Villa() {
    }


    public Villa(double poolArea) {
        this.poolArea = poolArea;
    }

    public Villa(String serviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent,
            String standardRoom, int numberOfFloors, double poolArea) {
        super(serviceName, areaUsed, rentalCosts, maxNumberOfPeople, typeRent, standardRoom, numberOfFloors);
        this.poolArea = poolArea;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public String toString() {
        return "Services name: " + getServiceName()
                + "\nArea used: " + getAreaUsed()
                + "\nRental costs: " + getRentalCosts()
                + "\nMax number of people: " + getMaxNumberOfPeople()
                + "\nType rent: " + getTypeRent()
                + "\nStandard room: " + getStandardRoom()
                + "\nPool area: " + getPoolArea()
                + "\nNumber of floors: " + getNumberOfFloors();
     }
    
}
