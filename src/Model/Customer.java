package Model;

public class Customer {
    private int customerId;
    private String customerName;
    private int customerHouseNumber;

    public Customer() {

    }

    public Customer(String customerName, int customerHouseNumber) {
        this.customerName = customerName;
        this.customerHouseNumber = customerHouseNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerHouseNumber() {
        return customerHouseNumber;
    }

    public void setCustomerHouseNumber(int customerHouseNumber) {
        this.customerHouseNumber = customerHouseNumber;
    }
}
