package models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    

    public Room(String idFacility,
            String serviceName,
            float area,
            float price,
            int maxNumberOfPeople,
            String typeOfRent,
            String freeService) {
        super(idFacility, serviceName, area, price, maxNumberOfPeople, typeOfRent);
        this.freeService = freeService;
    }



    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                " Free Service: " + getFreeService();
    }

    public String getInfoToCVS() {
        return getIdFacility() + "," + getServiceName() + "," + getArea() + "," + getPrice() + ","
                + getMaxNumberOfPeople() + "," + getTypeOfRent() + "," + getFreeService();
    }
}
