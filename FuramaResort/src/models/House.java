// -	Riêng loại House sẽ có thêm thông tin: Tiêu chuẩn phòng, Số tầng.

package models;

public class House extends Facility {

    public House() {
    }

    public House(String serviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent,
            String standardRoom, int numberOfFloors) {
        super(serviceName, areaUsed, rentalCosts, maxNumberOfPeople, typeRent, standardRoom, numberOfFloors);
    }
    public String toString() {
        return "Services name: " + getServiceName()
                + "\nArea used: " + getAreaUsed()
                + "\nRental costs: " + getRentalCosts()
                + "\nMax number of people: " + getMaxNumberOfPeople()
                + "\nType rent: " + getTypeRent()
                + "\nStandard room: " + getStandardRoom()
                + "\nNumber of floors: " + getNumberOfFloors();
     }
}
