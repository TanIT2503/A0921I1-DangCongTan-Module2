package services.impl;

import java.util.*;

import models.Facility;
import models.Villa;
import services.IFacilityService;

public class FacilityServiceImpl implements IFacilityService {

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + " number of times hired" + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }
                // int idFacility,
                //  String serviceName,
                //  float area,
                //  float price,
                //  int maxNumberOfPeople,
                //  String typeOfRent,
                // String standardRoom,
                // float areaPool,
                // String numberFloor
    @Override
    public void addVilla() {
        System.out.println("Enter villa ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter villa name: ");
        String name = scanner.nextLine();
        System.out.println("Enter villa area: ");
        float area = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter villa price: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter villa max number of people: ");
        int maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter villa type of rent: ");
        String typeOfRent = scanner.nextLine();
        System.out.println("Enter villa standard room: ");
        String standardRoom = scanner.nextLine();
        System.out.println("Enter villa area pool: ");
        float areaPool = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter villa number floor: ");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(id, name, area, price, maxNumberOfPeople, typeOfRent, standardRoom, areaPool,
                numberFloor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Add Villa Successfully");
    }

    @Override
    public void addHouse() {

    }

    @Override
    public void addRoom() {

    }
}