// -	Riêng loại Room sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm

package models;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceName, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent, String freeService) {
        super(serviceName, areaUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String toString() {
        return "Services name: " + getServiceName()
                + "\nArea used: " + getAreaUsed()
                + "\nRental costs: " + getRentalCosts()
                + "\nMax number of people: " + getMaxNumberOfPeople()
                + "\nType rent: " + getTypeRent()
                + "\nFree service: " + getFreeService();
     }
}
