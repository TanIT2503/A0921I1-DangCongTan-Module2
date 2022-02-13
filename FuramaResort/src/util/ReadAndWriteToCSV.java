package util;

import models.Customer;
import models.Employee;
import models.House;
import models.Villa;
import models.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReadAndWriteToCSV {
    public static void writeCustomerListToCSV(String pathFile, List<Customer> customerList, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.getInfoToCVS());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            System.out.println("File write error!!! ");
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (Exception e) {
                System.out.println("Error due to closure when the object is null");
            }
        }
    }

    public static List<Customer> readCustomerListFormCSV(String pathFile) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Customer customer = new Customer(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4],
                        array[5], array[6], array[7], array[8]);
                customerList.add(customer);
            }
        } catch (Exception e) {
            System.out.println("File read error!!! ");
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                    fileReader.close();
                }
            } catch (Exception e) {
                System.out.println("Error due to closure when the object is null");
            }
        }
        return customerList;
    }
    // public static void writeCustomerListToCSV1(String pathFile, List<Customer> customerList, boolean append){
    //     List<String> stringList = new ArrayList<>();
    //     for (Customer customer: customerList) {
    //         stringList.add(customer.getInfoToCVS());
    //     }
    //     writeStringListToCSV(pathFile,stringList,append);
    // }

    public static void writeEmployeeListToCSV(String pathFile, List<Employee> employeeList, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.getInfoToCVS());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            System.out.println("File write error!!!");
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (Exception e) {
                System.out.println("Error due to closure when the object is null");
            }
        }

    }

    public static List<Employee> readEmployeeListfromCSV(String pathFile) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Employee employee = new Employee(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4],
                        array[5], array[6], array[7], array[8], Float.parseFloat(array[9]));
                employeeList.add(employee);
            }
        } catch (Exception e) {
            System.out.println("File read error!!! ");
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                    fileReader.close();
                }
            } catch (Exception e) {
                System.out.println("Error due to closure when the object is null");
            }
        }
        return employeeList;
    }

    public static void writeEmployeeToCSV1(String pathFile, List<Employee> employeeList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getInfoToCVS());
        }
        writeStringListToCSV(pathFile, stringList, append);
    }

    // ghi 1 list string vào file csv dùng chung cho các dối tượng
    private static void writeStringListToCSV(String pathFile, List<String> stringList, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("File write error!!! ");
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Error due to closure when the object is null.");
            }
        }
    }

    public static void writeVillageToCSV(String pathFile, Map<Villa, Integer> villaMap, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Villa, Integer> villa : villaMap.entrySet()) {
            stringList.add(villa.getKey().getInfoToCVS());
        }
        writeStringListToCSV(pathFile, stringList, append);
    }

    public static List<Villa> readVillaListFromCSV(String pathFile) {
        List<Villa> villaList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Villa villa = new Villa(array[0], array[1], Float.parseFloat(array[2]), Float.parseFloat(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6], Float.parseFloat(array[7]),
                        Integer.parseInt(array[8]));
                villaList.add(villa);
            }
        } catch (Exception e) {
            System.out.println("File read error!!! ");
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                    fileReader.close();
                }
            } catch (Exception e) {
                System.out.println("Error due to closure when the object is null");
            }
        }
        return villaList;
    }

    public static void writeHouseToCSV(String pathFile, Map<House, Integer> houseMap, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<House, Integer> house : houseMap.entrySet()) {
            stringList.add(house.getKey().getInfoToCVS());
        }
        writeStringListToCSV(pathFile, stringList, append);
    }

    public static List<House> readHouseListFromCSV(String pathFile) {
        List<House> houseList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                House house = new House(array[0], array[1], Float.parseFloat(array[2]), Float.parseFloat(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6],
                        Integer.parseInt(array[7]));
                houseList.add(house);
            }
        } catch (Exception e) {
            System.out.println("File read error!!! ");
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                    fileReader.close();
                }
            } catch (Exception e) {
                System.out.println("Error due to closure when the object is null");
            }
        }
        return houseList;
    }

    public static void writeRoomToCSV(String pathFile, Map<Room, Integer> roomMap, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Room, Integer> room : roomMap.entrySet()) {
            stringList.add(room.getKey().getInfoToCVS());
        }
        writeStringListToCSV(pathFile, stringList, append);
    }
    public static List<Room> readRoomListFromCSV(String pathFile) {
        List<Room> roomList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Room room = new Room(array[0], array[1], Float.parseFloat(array[2]), Float.parseFloat(array[3]),
                        Integer.parseInt(array[4]), array[5], array[6]);
                roomList.add(room);
            }
        } catch (Exception e) {
            System.out.println("File read error!!! ");
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                    fileReader.close();
                }
            } catch (Exception e) {
                System.out.println("Error due to closure when the object is null");
            }
        }
        return roomList;
    }
}
