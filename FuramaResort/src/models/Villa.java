package models;

public class Villa extends Facility {
    private String standardRoom;
    private float areaPool;
    private int numberFloor;
    
    public Villa() {
    }

    public Villa(String idFacility,
                 String serviceName,
                 float area,
                 float price,
                 int maxNumberOfPeople,
                 String typeOfRent,
                String standardRoom,
                float areaPool,
                int numberFloor) {
        super(idFacility, serviceName, area, price, maxNumberOfPeople, typeOfRent);
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }


    public float getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(float areaPool) {
        this.areaPool = areaPool;
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
                "Area Pool: " + getAreaPool() +
                "Number Floor: " + getNumberFloor();
    }
}
