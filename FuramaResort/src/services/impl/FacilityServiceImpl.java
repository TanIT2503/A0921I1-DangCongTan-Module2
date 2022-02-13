package services.impl;

import java.util.*;

import models.Facility;
import models.House;
import models.Room;
import models.Villa;
import services.IFacilityService;
import util.ReadAndWriteToCSV;

public class FacilityServiceImpl implements IFacilityService {

    private final String VILLA_PATH_FILE = "src\\data\\Villa.csv";
    private final String HOUSE_PATH_FILE = "src\\data\\House.csv";
    private final String ROOM_PATH_FILE = "src\\data\\Room.csv";
    private static Map<Villa, Integer> villaIntegerMap=new LinkedHashMap<>();
    private static Map<House, Integer> houseIntegerMap=new HashMap<>();
    private static Map<Room, Integer> roomIntegerMap=new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayVilla() {
        List<Villa> villaListCSV = ReadAndWriteToCSV.readVillaListFromCSV(VILLA_PATH_FILE);
        for (int i=0;i<villaListCSV.size();i++) {
            System.out.println((i + 1) + "." + villaListCSV.get(i));
        }
    }

    @Override
    public void displayHouse() {
        List<House> houseListCSV = ReadAndWriteToCSV.readHouseListFromCSV(HOUSE_PATH_FILE);
        for (int i = 0; i < houseListCSV.size(); i++) {
            System.out.println((i + 1) + "." + houseListCSV.get(i));
        }
    }
    @Override
    public void displayRoom() {
        List<Room> roomListCSV = ReadAndWriteToCSV.readRoomListFromCSV(ROOM_PATH_FILE);
        for (int i=0;i<roomListCSV.size();i++) {
            System.out.println((i + 1) + "." + roomListCSV.get(i));
        }
    }
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
        villaIntegerMap.put(villa,0);
        ReadAndWriteToCSV.writeVillageToCSV(VILLA_PATH_FILE, villaIntegerMap, true);
        System.out.println("Add Villa Successfully");
    }

    @Override
    public void addHouse() {
        System.out.println("Enter house ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter house name: ");
        String name = scanner.nextLine();
        System.out.println("Enter house area: ");
        float area = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter house price: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter house max number of people: ");
        int maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter house type of rent: ");
        String typeOfRent = scanner.nextLine();
        System.out.println("Enter house standard room: ");
        String standardRoom = scanner.nextLine();
        System.out.println("Enter house number floor: ");
        int numberFloor = Integer.parseInt(scanner.nextLine());
        House house = new House(id, name, area, price, maxNumberOfPeople, typeOfRent, standardRoom, numberFloor);
        houseIntegerMap.put(house,0);
        ReadAndWriteToCSV.writeHouseToCSV(HOUSE_PATH_FILE, houseIntegerMap, true);
        System.out.println("Add House Successfully");
    }

    @Override
    public void addRoom() {
        System.out.println("Enter room ID: ");
        String id = scanner.nextLine();
        System.out.println("Enter room name: ");
        String name = scanner.nextLine();
        System.out.println("Enter room area: ");
        float area = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter room price: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter room max number of people: ");
        int maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter room type of rent: ");
        String typeOfRent = scanner.nextLine();
        System.out.println("Free service: ");
        String freeService = scanner.nextLine();
        Room room = new Room(id, name, area, price, maxNumberOfPeople, typeOfRent, freeService);
        roomIntegerMap.put(room,0);
        ReadAndWriteToCSV.writeHouseToCSV(ROOM_PATH_FILE, houseIntegerMap, true);
        System.out.println("Add Room Successfully");
    }
}