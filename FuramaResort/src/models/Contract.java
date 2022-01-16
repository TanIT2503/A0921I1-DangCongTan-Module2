// mã booking, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ, loại dịch vụ.

package models;

public class Contract {
    private int contractID;
    private String checkInDate;
    private String checkOutDate;
    private int customerID;
    private String serviceName;
    private String typeService;

    public Contract() {
    }

    public Contract(int contractID, String checkInDate, String checkOutDate, int customerID,
            String serviceName, String typeService) {
        this.contractID = contractID;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.customerID = customerID;
        this.serviceName = serviceName;
        this.typeService = typeService;
    }
    public int getContractID() {
        return contractID;
    }
    public void setContractID(int contractID) {
        this.contractID = contractID;
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
        return "Contract []";
    }
}
