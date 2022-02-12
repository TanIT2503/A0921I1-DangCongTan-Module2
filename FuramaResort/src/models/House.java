package models;

public class House extends Facility {
    private String standardRoom;
    private int numberFloor;
    public House() {
    }
    
    public House(String idFacility, String serviceName, float area, float price, int maxNumberOfPeople, String typeOfRent,
            String standardRoom, int numberFloor) {
        super(idFacility, serviceName, area, price, maxNumberOfPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.numberFloor = numberFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }
    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }
    
    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Standard Room: " + getStandardRoom()  +
                "Number Floor: " + getNumberFloor();
    }
    
    
}
