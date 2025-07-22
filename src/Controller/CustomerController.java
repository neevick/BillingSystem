package Controller;

import Dao.CustomerDao;
import Model.BillingRecords;
import Model.Customer;
import Service.CustomerService;

import java.sql.ResultSet;

public class CustomerController {
    CustomerService customerService = new CustomerService();
    private final CustomerDao customerDao;
    {
        try {
            customerDao = new CustomerDao();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addCustomer(Customer customer) {
        return customerDao.insertCustomer(customer);
    }

    public int getcustomerid(String customerName, int customerHouseNumber){
        return customerService.pullCustomerId(customerName,customerHouseNumber);
    }
}
