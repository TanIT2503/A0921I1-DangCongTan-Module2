// mã booking, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dịch vụ.

package models;

public class Booking {
    private int bookingID;
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;
    private int customerID;
    private String serviceName;
    private String typeService;
    public Booking() {
    }
    public Booking(int bookingID, String bookingDate, String checkInDate, String checkOutDate, int customerID,
            String serviceName, String typeService) {
        this.bookingID = bookingID;
        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.customerID = customerID;
        this.serviceName = serviceName;
        this.typeService = typeService;
    }
    public int getBookingID() {
        return bookingID;
    }
    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }
    public String getBookingDate() {
        return bookingDate;
    }
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }
    public String getCheckInDate() {
        return checkInDate;
    }
    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }
    public String getCheckOutDate() {
        return checkOutDate;
    }
    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getTypeService() {
        return typeService;
    }
    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }
    @Override
    public String toString() {
        return "Booking"
        +"\nBookingID: " + bookingID
        +"\nBookingDate: " + bookingDate
        +"\nCheckInDate: " + checkInDate
        +"\nCheckOutDate: " + checkOutDate
        +"\nCustomerID: " + customerID
        +"\nServiceName: " + serviceName
        +"\nTypeService: " + typeService;
        
    }
    
}
